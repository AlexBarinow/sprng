package com.example.sprng.introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("singleton")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }


    @PostConstruct
    public void init() {
        System.out.println("Dog object has been created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog object has been destroyed");
    }

    @Override
    public void say() {
        System.out.println("bow-bow!");
    }
}
