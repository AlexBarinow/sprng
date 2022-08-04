package com.example.sprng.aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook(){
        System.out.println("we pick a book");
    }
}
