package com.example.choongang_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp8 {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(MyApp8.class, args);

    System.out.println(context.getBean("myClass14"));
    System.out.println(context.getBean("myClass13", MyClass13.class).getDepen());
  }
}

@Component
class MyClass14 {

}

@Component
class MyClass13 {

  private MyClass14 depen;

  public MyClass13(MyClass14 depen) {
    this.depen = depen;
  }

  public MyClass14 getDepen() {
    return depen;
  }
}