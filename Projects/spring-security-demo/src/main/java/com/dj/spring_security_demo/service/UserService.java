package com.dj.spring_security_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dj.spring_security_demo.dao.UserRepo;
import com.dj.spring_security_demo.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user);
    }
}
