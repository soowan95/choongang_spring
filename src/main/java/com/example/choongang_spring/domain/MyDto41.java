package com.example.choongang_spring.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MyDto41 {
  private Integer id;
  private String lastName;
  private String firstName;
  private LocalDate birthDate;
}
