-- Praktikum bagian 1
SELECT * FROM Sales.Customers

	SELECT 
		[custid],
		[companyname],
		[contactname],
		[contacttitle],
		[address],
		[city],
		[region],
		[postalcode],
		[country],
		[phone],
		[fax]
	FROM 
		[Sales].[Customers];


-- Praktikum bagian 2
SELECT 
	contactname, address, postalcode, city, country
FROM Sales.Customers;


-- Praktikum bagian 3
SELECT country FROM Sales.Customers;

SELECT DISTINCT country FROM Sales.Customers;

-- Praktikum bagian 4
SELECT 
	c.contactname, 
	c.contacttitle
FROM Sales.Customers AS c;

SELECT 
	c.contactname AS Name,
	c.contacttitle AS Title, 
	c.companyname AS "Company Name"
FROM Sales.Customers AS c;

-- Praktikum bagian 5
SELECT p.categoryid, p.productname
FROM Production.Products AS p;

SELECT 
	p.categoryid, p.productname,
	CASE 
		WHEN p.categoryid = 1 THEN 'Beverages'
		WHEN p.categoryid = 2 THEN 'Condiments'
		WHEN p.categoryid = 3 THEN 'Confections'
		WHEN p.categoryid = 4 THEN 'Dairy Products'
		WHEN p.categoryid = 5 THEN 'Grains/Cereals'
		WHEN p.categoryid = 6 THEN 'Meat/Poultry'
		WHEN p.categoryid = 7 THEN 'Produce'
		WHEN p.categoryid = 8 THEN 'Seafood'
		ELSE 'Other'
	END AS categoryname
FROM Production.Products p;

SELECT 
	p.categoryid, p.productname,
	CASE 
		WHEN p.categoryid = 1 THEN 'Beverages'
		WHEN p.categoryid = 2 THEN 'Condiments'
		WHEN p.categoryid = 3 THEN 'Confections'
		WHEN p.categoryid = 4 THEN 'Dairy Products'
		WHEN p.categoryid = 5 THEN 'Grains/Cereals'
		WHEN p.categoryid = 6 THEN 'Meat/Poultry'
		WHEN p.categoryid = 7 THEN 'Produce'
		WHEN p.categoryid = 8 THEN 'Seafood'
		ELSE 'Other'
	END AS categoryname,
	CASE
		WHEN p.categoryid IN (1, 7, 8) THEN 'Campaign Products'
		ELSE 'Non-Campaign Products'
	END AS iscampaign
FROM Production.Products AS p;


SELECT
	p.categoryid AS ID_KATEGORI,
	p.productname AS NAMA_PRODUK,
	CASE 
		WHEN p.categoryid = 1 THEN 'Beverages'
		WHEN p.categoryid = 2 THEN 'Condiments'
		WHEN p.categoryid = 3 THEN 'Confections'
		WHEN p.categoryid = 4 THEN 'Dairy Products'
		WHEN p.categoryid = 5 THEN 'Grains/Cereals'
		WHEN p.categoryid = 6 THEN 'Meat/Poultry'
		WHEN p.categoryid = 7 THEN 'Produce'
		WHEN p.categoryid = 8 THEN 'Seafood'
		ELSE 'Other'
	END AS NAMA_KATEGORI,
		CASE
		WHEN p.categoryid IN (1, 7, 8) THEN 'Campaign Products'
		ELSE 'Non-Campaign Products'
	END AS iscampaign
FROM Production.Products AS p
WHERE p.categoryid = 8;

SELECT 
	emp.firstname AS FIRST_NAME,
	emp.lastname AS LAST_NAME,
	emp.city AS CITY,
	emp.country AS COUNTRY
FROM HR.Employees AS emp
WHERE 
	COUNTRY = 'USA' AND CITY = 'Seattle';

