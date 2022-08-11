package com.example.sprng.aop.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Pointcut;


public class MyPointCuts {
    /*
    execution( modifiers-pattern?  private/public
    return-type-pattern       void/string
    declaring-type-pattern?    class
        method-name-pattern(parameters-pattern)  name of the method itselfd
        throws-pattern?  exceptions


        parameters-pattern
                * - one parameter of any type
                .. - any parameters of any kind in any amount including no parameters option
    */




    @Pointcut("execution(* get*(..))")
    public void onGet() {
    }

    @Pointcut("execution(* com.example.sprng.aop.University.*(..))")
    public void allUniversityMethods(){

    }
    @Pointcut("execution(* com.example.sprng.aop.University.getStudents(..))")
    public void UniversityGetStudents(){

    }


    @Pointcut("execution(* add*(..))")
    public void onAdd() {
    }

    @Pointcut("execution(* com.example.sprng.aop.UniLibrary.get*(..))")
    public void onGetFromUnilibrary() {
    }

    @Pointcut("execution(* com.example.sprng.aop.UniLibrary.return*(..))")
    public void onReturnToUnilibrary() {
    }

    @Pointcut("onReturnToUnilibrary() || onGetFromUnilibrary()")
    public void onGetOrReturn() {
    }

    @Pointcut("execution(* com.example.sprng.aop.UniLibrary.*(..))")
    public void allMethodsFromUnilibrary() {
    }

    @Pointcut("execution(* com.example.sprng.aop.UniLibrary.returnMagazine(..))")
    public void returnMagazineFromUnilibrary() {
    }

    @Pointcut("allMethodsFromUnilibrary() && !returnMagazineFromUnilibrary()")
    public void exceptReturnMagazine() {

    }

}
