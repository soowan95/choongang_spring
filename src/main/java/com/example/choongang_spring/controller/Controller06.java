package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto3;
import com.example.choongang_spring.domain.MyDto4;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main6")
public class Controller06 {

  @RequestMapping("sub1")
  public void method1(MyDto3 obj) {
    System.out.println("obj = " + obj);
  }

  @RequestMapping("sub2")
  public void method2(MyDto4 obj) {
    System.out.println("obj = " + obj);
  }
}
