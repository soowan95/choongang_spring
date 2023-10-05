package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto15;
import com.example.choongang_spring.domain.MyDto16;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main20")
public class Controller20 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub1")
  public void method1() {
  }

  @GetMapping("sub2")
  public String method2(String id, Model model) throws SQLException {

    String sql = """
            SELECT CustomerID, CustomerName, Address, Country
            FROM customers
            where CustomerId = ?
            """;

    Connection connection = dataSource.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, id);
    ResultSet rs = statement.executeQuery();
    List<MyDto15> list = new ArrayList<>();

    try (connection; statement; rs) {
      while (rs.next()) {
        MyDto15 dto = new MyDto15();
        dto.setId(rs.getInt(1));
        dto.setName(rs.getString(2));
        dto.setAddress(rs.getString(3));
        dto.setCountry(rs.getString(4));

        list.add(dto);
      }
    }

    model.addAttribute("customerList", list);

    return "/main19/sub6";
  }

  @GetMapping("sub3")
  public void method3(String id) throws SQLException {

    String sql = """
            SELECT customerId, customerName, country
            FROM customers
            WHERE customerId = ?
            """;

    Connection connection = dataSource.getConnection();

    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, id);

    ResultSet rs = statement.executeQuery();

    try (connection; statement; rs) {
      while (rs.next()) {
        System.out.println();
        System.out.println("고객 정보");
        System.out.println("id = " + rs.getString(1));
        System.out.println("name = " + rs.getString(2));
      }
    }
  }

  @GetMapping("sub4")
  public void method4(String pid, String name) throws SQLException {

    String sql = """
            SELECT productId, productName
            FROM products
            WHERE productId = ? AND productName = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, pid);
    ps.setString(2, name);
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {
      while (rs.next()) {
        System.out.println();
        System.out.println("상품 정보");
        System.out.println("상품번호 = " + rs.getInt(1));
        System.out.println("상품명 = " + rs.getString(2));
      }
    }
  }

  @GetMapping("sub5")
  public void method5(String country) throws SQLException {

    String sql = """
            SELECT customerId, customerName, country
            FROM customers
            WHERE country = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, country);
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      while (rs.next()) {
        System.out.println();
        System.out.println(rs.getString(3) + "에 사는 " + rs.getInt(1) + ". " + rs.getString(2) + " 고객님");
      }
    }
  }

  @GetMapping("sub6")
  public void method6(String c1, String c2) throws SQLException {

    String sql = """
            SELECT customerName, country
            FROM customers
            WHERE country = ? OR country = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, c1);
    ps.setString(2, c2);
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      while (rs.next()) {

        System.out.println();
        System.out.println(rs.getString(1) + "은 " + rs.getString(2) + " 출신");
      }
    }
  }

  @GetMapping("sub7")
  public void method7() {

  }

  @GetMapping("sub8")
  public void method8(Double min, Double max, Model model) throws SQLException {

    List<MyDto16> list = new ArrayList<>();

    String sql = """
            SELECT productId, productName
            FROM products
            WHERE Price >= ? AND Price <= ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setDouble(1, min);
    ps.setDouble(2, max);
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      while (rs.next()) {
        MyDto16 dto = new MyDto16();
        dto.setPid(rs.getInt(1));
        dto.setProductName(rs.getString(2));
        System.out.println();
        System.out.println(rs.getString(1) + ". " + rs.getString(2));

        list.add(dto);
      }
    }

    model.addAttribute("productList", list);
  }

  @GetMapping("sub9")
  public void method9(@RequestParam("country") List<String> countryList) throws SQLException {

    String questionMarks = "";
    for (int i = 0; i < countryList.size(); i++) {
      questionMarks += "?";

      if (i < countryList.size() - 1) {
        questionMarks += ", ";
      }
    }

    String sql = """
            SELECT *
            FROM customers
            WHERE country IN ("""
            + questionMarks +
            """
                    )""";

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    for (int i = 0; i < countryList.size(); i++) {
      ps.setString(i + 1, countryList.get(i));
    }
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      System.out.println("고객 목록");
      while (rs.next()) {

        String name = rs.getString(2);
        String country = rs.getString(7);

        System.out.println(name + " : " + country);
      }
    }
  }

  @GetMapping("sub10")
  public void method10(Model model) throws SQLException {

    String sql = """
            SELECT DISTINCT country
            FROM suppliers
            """;

    Connection c = dataSource.getConnection();
    Statement st = c.createStatement();
    ResultSet rs = st.executeQuery(sql);

    List<String> list = new ArrayList<>();

    try (c; st; rs) {

      while (rs.next()) {

        list.add(rs.getString(1));
      }
    }

    model.addAttribute("countryList", list);
  }

  @GetMapping("sub11")
  public void method11(@RequestParam("country") List<String> countryList) throws SQLException {

    String questionMarks = "";

    for (int i = 0; i < countryList.size(); i++) {
      questionMarks += "?";

      if (i < countryList.size() - 1) {
        questionMarks += ", ";
      }
    }

    String sql = """
            SELECT SupplierName, Country, City
            FROM suppliers
            WHERE Country IN ("""
            + questionMarks +
            """
            )""";

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    for (int i = 0; i < countryList.size(); i++) {
      ps.setString(i + 1, countryList.get(i));
    }
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      System.out.println("이름 \t 국가 \t 도시");
      while (rs.next()) {

        System.out.println();
        System.out.println(rs.getString(1) + "|" + rs.getString(2) + "|" + rs.getString(3));
      }
    }
  }
}
