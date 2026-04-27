package com.dj.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    CPU cpu;

    public void compile(){
        cpu.use();
        System.out.println("Compiling");
    }
}
