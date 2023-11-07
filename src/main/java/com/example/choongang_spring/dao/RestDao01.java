package com.example.choongang_spring.dao;

import com.example.choongang_spring.domain.MyDto34Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
}
