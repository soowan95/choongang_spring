package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main11")
public class Controller11 {
  @RequestMapping("sub1")
  public void method1() {
  }

  @RequestMapping("sub2")
  public void method2() {
  }

  @RequestMapping("sub3")
  public void method3() {
  }

  @RequestMapping("sub4")
  public void method4() {
  }

  @RequestMapping({"sub5", "sub6"})
  public void method5() {
  }

  @RequestMapping("sub7")
  public void method7(@RequestParam(value = "show", defaultValue = "false") Boolean show, Model model) {
    if (show) {
      List<MyDto9> list = new ArrayList<>();
      list.add(new MyDto9("31", "son", "hm", "footbal", "010"));
      list.add(new MyDto9("32", "lee", "gi", "paris", "011"));
      list.add(new MyDto9("33", "kim", "sw", "seoul", "012"));
      list.add(new MyDto9("34", "park", "sh", "babo", "013"));
      list.add(new MyDto9("35", "kim", "th", "busan", "014"));

      model.addAttribute("table", list);
    }
  }
}
