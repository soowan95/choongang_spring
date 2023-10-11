package com.example.choongang_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main25")
public class Controller25 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub1")
  public void method1(@RequestParam(value = "id", required = false) Integer customerId) throws SQLException {

    if (customerId == null) {
      System.out.println("삭제할 id를 넣어주세요");
      return;
    }

    String sql = """
            DELETE FROM customers
            WHERE customerId = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    try (c; ps) {
      ps.setInt(1, customerId);
      int rows = ps.executeUpdate();

      if (rows == 1) {
        System.out.println(rows + "개 레코드 잘 지워짐");
      } else {
        System.out.println("지워지지 않음");
      }
    }
  }

  @GetMapping("sub2")
  public void method2() {
  }

  @PostMapping("sub2")
  public void method2(@RequestParam(value = "pid", required = false) Integer productId) throws SQLException {

    if (productId == null) {
      System.out.println("입력바람.");
      return;
    }

    String sql = """
            DELETE FROM products
            WHERE productId = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    try (c; ps) {
      ps.setInt(1, productId);
      int rows = ps.executeUpdate();

      if (rows == 1) {
        System.out.println("성공");
      } else {
        System.out.println("실패");
      }
    }
  }

  @GetMapping("sub3")
  public void method3() throws SQLException {

    String sql = """
            UPDATE shippers
            SET ShipperName = ?, Phone = ?
            WHERE ShipperId = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);

    try (c; ps) {
      ps.setString(1, "이강인");
      ps.setString(2, "01012344567");
      ps.setInt(3, 1);

      int rows = ps.executeUpdate();

      if (rows == 1) {
        System.out.println("잘 변경됨");
      } else {
        System.out.println("뭔가 잘 못됨");
      }
    }
  }

  @GetMapping("sub4")
  public void method4(@RequestParam(value = "id", defaultValue = "1") Integer shipperId, Model model) throws SQLException {

    String sql = """
            SELECT * FROM shippers
            WHERE shipperId = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);

    try (c; ps) {

      ps.setInt(1, shipperId);

      ResultSet rs = ps.executeQuery();

      try (rs) {

        if (rs.next()) {

          model.addAttribute("shipper", Map.of("shipperId", rs.getInt("shipperId"), "shipperName",
                  rs.getString("shipperName"), "phone", rs.getString("phone")));
        }
      }
    }
  }

  @PostMapping("sub4")
  public String method4(@RequestParam(value = "id", required = false) Integer shipperId,
                        @RequestParam(value = "name", required = false) String shipperName,
                        @RequestParam(value = "phone", required = false) String phone,
                        RedirectAttributes rttr
  ) throws SQLException {

    String sql = """
            UPDATE shippers
            SET ShipperName = ?, Phone = ?
            WHERE ShipperId = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);
    try (c; ps) {

      ps.setString(1, shipperName);
      ps.setString(2, phone);
      ps.setInt(3, shipperId);

      int rows = ps.executeUpdate();

      if (rows == 1) {
        System.out.println("잘 변경됨");
      } else {
        System.out.println("문제가 있음");
      }
    }

    rttr.addAttribute("id", shipperId);
    return "redirect:/main25/sub4";
  }

  @GetMapping("sub5")
  public void method5(@RequestParam(value = "id", required = false) Integer employeeId, Model model) throws SQLException {

    if (employeeId == null) {
      return;
    }

    String sql = """
            SELECT * FROM employees
            WHERE employeeId = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);

    try (c; ps) {

      ps.setInt(1, employeeId);

      ResultSet rs = ps.executeQuery();

      try (rs) {

        if (rs.next()) {
          Integer id = rs.getInt("employeeId");
          String lastName = rs.getString("lastName");
          String firstName = rs.getString("firstName");
          LocalDate birthDate = rs.getDate("birthDate").toLocalDate();
          String photo = rs.getString("photo");
          String notes = rs.getString("notes");

          model.addAttribute("employee", Map.of("lastName", lastName, "firstName", firstName, "birthDate", birthDate, "photo", photo, "notes", notes, "employeeId", id));
        }
      }
    }
  }

  @PostMapping("sub5")
  public String method5(@RequestParam("id") Integer employeeId,
                        @RequestParam("lastName") String lastName,
                        @RequestParam("firstName") String firstName,
                        @RequestParam("birthDate") LocalDate birthDate,
                        @RequestParam("photo") String photo,
                        @RequestParam("notes") String notes,
                        RedirectAttributes rttr
  ) throws SQLException {

    String sql = """
            UPDATE employees
            SET lastName = ?, firstName = ?, birthDate = ?, photo = ?, notes = ?
            WHERE employeeId = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);

    try (c; ps) {

      ps.setString(1, lastName);
      ps.setString(2, firstName);
      ps.setDate(3, Date.valueOf(birthDate));
      ps.setString(4, photo);
      ps.setString(5, notes);
      ps.setInt(6, employeeId);

      ps.executeUpdate();
    }

    rttr.addAttribute("id", employeeId);
    return "redirect:/main25/sub5";
  }
}
