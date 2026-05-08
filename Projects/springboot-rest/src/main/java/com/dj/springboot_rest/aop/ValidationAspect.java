package com.dj.springboot_rest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    

    //to get hold of the input parameters we are passing to the getJob we can get it here.. using args()
    @Around("execution(* com.dj.springboot_rest.service.JobService.getJob(..)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint jp,int postId) throws Throwable {
        if(postId<0){
            LOGGER.info("Post Id is Negative, updating it!!");
            postId = -postId;
        }
        //pass the updated arguments like this
        Object obj = jp.proceed(new Object[]{postId});

        return obj;
    }


}
