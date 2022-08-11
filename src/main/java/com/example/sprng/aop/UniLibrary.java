package com.example.sprng.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getMagazine() {
        System.out.println("we pick a magazine");
        makeLine();
    }


    public void returnMagazine() {
        System.out.println("We return a magazine");
        makeLine();
    }

    public void addMagazine() {
        System.out.println("We add a magazine");
        makeLine();
    }


    public String returnBook() {
        System.out.println("We return a book");
        //makeLine();
        return "We return a book: Proud and prejudice";
    }

    public void addBook(String person_name, Book book ) {
        System.out.println("We add a book");
        makeLine();
    }

    public void getBook() {
        System.out.println("We pick a book");
        makeLine();
    }

}
