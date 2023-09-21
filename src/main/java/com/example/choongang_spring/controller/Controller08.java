package com.example.choongang_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main8")
public class Controller08 {

  @RequestMapping("sub1")
  public void method1(Model model) {
    model.addAttribute("attr1", "value1");
    model.addAttribute("attr2", "value2");
  }

  @RequestMapping("sub2")
  public void method2(Model model) {
    model.addAttribute("propone", "😊");
    model.addAttribute("proptwo", "😂");
  }
}
