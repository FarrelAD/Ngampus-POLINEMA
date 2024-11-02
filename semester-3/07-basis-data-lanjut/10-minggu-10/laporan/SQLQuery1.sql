-- PRAKTIKUM BAGIAN 1
-- Soal 1
SELECT productid, productname
FROM Production.Products
WHERE categoryid = 4
UNION
SELECT p.productid, p.productname
FROM Production.Products p 
INNER JOIN Sales.OrderDetails od ON p.productid = od.productid
GROUP BY p.productid, p.productname
HAVING SUM(od.qty * od.unitprice) > 50000;


-- Soal 2
SELECT productid, productname
FROM Production.Products
WHERE categoryid = 4
UNION ALL
SELECT p.productid, p.productname
FROM Production.Products p 
INNER JOIN Sales.OrderDetails od ON p.productid = od.productid
GROUP BY p.productid, p.productname
HAVING SUM(od.qty * od.unitprice) > 50000;


-- Soal 3
SELECT productid, productname
FROM Production.Products
WHERE categoryid = 4
UNION ALL
SELECT p.productid, p.productname
FROM Production.Products p 
INNER JOIN Sales.OrderDetails od ON p.productid = od.productid
GROUP BY p.productid, p.productname
HAVING SUM(od.qty * od.unitprice) > 50000;


-- Soal 4
SELECT *
FROM (
	SELECT TOP 10 
		c.custid, c.contactname, o.orderdate, v.val
	FROM Sales.Orders o
	INNER JOIN Sales.OrderValues v ON v.orderid = o.orderid
	INNER JOIN Sales.Customers c ON o.custid = c.custid
	WHERE MONTH(o.orderdate) = 1 AND YEAR(o.orderdate) = 2008
	ORDER BY v.val DESC
) sales_january
UNION ALL
SELECT *
FROM (
	SELECT TOP 10 
		c.custid, c.contactname, o.orderdate, v.val
	FROM Sales.Orders o
	INNER JOIN Sales.OrderValues v ON v.orderid = o.orderid
	INNER JOIN Sales.Customers c ON o.custid = c.custid
	WHERE MONTH(o.orderdate) = 2 AND YEAR(o.orderdate) = 2008
	ORDER BY v.val DESC
) sales_february;



-- PRAKTIKUM BAGIAN 2
SELECT p.productid, p.productname, o.orderid
FROM Production.Products p
CROSS APPLY 
(
	SELECT TOP(2)
	d.orderid
	FROM Sales.OrderDetails d
	WHERE d.productid = p.productid
	ORDER BY d.orderid DESC
) o
ORDER BY p.productid;

IF OBJECT_ID('dbo.fnGetTop3ProductsForCustomer') IS NOT NULL
	DROP FUNCTION dbo.fnGetTop3ProductsForCustomer;

GO 
CREATE FUNCTION dbo.fnGetTop3ProductsForCustomer (@custid AS INT)
RETURNS TABLE
AS
	RETURN 
		SELECT TOP(3)
			d.productid,
			p.productname,
			SUM(d.qty * d.unitprice) totalsalesamount
		FROM Sales.Orders o
		INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
		INNER JOIN Production.Products p ON p.productid = d.productid
		WHERE custid = @custid
		GROUP BY d.productid, p.productname
ORDER BY totalsalesamount DESC;
GO


SELECT c.custid, c.contactname, p.productid, p.productname, p.totalsalesamount
FROM Sales.Customers c
CROSS APPLY dbo.fnGetTop3ProductsForCustomer(c.custid) p
ORDER BY c.custid;

-- Soal 5
SELECT c.custid, c.contactname, p.productid, p.productname, p.totalsalesamount
FROM Sales.Customers c
OUTER APPLY dbo.fnGetTop3ProductsForCustomer(c.custid) p
ORDER BY c.custid;


