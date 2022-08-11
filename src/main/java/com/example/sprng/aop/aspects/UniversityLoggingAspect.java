package com.example.sprng.aop.aspects;

import com.example.sprng.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
@Order(15)
public class UniversityLoggingAspect {

    @Before("com.example.sprng.aop.aspects.MyPointCuts.UniversityGetStudents()")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging students list retrieving" +
                " before getStudents() executing");
    }

//    @AfterReturning(pointcut = "com.example.sprng.aop.aspects.MyPointCuts.UniversityGetStudents()"
//            , returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade * 1.23434234548679;
//        firstStudent.setAvgGrade((int) avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logging students list retrieving" +
//                " after getStudents() is finished");
//    }

    @AfterThrowing(pointcut = "com.example.sprng.aop.aspects.MyPointCuts.UniversityGetStudents()",
            throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Exception exception) {
        System.out.println("AfterThrowingGetStudentsLoggingAdvice: " + exception + exception.getMessage());

    }


    @After("com.example.sprng.aop.aspects.MyPointCuts.UniversityGetStudents()")
    public void AfterGetStudentsLoggingAdvice() {
        System.out.println("AfterGetStudentsLoggingAdvice: " + " This message should inform you that the method execution is over");
    }


}
