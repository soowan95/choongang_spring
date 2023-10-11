-- 정수 : int
-- 문자열 :varchar (최대 길이)
-- 실수 : DEC (총 길이, 소숫점 이하 길이)
-- 날짜 (날짜시간)

USE mydb1;

CREATE TABLE my_table3 (
    col1 int
);

INSERT INTO my_table3 (col1) VALUE (2129);

SELECT * FROM my_table3;

CREATE TABLE my_table4 (
    col1 DEC
);

INSERT INTO my_table4 (col1) VALUE (3.14);

SELECT * FROM my_table4;

CREATE TABLE my_table5 (
    col1 DEC(5, 3)
);

INSERT INTO my_table5 (col1) VALUE (10.123);
INSERT INTO my_table5 (col1) VALUE (10.1234);
INSERT INTO my_table5 (col1) VALUE (100.1234);

SELECT * FROM my_table5;

CREATE TABLE my_table6 (
    age int,
    score DEC(7, 2)
);

INSERT INTO my_table6 (age, score) VALUE (20, 123.23);

SELECT * FROM my_table6;

CREATE TABLE my_table7 (
    col1 VARCHAR(1),
    col2 VARCHAR(2),
    col3 VARCHAR(16000)
);

CREATE TABLE my_table9 (
    name VARCHAR(100),
    address VARCHAR(200),
    phone VARCHAR(100)
);

CREATE TABLE my_table10 (
    col1 DATE
);

INSERT INTO my_table10 (col1) VALUE ('2000-01-01');

CREATE TABLE my_table11 (
    col1 DATETIME
);

INSERT INTO my_table11 (col1) VALUE (NOW());

SELECT * FROM my_table11;