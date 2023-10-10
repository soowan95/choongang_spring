INSERT INTO employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
    VALUE (10, '손', '흥민', '2000-01-01', '사진10', 'epl 득점왕');

INSERT INTO employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
    VALUE (11, '이', '강인', '2000-02-02', '사진11', '드리블 잘함');

INSERT INTO employees VALUE (12, '김', '민재', '2000-03-03', '사진12', '수비 벽');

INSERT INTO employees (EmployeeID, LastName, FirstName) VALUE (13, '박', '지성');

INSERT INTO employees (EmployeeID) VALUE (14);

INSERT INTO employees (LastName) VALUE ('son');

INSERT INTO employees (LastName) VALUE ('10000');

INSERT INTO employees (BirthDate) VALUE ('2000-01-01');

SELECT * FROM employees ORDER BY EmployeeID DESC;

INSERT INTO products (Price) VALUE (20.10);

INSERT INTO products (Price) VALUE ('30.33');

INSERT INTO products VALUE (80, '닭가슴살', 1, 1, '100 g', 1.2);

INSERT INTO products (ProductName, SupplierID, CategoryID, Unit, Price) VALUE ('고구마', 2, 2, '1 kg', '5.00');

SELECT * FROM products ORDER BY ProductID DESC;

SELECT * FROM suppliers ORDER BY SupplierID DESC;

SELECT * FROM employees ORDER BY EmployeeID DESC;

DELETE FROM employees WHERE EmployeeID > 17;