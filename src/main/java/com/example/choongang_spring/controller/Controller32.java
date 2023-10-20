package com.example.choongang_spring.controller;

import com.example.choongang_spring.dao.MyDao6;
import com.example.choongang_spring.domain.MyDto37;
import com.example.choongang_spring.domain.MyDto38;
import com.example.choongang_spring.service.MyService1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("main32")
@RequiredArgsConstructor
public class Controller32 {

  private final MyDao6 dao;
  private final MyService1 service1;

  @GetMapping("sub1")
  public void method1(MyDto37 dto) {
    dao.insert1(dto);

    System.out.println("dto = " + dto);
  }

  @GetMapping("sub2")
  public void method2(MyDto38 dto) {
    dao.insert2(dto);

    System.out.println("dto = " + dto);
  }

  @GetMapping("sub3")
  public void method3() {
  }

  @PostMapping("sub4")
  public String method4(MyDto38 dto, RedirectAttributes rttr) {
    dao.insert3(dto);

    rttr.addFlashAttribute("msg", dto.getId() + "번 직원 등록!!");

    return "redirect:/main32/sub3";
  }

  @GetMapping("sub5")
  public void method5() {
    try {
      service1.tx1();
    } finally {
      System.out.println("dao.select1() = " + dao.select1());
    }
  }
}
