package com.example.sprng;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Person person = context.getBean("person", Person.class);
//        person.callYourPet();
//        context.close();

        Pet cat1 = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);

        cat1.say();

        context.close();
    }
}
