package com.dj;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("prototype")
// @Primary -> when you don't want to use the Qualifier.
//if both are there, Qualifer gets the prefereance.
public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("Compiling from the laptop");
    }
    
}
