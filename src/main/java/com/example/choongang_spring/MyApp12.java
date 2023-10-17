package com.example.choongang_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp12 {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(MyApp12.class, args);
    Object bean = context.getBean("myClass25");
    Object bean1 = context.getBean("myClass24");
    Object bean2 = context.getBean("myClass23");

    MyClass25 o1 = (MyClass25) bean;

    System.out.println(bean1.hashCode());
    System.out.println(bean2.hashCode());
    System.out.println(o1.getField().hashCode());
  }
}

interface MyInterface3 {}

@Component
class MyClass23 implements MyInterface3 {}

@Component
class MyClass24 implements MyInterface3 {}


@Component
class MyClass25 {

  private MyInterface3 field;

  public MyClass25(@Qualifier("myClass23") MyInterface3 field) {
    this.field = field;
  }

  public MyInterface3 getField() {
    return field;
  }
}