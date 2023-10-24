package com.example.choongang_spring.controller;

import com.example.choongang_spring.dao.MyDao7;
import com.example.choongang_spring.domain.MyDto39;
import com.example.choongang_spring.domain.MyDto40;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@Controller
@RequestMapping("main36")
@RequiredArgsConstructor
public class Controller36 {

  private final MyDao7 dao;

  @GetMapping("sub1")
  public void method1() {
  }

  @GetMapping("sub2")
  public void method2(Integer id) {
    Map<String, Object> data = dao.selectByCustomerId(id);
    System.out.println("data = " + data);
  }

  @GetMapping("sub3")
  public void method3(Integer id) {
    Map<String, Object> data = dao.selectByEmployeeId(id);
    System.out.println("data = " + data);
  }

  @PostMapping("sub4")
  public void method4(String lastName, String firstName, LocalDate birthDate) {
    int i = dao.insertEmployee(lastName, firstName, birthDate);
    System.out.println(i + "개 입력됨");
  }

  @PostMapping("sub5")
  public void method5(String name, Double price, Integer category) {
    int r = dao.insertProduct(name, price, category);
    System.out.println(r + "개 입력됨");
  }

  //  @RequestMapping(method = RequestMethod.DELETE, value = "sub6")
  @DeleteMapping("sub6")
  public void method6() {
    System.out.println("Controller36.method6");
  }

  @DeleteMapping("sub7")
  public void method7() {
    System.out.println("Controller36.method7");
  }

  @DeleteMapping("sub8")
  public void method8(String name) {
    System.out.println("name = " + name);
  }

  // PathVariable : 경로에 포함된 데이터
  /*
  axios.delete("/main36/sub9/son")
   */
  @DeleteMapping("sub9/{name}")
  public void method9(@PathVariable("name") String n) {
    System.out.println("n = " + n);
  }

  @DeleteMapping("sub10/{id}")
  public void method10(@PathVariable("id") Integer id) {
    System.out.println("id = " + id);
  }

  @DeleteMapping("sub11/{pid}")
  public void method11(@PathVariable Integer pid) {
    int i = dao.deleteByProductId(pid);
    System.out.println(i + "개 삭제됨");
  }

  @DeleteMapping("sub12/{cid}")
  public void method12(@PathVariable Integer cid) {
    int i = dao.deleteByCustomerId(cid);
    System.out.println(i + "개 삭제됨");
  }

  /*
  axios.put("/main36/sub13")
   */
//  @RequestMapping(method = RequestMethod.PUT, value = "sub13")
  @PutMapping("sub13")
  public void method13() {
    System.out.println("Controller36.method13");
  }

  /*
  axios.put("/main36/sub14", {
    name: "son",
    address: "korea"
  }, {
    headers: {
      "content-type": "application/x-www-form-urlencoded"
    }
  })
   */
  @PutMapping("sub14")
  public void method14(String name, String address) {
    System.out.println("name = " + name);
    System.out.println("address = " + address);
  }

  @PutMapping("sub15")
  public void method15(MyDto39 dto) {
    System.out.println(dto.getCity());
    System.out.println(dto.getAge());
    System.out.println(dto.getScore());
  }

  /*
  axios.put("/main36/sub16", {
    id: 3,
    name: "햄버거",
    category: 2,
    price: 5000.00
  }, {
    headers: {
      "content-type": "application/x-www-form-urlencoded"
    }
  })
   */
  @PutMapping("sub16")
  public void method16(MyDto40 dto) {
    int rows = dao.updateProduct(dto);
    System.out.println(rows + "개 수정됨");
  }

  /*
  axios.put("/main36/sub17", {
    lastName: "lee",
    firstName: "kangin",
    birthDate: "2020-01-01",
    id: 5
  }, {
    headers: {
      "content-type": "application/x-www-form-urlencoded"
    }
  })
   */
  @PutMapping("sub17")
  public void method17(String lastName, String firstName, LocalDate birthDate, Integer id) {
    int i = dao.updateEmployee(lastName, firstName, birthDate, id);
    System.out.println(i + "개 수정됨");
  }
}
