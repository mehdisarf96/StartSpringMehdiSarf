package com.mehdisarf.aop.sixth.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    @Around("@annotation(com.mehdisarf.aop.sixth.aspects.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint){

        // nemikham asan intercepted method ro ejra konam.
        // joinPoint.proceed();

        System.out.println("Publishing Comment: " + "Yoohahaha");
        return "FAILED";
    }
}
