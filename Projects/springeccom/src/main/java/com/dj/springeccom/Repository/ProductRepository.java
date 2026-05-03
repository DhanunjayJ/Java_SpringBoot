package com.dj.springeccom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dj.springeccom.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}
