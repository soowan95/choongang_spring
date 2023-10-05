package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto15;
import com.example.choongang_spring.domain.MyDto16;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main19")
public class Controller19 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub6")
  public void method6(Model model) throws SQLException {
    String sql = """
                SELECT CustomerID, CustomerName, Address, Country
                FROM customers
                """;

    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);

    List<MyDto15> list = new ArrayList<>();
    try (connection; statement; resultSet) {
      while (resultSet.next()) {
        MyDto15 dto = new MyDto15();
        dto.setId(resultSet.getInt(1));
        dto.setName(resultSet.getString(2));
        dto.setAddress(resultSet.getString(3));
        dto.setCountry(resultSet.getString(4));

        list.add(dto);
      }
    }
    model.addAttribute("customerList", list);
  }

  @GetMapping("sub8")
  public void method8() {

  }

  @GetMapping("sub9")
  public String method9(Integer pid, Model model) throws SQLException {

    String sql = """
            select ProductId, ProductName, Unit, Price
            from products
            where ProductId = 
            """;
    sql += pid;

    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery(sql);
    List<MyDto16> list = new ArrayList<>();

    try (connection; statement; rs) {
      while (rs.next()) {
        MyDto16 dto = new MyDto16();
        dto.setPid(rs.getInt(1));
        dto.setProductName(rs.getString(2));
        dto.setUnit(rs.getString(3));
        dto.setPrice(rs.getDouble(4));

        list.add(dto);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    model.addAttribute("productList", list);

    return "/main19/sub5";
  }

  @GetMapping("sub10")
  public void method10() {
  }

  @GetMapping("sub11")
  public String method11(Integer cid, Model model) throws SQLException {

    String sql = """
                SELECT CustomerID, CustomerName, Address, Country
                FROM customers
                where CustomerId =
                """;
    sql += cid;

    Connection connection = dataSource.getConnection();
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery(sql);
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
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    model.addAttribute("customerList", list);

    return "/main19/sub6";
  }
}
