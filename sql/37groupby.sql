-- GROUP BY : 그룹함수 사용 시 그룹함수의 범위 지정
SELECT MAX(Price)
FROM products;

SELECT CategoryID, MAX(Price)
FROM products
GROUP BY CategoryID;

SELECT OrderDate, SUM(Price * Quantity)
FROM products
         NATURAL JOIN orderdetails
         NATURAL JOIN orders
GROUP BY OrderDate
ORDER BY OrderDate;

SELECT LastName, SUM(Price * Quantity)
FROM products
         NATURAL JOIN orderdetails
         NATURAL JOIN orders
         NATURAL JOIN employees
GROUP BY EmployeeID;

SELECT CustomerName, SUM(Price * Quantity)
FROM products
         NATURAL JOIN orderdetails
         NATURAL JOIN orders
         NATURAL JOIN customers
GROUP BY CustomerID
ORDER BY 2 DESC ;

SELECT LastName, SUM(Price * Quantity) 처리금액
FROM products
         NATURAL JOIN orderdetails
         NATURAL JOIN orders
         NATURAL JOIN employees
GROUP BY EmployeeID
HAVING 처리금액 < 100000;