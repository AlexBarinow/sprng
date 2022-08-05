package com.example.sprng.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractLibrary {

    public void returnBook() {
        System.out.println("We return a book");
    }

    public void addBook(){
        System.out.println("We add a book");
    }

    public void getBook() {
        System.out.println("We pick a book"  );
    }
}
