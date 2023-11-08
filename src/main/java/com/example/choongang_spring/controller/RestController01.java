package com.example.choongang_spring.controller;

import com.example.choongang_spring.dao.RestDao01;
import com.example.choongang_spring.domain.MyDto34Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/main1")
@RequiredArgsConstructor
public class RestController01 {

  private final RestDao01 dao;

  @GetMapping("sub1")
  @ResponseBody
  public String method1() {
    return "hello boot app!!";
  }

  @GetMapping("sub2")
  @ResponseBody
  public String method2() {
    return dao.select();
  }

  @GetMapping("sub3")
  @ResponseBody
  public MyDto34Customer method3() {
    return dao.selectCustomer();
  }

  @GetMapping("sub4")
  @ResponseBody
  public ResponseEntity<String> method4(Integer id) {
    String cName = dao.selectByCustomerId(id);
    if (cName == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(cName);
  }
}
