package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto7;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Controller
@RequestMapping("main9")
public class Controller09 {

  @RequestMapping("sub1")
  public void method1(Model model) {
    model.addAttribute("attr1", "son");
    model.addAttribute("attr2", 300);
    model.addAttribute("attr3", true);
    model.addAttribute("attr4", 3.14);

    // 모델속성이 배열일 경우
    model.addAttribute("attr5", new String[]{"lee", "kim"});

    String[] myArr1 = {"korea", "seoul", "jeju"};
    model.addAttribute("yourArr6", myArr1);
  }

  @RequestMapping("sub2")
  public void method2(Model model) {
    String[] myName = {"kim", "soowan"};
    String[] yourEmail = {"@google.com", "@hanmail.net", "@naver.com"};
    String[] herAddress = {"seoul", "eungam"};

    model.addAttribute("myName", myName);
    model.addAttribute("yourEmail", yourEmail);
    model.addAttribute("herAddress", herAddress);
  }

  @RequestMapping("sub3")
  public void method3(Model model) {
    model.addAttribute("names", List.of("두식", "봉석", "희수"));
    List<String> list1 = List.of("any1", "any2");
    List<Integer> mapList1 = List.of(1, 2, 3);
    List<String> cities = List.of("seoul", "daegu", "daejeon", "busan");
    model.addAttribute("list1", list1);
    model.addAttribute("mapList1", mapList1);
    model.addAttribute("cities", cities);
  }

  @RequestMapping("sub4")
  public void method4(Model model) {
    Map<String, Integer> map1 = Map.of("son", 7, "lee", 19, "kim", 30);
    Map<String, String> cityMap = Map.of("seoul", "대도시", "busan", "바캉스");
    Map<String, String> color = Map.of("red", "빨강", "blue", "파랑", "black", "검정");
    model.addAttribute("myMap", map1);
    model.addAttribute("cityMap", cityMap);
    model.addAttribute("color", color);

    Map<String, String> map3 = Map.of("name", "두식", "my name", "봉석", "your-name", "희수");
    model.addAttribute("attr3", map3);
  }

  @RequestMapping("sub5")
  public void method5(Model model) {
    Map<String, String> map1 = Map.of("phone1", "iphone", "phone2", "galaxy");
    Map<String, String> map2 = Map.of("korea", "seoul", "us", "ny");
    Map<String, String> map3 = Map.of("1st", "hamberger", "2nd", "pizza");

    model.addAttribute("korea", "us");
    model.addAttribute("phones", map1);
    model.addAttribute("caps", map2);
    model.addAttribute("foods", map3);
  }

  @RequestMapping("sub6")
  public void method6(Model model) {
    model.addAttribute("attr1", new Object());
    model.addAttribute("attr2", new Scanner(System.in));
    model.addAttribute("attr3", new MyDto7());
  }
}
