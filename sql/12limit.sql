SELECT * FROM customers;

SELECT * FROM customers LIMIT 3;

SELECT * FROM employees LIMIT 2;

SELECT * FROM employees ORDER BY BirthDate LIMIT 2;

SELECT * FROM products ORDER BY Price DESC LIMIT 10;

SELECT * FROM employees ORDER BY BirthDate DESC LIMIT 3;

SELECT * FROM products WHERE CategoryID = 2 ORDER BY Price LIMIT 1;

SELECT ProductName, Price FROM products ORDER BY Price LIMIT 3;
SELECT ProductName, Price FROM products ORDER BY Price LIMIT 0, 3;

SELECT ProductName, Price FROM products ORDER BY Price LIMIT 1, 3;

SELECT ProductName, Price FROM products ORDER BY Price LIMIT 2, 3;

SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID;

SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 0, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 10, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 20, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 30, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 40, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 50, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 60, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 70, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 80, 10;
SELECT CustomerID, CustomerName FROM customers ORDER BY CustomerID LIMIT 90, 10;

SELECT * FROM suppliers ORDER BY SupplierID LIMIT 10, 5;