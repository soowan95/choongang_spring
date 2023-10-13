SELECT e1.LastName, e1.BirthDate, e2.LastName, e2.BirthDate
FROM employees e1
         JOIN employees e2
WHERE e1.BirthDate < e2.BirthDate
  AND e2.LastName = 'Leverling';

SELECT p1.ProductName
FROM products p1
         JOIN products p2 ON p1.Price > p2.Price
WHERE p2.ProductName = 'Ipoh Coffee';