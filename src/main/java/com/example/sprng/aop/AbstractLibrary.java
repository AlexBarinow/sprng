package com.example.sprng.aop;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractLibrary {

    public void makeLine() {
        System.out.println("-------------------------------");
    }

    public String returnBook() {
        System.out.println("We return a book");
        makeLine();
        return "Lmao";
    }

    public void addBook(String person_name, Book book ) {
        System.out.println("We add a book");
        makeLine();
    }

    public void getBook() {
        System.out.println("We pick a book, super");
        makeLine();
    }
}
