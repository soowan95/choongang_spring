package com.example.choongang_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main23")
public class Controller23 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub1")
  public void method1(@RequestParam("sw") String keyword) throws SQLException {

    String sql = """
            SELECT *
            FROM products
            WHERE productName LIKE ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, "%" + keyword + "%");
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      System.out.println();
      System.out.println(keyword + "가 포함된 결과");
      while (rs.next()) {

        String name = rs.getString("productName");
        System.out.println("name = " + name);
      }
    }
  }

  @GetMapping("sub2")
  public void method2(@RequestParam(value = "k", required = false) String keyword, Model model) throws SQLException {

    List<String> list = new ArrayList<>();

    String sql = """
            SELECT *
            FROM customers
            WHERE CustomerName LIKE ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, "%" + keyword + "%");
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      while (rs.next()) {

        String name = rs.getString("CustomerName");
        list.add(name);
      }
    }

    model.addAttribute("nameList", list);
  }

  @GetMapping("sub3")
  public void method3(@RequestParam(value = "st", defaultValue = "name1") String searchType, @RequestParam(value = "k", required = false) String keyword, Model model) throws SQLException {

    List<Map<String, Object>> list = new ArrayList<>();

    String sql = """
            SELECT *
            FROM customers
            WHERE
            """;

    if (searchType.equals("name1")) {

      sql += " customerName LIKE ?";
    } else if (searchType.equals("name2")) {

      sql += " contactName LIKE ?";
    }

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, "%" + keyword + "%");
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      while (rs.next()) {

        String customerName = rs.getString("customerName");
        String contactName = rs.getString("contactName");

        list.add(Map.of("customerName", customerName, "contactName", contactName));
      }
    }

    model.addAttribute("customers", list);
  }

  @GetMapping("sub4")
  public void method4(@RequestParam(value = "t", defaultValue = "lname") String option, @RequestParam(value = "k", required = false) String keyword, Model model) throws SQLException {

    List<Map<String, Object>> list = new ArrayList<>();

    String sql = """
            SELECT *
            FROM employees
            WHERE
            """;

    if (option.equals("lname")) {
      sql += " LastName LIKE ?";
    } else if (option.equals("fname")) {
      sql += " FirstName LIKE ?";
    } else if (option.equals("note")) {
      sql += " Notes LIKE ?";
    }

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, "%" + keyword + "%");
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      while (rs.next()) {

        String lastName = rs.getString("LastName");
        String firstName = rs.getString("FirstName");
        String note = rs.getString("Notes");

        list.add(Map.of("lastName", lastName, "firstName", firstName, "note", note));
      }
    }

    model.addAttribute("keyword", keyword);
    model.addAttribute("option", option);
    model.addAttribute("someList", list);
  }
}
