package com.example.choongang_spring.dao;

import com.example.choongang_spring.domain.MyDto36;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface MyDao5 {

  @Select("""
  <script>
  SELECT COUNT(*)
  FROM customers
  
  <if test='country != null'>
  WHERE Country = #{country}
  </if>
  </script>
  """)
  String select1(String country);

  @Select("""
  <script>
  SELECT CustomerName 
  FROM customers
  
  <if test='num == 10'>
  
  </if>
  <if test='num != 10'>
  
  </if>
  <if test='num gt 10'>
  
  </if>
  </script>
  """)
  void select2(Integer num);

  @Select("""
  <script>
  SELECT CustomerName, ContactName
  FROM customers
  
  <if test='code eq 1'>
  WHERE CustomerName LIKE #{k}
  </if>
  <if test='code eq 2'>
  WHERE ContactName LIKE #{k}
  </if>
  <if test='code eq null'>
  WHERE CustomerId IS NULL
  </if>
  </script>
  """)
  List<Map<String, Object>> select3(Integer code, String k);

  @Select("""
  <script>
  SELECT COUNT(*)
  FROM customers
  WHERE 
  <if test='i gt 10'>
  -- i 가 10보다 큼
  </if>
  <if test='i lt 10'>
  -- i 가 10보다 작음
  </if>
  <if test='(i gt 0) and (i lt 100)'>
  -- i 가 0보다 크고 100보다 작음
  </if>
  </script>
  """)
  String select4(int i);


  @Select("""
  SELECT *
  FROM customers
  WHERE CustomerName > 'a';
  """)
  String select5();

  @Select("""
  <script>
  <![CDATA[
  SELECT *
  FROM customers
  WHERE CustomerName < 'a';
  ]]>
  </script>
  """)
  String select6();

  @Select("""
  <script>
  SELECT *
  FROM customers
  WHERE 
  country IN
  <foreach collection="args" item="elem" separator=", " open="(" close=")">
  #{elem}
  </foreach>
  </script>
  """)
  String select7(List args);

  @Select("""
  <script>
  SELECT *
  FROM customers
  <trim prefix="WHERE" prefixOverrides="OR">
  <foreach collection="args" item="elem">
  OR country = #{elem}
  </foreach>
  </trim>
  </script>
  """)
  String select8(List args);

  @Select("""
  <script>
  <bind name="alterKeyword" value="'%'+keyword+'%'" />
  SELECT *
  FROM customers
  WHERE CustomerName LIKE #{alterKeyword}
  </script>
  """)
  String select9(String keyword);

  @Select("""
  <script>
  SELECT *
  FROM customers
  WHERE
  <if test="word == 'abc'">
  -- word is abc
  </if>
  <if test='word == "def"'>
  -- word is def
  </if>
  <if test='word == "k"'>
  -- word is k
  </if>
  </script>
  """)
  String select10(String word);

  @Select("""
  SELECT DISTINCT City
  FROM customers
  WHERE City IS NOT NULL AND City != ''
  ORDER BY 1
  """)
  List<String> listCustomerCity();

  @Select("""
  SELECT DISTINCT Country
  FROM customers
  WHERE Country IS NOT NULL AND Country != ''
  ORDER BY 1
  """)
  List<String> listCustomerCountry();

  @Select("""
  <script>
  SELECT CustomerName name, City, Country
  FROM customers
  <trim prefix="WHERE">
  <if test='type eq "1"'>
  City 
  <foreach collection="city" item="elem" open="IN (" separator=", " close=")">
  #{elem}
  </foreach>
  </if>
  <if test='type eq "2"'>
  Country
  <foreach collection="country" item="elem" open="IN (" separator=", " close=")">
  #{elem}
  </foreach>
  </if>
  </trim>
  ORDER BY name
  </script>
  """)
  List<Map<String, Object>> listCustomer(MyDto36 dto);
}
