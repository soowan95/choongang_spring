package com.example.choongang_spring.dao;

import com.example.choongang_spring.domain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Mapper
public interface MyDao3 {

  @Select("""
  SELECT customerName FROM customers
  WHERE CustomerID = 1
  """)
  String select1();

  @Select("""
  SELECT Price FROM products
  WHERE ProductID = 1
  """)
  Double select2();

  @Select("""
  SELECT LastName FROM employees
  WHERE EmployeeID = 1
  """)
  String select3();

  @Select("""
  SELECT BirthDate FROM employees
  WHERE EmployeeID = 2;
  """)
  LocalDate select4();

  @Select("""
  SELECT DISTINCT Country FROM customers
  ORDER BY 1
  """)
  List<String> select5();

  @Select("""
  SELECT BirthDate FROM employees
  ORDER BY 1
  """)
  List<LocalDate> select6();

  @Select("""
  SELECT Price FROM products
  ORDER BY 1
  """)
  List<Double> select7();

  @Select("""
  SELECT CustomerID, CustomerName, Address
  FROM customers
  WHERE CustomerID = 1
  """)
  Map<String, Object> select8();

  @Select("""
  SELECT ProductName, Price, CategoryName
  FROM products NATURAL JOIN categories
  WHERE ProductID = 1
  """)
  Map<String, Object> select9();

  @Select("""
  SELECT EmployeeID, LastName, FirstName
  FROM employees
  WHERE EmployeeID = 1
  """)
  MyDto19 select10();

  @Select("""
  SELECT ProductName, Price, CategoryName
  FROM products NATURAL JOIN categories
  WHERE ProductID = 1
  """)
  MyDto20 select11();

  @Select("""
  SELECT CustomerID id, CustomerName name, Country 
  FROM customers
  WHERE CustomerID = 2
  """)
  MyDto21 select12();

  @Select("""
  SELECT ProductID id, ProductName name, Price
  FROM products
  WHERE CategoryID = 2
  ORDER BY Price
  """)
  List<Map<String, Object>> select13();

  @Select("""
  SELECT ProductName name, Quantity, Price
  FROM products NATURAL JOIN orderdetails NATURAL JOIN orders
  WHERE OrderDate = '1996-07-04'
  """)
  List<Map<String, Object>> select14();

  @Select("""
  SELECT ProductName name, Quantity, Price
  FROM products NATURAL JOIN orderdetails NATURAL JOIN orders
  WHERE OrderDate = '1996-07-04'
  """)
  List<MyDto22> select15();

  @Select("""
  SELECT OrderDate, ProductName, CategoryName, Quantity, Price
  FROM products NATURAL JOIN orders NATURAL JOIN categories NATURAL JOIN orderdetails
  WHERE CategoryID = 1
  ORDER BY OrderDate, ProductName
  """)
  List<MyDto23> select16();

  @Select("""
  SELECT CustomerName
  FROM customers
  WHERE CustomerID = 100
  """)
  String select17();

  @Select("""
  SELECT CustomerID
  FROM customers
  WHERE CustomerID = 100
  """)
  Integer select18();

  @Select("""
  SELECT CustomerID id, CustomerName name, Country
  FROM customers
  WHERE CustomerID = 1
  """)
  MyDto24 select19();

  @Select("""
  SELECT CustomerID id, CustomerName name, Country
  FROM customers
  WHERE CustomerID > 1
  """)
  MyDto24 select20();
}
