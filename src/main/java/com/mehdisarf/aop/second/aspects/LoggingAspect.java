package com.mehdisarf.aop.second.aspects;

import com.mehdisarf.aop.second.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.mehdisarf.aop.second.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName + " with params: " + Arrays.asList(arguments) + " will execute.");

        Comment comment = new Comment();
        comment.setText("Some other text! :D");
        Object[] newArguments = {comment};

        // send a different comment instance as a value to the method’s parameter.
        Object returnedByMethod = joinPoint.proceed(newArguments);

        // We log the value returned by the intercepted method.
        logger.info("Method executed and returned " + returnedByMethod);

        // Before:
        // return returnedByMethod;
        // but now, we return a different value to the caller.

        return "Failed";
    }
}
