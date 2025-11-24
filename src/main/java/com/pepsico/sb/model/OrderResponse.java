package com.pepsico.sb.model;


import java.math.BigDecimal;

public class OrderResponse {

    private Long orderId;
    private String userEmail;
    private String productName;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal totalPrice;
    private String status;
    private String orderDate;

    public OrderResponse() {}

    public OrderResponse(Long orderId, String userEmail, String productName, Integer quantity, BigDecimal price, BigDecimal totalPrice, String status, String orderDate) {
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
        this.status = status;
        this.orderDate = orderDate;
    }

    // getters
    public Long getOrderId() { return orderId; }
    public String getUserEmail() { return userEmail; }
    public String getProductName() { return productName; }
    public Integer getQuantity() { return quantity; }
    public BigDecimal getPrice() { return price; }
    public BigDecimal getTotalPrice() { return totalPrice; }
    public String getStatus() { return status; }
    public String getOrderDate() { return orderDate; }
}
