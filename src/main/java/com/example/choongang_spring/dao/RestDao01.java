package com.example.choongang_spring.dao;

import com.example.choongang_spring.domain.MyDto33Employee;
import com.example.choongang_spring.domain.MyDto34Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RestDao01 {

  @Select("""
  SELECT customerName
  FROM customers
  WHERE CustomerID = 7;
  """)
  String select();

  @Select("""
  SELECT *
  FROM customers
  WHERE CustomerID = 7;
  """)
  MyDto34Customer selectCustomer();

  @Select("""
  SELECT CustomerName
  FROM customers
  WHERE CustomerID = #{id}
  """)
  String selectByCustomerId(Integer id);

  @Select("""
  SELECT EmployeeID `id`, LastName, FirstName, BirthDate, Photo, Notes
  FROM employees
  WHERE EmployeeID = #{id}
  """)
  MyDto33Employee selectByEmployeeId(Integer id);

  @Select("""
  SELECT CustomerID
  FROM customers
  ORDER BY CustomerID
  """)
  List<Integer> selectCustomerIdList();

  @Select("""
  SELECT EmployeeID `id`
  FROM employees
  ORDER BY EmployeeID
  """)
  List<Integer> selectEmployeeIdList();
}
