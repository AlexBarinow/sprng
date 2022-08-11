package com.example.sprng.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("com.example.sprng.aop.aspects.MyPointCuts.onReturnToUnilibrary()")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundReturnBookAdvice: ");

        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();

        Object targetMethodResult = null;
        try {
            targetMethodResult = pjp.proceed();
        } catch (Exception e) {
            System.out.println("The fall of the upper method ->" + "\"" + methodSignature.getMethod() + "\"" + " caused an exception " + "\"" + e.getMessage() + "\"");

            //targetMethodResult = "The art of the war";

            throw e;
        }

        System.out.println("aroundReturnBookAdvice: ");

        return targetMethodResult;
    }
}
