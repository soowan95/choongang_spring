SELECT Country FROM customers;
SELECT Country FROM suppliers;

SELECT Country FROM customers
UNION
SELECT Country FROM suppliers;

SELECT Country FROM customers
UNION ALL
SELECT Country FROM suppliers;

SELECT CustomerName, Country FROM customers
UNION
SELECT SupplierName, Country FROM suppliers;

SELECT LastName `name` FROM employees
UNION
SELECT FirstName FROM employees;

SELECT * FROM my_table44_a a LEFT JOIN my_table45_b b ON a.col1 = b.col1;
SELECT * FROM my_table44_a a RIGHT JOIN my_table45_b b ON a.col1 = b.col1;

SELECT * FROM my_table44_a a LEFT JOIN my_table45_b b ON a.col1 = b.col1
UNION
SELECT * FROM my_table44_a a RIGHT JOIN my_table45_b b ON a.col1 = b.col1;