package com.example.sprng.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Pet myDog = context.getBean("dog", Dog.class);
        Pet yourDog = context.getBean("dog", Dog.class);

        System.out.println("variables refer to the same object?:" +
                (myDog == yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);


        context.close();
    }
}
