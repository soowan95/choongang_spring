package com.example.choongang_spring.dao;

import com.example.choongang_spring.domain.MyDto40;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.Map;

@Mapper
public interface MyDao7 {

  @Select("""
  SELECT *
  FROM customers
  WHERE CustomerID = #{id}
  """)
  Map<String, Object> selectByCustomerId(Integer id);

  @Select("""
  SELECT *
  FROM employees
  WHERE EmployeeID = #{id}
  """)
  Map<String, Object> selectByEmployeeId(Integer id);

  @Insert("""
  INSERT INTO employees (LastName, FirstName, BirthDate)
  VALUE (#{lastName}, #{firstName}, #{birthDate})
  """)
  int insertEmployee(String lastName, String firstName, LocalDate birthDate);

  @Insert("""
  INSERT INTO products (ProductName, Price, CategoryID)
  VALUE (#{name}, #{price}, #{category})
  """)
  int insertProduct(String name, Double price, Integer category);

  @Delete("""
  DELETE FROM products
  WHERE ProductID = #{pid}
  """)
  int deleteByProductId(Integer pid);

  @Delete("""
  DELETE FROM customers
  WHERE CustomerID = #{cid}
  """)
  int deleteByCustomerId(Integer cid);

  @Update("""
  UPDATE products
  SET Price = #{price}, CategoryID = #{category}, ProductName = #{name}
  WHERE ProductID = #{id}
  """)
  int updateProduct(MyDto40 dto);

  @Update("""
  UPDATE employees
  SET LastName = #{lastName}, FirstName = #{firstName}, BirthDate = #{birthDate}
  WHERE EmployeeID = #{id}
  """)
  int updateEmployee(String lastName, String firstName, LocalDate birthDate, Integer id);
}
