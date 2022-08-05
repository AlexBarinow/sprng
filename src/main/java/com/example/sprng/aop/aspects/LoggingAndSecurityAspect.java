package com.example.sprng.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

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

    @Pointcut("execution(* com.example.sprng.aop.UniLibrary.get*(..))")
    private void onGetFromUnilibrary() {
    }

    @Pointcut("execution(* com.example.sprng.aop.UniLibrary.return*(..))")
    private void onReturnToUnilibrary() {
    }

    @Pointcut("onReturnToUnilibrary() || onGetFromUnilibrary()")
    private void onGetOrReturn() {
    }

//    @Before("onGetFromUnilibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetloggingAdvice: writing Log #1");
//    }
//
//    @Before("onReturnToUnilibrary()")
//    public void afterGetLoggingAdvice() {
//        System.out.println("beforeGetloggingAdvice: writing Log #2");
//    }

    @Before("onGetOrReturn()")
    public void BeforeGetOrReturn() {
        i ++;
        System.out.println("onGetOrReturn: writing Log " + i);
    }




}
