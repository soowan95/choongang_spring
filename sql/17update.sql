SELECT * FROM products;

SELECT * FROM products WHERE ProductID = 1;

UPDATE products
SET ProductName = '차이즈',
    Unit        = '10 박스',
    Price       = 36.00
WHERE ProductID = 1;

UPDATE products
SET ProductName = '두부김치';

SELECT * FROM customers WHERE CustomerID = 3;

UPDATE customers SET CustomerName = '안토니' WHERE CustomerID = 3;

SELECT * FROM employees WHERE EmployeeID = 5;

UPDATE employees SET Notes = '열심히 함' WHERE EmployeeID = 5;

SELECT * FROM suppliers WHERE SupplierID = 1;

UPDATE suppliers SET Phone = '010-1234-1234', Address = 'Seoul' WHERE SupplierID = 1;

SELECT * FROM products WHERE CategoryID = 1;

UPDATE products SET Price = Price * 2 WHERE CategoryID = 1;