package com.example.choongang_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main12")
public class Controller12 {

  @RequestMapping("sub1")
  public void method1() {

  }

  @RequestMapping("asub2/bsub2/csub2/dsub2/esub2")
  public void method2() {

  }
}
