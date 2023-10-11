SELECT * FROM customers ORDER BY 1 DESC;

INSERT INTO customers (CustomerName) VALUE ('흥민');

INSERT INTO customers (CustomerName, ContactName) VALUE ('강인', '');

INSERT INTO customers (CustomerName, ContactName) VALUE ('민재', null);

SELECT ProductID, ProductName, Price FROM products ORDER BY 1 DESC;

INSERT INTO products (ProductName, Price) VALUE ('pizza', 0.00);

INSERT INTO products (ProductName, Price) VALUE ('burger', null);

SELECT * FROM products WHERE Price = 0.00 ORDER BY 1 DESC;

SELECT * FROM products WHERE Price != 0.00 ORDER BY 1 DESC;

SELECT * FROM products WHERE Price IS NULL;

SELECT * FROM products WHERE NOT Price IS NULL;

SELECT * FROM products WHERE Price IS NOT NULL;

SELECT ProductName, Price * 10 FROM products;

SELECT ProductName, Price FROM products ORDER BY ProductID DESC;

SELECT ProductName, IFNULL(Price, 0.00) FROM products ORDER BY ProductID DESC;

SELECT * FROM customers ORDER BY 1 DESC;

SELECT * FROM customers WHERE ContactName IS NULl;

SELECT * FROM customers WHERE Address IS NULL;

SELECT CustomerName, IFNULL(Country, '없음') FROM customers ORDER BY CustomerID DESC;