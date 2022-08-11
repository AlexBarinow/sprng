package com.example.sprng.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope("prototype")
@Component
public class Book {

    public Book(){

    }



    @Value("Tom&Jerry")
    private String name;

    @Value("Paul McCartney")
    private String Author;


    @Value("1866")
    private int YearOfRelease;


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYearOfRelease() {
        return YearOfRelease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return name;
    }

}
