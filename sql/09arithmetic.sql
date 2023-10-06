SELECT Price FROM products WHERE ProductID = 1;
SELECT Price + 1 FROM products WHERE ProductID = 1;
SELECT Price - 10.5 FROM products WHERE ProductID = 1;

SELECT ProductName, Price * 2 AS Price FROM products;

SELECT CONCAT(ProductName, 1), Price From products;

SELECT LastName, BirthDate FROM employees WHERE EmployeeID = 1;
SELECT LastName, BirthDate + 1 FROM employees WHERE EmployeeID = 1;
SELECT LastName, ADDDATE(BirthDate, INTERVAL 1 DAY ) FROM employees WHERE EmployeeID = 1;

SELECT * FROM employees;

SELECT EmployeeID, LastName, FirstName FROM employees;
SELECT EmployeeID, CONCAT(LastName, FirstName) FROM employees;
SELECT EmployeeID, CONCAT(LastName, ' ', FirstName), ADDDATE(BirthDate, INTERVAL 1 YEAR ) FROM employees;

SELECT Quantity * 2 FROM orderdetails;

SELECT CONCAT(city, ', ', Country) FROM customers;