package com.dj;

public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("Compiling from the laptop");
    }
    
}
