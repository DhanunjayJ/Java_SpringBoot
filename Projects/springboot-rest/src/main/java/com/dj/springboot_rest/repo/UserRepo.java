package com.dj.springboot_rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dj.springboot_rest.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    User findByUsername(String username);
}
