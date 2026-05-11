package com.dj.spring_security_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
    
    List<Student> students = new ArrayList<>(
        List.of(
            new Student(1,"DJ","Java"),
            new Student(2,"Dhanunjay","React")
        )
    );

    // csrf token is necessary for put,post and delete methods.
    //to avoid the cross origin request to access the session id
    //we use the csrf token so that whnen ever there is a modificatoin
    //request we need to send the csrf tocken. 
    // in postman send X-CSRF-TOKEN value as this. for post request. 
    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("students")
    public List<Student> getStudnets(){
        return students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }

}
