package com.example.choongang_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("main5")
public class Controller05 {

  @RequestMapping(value = "sub1", params = {"address"}, consumes = "text/json")
  public void method1(String name, Integer age, String address) {
    System.out.println("name = " + name);
    System.out.println("age = " + age);
    System.out.println("address = " + address);
  }

  @RequestMapping("sub2")
  public void method2(String name, Integer age, String address) {
    Person5 o1 = new Person5();
    o1.setName(name);
    o1.setAge(age);
    o1.setAddress(address);

    System.out.println(o1);
//    service.action(o1);
  }

  @RequestMapping("sub3")
  public void method3(Person5 person5) {
    System.out.println("person5 = " + person5);
  }

  @RequestMapping("sub4")
  public void method4(Info5 info5) {
    System.out.println("info5 = " + info5);
  }
}

class Info5 {
  private String email;
  private Boolean married;
  private Integer age;
  private String info;

  @Override
  public String toString() {
    return "Info5{" +
            "email='" + email + '\'' +
            ", married=" + married +
            ", age=" + age +
            ", info='" + info + '\'' +
            '}';
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getMarried() {
    return married;
  }

  public void setMarried(Boolean married) {
    this.married = married;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }
}

class Person5 {
  private String name;
  private Integer age;
  private String address;

  @Override
  public String toString() {
    return "Person5{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}