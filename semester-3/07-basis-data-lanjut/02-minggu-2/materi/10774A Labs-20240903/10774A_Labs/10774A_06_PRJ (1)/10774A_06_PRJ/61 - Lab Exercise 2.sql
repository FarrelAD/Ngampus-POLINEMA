---------------------------------------------------------------------
-- LAB 06
--
-- Exercise 2
---------------------------------------------------------------------

USE TSQL;
GO

---------------------------------------------------------------------
-- Task 1
-- 
-- Open the project file F:\10774A_Labs\10774A_06_PRJ\10774A_06_PRJ.ssmssln and the T-SQL script 61 - Lab Exercise 2.sql. Ensure that you are connected to the TSQL2012 database.
--
-- Write a SELECT statement to retrieve the custid and contactname columns from the Sales.Customers table and the orderid and orderdate columns from the Sales.Orders table. Filter the results to include only orders placed on or after April, 1 2008 (filter the orderdate column). Then sort the result by orderdate in descending order and custid in ascending order.
--
-- Execute the written statement and compare the results that you got with the desired results shown in the file 62 - Lab Exercise 2 - Task 1 Result.txt.
---------------------------------------------------------------------
SELECT
	c.custid,
	c.contactname,
	o.orderid,
	o.orderdate
FROM Sales.Customers c
RIGHT JOIN Sales.Orders o ON c.custid = o.custid
WHERE o.orderdate >= '2008-04-01'
ORDER BY 
	o.orderdate DESC,
	c.custid ASC;

---------------------------------------------------------------------
-- Task 2
-- 
-- Execute the query exactly as written inside a query window and observe the result.
--
-- You get an error. What is the error message? Why do you think you got this error? (Tip: Remember the logical processing order of the query.)
--
-- Apply the needed changes to the SELECT statement so that it will run without an error. Test the changes by executing the T-SQL statement.
--
-- Observe and compare the results that you got with the recommended result shown in the file 63 - Lab Exercise 2 - Task 2 Result.txt.
---------------------------------------------------------------------

SELECT
	e.empid, e.lastname, e.firstname, e.title, e.mgrid,
	m.lastname AS mgrlastname, m.firstname AS mgrfirstname
FROM HR.Employees AS e
INNER JOIN HR.Employees AS m ON e.mgrid = m.empid
WHERE
	m.lastname = N'Buck';

---------------------------------------------------------------------
-- Task 3
-- 
-- Copy the existing T-SQL statement from task 2 and modify it so that the result will return all employees and be ordered by the manager�s first name. Try first to use the source column name, and then try to use the alias column name.
--
-- Execute the written statement and compare the results that you got with the recommended result shown in the file 64 - Lab Exercise 2 - Task 3 Result.txt.
--
-- Why were you able to use a source column name or an alias column name? 
---------------------------------------------------------------------

-- Cara 1
SELECT
	e.empid, e.lastname, e.firstname, e.title, e.mgrid,
	m.lastname AS mgrlastname, m.firstname AS mgrfirstname
FROM HR.Employees AS e
LEFT JOIN HR.Employees AS m ON e.mgrid = m.empid
WHERE e.mgrid IS NOT NULL
ORDER BY 
	m.firstname ASC,
	e.lastname DESC;

-- Cara 2
SELECT
	e.empid, e.lastname, e.firstname, e.title, e.mgrid,
	m.lastname AS mgrlastname, m.firstname AS mgrfirstname
FROM HR.Employees AS e
LEFT JOIN HR.Employees AS m ON e.mgrid = m.empid
WHERE e.mgrid IS NOT NULL
ORDER BY 
	mgrfirstname ASC,
	e.lastname DESC;