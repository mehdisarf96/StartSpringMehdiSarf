package com.mehdisarf.aop.fifth.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(com.mehdisarf.aop.fifth.aspects.ToLog)")
    public Object toLog(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Logging aspect: calling the intercepted method. ");
        Object returnedValue = joinPoint.proceed();
        logger.info("Logging aspect: Method executed and returned: " + returnedValue);

        return returnedValue;
    }
}
