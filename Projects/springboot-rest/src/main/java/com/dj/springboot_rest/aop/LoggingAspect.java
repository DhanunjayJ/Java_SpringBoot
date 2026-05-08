package com.dj.springboot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
    // if we want to execute the advice for multiple methods we use the pipe symbole and 
    //place the other methods 
    @Before("execution(* com.dj.springboot_rest.service.JobService.getJob(..)) || execution(* com.dj.springboot_rest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());
    }
    //after finally -> even if we get exeception or not. 
    @After("execution(* com.dj.springboot_rest.service.JobService.getJob(..)) || execution(* com.dj.springboot_rest.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    //this will be called when there is a exception
    @AfterThrowing("execution(* com.dj.springboot_rest.service.JobService.getJob(..)) || execution(* com.dj.springboot_rest.service.JobService.updateJob(..))")
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info("Method has some Issues Executed " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.dj.springboot_rest.service.JobService.getJob(..)) || execution(* com.dj.springboot_rest.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method Executed Sucessfully" + jp.getSignature().getName());
    }

}
