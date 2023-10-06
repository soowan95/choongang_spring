package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto15;
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
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("main22")
public class Controller22 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub1")
  public void method1(Integer n) throws SQLException {

    String sql = """
            SELECT customerID id,
                   customerName name
            FROM customers
            ORDER BY id
            LIMIT ?, ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setInt(1, (n - 1) * 10);
    ps.setInt(2, 10);
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      System.out.println("고객 목록");
      while (rs.next()) {

        String id = rs.getString("id");
        String name = rs.getString("name");

        System.out.println(id + ": " + name);
      }
    }
  }

  @GetMapping("sub2")
  public void method2(@RequestParam(value = "p", defaultValue = "1") Integer page, Model model) throws SQLException {

    List<MyDto15> list = new ArrayList<>();

    String sql = """
            SELECT SupplierID id, SupplierName name
            FROM suppliers
            ORDER BY id
            LIMIT ?, ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setInt(1, (page - 1) * 7);
    ps.setInt(2, 7);
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      while (rs.next()) {
        MyDto15 dto = new MyDto15();

        String name = rs.getString("name");
        Integer id = rs.getInt("id");

        dto.setId(id);
        dto.setName(name);

        list.add(dto);
      }
    }

    String sql1 = """
            SELECT COUNT(*)
            FROM suppliers
            """;

    Connection c1 = dataSource.getConnection();
    Statement st = c1.createStatement();
    ResultSet rs1 = st.executeQuery(sql1);

    try (c1; st; rs1) {

      if (rs1.next()) {
        int countAll = rs1.getInt(1);

        int lastPageNumber = ((countAll - 1) / 7) + 1;

        model.addAttribute("lastPageNumber", lastPageNumber);
      }
    }

    model.addAttribute("supplierList", list);
  }

  @GetMapping("sub3")
  public void method3(@RequestParam(value = "p", defaultValue = "1") Integer page, Model model) throws SQLException {

    List<Map<String, Object>> list = new ArrayList<>();

    String sql = """
            SELECT CustomerID id, CustomerName name
            FROM customers
            ORDER BY id
            LIMIT ?, ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setInt(1, (page - 1) * 5);
    ps.setInt(2, 5);
    ResultSet rs = ps.executeQuery();

    try (c; ps; rs) {

      while (rs.next()) {

        int id = rs.getInt("id");
        String name = rs.getString("name");

        list.add(Map.of("id", id, "name", name));
      }
    }

    model.addAttribute("customerList", list);

    String sql1 = """
            SELECT COUNT(*)
            FROM customers
            """;

    Connection c1 = dataSource.getConnection();
    Statement st = c1.createStatement();
    ResultSet rs1 = st.executeQuery(sql1);

    int lastPageNumber = 0;
    try (c1; st; rs1) {

      if (rs1.next()) {

        int count = rs1.getInt(1);

        lastPageNumber = ((count - 1) / 5) + 1;

        model.addAttribute("lastPageNumber", lastPageNumber);
      }
    }

    model.addAttribute("currentPage", page);

    int leftPageNumber = ((page - 1) / 5) * 5 + 1;
    int rightPageNumber = leftPageNumber + 4;

    rightPageNumber = Math.min(rightPageNumber, lastPageNumber);

    int prevPage = (page-6) / 5 * 5 + 5;
    int nextPage = (page+4) / 5 * 5 + 1;

    model.addAttribute("leftPageNumber", leftPageNumber);
    model.addAttribute("rightPageNumber", rightPageNumber);

    model.addAttribute("prevPage", prevPage);
    model.addAttribute("nextPage", nextPage);
  }
}
