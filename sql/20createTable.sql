USE mydb1;

CREATE TABLE my_table1 (
    col_name1 varchar(100),
    col_name2 varchar(100),
    col_name3 varchar(100)
);

SELECT * FROM my_table1;

INSERT INTO my_table1 (col_name1, col_name2, col_name3) VALUE ('민재', '흥민', '강인');

CREATE TABLE my_table2 (
    a varchar(10),
    b varchar(10),
    c varchar(10),
    d varchar(10)
);

SELECT * FROM my_table2;