package com.example.sprng.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {


    @Value("Tom&Jerry")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return name;
    }

}
