package com.example.choongang_spring.domain;

public class MyDto1 {
  // name property
  // homeAddress property
  // MYHOME property
  private String name;
  private String homeAddress;
  private String MYHOME;
  private Boolean married;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(String homeAddress) {
    this.homeAddress = homeAddress;
  }

  public String getMYHOME() {
    return MYHOME;
  }

  public void setMYHOME(String MYHOME) {
    this.MYHOME = MYHOME;
  }

  public Boolean getMarried() {
    return married;
  }

  public void setMarried(Boolean married) {
    this.married = married;
  }
}
