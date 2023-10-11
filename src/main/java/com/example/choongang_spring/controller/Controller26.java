package com.example.choongang_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Controller
@RequestMapping("main26")
public class Controller26 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub1")
  public void method1() throws Exception {

    String sql = """
            INSERT INTO my_table12
            
            """;
  }
}
