package com.dj;

public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling from the Desktop");
    }
}
