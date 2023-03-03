package com.order.demo.service;

import com.order.demo.DAO.ProductDao;
import com.order.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;
    public Product addProduct(Product product){

    }

    public Product getProductById(Long id){

    }

    public List<Product> getAllProducts(){

    }
}
