package com.example.sprng.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);

        university.addStudents();
        List<Student> students = null;
        try {
            students = university.getStudents();
        } catch (IndexOutOfBoundsException ie) {
        }
        System.out.println();
        System.out.println(students);

        context.close();
    }
}
