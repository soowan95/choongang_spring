SELECT *
FROM products;
SELECT *
FROM categories;

SELECT CategoryID
FROM products
WHERE ProductName = 'chais';

SELECT CategoryName
FROM categories
WHERE CategoryID = 1;

SELECT *
FROM categories
         JOIN products;

CREATE TABLE table_a
(
    product_id   INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(20),
    category_id  INT
);

CREATE TABLE table_b
(
    category_id   INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(20)
);

INSERT INTO table_b (category_name)
VALUES ('음료수'),
       ('반찬');

INSERT INTO table_a (product_name, category_id)
VALUES ('콜라', 1),
       ('사이다', 1),
       ('제육', 2),
       ('돈까스', 2),
       ('두부', 2);

SELECT *
FROM table_b
         JOIN table_a ON table_a.category_id = table_b.category_id;

SELECT *
FROM products p
         JOIN categories c ON p.CategoryID = c.CategoryID
WHERE ProductName = 'chais';

SELECT SupplierName, Phone
FROM suppliers s
         JOIN w3schools.products p on s.SupplierID = p.SupplierID
WHERE ProductName = 'chais';

SELECT CustomerName
FROM customers c
         JOIN w3schools.orders o on c.CustomerID = o.CustomerID
WHERE OrderDate = '1996-07-04';

SELECT CONCAT(LastName, ' ', FirstName) `Name`
FROM employees e
         JOIN w3schools.orders o on e.EmployeeID = o.EmployeeID
WHERE OrderDate = '1996-07-04';

SELECT SupplierName, CategoryName
FROM suppliers s
         JOIN products p ON s.SupplierID = p.SupplierID
         JOIN categories c on p.CategoryID = c.CategoryID
WHERE ProductName = 'Chang';

SELECT CustomerName, CONCAT(LastName, ' ', FirstName) `Name`
FROM orders o
         JOIN customers c on o.CustomerID = c.CustomerID
         JOIN employees e on o.EmployeeID = e.EmployeeID
WHERE OrderDate = '1996-07-09';

SELECT ProductName
FROM orders o
         JOIN orderdetails od ON o.OrderID = od.OrderID
         JOIN products p ON od.ProductID = p.ProductID
WHERE OrderDate = '1996-07-09';

SELECT ProductName, OrderDate, CustomerName, CONCAT(LastName, ' ', FirstName) `Name`
FROM orders o
         JOIN orderdetails od ON o.OrderID = od.OrderID
         JOIN products p ON p.ProductID = od.ProductID
         JOIN customers c ON c.CustomerID = o.CustomerID
         JOIN employees e ON o.EmployeeID = e.EmployeeID
WHERE ProductName = 'Chang';