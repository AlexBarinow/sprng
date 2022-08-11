package com.example.sprng.aop;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();


    public void addStudents() {
        Student st1 = new Student("Alex Havriuk", 1, 9);
        Student st2 = new Student("Dimas", 2, 4);
        Student st3 = new Student("Skog", 3, 5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }


    public List<Student> getStudents() {
        System.out.println("the beginning of the method: public List<Student> getStudents() ");


        System.out.println(students.get(3).getNameSurname());

        System.out.println("Information from method getStudents:");

        System.out.println(students);
        return students;
    }


}
