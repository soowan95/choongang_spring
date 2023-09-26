package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto11;
import com.example.choongang_spring.domain.MyDto12;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("main13")
public class Controller13 {

  @RequestMapping({"sub1", "sub2", "sub4", "sub7", "sub9"})
  public void method1() {
  }

  @RequestMapping("sub3")
  public void method3(String param1, Integer param2, String param3,
                      LocalDate param4, // 날짜
                      LocalDateTime param5, // 날짜 시간
                      String param6, String[] param8,
                      @RequestParam("param8") List<String> param9
  ) {
    System.out.println("param1 = " + param1);
    System.out.println("param2 = " + param2);
    System.out.println("param3 = " + param3);
    System.out.println("param4 = " + param4);
    System.out.println("param5 = " + param5);
    System.out.println("param6 = " + param6);
    if (param8 != null) Arrays.stream(param8).forEach(System.out::println);
    System.out.println("list로 받음");
    if (param9 != null) param9.forEach(System.out::println);
  }

  @RequestMapping("sub5")
  public void method5(String userId, String userEmail, LocalDate birthDate, String hobby) {
    System.out.println(userId + "/" + userEmail + "/" + birthDate + "/" + hobby + "가 저장됨.");
  }

  @RequestMapping("sub6")
  public void method6(MyDto11 myDto11) {
    System.out.println("myDto11 = " + myDto11);
  }

  @RequestMapping("sub8")
  public void method7(MyDto12 myDto12) {
    System.out.println("myDto12 = " + myDto12);
  }

  @RequestMapping("sub10")
  public void method10(String title, String contentBody) {
    System.out.println("title = " + title);
    System.out.println("contentBody = " + contentBody);
  }
}
