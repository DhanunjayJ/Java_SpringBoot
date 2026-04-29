package com.dj.firstspringboot.Repository;

import org.springframework.stereotype.Repository;

import com.dj.firstspringboot.Model.Laptop;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database....");
    }
}
