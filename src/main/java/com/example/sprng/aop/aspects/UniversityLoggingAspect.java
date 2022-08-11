package com.example.sprng.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(15)
public class UniversityLoggingAspect {

    @Before("com.example.sprng.aop.aspects.MyPointCuts.UniversityGetStudents()")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging students list retrieving" +
                "before getStudents() executing");
    }

    @AfterReturning("com.example.sprng.aop.aspects.MyPointCuts.UniversityGetStudents()")
    public void afterReturningGetStudentsLoggingAdvice() {
        System.out.println("afterReturningGetStudentsLoggingAdvice: logging students list retrieving" +
                "after getStudents() is finished");
    }
}
