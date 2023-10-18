package com.example.choongang_spring.dao;

import com.example.choongang_spring.domain.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface MyDao4 {

  @Select("""
  SELECT Customername
  FROM customers
  WHERE CustomerID = #{i}
  """)
  String select1(int i);

  @Select("""
  SELECT ProductName
  FROM products
  WHERE Price BETWEEN #{from} AND #{to}
  """)
  List<String> select2(Double from, Double to);

  @Select("""
  SELECT DISTINCT ProductName
  FROM products NATURAL JOIN orders
  WHERE OrderDate BETWEEN #{from} AND #{to}
  ORDER BY ProductID
  """)
  List<String> select3(LocalDate from, LocalDate to);

  @Select("""
  SELECT *
  FROM products
  WHERE price BETWEEN #{min} AND #{max}
  """)
  List<String> select4(MyDto25 dto);

  @Select("""
  SELECT CustomerName
  FROM customers
  WHERE Country = #{country1} OR Country = #{country2} 
  """)
  List<String> select5(MyDto26 dto);

  @Select("""
  SELECT COUNT(OrderID)
  FROM orders
  WHERE OrderDate BETWEEN #{dto1.from} AND #{dto2.to}
  """)
  Integer select6(MyDto27 dto1, MyDto28 dto2);

  @Select("""
  SELECT CustomerName
  FROM customers
  WHERE CustomerName LIKE #{dto2.keyword}
  LIMIT #{dto1.from}, #{dto1.rows}
  """)
  List<String> select7(MyDto29 dto1, MyDto30 dto2);

  @Insert("""
  INSERT INTO customers (CustomerName, Country)
  VALUES (#{name}, #{country})
  """)
  int insert1(MyDto31 dto);

  @Insert("""
  INSERT INTO employees (LastName, FirstName)
  VALUES (#{lastName}, #{firstName})
  """)
  int insert2(MyDto32 emp);
}
