package com.example.choongang_spring.domain;

public class Student {

  // email property
  // info property는 없고 information property 가 있음
  private String email;
  private String info;

//  public String getEmail() {
//    return email;
//  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getInformation() {
    return info;
  }

  public void setInformation(String info) {
    this.info = info;
  }

  @Override
  public String toString() {
    return "Student{" +
            "email='" + email + '\'' +
            ", info='" + info + '\'' +
            '}';
  }
}
