package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto18Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;

@Controller
@RequestMapping("main24")
public class Controller24 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub1")
  public void method1() throws SQLException {

    String sql = """
            INSERT INTO products (ProductName, SupplierID, CategoryID, Unit, Price)
            VALUE (?, ?, ?, ?, ?)
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, "돈까스");
    ps.setInt(2, 3);
    ps.setInt(3, 4);
    ps.setString(4, "한 장");
    ps.setDouble(5, 500.00);
    ps.executeUpdate();

    c.close();
    ps.close();
  }

  @RequestMapping("sub2")
  public void method2(String sname, String cname, String address, String city, String pc, String country, String phone) throws SQLException {

    try {
      if (!sname.equals(null)) {
        String sql = """
                INSERT INTO suppliers (SupplierName, ContactName, Address, City, PostalCode, Country, Phone)
                VALUE (?, ?, ?, ?, ?, ?, ?)
                """;

        Connection c = dataSource.getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, sname);
        ps.setString(2, cname);
        ps.setString(3, address);
        ps.setString(4, city);
        ps.setString(5, pc);
        ps.setString(6, country);
        ps.setString(7, phone);
        ps.executeUpdate();

        c.close();
        ps.close();
      }
    } catch (NullPointerException e) {
    }
  }

  @GetMapping("sub4")
  public void method4() {
  }

  @PostMapping("sub4")
  public void method4(MyDto18Employee employee) throws SQLException {

    String sql = """
            INSERT INTO employees (LastName, FirstName, BirthDate, Photo, Notes)
            VALUE (?, ?, ?, ?, ?)
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    ps.setString(1, employee.getLastName());
    ps.setString(2, employee.getFirstName());
    ps.setDate(3, Date.valueOf(employee.getBirthDate()));
    ps.setString(4, employee.getPhoto());
    ps.setString(5, employee.getNotes());
    ps.executeUpdate();

    c.close();
    ps.close();
  }
}
