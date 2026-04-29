package com.dj.firstspringboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.firstspringboot.Model.Laptop;
import com.dj.firstspringboot.Repository.LaptopRepository;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository laptopRepository;

    public boolean isLaptop(Laptop lap){
        laptopRepository.save(lap);
        return true;
    }
}
