package com.example.sprng.aop;

import com.example.sprng.aop.MyConfig;
import com.example.sprng.aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1d1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);


        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.returnBook();

        uniLibrary.getMagazine();
        uniLibrary.returnMagazine();

        context.close();
    }
}
