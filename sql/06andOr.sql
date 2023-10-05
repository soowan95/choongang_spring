SELECT CustomerName, City, Country FROM customers WHERE Country = 'spain';
SELECT CustomerName, City, Country FROM customers WHERE City = 'madrid';
SELECT CustomerName, City, Country FROM customers WHERE City = 'madrid' AND Country = 'spain';

SELECT CustomerName, City, Country FROM customers WHERE City = 'madrid';
SELECT CustomerName, City, Country FROM customers WHERE Country = 'spain';
SELECT CustomerName, City, Country FROM customers WHERE City = 'madrid' OR Country = 'spain';

SELECT CustomerName, City, Country FROM customers WHERE Country = 'spain' OR Country = 'UK';

SELECT * FROM products WHERE Price >= 10.00 AND Price <= 20.00;
SELECT * FROM customers WHERE CustomerName >= 'c' AND CustomerName < 'd';
SELECT * FROM employees WHERE BirthDate >= '1958-01-01' AND BirthDate < '1959-01-01';

SELECT * FROM suppliers WHERE Country = 'sweden' OR Country = 'italy';

SELECT * FROM employees WHERE BirthDate >= '1963-08-01' AND BirthDate < '1963-09-01';

SELECT * FROM products WHERE Price >= 100.00 AND Price <= 200.00;

SELECT * FROM orders WHERE OrderDate >= '1997-01-01' AND OrderDate <'1998-01-01';

SELECT * FROM products WHERE (Price < 10 OR Price >= 100.00) AND CategoryID = 1;