-- 1
SELECT o.custid, c.contactname
FROM Sales.Orders o
INNER JOIN Sales.Customers c ON o.custid = c.custid
WHERE o.empid = 5
GROUP BY o.custid, c.contactname;


-- 2
SELECT o.custid, c.contactname, c.city
FROM Sales.Orders o
INNER JOIN Sales.Customers c ON o.custid = c.custid
WHERE o.empid = 5
GROUP BY o.custid, c.contactname;

-- 3
-- Ada error

-- 4
SELECT o.custid, c.contactname, c.city
FROM Sales.Orders o
INNER JOIN Sales.Customers c ON o.custid = c.custid
WHERE o.empid = 5
GROUP BY o.custid, c.contactname, c.city;


-- 5
SELECT custid, YEAR(orderdate) orderyear
FROM Sales.Orders
WHERE empid = 5
GROUP BY custid, YEAR(orderdate);

-- 6
SELECT c.categoryid, categoryname
FROM Production.Categories c
INNER JOIN Production.Products p ON c.categoryid = p.categoryid
INNER JOIN Sales.OrderDetails d ON d.productid = p.productid
INNER JOIN Sales.Orders o ON o.orderid = d.orderid
WHERE YEAR(o.orderdate) = 2008
GROUP BY categoryname, c.categoryid;


-- AGREGASI
-- 7
SELECT o.orderid, o.orderdate, SUM(d.qty * d.unitprice) salesamount
FROM Sales.Orders o 
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
GROUP BY o.orderid, o.orderdate
ORDER BY salesamount DESC;


-- 8
SELECT 
    o.orderid, 
    o.orderdate, 
    SUM(d.qty * d.unitprice) AS salesamount, 
    COUNT(d.orderid) AS nooforderlines, 
    AVG(d.qty * d.unitprice) AS avgsalesamountperorderline
FROM Sales.Orders o 
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
GROUP BY o.orderid, o.orderdate
ORDER BY salesamount DESC;


-- 9
SELECT 
	FORMAT(o.orderdate, 'yyyyMM') AS yearmonthno,
	SUM(d.qty * d.unitprice) saleamountpermonth
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
GROUP BY FORMAT(o.orderdate, 'yyyyMM')
ORDER BY yearmonthno ASC;


-- 10
SELECT 
	c.custid,
	contactname,
	SUM(d.qty * d.unitprice) totalsalesamount, 
	MAX(d.unitprice * d.qty) maxsalesamountperorderline,
	COUNT(*) numberofrows, 
	COUNT(d.orderid) numberoforderlines
FROM Sales.Customers c
LEFT JOIN Sales.Orders o ON c.custid = o.custid
LEFT JOIN Sales.OrderDetails d ON d.orderid = o.orderid
GROUP BY c.custid, contactname
ORDER BY totalsalesamount ASC;


-- DISTINCT
-- 11
SELECT
	YEAR(orderdate) orderyear,
	COUNT(orderid) nooforders,
	COUNT(DISTINCT custid) noofcustomers
FROM Sales.Orders
GROUP BY YEAR(orderdate)
ORDER BY orderyear ASC;

-- 13
SELECT 
	SUBSTRING(contactname, 1, 1) firstletter,
	COUNT(DISTINCT c.custid) noofcustomers,
	COUNT(orderid) nooforders
FROM Sales.Customers c
LEFT JOIN Sales.Orders o ON o.custid = c.custid
GROUP BY SUBSTRING(contactname, 1, 1)
ORDER BY firstletter ASC;

-- 14
SELECT 
	c.categoryid, 
	categoryname,
	SUM(d.qty * d.unitprice) totalsalesamount,
	COUNT(DISTINCT o.orderid) nooforders,
	SUM(d.qty * d.unitprice) / COUNT(DISTINCT o.orderid) AS avgsalesamountperorder
FROM Production.Categories c
INNER JOIN Production.Products p ON c.categoryid = p.categoryid
INNER JOIN Sales.OrderDetails d ON d.productid = p.productid
INNER JOIN Sales.Orders o ON o.orderid = d.orderid
WHERE YEAR(o.orderdate) = 2008
GROUP BY categoryname, c.categoryid
ORDER BY c.categoryid ASC;

--HAVING
-- 15
SELECT TOP 5
	o.custid,
	SUM(d.qty * d.unitprice) totalsalesamount
FROM Sales.Orders o 
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
GROUP BY o.custid
HAVING SUM(d.qty * d.unitprice) > 10000
ORDER BY totalsalesamount DESC;


-- 16
SELECT 
	empid, 
	o.orderid,
	SUM(d.qty * d.unitprice) totalsalesamount
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
WHERE YEAR(o.orderdate) = 2008
GROUP BY empid, o.orderid;


-- 17
SELECT 
	empid, 
	o.orderid,
	SUM(d.qty * d.unitprice) totalsalesamount
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
WHERE YEAR(o.orderdate) = 2008
GROUP BY empid, o.orderid
HAVING SUM(d.qty * d.unitprice) > 10000;


-- 18
SELECT 
	empid, 
	o.orderid,
	SUM(d.qty * d.unitprice) totalsalesamount
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
WHERE 
	YEAR(o.orderdate) = 2008 AND
	empid = 3
