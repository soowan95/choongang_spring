package com.example.choongang_spring.controller;

import com.example.choongang_spring.dao.MyDao3;
import com.example.choongang_spring.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main29")
@RequiredArgsConstructor
public class Controller29 {

  private final MyDao3 dao3;

  @GetMapping("sub1")
  public void method1() {

    String name = dao3.select1();
    System.out.println("name = " + name);
  }

  @GetMapping("sub2")
  public void method2() {
    Double price = dao3.select2();
    System.out.println("price = " + price);
  }

  @GetMapping("sub3")
  public void method3() {
    String name = dao3.select3();
    System.out.println("name = " + name);
  }

  @GetMapping("sub4")
  public void method4() {
    LocalDate birthDate = dao3.select4();
    System.out.println("birthDate = " + birthDate);
  }

  @GetMapping("sub5")
  public void method5() {
    List<String> countrys = dao3.select5();
    countrys.forEach(System.out::println);
  }

  @GetMapping("sub6")
  public void method6() {
    List<LocalDate> birthDates = dao3.select6();
    birthDates.forEach(System.out::println);
  }

  @GetMapping("sub7")
  public void method7() {
    List<Double> prices = dao3.select7();
    prices.forEach(System.out::println);
  }

  @GetMapping("sub8")
  public void method8() {
    Map<String, Object> row = dao3.select8();
    System.out.println("row = " + row);
  }

  @GetMapping("sub9")
  public void method9() {
    Map<String, Object> row = dao3.select9();
    System.out.println("row = " + row);
  }

  @GetMapping("sub10")
  public void method10() {
    MyDto19 dto = dao3.select10();
    System.out.println("dto = " + dto);
  }

  @GetMapping("sub11")
  public void method11() {
    MyDto20 dto = dao3.select11();
    System.out.println("dto = " + dto);
  }

  @GetMapping("sub12")
  public void method12() {
    MyDto21 dto = dao3.select12();
    System.out.println("dto = " + dto);
  }

  @GetMapping("sub13")
  public void method13() {
    List<Map<String, Object>> rows = dao3.select13();
    for (Map<String, Object> row : rows) {
      System.out.println("row = " + row);
    }
  }

  @GetMapping("sub14")
  public void method14() {
    List<Map<String, Object>> rows = dao3.select14();
    rows.forEach(System.out::println);
  }

  @GetMapping("sub15")
  public void method15() {
    List<MyDto22> rows = dao3.select15();
    rows.forEach(System.out::println);
  }

  @GetMapping("sub16")
  public void method16() {

    List<MyDto23> rows = dao3.select16();
    rows.forEach(System.out::println);
  }

  @GetMapping("sub17")
  public void method17() {
    String name = dao3.select17();
    System.out.println("name = " + name);
  }

  @GetMapping("sub18")
  public void method18() {
    Integer id = dao3.select18();
    System.out.println("id = " + id);
  }

  @GetMapping("sub19")
  public void method19() {
    MyDto24 myDto24 = dao3.select19();
    System.out.println("myDto24 = " + myDto24);
  }

  @GetMapping("sub20")
  public void method20() {
    MyDto24 myDto24 = dao3.select20();
    System.out.println("myDto24 = " + myDto24);
  }
}
