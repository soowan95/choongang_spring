-- NULL 허용 여부
CREATE TABLE my_table13 (
  col1 INT,
  col2 INT NOT NULL
);

INSERT INTO my_table13 (col1, col2) VALUE (33, 44);
INSERT INTO my_table13 (col2) VALUE (55);
INSERT INTO my_table13 (col1) VALUE (66);

SELECT * FROM my_table13;
-- UNIQUE : 유일한 값 여부
CREATE TABLE my_table14
(
    col1 INT,
    co12 INT UNIQUE
);

INSERT INTO my_table14 (col1, co12) VALUE (11, 22);
INSERT INTO my_table14 (col1, co12) VALUE (11, 33);
INSERT INTO my_table14 (col1, co12) VALUE (11, 33);

SELECT * FROM my_table14;

CREATE TABLE my_table15 (
  col1 INT,
  col2 INT NOT NULL ,
  col3 INT UNIQUE,
  col4 INT NOT NULL UNIQUE
);

INSERT INTO my_table15 (col1, col2, col3, col4) VALUE (11, 22, 33, 44);
INSERT INTO my_table15 (col1, col2, col3, col4) VALUE (11, 22, 33, 44);
INSERT INTO my_table15 (col1, col2, col3, col4) VALUE (11, 22, 44, NULL);

SELECT * FROM my_table15;
-- DEFAULT : 기본값 지정
CREATE TABLE my_table17 (
  col1 INT,
  col2 INT DEFAULT 100,
  col3 VARCHAR(10) DEFAULT 'empty',
  col4 DATETIME DEFAULT NOW()
);

INSERT INTO my_table17 (col1, col2, col3, col4) VALUE (22, 33, 'son', '2023-11-11 22:33:44');
INSERT INTO my_table17 (col1) VALUE (222);

SELECT * FROM my_table17;

CREATE TABLE my_table18 (
  col1 INT,
  col2 INT DEFAULT 300,
  col3 INT NOT NULL DEFAULT 500
);

INSERT INTO my_table18 (col1, col2, col3) VALUE (3, NULL, NULL);
INSERT INTO my_table18 (col1,  col3) VALUE (3, 222);

SELECT * FROM my_table18;
-- DESCRIBE, DESC : 테이블 정보 확인
DESC my_table18;
-- CHECK : 값의 유효범위 체크
CREATE TABLE my_table20 (
    col1 INT,
    col2 INT CHECK ( col2 > 100 ),
    col3 INT CHECK ( col3 > 1000 AND col3 < 200)
)

DESC my_table20;