SELECT Price
FROM products
WHERE ProductName = 'Ipoh Coffee';

SELECT ProductName, Price
FROM products
WHERE Price > 46.00;

SELECT ProductName, Price
FROM products
WHERE Price > (SELECT Price FROM products WHERE ProductName = 'Ipoh Coffee');

SELECT BirthDate
FROM employees
WHERE LastName = 'Leverling';

SELECT LastName, FirstName, BirthDate
FROM employees
WHERE BirthDate < '1963-08-30';

SELECT LastName, FirstName, BirthDate
FROM employees
WHERE BirthDate < (SELECT BirthDate FROM employees WHERE LastName = 'Leverling');

SELECT ShipperID
FROM orders
WHERE OrderDate = '1996-07-08';
SELECT CustomerName
FROM customers
WHERE Country = 'mexico';

SELECT CustomerID, CustomerName
FROM customers
WHERE Country = 'mexico';

SELECT SupplierName
FROM suppliers
WHERE SupplierID = (SELECT SupplierID FROM products WHERE ProductName = 'tofu');

SELECT SupplierName
FROM suppliers
         NATURAL JOIN products
WHERE ProductName = 'tofu';

SELECT CustomerID
FROM customers
WHERE Country = 'mexico';

SELECT OrderDate
FROM orders
WHERE CustomerID IN (2, 3, 13, 58, 80);

SELECT OrderDate
FROM orders
WHERE CustomerID IN (SELECT CustomerID
                     FROM customers
                     WHERE Country = 'mexico');

SELECT CategoryID, OrderID
FROM orderdetails od
         NATURAL JOIN products p
WHERE CategoryID = 1;

SELECT OrderDate
FROM orders
WHERE OrderID IN (SELECT OrderID
                  FROM orderdetails od
                           NATURAL JOIN products p
                  WHERE CategoryID = 1);

SELECT DISTINCT CategoryID, OrderID, OrderDate
FROM orderdetails od
         NATURAL JOIN products p
         NATURAL JOIN orders o
WHERE CategoryID = 1;

SELECT CustomerId
FROM orders;

SELECT *
FROM customers
WHERE CustomerID NOT IN (SELECT CustomerId FROM orders);

SELECT *
FROM customers;

INSERT INTO customers (CustomerName, Address, Country) (SELECT SupplierName, Address, Country FROM suppliers);

INSERT INTO customers (CustomerName, Address, Country) (SELECT ContactName, City, Phone FROM suppliers);

CREATE TABLE table_c
SELECT CustomerName, City, Country
FROM customers;

SELECT *
FROM table_c;

CREATE TABLE table_d SELECT ProductName, CategoryName, Price FROM products NATURAL JOIN categories;

SELECT * FROM table_d;