package com.dj.springeccom.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.springeccom.Model.Product;
import com.dj.springeccom.Repository.ProductRepository;

@Service
public class ProductService {
    

    @Autowired
    private ProductRepository repository;
    
    public List<Product> getAllProducts(){
       return repository.findAll();
    }

    public Product addProduct(Product product){
        return repository.save(product);
    }

    public Optional<Product> getProductById(int productId){
        return repository.findById(productId);
    }
}
