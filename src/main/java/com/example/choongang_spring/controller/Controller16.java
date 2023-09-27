package com.example.choongang_spring.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("main16")
public class Controller16 {

  @Autowired
  private ServletContext application;

  @GetMapping("sub1")
  public void method1(Model model, HttpSession session) {
    model.addAttribute("modelAttr1", "chooseok");
    session.setAttribute("sessionAttr1", "kangkang");
    application.setAttribute("appAttr1", "moon");

    model.addAttribute("attr1", "songpyeon");
    session.setAttribute("attr1", "playing");
    application.setAttribute("attr1", "rabbit");
  }

  @GetMapping("sub2")
  public void method2(HttpSession session) {
    Object count = session.getAttribute("count");
    if (count == null) {
      session.setAttribute("count", 0);
    } else {
      Integer countInt = (Integer) count;
      countInt++;
      session.setAttribute("count", countInt);
    }

    Object appCount = application.getAttribute("count");
    if (appCount == null) {
      application.setAttribute("count", 0);
    } else {
      Integer countInt = (Integer) appCount;
      countInt++;
      application.setAttribute("count", countInt);
    }
  }

  @GetMapping("sub3")
  public void method3(Model model, HttpSession session) {
    model.addAttribute("modelAttr1", "moon");
    session.setAttribute("sessionAttr1", "songpyeon");
  }

  @GetMapping("sub4")
  public void method4(Model model, HttpSession session) {
    Object modelAttr1 = model.getAttribute("modelAttr1");
    Object sessionAttr1 = session.getAttribute("sessionAttr1");

    System.out.println("modelAttr1 = " + modelAttr1);
    System.out.println("sessionAttr1 = " + sessionAttr1);
  }

  @GetMapping("sub5")
  public String method5() {
    return "/main16/sub5"; // view name
  }

  @GetMapping("sub6")
  public String method6() {

    // redirection
    // 다른 곳(location)으로 가라는 응답(response, response status code : 3XX, 보통은 302)
    return "redirect:/main16/sub5";
  }

  @GetMapping("sub7")
  public String method7() {
    return "redirect:https://www.naver.com";
  }

  @GetMapping("sub8")
  public String method8(String email) {

    String precessed = "result of using " + email;

    return "redirect:/main16/sub9?p=" + precessed;
  }

  @GetMapping("sub9")
  public void method9(String p) {
    System.out.println("p = " + p);
  }

  @GetMapping("sub10")
  public String method10(String name, HttpSession session) {
    String processed = name + " result";
    session.setAttribute("processedValue", processed);

    return "redirect:/main16/sub11";
  }

  @GetMapping("sub11")
  public void method11(HttpSession session) {
    Object processedValue = session.getAttribute("processedValue");
    System.out.println("processedValue = " + processedValue);
  }

  @GetMapping("sub12")
  public String method12(String address, RedirectAttributes rttr) {
    String processed = address + "result";

    rttr.addFlashAttribute("processedValue", processed);

    return "redirect:/main16/sub13";
  }

  @GetMapping("sub13")
  public void method13(Model model) {
    Object processedValue = model.getAttribute("processedValue");
    System.out.println("processedValue = " + processedValue);
  }

  // 첫 요청을 /main16/sub14
  @GetMapping("sub14")
  public String method14(String[] food, RedirectAttributes rttr) {
    // /main16/sub15 요청할 때
    // foodList 라는 attribute를 꺼낼 수 있게 코드작성
    rttr.addFlashAttribute("foodList", food);

    return "redirect:/main16/sub15";
  }

  @GetMapping("sub15")
  public void method15(Model model) {
  }

  @GetMapping("sub16")
  public String method16(RedirectAttributes rttr) {

    rttr.addFlashAttribute("flashAttr", "in Model");
    rttr.addAttribute("attr1", "in QueryString");
    rttr.addAttribute("address","seoul sinchon");

    return "redirect:/main16/sub17";
  }

  @GetMapping("sub17")
  public void method17() {
    System.out.println("Controller16.method17");
  }
}
