package com.example.choongang_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("main26")
public class Controller26 {

  @Autowired
  private DataSource dataSource;

  @GetMapping("sub1")
  public void method1() throws Exception {

    String sql = """
            INSERT INTO mydb1.my_table12 (int_col, dec_col, str_col, date_col, date_time_col)
            VALUE (?, ?, ?, ?, ?)            
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);

    try (c; ps) {

      ps.setInt(1, 1231);
      ps.setDouble(2, 123.12);
      ps.setString(3, "ok");
      ps.setDate(4, Date.valueOf(LocalDate.now()));
      ps.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));

      ps.executeUpdate();
    }
  }

  @GetMapping("sub2")
  public void method2() throws Exception {

    String sql = """
            SELECT * FROM mydb1.my_table12
            LIMIT 1
            """;

    Connection c = dataSource.getConnection();
    Statement st = c.createStatement();
    ResultSet rs = st.executeQuery(sql);

    try (c; st; rs) {

      if (rs.next()) {

        int intCol = rs.getInt("int_col");
        double decCol = rs.getDouble("dec_col");
        String strCol = rs.getString("str_col");
        LocalDate dateCol = rs.getDate("date_col").toLocalDate();
        LocalDateTime dateTimeCol = rs.getTimestamp("date_time_col").toLocalDateTime();

        System.out.println("intCol = " + intCol);
        System.out.println("decCol = " + decCol);
        System.out.println("strCol = " + strCol);
        System.out.println("dateCol = " + dateCol);
        System.out.println("dateTimeCol = " + dateTimeCol);
      }
    }
  }
}
