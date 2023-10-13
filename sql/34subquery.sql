SELECT COUNT(*) FROM suppliers s JOIN customers c ON s.Country = c.Country;

SELECT SupplierID, Country, (SELECT COUNT(*) FROM customers WHERE customers.Country = s.Country) `count` FROM suppliers s;

SELECT lastName, (SELECT COUNT(*) FROM employees e1 WHERE e1.BirthDate < e2.BirthDate) `NumberOfEmp` FROM employees e2;