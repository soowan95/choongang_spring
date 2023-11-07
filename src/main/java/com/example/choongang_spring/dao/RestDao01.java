package com.example.choongang_spring.dao;

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
}