-- Soal 6
SELECT c.custid, c.contactname, p.productid, p.productname, p.totalsalesamount
FROM Sales.Customers c
OUTER APPLY dbo.fnGetTop3ProductsForCustomer(c.custid) p
WHERE p.productid IS NULL
ORDER BY c.custid;


-- PRAKTIKUM 3 
SELECT o.custid
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
GROUP BY o.custid
HAVING COUNT(DISTINCT d.productid) > 20;

-- Soal 7
SELECT o.custid
FROM Sales.Orders o
INNER JOIN Sales.Customers c ON o.custid = c.custid
WHERE c.country = 'USA'
EXCEPT
SELECT o.custid
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
GROUP BY o.custid
HAVING COUNT(DISTINCT d.productid) > 20;



SELECT o.custid
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
GROUP BY o.custid
HAVING SUM(d.qty * d.unitprice) > 10000;

-- Soal 8
SELECT o.custid
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
GROUP BY o.custid
HAVING SUM(d.qty * d.unitprice) > 10000
INTERSECT
SELECT o.custid
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
GROUP BY o.custid
HAVING COUNT(DISTINCT d.productid) > 20;

-- Soal 9

-- Soal 10
SELECT *
FROM
(
	SELECT o.custid
	FROM Sales.Orders o
	INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
	GROUP BY o.custid
	HAVING SUM(d.qty * d.unitprice) > 10000
INTERSECT
SELECT o.custid
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
GROUP BY o.custid
HAVING COUNT(DISTINCT d.productid) > 20
) result;


-- PRAKTIKUM BAGIAN 3
-- TRIGGER (AFTER)
GO
IF OBJECT_ID('Sales.trgAutoAddOrderDetailsForOrder') IS NOT NULL
	DROP TRIGGER Sales.trgAutoAddOrderDetailsForOrder;
GO;

CREATE TRIGGER trgAutoAddOrderDetailsForOrder ON Sales.Orders
AFTER INSERT
AS
	PRINT 'TRIGGER trgAutoAddOrderDetailsForOrder dipanggil!';

	DECLARE @orderid INT = (SELECT orderid FROM inserted);
	DECLARE @productid INT = 1;
	DECLARE @unitprice MONEY = 0;
	DECLARE @qty SMALLINT = 1;
	DECLARE @discount NUMERIC(4,3) = 0;

	INSERT INTO Sales.OrderDetails VALUES
	(@orderid, @productid, @unitprice, @qty, @discount);

	PRINT 'Data kosong ditambahkan secara otomatis ke tabel Sales.OrderDetails';
GO;


INSERT INTO Sales.Orders
	(custid, empid, orderdate, requireddate, shipperid, freight,
	shipname, shipaddress, shipcity, shipcountry)
VALUES
(85, 5, GETDATE(), GETDATE(), 3, 100, 'Kapal Api', 'Jl. Soekarno-Hatta', 'Malang', 'Indonesia');


IF OBJECT_ID('Production.trgAutoUpdateOrderDetailsUnitPrice') IS NOT NULL
DROP TRIGGER Production.trgAutoUpdateOrderDetailsUnitPrice;
GO;

CREATE TRIGGER trgAutoUpdateOrderDetailsUnitPrice ON Production.Products
AFTER UPDATE
AS 
	PRINT 'Trigger trgAutoUpdateOrderDetailsUnitPrice DIPANGGIL!';

	DECLARE @productid INT = (SELECT productid FROM inserted);
	DECLARE @uniprice MONEY = COALESCE((SELECT unitprice FROM inserted), 0.0);

	UPDATE Sales.OrderDetails SET unitprice = @uniprice
	WHERE productid = @productid;

	PRINT 'Harga di tabel Sales.OrderDetails secara otomatis disesuaikan';
GO;


UPDATE Production.Products SET unitprice = 100 WHERE productid = 11;
SELECT * FROM Production.Products WHERE productid = 11;
SELECT * FROM Sales.OrderDetails WHERE productid = 11;


