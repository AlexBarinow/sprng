package com.example.sprng.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("com.example.sprng.aop.aspects.MyPointCuts.onGetFromUnilibrary()")
    public void beforeAddExceptionAdvice() {
        System.out.println("!!! beforeGetExceptionAdvice: We've caught an exception!!!");
    }
}
