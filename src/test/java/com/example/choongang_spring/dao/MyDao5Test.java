package com.example.choongang_spring.dao;

import com.example.choongang_spring.ChoongangSpringApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ChoongangSpringApplication.class)
class MyDao5Test {

  @Autowired
  MyDao5 dao;

  @Test
  void select5test1() {
    dao.select5();
  }

  @Test
  void select6test1() {
    dao.select6();
  }

  @Test
  void select7test1() {
    dao.select7(List.of("mexico", "uk"));
  }

  @Test
  void select8test1() {
    dao.select8(List.of("asdf", "asdf"));
  }

  @Test
  void select8test2() {
    dao.select8(List.of());
  }

  @Test
  void select9test1() {
    dao.select9("com");
  }

  @Test
  void select10test1() {
    dao.select10("abc");
  }

  @Test
  void select10test2() {
    dao.select10("def");
  }

  @Test
  void select10test3() {
    dao.select10("q");
  }

  @Test
  void select10test4() {
    dao.select10("k");
  }
}