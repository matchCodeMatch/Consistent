package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity

public class Order {
    @Id
    @GeneratedValue(strategy
            = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long orderId;

    private String title;
    private LocalDate orderDate;
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}