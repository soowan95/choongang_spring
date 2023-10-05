SELECT * FROM customers WHERE Country = 'UK' OR Country = 'spain' OR Country = 'italy';
SELECT * FROM customers WHERE Country IN ('uk', 'spain', 'italy');

SELECT * FROM products WHERE CategoryID IN (3, 4);

SELECT * FROM orders WHERE OrderDate IN ('1996-07-04', '1996-07-05');

SELECT * FROM customers WHERE City IN ('london', 'madrid', 'sevilla');