package com.example.sprng.aop;

import org.springframework.stereotype.Component;

@Component
public class Library extends AbstractLibrary {

    public void getBook() {
        System.out.println("we pick a book" );
    }

    public void returnBook() {
        System.out.println("we return a book");
    }


}
