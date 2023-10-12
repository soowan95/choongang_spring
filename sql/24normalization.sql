CREATE TABLE my_table21_person (
    name VARCHAR(100) NOT NULL ,
    schools VARCHAR(100) ,
    skil VARCHAR(1000)
);

INSERT INTO my_table21_person (name, schools, skil) VALUE ('손흥민', '대학', '축구, 노래');
INSERT INTO my_table21_person (name, schools, skil) VALUE ('이강인', '대학원', '야구, 농구');
INSERT INTO my_table21_person (name, schools, skil) VALUE ('김민재', '대학원', '배구');

SELECT * FROM my_table21_person;

CREATE TABLE my_table22_person (
    name VARCHAR(20) NOT NULL ,
    schools VARCHAR(100),
    skill1 VARCHAR(100),
    skill2 VARCHAR(100),
    skill3 VARCHAR(100)
);

INSERT INTO my_table22_person (name, schools, skill1, skill2, skill3) VALUE ('흥민', '대학', '축구', '노래', NULL);
INSERT INTO my_table22_person (name, schools, skill1, skill2, skill3) VALUE ('강인', '대학원', '야구', '농구', NULL);
INSERT INTO my_table22_person (name, schools, skill1, skill2, skill3) VALUE ('민재', '대학원', '배구', NULL, NULL);

SELECT * FROM my_table22_person;

CREATE TABLE my_table23_person (
     name VARCHAR(20) NOT NULL ,
     schools VARCHAR(100),
     skill VARCHAR(1000)
);

INSERT INTO my_table23_person (name, schools, skill) VALUE ('흥민', '대학', '축구');
INSERT INTO my_table23_person (name, schools, skill) VALUE ('흥민', '대학', '노래');
INSERT INTO my_table23_person (name, schools, skill) VALUE ('강인', '대학', '야구');
INSERT INTO my_table23_person (name, schools, skill) VALUE ('강인', '대학', '농구');

SELECT * FROM my_table23_person;

CREATE TABLE my_table24_person (
    ssn VARCHAR(10) NOT NULL UNIQUE,
    name VARCHAR(10) NOT NULL,
    school VARCHAR(10),
    skill VARCHAR(10)
);

CREATE TABLE my_table25_person (
  id INT NOT NULL UNIQUE AUTO_INCREMENT,
  ssn VARCHAR(10) NOT NULL ,
  name VARCHAR(10) NOT NULL ,
  school VARCHAR(10),
  skill VARCHAR(10)
);

DROP TABLE my_table25_person;

INSERT INTO my_table25_person (ssn, name, school, skill) VALUE ('0210515', '흥민', '대학', '축구');
INSERT INTO my_table25_person (ssn, name, school, skill) VALUE ('0210515', '흥민', '대학', '노래');
INSERT INTO my_table25_person (ssn, name, school, skill) VALUE ('0410515', '강인', '대학', '농구');
INSERT INTO my_table25_person (ssn, name, school, skill) VALUE ('0410515', '강인', '대학', '축구');

SELECT * FROM my_table25_person;

CREATE TABLE my_table26_person (
  id INT PRIMARY KEY AUTO_INCREMENT,
  ssn VARCHAR(10) NOT NULL ,
  name VARCHAR(10) NOT NULL ,
  school VARCHAR(10),
  skill VARCHAR(10)
);