GROUP BY empid, o.orderid
HAVING SUM(d.qty * d.unitprice) > 10000;


-- 19
SELECT
	o.custid,
	MAX(o.orderdate) lastorderdate,
	SUM(d.qty * d.unitprice) totalsalesamount
FROM Sales.Orders o 
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
GROUP BY o.custid
HAVING COUNT(DISTINCT o.orderid) > 25
ORDER BY totalsalesamount DESC;


--SUBQUERY
-- 20
SELECT MAX(orderdate) lastorderdate 
FROM Sales.Orders;


-- 21
SELECT 
	orderid,
	orderdate,
	empid,
	custid
FROM Sales.Orders
WHERE orderdate = (
	SELECT MAX(orderdate) lastorderdate 
	FROM Sales.Orders);


-- 22
SELECT
	orderid,
	orderdate,
	empid,
	custid
FROM Sales.Orders o
WHERE custid =
	(
		SELECT custid
		FROM Sales.Customers
		WHERE contactname LIKE N'I%'
	);

-- 23 
-- Ada error

-- 24
SELECT
	orderid,
	orderdate,
	empid,
	custid
FROM Sales.Orders o
WHERE custid IN 
	(
		SELECT custid
		FROM Sales.Customers
		WHERE contactname LIKE 'B%'
	);


-- 25
SELECT 
	o.orderid,
	SUM(d.qty * d.unitprice) totalsalesamount,
	SUM(d.qty * d.unitprice) / 
	(
		SELECT SUM(qty * unitprice)
		FROM Sales.OrderDetails d
		INNER JOIN Sales.Orders o 
			ON d.orderid = o.orderid
		WHERE 
			MONTH(o.orderdate) = 5 AND 
			YEAR(o.orderdate) = 2008
	) * 100 salespctoftotal
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d 
	ON d.orderid = o.orderid
WHERE 
	MONTH(o.orderdate) = 5 AND 
	YEAR(o.orderdate) = 2008
GROUP BY o.orderid;


-- SUBQUERY SKALAR DAN MULTI NILAI
-- 26
-- versi 1
SELECT 
	p.productid,
	p.productname
FROM Production.Products p
INNER JOIN Sales.OrderDetails d ON p.productid = d.productid
INNER JOIN Sales.Orders o on d.orderid = o.orderid
GROUP BY p.productid, p.productname
HAVING SUM((
		SELECT SUM(dl.qty)
		FROM Sales.OrderDetails dl
		WHERE dl.productid = d.productid
	)) > 100;

-- versi 2
SELECT 
    p.productid,
    p.productname
FROM Production.Products p
INNER JOIN Sales.OrderDetails d ON p.productid = d.productid
INNER JOIN Sales.Orders o ON d.orderid = o.orderid
GROUP BY p.productid, p.productname
HAVING SUM(d.qty) > 1000
ORDER BY SUM(d.qty) DESC;


-- 27
SELECT c.custid, contactname
FROM Sales.Customers c
WHERE NOT EXISTS (
	SELECT * FROM Sales.Orders o
	WHERE o.custid = c.custid);

-- 28
INSERT INTO Sales.Orders 
VALUES 
(NULL, 1, '20111231', '20111231', '20111231', 1, 0, 'ShipOne', 'ShipAddress', 'ShipCity', 'RA', '1000', 'USA');
-- Sukses!


-- 29
SELECT c.custid, contactname
FROM Sales.Customers c
LEFT JOIN Sales.Orders o ON o.custid = c.custid
WHERE o.orderid IS NULL;


-- 30
-- versi 1
SELECT 
	c.custid, 
	contactname,
	MAX(orderdate) lastorderdate
FROM Sales.Customers c
LEFT JOIN Sales.Orders o ON o.custid = c.custid
GROUP BY c.custid, contactname;

-- versi 2
SELECT 
	c.custid,
	contactname,
	(
		SELECT MAX(orderdate)
		FROM Sales.Orders o
		WHERE o.custid = c.custid
	) lastorderdate
FROM Sales.Customers c;

-- 31
SELECT c.custid, contactname
FROM Sales.Customers c
WHERE NOT EXISTS (
	SELECT * FROM Sales.Orders o
	WHERE o.custid = c.custid);


-- 32
SELECT 
	c.custid, 
	contactname
FROM Sales.Customers c
WHERE EXISTS (
	SELECT 1
	FROM Sales.Orders o
	INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
	WHERE 
		o.orderdate >= '2008-04-01' AND 
		d.unitprice > 100 AND
		c.custid = o.custid
);



-- 33
SELECT 
    YEAR(o.orderdate) AS orderyear,
    SUM(d.qty * d.unitprice) AS totalsales,
    (SELECT SUM(dl.qty * dl.unitprice) 
     FROM Sales.OrderDetails dl
     INNER JOIN Sales.Orders oo ON dl.orderid = oo.orderid
     WHERE YEAR(oo.orderdate) <= YEAR(o.orderdate)
    ) AS runsales
FROM Sales.Orders o
INNER JOIN Sales.OrderDetails d ON o.orderid = d.orderid
GROUP BY YEAR(o.orderdate)
ORDER BY orderyear ASC;
