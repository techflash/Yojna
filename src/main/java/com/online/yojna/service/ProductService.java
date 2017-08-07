package com.online.yojna.service;

import com.online.yojna.domain.Product;
import com.online.yojna.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> retrieveAllProduct(){
        return productRepository.findAll();
    }

}
