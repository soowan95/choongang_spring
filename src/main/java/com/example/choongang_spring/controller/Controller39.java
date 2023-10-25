package com.example.choongang_spring.controller;

import com.example.choongang_spring.dao.MyDao8;
import com.example.choongang_spring.domain.MyDto33Employee;
import com.example.choongang_spring.domain.MyDto45;
import com.example.choongang_spring.service.MyService2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main39")
@RequiredArgsConstructor
public class Controller39 {

  private final MyDao8 dao;
  private final MyService2 service;

  @GetMapping("sub0")
  public void method0() {
  }

  @GetMapping("sub1")
  public ResponseEntity method1() {
    // ResponseEntity
    // : 응답코드, 응답본문 작성 가능한 객체
    return ResponseEntity.status(200).build();
  }

  @GetMapping("sub2")
  public ResponseEntity method2() {
    return ResponseEntity.badRequest().build();
//    return ResponseEntity.internalServerError().build();
  }

  @GetMapping("sub3")
  public ResponseEntity method3() {
    return ResponseEntity.badRequest().build();
  }

  @GetMapping("sub4")
  public ResponseEntity<MyDto45> method4(Integer id) {
    MyDto45 data = dao.selectByProductAndCategory(id);

    if (data == null) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok().body(data);
  }

  @GetMapping("sub5")
  public ResponseEntity method5() {
    if (Math.random() > 0.5) {
      return ResponseEntity.ok().build();
    }
    return ResponseEntity.internalServerError().build();
  }

  @PostMapping("sub6")
  public ResponseEntity method6(@RequestBody MyDto33Employee dto) {
    if (service.validate(dto)) {
      int rows = service.add(dto);
      if (rows == 1) {
        return ResponseEntity.ok().build();
      } else {
        return ResponseEntity.internalServerError().build();
      }
    } else {
      return ResponseEntity.badRequest().build();
    }
  }
}
