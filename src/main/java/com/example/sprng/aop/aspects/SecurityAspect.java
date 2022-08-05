package com.example.sprng.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {


    @Before("com.example.sprng.aop.aspects.MyPointCuts.onGetFromUnilibrary()")
    public void beforeSecurityGetAdvice() {
        System.out.println("beforeSecurityGetAdvice: writing Log #1");
    }
}
