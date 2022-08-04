package com.example.sprng;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-Meow!");
    }


    @PostConstruct
    public void init() {
        System.out.println("cat bean is created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cat bean was destroyed");
    }
}