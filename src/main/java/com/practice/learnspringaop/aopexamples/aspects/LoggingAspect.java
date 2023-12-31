package com.practice.learnspringaop.aopexamples.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //Pointcut - When?
    // execution(* PACKAGE.*.*(..))
    @Before("execution(* com.practice.learnspringaop.aopexample.*.*.*(..))")//WHEN
    public void logMethodCall(JoinPoint joinPoint) {
        logger.info("Before Aspect - {} is called with arguments: {}"
                ,  joinPoint, joinPoint.getArgs());//WHAT
    }

}
