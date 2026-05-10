package com.dj.spring_security_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request){
        return "Hello World!" + request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request){
        return "Dhanunjay Spring Website" + request.getSession().getId();
    }
}
