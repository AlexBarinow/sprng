package com.example.sprng.introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
//    @Autowired
//    @Qualifier("cat")

    public Person(){}
    private Pet pet;

    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age is set");
    }

//    public void setSurname(String surname) {
//        this.surname = surname;
//        System.out.println("Surname is set");
//    }


//    @Autowired
//    public void setPet(Pet pet) {
//        this.pet = pet;
//        System.out.println("pet is set");
//    }

    //@Autowired
    public Person(/*@Qualifier("dog")*/ Pet pet){
        this.pet = pet;
        System.out.println("Person bean is created");
    }

    public void callYourPet() {
        System.out.println("hello my lovely pet");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }
}
