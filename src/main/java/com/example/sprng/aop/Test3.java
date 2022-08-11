package com.example.sprng.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);


        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);

            String bookName = library.returnBook();

        System.out.println("Returned a book  " +
                bookName);

        context.close();
    }
}
