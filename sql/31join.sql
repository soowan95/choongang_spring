SELECT DISTINCT CustomerID
FROM orders
ORDER BY 1;

SELECT CustomerName
FROM customers
WHERE CustomerID NOT IN (SELECT DISTINCT CustomerID FROM orders ORDER BY 1);

SELECT c.CustomerName
FROM customers c
         LEFT JOIN orders o ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL;

SELECT CONCAT(LastName, ' ', FirstName) `name`
FROM employees e
         LEFT JOIN orders o ON e.EmployeeID = o.EmployeeID
WHERE o.EmployeeID IS NULL;

INSERT INTO employees (LastName, FirstName, BirthDate, Photo, Notes)
VALUES ('손', '흥민', '2022-01-01', '사진1', '축구선수');
