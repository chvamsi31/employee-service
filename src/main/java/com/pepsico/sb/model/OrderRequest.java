package com.pepsico.sb.model;

import java.math.BigDecimal;

public class OrderRequest {

    private String userEmail;
    private String productName;
    private Integer quantity;
    private BigDecimal price;     // unit price
    private String orderDate;     // dd-MM-yyyy
    private String status;        // optional, can be null -> defaulted by service

    public OrderRequest() {}

    // getters & setters
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}