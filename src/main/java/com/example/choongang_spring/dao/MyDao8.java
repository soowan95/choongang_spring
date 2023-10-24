package com.example.choongang_spring.dao;

import com.example.choongang_spring.domain.MyDto33Employee;
import com.example.choongang_spring.domain.MyDto45;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface MyDao8 {

  @Select("""
  SELECT *
  FROM products
  WHERE ProductID = #{id}
  """)
  Map<String, Object> selectProductById(Integer id);

  @Select("""
  SELECT EmployeeID id, FirstName, LastName, BirthDate, Photo, Notes
  FROM employees
  WHERE EmployeeID = #{id}
  """)
  MyDto33Employee selectByEmployeeId(Integer id);

  @Select("""
  SELECT ProductID id, Price, CategoryName category, Unit
  FROM products NATURAL JOIN categories
  WHERE ProductID = #{id}
  """)
  MyDto45 selectByProductAndCategory(Integer id);
}
