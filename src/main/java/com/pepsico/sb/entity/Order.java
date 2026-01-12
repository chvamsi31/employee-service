package com.pepsico.sb.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @Column(name = "orderid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "useremail")
    private String userEmail;

    @Column(name = "productname")
    private String productName;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "totalprice")
    private BigDecimal totalPrice;

    @Column(name = "status")
    private String status;

    @Column(name = "orderdate")
    private String orderDate;

    public Order(String userEmail, String productName, Integer quantity, BigDecimal price, BigDecimal totalPrice, String status, String orderDate) {
        this.userEmail = userEmail;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.status = status;
        this.orderDate = orderDate;
    }
}