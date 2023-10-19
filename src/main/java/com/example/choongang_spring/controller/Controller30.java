package com.example.choongang_spring.controller;

import com.example.choongang_spring.dao.MyDao4;
import com.example.choongang_spring.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("main30")
public class Controller30 {

  private final MyDao4 dao;

  @GetMapping("sub1")
  public void method1(Integer id) {
    String name = dao.select1(id);
    System.out.println("name = " + name);
  }

  @GetMapping("sub2")
  public void method2(Double from, Double to) {
    List<String> names = dao.select2(from, to);
    names.forEach(System.out::println);
  }

  @GetMapping("sub3")
  public void method3(LocalDate from, LocalDate to) {
    List<String> list = dao.select3(from, to);
    list.forEach(System.out::println);
  }

  @GetMapping("sub4")
  public void method4(MyDto25 dto) {
    List<String> list = dao.select4(dto);
    System.out.println("list.size() = " + list.size());
  }

  @GetMapping("sub5")
  public void method5(MyDto26 dto) {
    List<String> list = dao.select5(dto);
    list.forEach(System.out::println);
  }

  @GetMapping("sub6")
  public void method6(MyDto27 dto1, MyDto28 dto2) {
    dao.select6(dto1, dto2);
  }

  @GetMapping("sub7")
  public void method7(MyDto29 dto1, MyDto30 dto2) {
    String keyword = "%" + dto2.getKeyword() + "%";
    dto2.setKeyword(keyword);
    int i = ((dto1.getPage() - 1) * dto1.getRows()) + 1;
    dto1.setFrom(i);
    List<String> names = dao.select7(dto1, dto2);
    names.forEach(System.out::println);
  }

  @GetMapping("sub8")
  public void method8(MyDto31 dto) {

    int row = dao.insert1(dto);
    System.out.println(row + "행이 입력되었습니다.");
  }

  @GetMapping("sub9")
  public void method9() {
  }

  @PostMapping("sub10")
  public String method10(MyDto32 emp) {

    int row = dao.insert2(emp);
    System.out.println(row + "행이 입력됨");

    return "redirect:/main30/sub9";
  }

  @GetMapping("sub11")
  public void method11(Integer id) {
    int rows = dao.delete1(id);
    System.out.println("rows = " + rows + "개 행 지워짐");
  }

  @GetMapping("sub12")
  public void method12(Integer pid) {
    int rows = dao.delete2(pid);
    System.out.println(rows + "개 삭제");
  }

  @GetMapping("sub13")
  public void method13(Integer id, Model model) {
    MyDto33Employee employee = dao.select8(id);

    model.addAttribute("employee", employee);

  }

  @PostMapping("sub14")
  public String method14(MyDto33Employee dto, RedirectAttributes rttr) {
    int rows = dao.update1(dto);

    if (rows == 1) {
      rttr.addFlashAttribute("message", "정보가 수정되었습니다.");
    } else {
      rttr.addFlashAttribute("message", "정보가 수정되지 않았습니다.");
    }

    rttr.addAttribute("id", dto.getId());

    return "redirect:/main30/sub13";
  }

  @GetMapping("sub15")
  public void method15(Integer id, Model model) {
    MyDto34Customer customer = dao.select9(id);

    model.addAttribute("customer", customer);
  }

  @PostMapping("sub16")
  public String method16(MyDto34Customer dto, RedirectAttributes rttr) {
    int rows = dao.update2(dto);

    if (rows == 1) {
      rttr.addFlashAttribute("msg", "잘 수정됨");
    } else {
      rttr.addFlashAttribute("msg", "수정안됨");
    }

    rttr.addAttribute("id", dto.getCustomerId());

    return "redirect:/main30/sub15";
  }
}
