-- 1

SELECT 
	productid,
	productname,
	supplierid,
	unitprice,
	discontinued
FROM Production.Products
WHERE categoryid = 1;


-- Soal 2
GO
CREATE VIEW Production.ProductsBeverages AS
SELECT 
	productid,
	productname,
	supplierid,
	unitprice,
	discontinued
FROM Production.Products
WHERE categoryid = 1;
GO


-- 3
SELECT productid, productname
FROM Production.ProductsBeverages
WHERE supplierid = 1;

-- 4
GO
ALTER VIEW Production.ProductsBeverages AS
SELECT 
	productid, productname, supplierid, unitprice, discontinued
FROM Production.Products
WHERE categoryid = 1
ORDER BY productname;
GO

-- Modifikasi no 4
GO
ALTER VIEW Production.ProductsBeverages AS
SELECT TOP(100) PERCENT
	productid, productname, supplierid, unitprice, discontinued
FROM Production.Products
WHERE categoryid = 1
ORDER BY productname;
GO

-- 5
SELECT TOP(100) PERCENT
	productid, productname, supplierid, unitprice, discontinued
FROM Production.Products
WHERE categoryid = 1
ORDER BY productname;

SELECT * 
FROM Production.ProductsBeverages;


-- 6
GO
ALTER VIEW Production.ProductsBeverages AS
SELECT
	productid, productname, supplierid, unitprice, discontinued,
	CASE 
		WHEN unitprice > 100 THEN N'high' 
		ELSE N'normal' 
	END
FROM Production.Products
WHERE categoryid = 1;
GO

-- 7
GO 
CREATE OR ALTER VIEW Production.ProductsBeverages AS
SELECT
	productid, productname, supplierid, unitprice, discontinued,
	CASE 
		WHEN unitprice > 100 THEN N'high' 
		ELSE N'normal' 
	END AS price_category
FROM Production.Products
WHERE categoryid = 1;
GO

-- Praktikum bagian 5
-- Hapus VIEW
IF OBJECT_ID(N'Production.ProductsBeverages', N'V') IS NOT NULL
DROP VIEW Production.ProductsBeverages;


-- 8
SELECT 
	p.productid, p.productname
FROM (
	SELECT
	productid, productname, supplierid, unitprice, discontinued,
	CASE 
		WHEN unitprice > 100 THEN N'high' 
		ELSE N'normal' 
	END AS price_type
	FROM Production.Products
) AS p
WHERE p.price_type = N'high';


-- 9
SELECT 
	o.custid,
	SUM(d.qty * d.unitprice) totalsalesamount
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
GROUP BY o.custid
ORDER BY o.custid ASC;

-- ini yang benar
SELECT 
	k.custid,
	SUM(k.totalsalesamountperorder) totalsalesamount,
	AVG(k.totalsalesamountperorder) avgtotalsalesamount
FROM (
	SELECT 
		o.custid,
		SUM(d.qty * d.unitprice) totalsalesamountperorder
	FROM Sales.Orders o
	INNER JOIN Sales.OrderDetails d ON d.orderid = o.orderid
	GROUP BY o.custid, o.orderid
) AS k
GROUP BY k.custid
ORDER BY k.custid ASC;


--  10
SELECT 
	YEAR(ov.orderdate) orderyear,
	SUM(ov.val) curtotalsales,
	prevorders.prevtotalsales,
	(
		(SUM(ov.val) - prevorders.prevtotalsales) 
		/ prevorders.prevtotalsales * 100
	) percentgrowth
FROM Sales.OrderValues ov
LEFT JOIN (
	SELECT
		YEAR(ov.orderdate) orderyear,
		SUM(ov.val) prevtotalsales
	FROM Sales.OrderValues ov
	GROUP BY YEAR(ov.orderdate)
) AS prevorders ON prevorders.orderyear = YEAR(ov.orderdate) -1
GROUP BY YEAR(ov.orderdate), prevorders.prevtotalsales
ORDER BY orderyear ASC;

-- 11
WITH ProductsBeverages AS
	(
		SELECT
		productid, productname, supplierid, unitprice, discontinued,
		CASE WHEN unitprice > 100 THEN N'high' 
			ELSE N'normal' 
		END AS pricetype
		FROM Production.Products
		WHERE categoryid = 1
	)
SELECT productid, productname
FROM ProductsBeverages
WHERE pricetype = 'high';


-- 12


-- 14
SELECT 
	custid, 
	SUM(val) AS totalsalesamount
FROM Sales.OrderValues
WHERE YEAR(orderdate) = 2007
GROUP BY custid;


-- 15
GO
CREATE FUNCTION getTotalSalesByCustomer
(@year AS INT) RETURNS TABLE
AS
RETURN 
	SELECT 
	custid, 
	SUM(val) AS totalsalesamount
FROM Sales.OrderValues
WHERE YEAR(orderdate) = 2007
GROUP BY custid;
GO

-- modifikasi nomor 15
-- ini tidak ada di soal
GO
CREATE FUNCTION getTotalSalesByCustomer2007()
RETURNS TABLE
AS
RETURN 
	SELECT 
	custid, 
	SUM(val) AS totalsalesamount
FROM Sales.OrderValues
WHERE YEAR(orderdate) = 2007
GROUP BY custid;
GO

-- 16
GO
ALTER FUNCTION getTotalSalesByCustomer
(@year AS INT) RETURNS TABLE
AS
RETURN 
	SELECT 
	custid, 
	SUM(val) AS totalsalesamount
FROM Sales.OrderValues
WHERE YEAR(orderdate) = @year
GROUP BY custid;
GO

-- 17
SELECT 
	custid, totalsalesamount
FROM getTotalSalesByCustomer(2007);



