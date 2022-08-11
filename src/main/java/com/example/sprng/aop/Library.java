package com.example.sprng.aop;

import org.springframework.stereotype.Component;

@Component
public class Library extends AbstractLibrary {

    public void getBook() {
        System.out.println("we pick a book" );
    }

    public String returnBook() {
        System.out.println("we return a book");
        return "some book here";
    }


}
