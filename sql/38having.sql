-- HAVING : 그룹함수 연산결과를 조건으로 줄 수 있는 키워드
SELECT *
FROM (SELECT CustomerName, SUM(Price * Quantity) 주문금액
      FROM products
               NATURAL JOIN orderdetails
               NATURAL JOIN orders
               NATURAL JOIN customers
      GROUP BY CustomerID) t
WHERE t.주문금액 > 100000;

SELECT CustomerName, SUM(Price * Quantity) 주문금액
FROM products
         NATURAL JOIN orderdetails
         NATURAL JOIN orders
         NATURAL JOIN customers
GROUP BY CustomerID
HAVING 주문금액 >= 100000;