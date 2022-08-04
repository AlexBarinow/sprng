package com.example.sprng;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet dog = context.getBean("myPet", Pet.class);
        Pet yourDoggo = context.getBean("myPet", Pet.class);

        System.out.println(yourDoggo==dog);
        System.out.println(dog);
        System.out.println(yourDoggo);

        context.close();
    }
}
