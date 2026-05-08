package com.dj.springboot_rest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type
    //fully qualified class name
    //method name
    //arguments
    //the syntax
    //returnType fullyqualifiedclassname.methodname(arguments)
    @Before("execution(* com.dj.springboot_rest.service.JobService.*(..))")
    public void logMethodCall(){
        LOGGER.info("Method called");
    }
}
