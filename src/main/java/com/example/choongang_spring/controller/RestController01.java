package com.example.choongang_spring.controller;

import com.example.choongang_spring.dao.RestDao01;
import com.example.choongang_spring.domain.MyDto33Employee;
import com.example.choongang_spring.domain.MyDto34Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("api/main1")
@RequiredArgsConstructor
public class RestController01 {

  private final RestDao01 dao;

  @GetMapping("sub1")
  public String method1() {
    return "hello boot app!!";
  }

  @GetMapping("sub2")
  public String method2() {
    return dao.select();
  }

  @GetMapping("sub3")
  public MyDto34Customer method3() {
    return dao.selectCustomer();
  }

  @GetMapping("sub4")
  public ResponseEntity<String> method4(Integer id) {
    String cName = dao.selectByCustomerId(id);
    if (cName == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(cName);
  }

  @GetMapping("sub5")
  public ResponseEntity<MyDto33Employee> method5(Integer id) {
    MyDto33Employee employee = dao.selectByEmployeeId(id);
    if (employee == null) {
      return ResponseEntity.badRequest().build();
    }
    return ResponseEntity.ok(employee);
  }

  @GetMapping("sub6")
  public List<Integer> method6() {
    return dao.selectCustomerIdList();
  }

  @GetMapping("sub7")
  public List<Integer> method7() {
    return dao.selectEmployeeIdList();
  }
}
