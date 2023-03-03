package org.example;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productId;
    private String productName;

    public Product() {
    }
    public  Product(String productName){
        this.productName = productName;
    }

    public Product(long productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString(){
        return "productId : "+this.productId+"  productName : "+this.productName;
    }
}
