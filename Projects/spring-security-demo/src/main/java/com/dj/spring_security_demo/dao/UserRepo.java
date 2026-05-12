package com.dj.spring_security_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dj.spring_security_demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    User findByUsername(String username);
}
