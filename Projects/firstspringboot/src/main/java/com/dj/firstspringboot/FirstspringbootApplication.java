package com.dj.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dj.firstspringboot.Model.Alien;
import com.dj.firstspringboot.Model.Laptop;
import com.dj.firstspringboot.Service.LaptopService;

@SpringBootApplication
public class FirstspringbootApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstspringbootApplication.class, args);
		Alien obj = context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.code();

		LaptopService lapService = context.getBean(LaptopService.class);
		lapService.isLaptop(context.getBean(Laptop.class));
	}
}
