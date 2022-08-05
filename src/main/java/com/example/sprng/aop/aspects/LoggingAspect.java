package com.example.sprng.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    private int i = 0;


    /*
    execution( modifiers-pattern?  private/public ...
    return-type-pattern       void/string
    declaring-type-pattern?    class
        method-name-pattern(parameters-pattern)  name of the method itselfd
        throws-pattern?  exceptions


        parameters-pattern
                * - one parameter of any type
                .. - any parameters of any kind in any amount including no parameters option
    */

//        @Pointcut("execution ( * get*())")
//        private void pointcutGets() {
//        }
//
//        @Before("pointcutGets()")
//        public void beforeGetLoggingAdvice() {
//            System.out.println("beforeGetBookAdvice: attempt to receive a book");
//        }
//
//        @Before("pointcutGets()")
//        public void beforeGetSecurityAdvice() {
//            System.out.println("Check the right to receive book or magazine");
//        }


    @Before("com.example.sprng.aop.aspects.MyPointCuts.onReturnToUnilibrary()")
    public void afterGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #2");
    }

    @Before("com.example.sprng.aop.aspects.MyPointCuts.exceptReturnMagazine()")
    public void BeforeGetOrReturn() {
        i++;
        System.out.println("BeforeGetOrReturn: writing Log " + i);
    }


}
