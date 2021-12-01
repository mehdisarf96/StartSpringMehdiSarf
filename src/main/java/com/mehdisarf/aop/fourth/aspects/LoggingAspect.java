package com.mehdisarf.aop.fourth.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterReturning(value = "@annotation(com.mehdisarf.aop.fourth.aspects.ToLog)"
                            , returning = "returnedValue")
    public void toLog(Object returnedValue) {
        logger.info("Method executed and returned : "+ returnedValue);
    }
}
