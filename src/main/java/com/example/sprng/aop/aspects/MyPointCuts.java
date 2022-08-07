package com.example.sprng.aop.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Pointcut;


public class MyPointCuts {

    @Pointcut("execution(* get*(..))")
    public void onGet() {
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
