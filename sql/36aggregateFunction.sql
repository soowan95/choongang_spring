SELECT *
FROM products;

-- MAX 최댓값
SELECT MAX(Price)
FROM products;
SELECT ProductName, MAX(Price)
FROM products;

SELECT *
FROM products
WHERE Price = (SELECT MAX(Price) FROM products);

-- MIN 최솟값
SELECT MIN(Price)
FROM products;

SELECT *
FROM products
WHERE Price = (SELECT MIN(Price) FROM products);

SELECT LastName
FROM employees
WHERE BirthDate = (SELECT MAX(BirthDate) FROM employees);

SELECT LastName
FROM employees
WHERE BirthDate = (SELECT MIN(BirthDate) FROM employees);

-- COUNT 갯수

-- SUM 합
SELECT SUM(Price)
FROM products;

SELECT SUM(Quantity)
FROM orders o
         JOIN orderdetails od ON o.OrderID = od.OrderID
WHERE o.OrderDate = '1996-07-04';

SELECT SUM(Quantity * Price)
FROM orders
         NATURAL JOIN orderdetails
         NATURAL JOIN products
WHERE OrderDate = '1996-07-04';

-- AVG 평균
SELECT AVG(Price) FROM products;