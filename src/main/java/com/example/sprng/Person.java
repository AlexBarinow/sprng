package com.example.sprng;

public class Person {
    private  Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("pet is set");
    }

   /* public Person(Pet pet){
        this.pet = pet;
        System.out.println("Person bean is created");
    }*/

    public void callYourPet(){
        System.out.println("hello my lovely pet");
        pet.say();
    }
}
