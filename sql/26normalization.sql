-- 첫번째 정규화 (FIRST NORMAL FORM) 1NF
-- 원자적 데이터를 가진 테이블, PK 컬럼이 있어야함

-- 두번째 정규화 (SECOND NORMAL FORM) 2NF
-- 1NF이고, 부분적 함수 의존이 없어야 함.

-- 부분적함수 의존 (partial functional dependency) :
-- 키가 아닌 컬럼의 값이 키 컬럼 일부에 의존.
-- 키의 일부가 변경되면 키가 아닌 컬럼이 변경되어야 하면 부분적 함수 의존임.

-- 세번째 정규화 (THIRD NORMAL FORM) 3NF
-- 2NF이고, 이행적 의존이 없어야 함.

-- 이행적 의존 (transitive dependency) :
-- 키가 아닌 컬림이 키가 아닌 다른 컬럼에 의존
-- 키가 아닌 컬럼이 변경되면 다른 키가 아닌 컬럼이 변경되어야 하면 이행적 종속임.

-- 입사지원자
-- 이름, 학교, 학교주소
CREATE TABLE my_table30_person
(
    id             INT PRIMARY KEY AUTO_INCREMENT,
    name           VARCHAR(10),
    school         VARCHAR(10),
    school_address VARCHAR(10)
);

INSERT INTO my_table30_person (name, school, school_address)
VALUES ('흥민', '서울대', '관악'),
       ('강인', '고려대', '안암'),
       ('민재', '연세대', '신촌'),
       ('지성', '고려대', '안암'),
       ('범근', '연세대', '신촌');

SELECT *
FROM my_table30_person;

CREATE TABLE my_table31_person
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR(10),
    school VARCHAR(10)
);

CREATE TABLE my_table32_school
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(10),
    address VARCHAR(10)
);

INSERT INTO my_table31_person (name, school)
VALUES ('흥민', '서울대'),
       ('강인', '고려대'),
       ('민재', '연세대'),
       ('지성', '고려대'),
       ('범근', '연세대');

INSERT INTO my_table32_school (name, address)
VALUES ('서울대', '관악'),
       ('고려대', '안암'),
       ('연세대', '신촌');

CREATE TABLE my_table33_person
(
    id        INT PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(10),
    school_id INT
);


CREATE TABLE my_table34_school
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(10),
    address VARCHAR(10)
);

INSERT INTO my_table33_person (name, school_id)
VALUES ('흥민', 1),
       ('강인', 2),
       ('민재', 1);

INSERT INTO my_table34_school (name, address)
VALUES ('서울대', '관악'),
       ('연세대', '신촌'),
       ('고려대', '안암');

INSERT INTO my_table33_person (name, school_id) VALUE ('지성', 4);

SELECT *
FROM my_table34_school;

CREATE TABLE my_table35_person
(
    id        INT PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(10),
    school_id INT REFERENCES my_table36_school(id)
);


CREATE TABLE my_table36_school
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(10),
    address VARCHAR(10)
);

INSERT INTO my_table35_person (name, school_id)
VALUES ('흥민', 1),
       ('강인', 2),
       ('민재', 1);

INSERT INTO my_table36_school (name, address)
VALUES ('서울대', '관악'),
       ('연세대', '신촌'),
       ('고려대', '안암');