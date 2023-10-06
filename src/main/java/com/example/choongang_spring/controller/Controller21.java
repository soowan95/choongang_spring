package com.example.choongang_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
@RequestMapping("main21")
public class Controller21 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub1")
  public void method1() throws SQLException {
    String sql = """
            SELECT customerName, country
            FROM customers
            WHERE CustomerID <= 3
            """;

    Connection c = dataSource.getConnection();
    Statement st = c.createStatement();
    ResultSet rs = st.executeQuery(sql);

    try (c; st; rs) {

      System.out.println("고객 목록");
      while (rs.next()) {

//        String name = rs.getString(1);
//        String country = rs.getString(2);

        String name = rs.getString("customerName");
        String country = rs.getString("country");

        System.out.println(name + ": " + country);
      }
    }
  }

  @GetMapping("sub2")
  public void method2() throws SQLException {

    String sql = """
            SELECT CONCAT(lastName, ', ', firstName) `fullName`,
                   BirthDate `birth`,
                   Notes `DESC`
            FROM employees
            """;

    Connection c = dataSource.getConnection();
    Statement st = c.createStatement();
    ResultSet rs = st.executeQuery(sql);

    try (c; st; rs) {

      System.out.println("직원 조회");
      while (rs.next()) {

        String name = rs.getString("fullName");
        String birth = rs.getString("birth");
        String note = rs.getString("DESC");

        System.out.println(name + ": " + birth + ": " + note);
      }
    }
  }
}
