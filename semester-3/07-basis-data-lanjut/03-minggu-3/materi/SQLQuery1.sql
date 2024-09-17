
-- 1
SELECT 
	CURRENT_TIMESTAMP AS currentdatetime,
	CAST(GETDATE() AS DATE) AS currentdate,
	FORMAT(GETDATE(), 'HH:mm:ss') AS currenttime,
	YEAR(GETDATE()) AS currentyear,
	MONTH(GETDATE()) AS currentmonth,
	DAY(GETDATE()) AS currentday,
	(DAY(GETDATE()) - 1) / 7 + 1 AS currentweeknumber,
	FORMAT(GETDATE(), 'MMMM') AS currentmonthname;

-- 2
SELECT CAST(GETDATE() AS DATE) todaysdate;

SELECT FORMAT(GETDATE(), 'MMM dd, yyyy') AS todaysdate;

SELECT FORMAT(GETDATE(), 'dd MMM yyyy') AS todaysdate;


-- 3
SELECT 
    DATEADD(MONTH, 5, GETDATE()) AS fivemonths,
    DATEDIFF(DAY, GETDATE(), DATEADD(MONTH, 5, GETDATE())) AS diffdays,
    DATEDIFF(WEEK, '1945-08-17', '2022-08-17') AS diffweeks,
    CAST(DATEFROMPARTS(YEAR(GETDATE()), MONTH(GETDATE()), 1) AS DATETIME) AS firstday;


-- 4
CREATE TABLE Sales.Somedates (
	isitdate varchar(9)
)

INSERT INTO Sales.Somedates (isitdate) VALUES
	('20230101'),
	('20230102'),
	('20230103X'),
	('20230104'),
	('20230105'),
	('20230106'),
	('20230107Y'),
	('20230108');

SELECT 
	isitdate,
	TRY_CONVERT(DATE, isitdate) AS converteddate
FROM Sales.Somedates;

SELECT SYSDATETIME() sysdatetime;
SELECT CURRENT_TIMESTAMP currenttimestamp;


-- 5
SELECT DISTINCT
	custid,
	shipname,
	shippeddate
FROM Sales.Orders
WHERE 
	MONTH(shippeddate) = MONTH('2008-03-01') 
	AND
	YEAR(shippeddate) = YEAR('2008-03-01');


-- 6
SELECT 
	GETDATE() AS currentdatetime,
	DATEADD(MONTH, DATEDIFF(MONTH, 0, GETDATE()), 0) AS firstdate,
	EOMONTH(GETDATE()) AS lastdate;


-- 7
SELECT 
	orderid,
	custid,
	orderdate,
	shipaddress
FROM Sales.Orders
WHERE orderdate BETWEEN DATEADD(DAY, -4, EOMONTH(orderdate)) AND EOMONTH(orderdate);


-- 8
SELECT 
	CONCAT(contactname, ' (city: ', city, ')')
FROM Sales.Customers;


-- 9
SELECT 
	contactname, 
	contacttitle
FROM Sales.Customers
WHERE 
	contactname LIKE '[A-G]%';


-- 10
SELECT 
	REPLACE(contactname, ',', ' ') AS contactname,
	SUBSTRING(contactname, 1, CHARINDEX(',', contactname)) AS lastname
FROM Sales.Customers;


-- 11
SELECT
	CONCAT('C', RIGHT('00000' + CAST(custid AS VARCHAR(5)), 5))
FROM Sales.Customers;


-- 12
SELECT 
	contactname, 
	LEN(contactname) - LEN(REPLACE(contactname, 'A', '')) AS numberofa
FROM Sales.Customers;