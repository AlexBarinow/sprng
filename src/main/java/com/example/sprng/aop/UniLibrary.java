package com.example.sprng.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getMagazine() {
        System.out.println("we pick a magazine");
    }

    public void returnMagazine() {
        System.out.println("We return a magazine");
    }

    public void addMagazine() {
        System.out.println("We add a magazine");
    }


    public void returnBook() {
        System.out.println("We return a book");
    }

    public void addBook() {
        System.out.println("We add a book");
    }

    public void getBook() {
        System.out.println("We pick a book");
    }

}
