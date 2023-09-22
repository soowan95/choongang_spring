package com.example.choongang_spring.controller;

import com.example.choongang_spring.domain.MyDto10;
import com.example.choongang_spring.domain.MyDto9;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main10")
public class Controller10 {

  @RequestMapping("sub1")
  public void method1(Model model) {
    MyDto9 o1 = new MyDto9();
    MyDto9 o2 = new MyDto9();
    MyDto9 o3 = new MyDto9();

    o1.setFirstName("son");
    o2.setFirstName("lee");
    o3.setFirstName("kim");

    model.addAttribute("students", List.of(o1, o2));
    model.addAttribute("studentList", List.of(o1, o2, o3));
  }

  @RequestMapping("sub2")
  public void method2(Model model) {
    MyDto9 o1 = new MyDto9();
    MyDto9 o2 = new MyDto9();

    o1.setLastName("두식");
    o2.setLastName("봉석");

    model.addAttribute("personMap", Map.of("person1", o1, "person2", o2));
    model.addAttribute("people", Map.of("1st", o1, "2nd", o2));
  }

  @RequestMapping("sub3")
  public void method3(Model model) {
    MyDto10 o1 = new MyDto10();
    o1.setName("doosik");
    o1.setId(3);
    o1.setFoods(List.of("pizza", "burger", "milk"));
    o1.setCars(List.of("kia", "hyun", "tesla"));

    model.addAttribute("person1", o1);
  }
}