-- Soal 12
SELECT * FROM Sales.OrderDetails;
SELECT * FROM Production.Products;

IF OBJECT_ID('Sales.trgAutoUpdateDiscontinuedCol') IS NOT NULL
DROP TRIGGER Sales.trgAutoUpdateDiscontinuedCol;
GO;

GO
CREATE TRIGGER trgAutoUpdateDiscontinuedCol ON Sales.OrderDetails
AFTER DELETE
AS
	UPDATE Production.Products
	SET discontinued = 1
	WHERE productid IN (SELECT productid FROM deleted);
GO;


BEGIN TRANSACTION;
BEGIN TRY
	DELETE FROM Sales.OrderDetails
	WHERE productid = 10;

	SELECT * FROM Production.Products WHERE productid = 10;
END TRY
BEGIN CATCH
	ROLLBACK TRANSACTION;
	PRINT 'Telah terjadi rollback karena terjadi kesalahan: ' + ERROR_MESSAGE();
END CATCH;


-- PRAKTIKUM BAGIAN 5
INSERT INTO HR.EmployeesBackup (
	lastname, firstname, title, titleofcourtesy, birthdate, hiredate, 
	address, city, region, postalcode, country, phone, mgrid)
SELECT lastname, firstname, title, titleofcourtesy, birthdate, hiredate,
	address, city, region, postalcode, country, phone, mgrid
FROM HR.Employees;


IF OBJECT_ID('HR.trgDivertInsertEmployeeToBackup') IS NOT NULL
DROP TRIGGER HR.trgDivertInsertEmployeeToBackup
GO;

CREATE TRIGGER trgDivertInsertEmployeeToBackup ON HR.Employees
INSTEAD OF INSERT
AS
	PRINT 'TRIGGER trgDivertInsertEmployeeToBackup DIPANGGIL!!';

	INSERT INTO HR.EmployeesBackup (
		lastname, firstname, title, titleofcourtesy, birthdate, hiredate,
		address, city, region, postalcode, country, phone, mgrid)
	SELECT 
		lastname, firstname, title, titleofcourtesy, birthdate, hiredate,
		address, city, region, postalcode, country, phone, mgrid
	FROM inserted;

	PRINT 'Employee baru disimpan di tabel HR.EmployeesBackup';
GO;

INSERT INTO HR.Employees
VALUES
	('Santoso', 'Adi', 'Staff', 'Mr. ', '19830101', '20170101',
	'Jl. Soekarno-Hatta', 'Malang', 'Jawa Timur', '65150', 'Indonesia',
	'(085) 123-456', 1);
SELECT * FROM HR.EmployeesBackup;


-- Soal 13
GO;
CREATE TRIGGER preventUserToUpdateEmployeeData ON HR.Employees
INSTEAD OF UPDATE
AS
	PRINT 'TRIGGER preventUserToUpdateEmployeeData dipanggil!';
	
	INSERT INTO HR.EmployeesBackup 
		(LastName, FirstName, Title, TitleOfCourtesy, BirthDate, HireDate, 
		Address, City, Region, PostalCode, Country, Phone, MGrid)
    SELECT LastName, FirstName, Title, TitleOfCourtesy, BirthDate, HireDate, 
           Address, City, Region, PostalCode, Country, Phone, MGrid
    FROM inserted;
GO;

UPDATE HR.Employees SET firstname = 'DEPAN', lastname = 'BELAKANG'
WHERE firstname = 'Adi';
SELECT * FROM HR.EmployeesBackup;


-- Soal 14
GO;
CREATE TRIGGER preventUserToDeleteEmployeeData ON HR.Employees
INSTEAD OF DELETE
AS
	PRINT 'TRIGGER preventUserToDeleteEmployeeData dipanggil!';

	DELETE FROM HR.EmployeesBackup
    WHERE empid = (SELECT empid deleted);
GO;


DELETE FROM HR.Employees WHERE firstname = 'Maria';
SELECT * FROM HR.EmployeesBackup;