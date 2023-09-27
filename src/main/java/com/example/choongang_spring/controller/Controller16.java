package com.example.choongang_spring.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main16")
public class Controller16 {

  @Autowired
  private ServletContext application;

  @GetMapping("sub1")
  public void method1(Model model, HttpSession session) {
    model.addAttribute("modelAttr1", "chooseok");
    session.setAttribute("sessionAttr1", "kangkang");
    application.setAttribute("appAttr1", "moon");
  }
}
