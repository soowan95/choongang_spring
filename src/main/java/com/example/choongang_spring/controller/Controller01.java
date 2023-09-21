package com.example.choongang_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller01 {

  @RequestMapping("/")
  public void method1() {
    System.out.println("Controller01.method1");
  }

  @RequestMapping("/path1")
  public void method2() {
    System.out.println("Controller01.method2");
  }

  @RequestMapping("/path2")
  public void method3() {
    System.out.println("Controller01.method3");
  }

  @RequestMapping("path3")
  public void method4() {
    System.out.println("Controller01.method4");
  }
}
