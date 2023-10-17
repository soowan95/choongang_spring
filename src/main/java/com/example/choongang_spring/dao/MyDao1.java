package com.example.choongang_spring.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@RequiredArgsConstructor
public class MyDao1 {

  private final DataSource dataSource;

  public String select(int i) throws SQLException {

    String sql = """
            SELECT * FROM customers
            WHERE customerId = ?
            """;

    Connection c = dataSource.getConnection();
    PreparedStatement ps = c.prepareStatement(sql);

    try (c; ps) {

      ps.setInt(1, i);
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {

        return rs.getString("customerName");
      }
    }

    return null;
  }
}
