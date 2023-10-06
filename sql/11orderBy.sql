SELECT * FROM employees ORDER BY BirthDate;

SELECT * FROM employees ORDER BY 4;

SELECT EmployeeID, LastName, BirthDate FROM employees ORDER BY 3;

SELECT * FROM products;

SELECT * FROM products ORDER BY CategoryID;
SELECT * FROM products ORDER BY CategoryID, Price;
SELECT * FROM products ORDER BY 4, 6;

SELECT * FROM products ORDER BY CategoryID DESC;
SELECT * FROM products ORDER BY CategoryID DESC, Price;
SELECT * FROM products ORDER BY CategoryID DESC, Price DESC;

SELECT * FROM customers ORDER BY Country;

SELECT * FROM products ORDER BY Price DESC;

SELECT * FROM employees ORDER BY BirthDate DESC;