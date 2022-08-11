package com.example.sprng.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("com.example.sprng.aop.aspects.MyPointCuts.onReturnToUnilibrary()")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundReturnBookAdvice: ");
        Object targetMethodResult = pjp.proceed();
        System.out.println("aroundReturnBookAdvice: ");

        return targetMethodResult;
    }
}
