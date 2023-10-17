package com.example.choongang_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp3 {

  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(MyApp3.class, args);

    MyClass4 bean = context.getBean("myBean4", MyClass4.class);

    MyClass5 bean1 = context.getBean("myClass5", MyClass5.class);

    System.out.println("bean = " + bean);
    System.out.println("bean1 = " + bean1);
  }
}

@Component
class MyClass5 {

}

@Component("myBean4")
class MyClass4 {

}