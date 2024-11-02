-- Minggu 7


-- 1
SELECT
	orderid,
	orderdate,
	val,
	ROW_NUMBER() OVER(ORDER BY orderdate) rowno
FROM Sales.OrderValues;

-- 2
SELECT
	orderid,
	orderdate,
	val,
	ROW_NUMBER() OVER(ORDER BY orderdate) rowno,
	RANK() OVER(ORDER BY orderdate) rankno
FROM Sales.OrderValues;

SELECT TOP 5
	orderid,
	orderdate,
	val,
	ROW_NUMBER() OVER(ORDER BY orderdate) rowno,
	RANK() OVER(ORDER BY orderdate) rankno
FROM Sales.OrderValues
ORDER BY rankno DESC


-- 4
SELECT 
	orderid, 
	orderdate,
	custid,
	val,
	RANK() OVER(PARTITION BY custid ORDER BY val) orderrankno
FROM Sales.OrderValues;


-- 5
SELECT
    custid,
    val,
    YEAR(orderdate) AS orderyear,
    ROW_NUMBER() OVER (PARTITION BY custid, YEAR(orderdate) ORDER BY val) AS orderrankno
FROM Sales.OrderValues;


-- 6
-- kueri di bawah ini adalah kueri yang salah
SELECT
    custid,
    val,
    YEAR(orderdate) AS orderyear,
    ROW_NUMBER() OVER (PARTITION BY custid, YEAR(orderdate) ORDER BY val) AS orderrankno
FROM Sales.OrderValues
WHERE ROW_NUMBER() OVER (PARTITION BY custid, YEAR(orderdate) ORDER BY val) IN (1, 2);

-- kueri di bawah ini adalah kueri yang benar
WITH cte AS (
	SELECT
		custid,
		val,
		YEAR(orderdate) AS orderyear,
		ROW_NUMBER() OVER (PARTITION BY custid, YEAR(orderdate) ORDER BY val) AS orderrankno
	FROM Sales.OrderValues
)
SELECT *
FROM cte
WHERE cte.orderrankno IN (1, 2);

	

-- 7
WITH OrderRows AS
(
	SELECT 
	orderid, orderdate, val,
	ROW_NUMBER() OVER (ORDER BY orderdate, orderid) rowno
FROM Sales.OrderValues
)
SELECT * FROM OrderRows;


-- 8
SELECT 
	orderid, orderdate, val,
	ROW_NUMBER() OVER (ORDER BY orderdate, orderid) rowno
FROM Sales.OrderValues;


-- 8
WITH OrderRows AS
(
	SELECT 
	orderid, orderdate, val,
	ROW_NUMBER() OVER (ORDER BY orderdate, orderid) rowno
	FROM Sales.OrderValues
)
SELECT 
	o.orderid,
	o.orderdate,
	o.val,
	(p.val) AS prevval,
	(o.val - p.val) AS valdiff
	FROM OrderRows AS o
LEFT OUTER JOIN OrderRows AS p ON o.rowno = p.rowno + 1;


-- 9
SELECT 
orderid, orderdate, val,
ROW_NUMBER() OVER (ORDER BY orderdate, orderid) rowno,
LAG(val) OVER(ORDER BY orderdate) prevval,
(val - LAG(val) OVER(ORDER BY orderdate)) diffprev
FROM Sales.OrderValues;


-- 10
WITH SalesMonth2007 AS (
	SELECT 
		MONTH(orderdate) AS monthno,
		SUM(val) AS total_sales
	FROM Sales.OrderValues
	WHERE YEAR(orderdate) = 2007
	GROUP BY MONTH(orderdate)
)
SELECT *
FROM SalesMonth2007
ORDER BY monthno;

-- 11
WITH SalesMonth2007 AS (
	SELECT 
		MONTH(orderdate) AS monthno,
		SUM(val) AS val
	FROM Sales.OrderValues
	WHERE YEAR(orderdate) = 2007
	GROUP BY MONTH(orderdate)
)
SELECT 
	monthno,
	val,
	(LAG(val, 3) OVER(ORDER BY monthno) / 3) avglast3months,
	(val - (FIRST_VALUE(val) OVER(ORDER BY monthno))) diffjanuary,
	LEAD(val) OVER(ORDER BY monthno) nextval
FROM SalesMonth2007
ORDER BY monthno;


-- 12
SELECT
	custid, orderid, orderdate, val,

FROM Sales.OrderValues
ORDER BY custid ASC, val DESC;