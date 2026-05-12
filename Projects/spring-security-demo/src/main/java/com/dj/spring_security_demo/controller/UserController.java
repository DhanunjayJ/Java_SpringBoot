package com.dj.spring_security_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dj.spring_security_demo.model.User;
import com.dj.spring_security_demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public User register(@RequestBody User user){
        return userService.saveUser(user);
    }
}
