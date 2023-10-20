package com.example.choongang_spring.dao;

import com.example.choongang_spring.domain.MyDto37;
import com.example.choongang_spring.domain.MyDto38;
import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Mapper
public interface MyDao6 {

  @Insert("""
  INSERT INTO customers (CustomerName)
  VALUE (#{name})
  """)
  @Options(useGeneratedKeys = true, keyProperty = "id")
  int insert1(MyDto37 dto);

  @Insert("""
  INSERT INTO employees (LastName)
  VALUE (#{lastName})
  """)
  @Options(useGeneratedKeys = true, keyProperty = "id")
  int insert2(MyDto38 dto);

  @Insert("""
  INSERT INTO employees (LastName, FirstName)
  VALUE (#{lastName}, #{firstName})
  """)
  @Options(useGeneratedKeys = true, keyProperty = "id")
  int insert3(MyDto38 dto);

  @Update("""
  UPDATE bank
  SET money = money - 1000
  WHERE name = 'son'
  """)
  int update1();

  @Update("""
  UPDATE bank
  SET money = money + 1000
  WHERE name = 'kim'
  """)
  int update2();

  @Select("""
  SELECT *
  FROM bank
  ORDER BY name
  """)
  List<Map<String, Object>> select1();
}
