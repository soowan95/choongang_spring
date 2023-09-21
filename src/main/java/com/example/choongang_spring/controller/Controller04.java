package com.example.choongang_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main4")
public class Controller04 {

  // request parameter 의 이름과 metho parameter 의 이름이 같으면
  // @RequestParam 의 value element 생략 가능
  @RequestMapping("sub1")
  public void method1(@RequestParam String name) {
    System.out.println("name = " + name);
  }

  @RequestMapping("sub2")
  public void method2(@RequestParam String address,
                      @RequestParam String email,
                      @RequestParam Integer age) {
    System.out.println("address = " + address);
    System.out.println("email = " + email);
    System.out.println("age = " + age);
  }

  @RequestMapping("sub3")
  public void method3(String name, Boolean married) {
    System.out.println("name = " + name);
    System.out.println("married = " + married);
  }

  @RequestMapping("sub4")
  public void method4(Boolean check, String email, Integer age) {
    System.out.println("check = " + check);
    System.out.println("email = " + email);
    System.out.println("age = " + age);
  }
}
