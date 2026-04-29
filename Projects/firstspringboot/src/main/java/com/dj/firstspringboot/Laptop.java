package com.dj.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    
    CPU cpu;

    @Override
    public void compile() {
        cpu.use();
        System.out.println("Compiling from Laptop");
    }

    public CPU getCpu() {
        return cpu;
    }

    @Autowired
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    
}
