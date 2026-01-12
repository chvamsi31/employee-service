package com.pepsico.sb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private String userEmail;
    private String productName;
    private Integer quantity;
    private BigDecimal price;     // unit price
    private String orderDate;     // dd-MM-yyyy
    private String status;        // optional, can be null -> defaulted by service
}