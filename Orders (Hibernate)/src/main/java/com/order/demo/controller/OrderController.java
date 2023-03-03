package com.order.demo.controller;

import com.order.demo.entity.Product;
import com.order.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/product")
public class OrderController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity getProduct(){

    }

    @GetMapping("/{id}")
    public ResponseEntity getbyId(){

    }

    @PostMapping
    public ResponseEntity addProduct(@ResponseBody Product product){

    }
}
