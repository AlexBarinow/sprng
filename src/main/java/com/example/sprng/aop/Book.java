package com.example.sprng.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {


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
