package com.example.choongang_spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/main1")
@RequiredArgsConstructor
public class RestController01 {

  @GetMapping("sub1")
  @ResponseBody
  public String method1() {
    return "hello boot app!!";
  }
}
