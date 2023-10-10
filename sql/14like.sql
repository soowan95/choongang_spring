SELECT *
FROM customers
WHERE CustomerName;


SELECT *
FROM customers
WHERE CustomerName LIKE '%the%';

SELECT *
FROM customers
WHERE CustomerName LIKE '%ch%';

SELECT *
FROM customers
WHERE CustomerName LIKE 'ch%';

SELECT *
FROM customers
WHERE CustomerName LIKE '%er';

SELECT *
FROM customers
WHERE CustomerName LIKE '%er%';

SELECT *
FROM employees
WHERE FirstName LIKE '_____';

SELECT *
FROM employees
WHERE FirstName LIKE '____';

SELECT *
FROM employees
WHERE LastName LIKE '_e%';

SELECT *
FROM products
WHERE ProductName LIKE 'ch%';

SELECT *
FROM products
WHERE ProductName LIKE '%es';

SELECT *
FROM products
WHERE ProductName LIKE '%use%';

SELECT *
FROM products
WHERE ProductName LIKE '_u%';
