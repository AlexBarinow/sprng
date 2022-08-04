package com.example.sprng.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    /*
    execution( modifiers-pattern? return-type-pattern declaring-type-pattern?
        method-name-pattern(parameters-pattern)throws-pattern?
    */

    @Before("execution(public void com.example.sprng.aop.Library.getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to receive a book");
    }


}
