package com.example.sprng.aop;

import com.example.sprng.aop.MyConfig;
import com.example.sprng.aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1d1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);


        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        context.getBean("book", Book.class);
//        uniLibrary.getBook();
        Book book = context.getBean("book", Book.class);
        uniLibrary.addBook("ALex", book);
        System.out.println(uniLibrary.returnBook());
//        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();

        context.close();
    }
}
