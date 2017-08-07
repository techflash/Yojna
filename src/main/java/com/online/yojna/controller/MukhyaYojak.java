package com.online.yojna.controller;

import com.online.yojna.domain.Product;
import com.online.yojna.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MukhyaYojak {

    @Autowired
    ProductService productService;

    @GetMapping("/welcome")
    public String swagat() {
        String name = "Sunil";
        return "Welcome to Yojna!" + name;
    }


    @GetMapping("/products")
    public List<Product> products() {
        return productService.retrieveAllProduct();
    }
}
