package com.dj.spring_security_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dj.spring_security_demo.model.User;
import com.dj.spring_security_demo.service.JwtService;
import com.dj.spring_security_demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("register")
    public User register(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("login")
    public String login(@RequestBody User user){
        
        Authentication authentication = authenticationManager
            .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if(authentication.isAuthenticated()) 
            return jwtService.generateToken(user.getUsername());
        return "Failed";
    }
}
