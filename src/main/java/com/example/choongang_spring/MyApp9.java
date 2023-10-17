package com.example.choongang_spring;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp9 {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(MyApp9.class, args);
    System.out.println(context.getBean("myClass16"));
    System.out.println(context.getBean("myClass15", MyClass15.class).getField());
  }
}

@Component
class MyClass16 {

}

@Component
@RequiredArgsConstructor
class MyClass15 {

  private final MyClass16 field;

  public MyClass16 getField() {
    return field;
  }
}