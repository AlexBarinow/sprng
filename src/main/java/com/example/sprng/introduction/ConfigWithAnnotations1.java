package com.example.sprng.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConfigWithAnnotations1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Pet cat = context.getBean("cat", Cat.class);
//
//
//        cat.say();
//        context.close();

        Person person = context.getBean("person", Person.class);

        person.callYourPet();
        System.out.println(person.getSurname());
        context.close();


    }
}
