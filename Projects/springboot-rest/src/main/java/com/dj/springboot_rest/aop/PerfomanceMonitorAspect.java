package com.dj.springboot_rest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfomanceMonitorAspect {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // @Around("execution(* com.dj.springboot_rest.service.JobService.getJob(..))")
    //for all the methods.
    @Around("execution(* com.dj.springboot_rest.service.JobService.*(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable{

        long start = System.currentTimeMillis();
        // around will start the advice but we need to
        //specify when to call that particular function
        //we do that by creating the object for the proceedingjointpoint
        // and calling proceed on that object. 
        //we have to return the object.
        Object obj = jp.proceed();
        
        long end = System.currentTimeMillis();

        LOGGER.info("Time taken by : "+ jp.getSignature().getName() + " : " + (end-start)+ " ms");

        return obj;
    }
}
