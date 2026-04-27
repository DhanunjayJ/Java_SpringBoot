package com.dj.firstspringboot;

import org.springframework.stereotype.Component;

@Component
public class CPU {
    public void use(){
        System.out.println("Laptop is using CPU");
    }
}
