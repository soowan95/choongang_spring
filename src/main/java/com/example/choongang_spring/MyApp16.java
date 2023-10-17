package com.example.choongang_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class MyApp16 {

  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(MyApp16.class, args);
    MyClass31 bean1 = context.getBean("myClass31Bean", MyClass31.class);
    MyClass30 bean2 = context.getBean("myClass30Bean", MyClass30.class);

    System.out.println("bean2 = " + bean2.hashCode());

    System.out.println("bean1 = " + bean1.hashCode());

    System.out.println(bean2.getField().hashCode());
  }
}

@Configuration
class Configuration3 {

  @Bean
  public MyClass31 myClass31Bean() {

    return new MyClass31();
  }

  @Bean
  public MyClass30 myClass30Bean() {

    MyClass30 myClass30 = new MyClass30(myClass31Bean());

    return myClass30;
  }
}

class MyClass31 {

}

class MyClass30 {

  private MyClass31 field;

  public MyClass30(MyClass31 field) {
    this.field = field;
  }

  public MyClass31 getField() {
    return field;
  }
}