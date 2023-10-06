SELECT * FROM employees;
SELECT EmployeeID, LastName FROM employees;

SELECT EmployeeID AS id, LastName AS name FROM employees;

SELECT EmployeeID, CONCAT(FirstName, ' ', LastName) AS fullName FROM employees;
SELECT EmployeeID, CONCAT(FirstName, ' ', LastName) `full Name` FROM employees;

SELECT SupplierName, CONCAT(Address, ', ', City, ', ', Country) `address`, Phone `phone number` FROM suppliers;

SELECT * FROM products;
SELECT * FROM categories;

SELECT products.ProductName, categories.CategoryName FROM products JOIN categories ON products.CategoryID = categories.CategoryID;
SELECT p.ProductName, c.CategoryName FROM products AS p JOIN categories AS c ON p.CategoryID = c.CategoryID;
