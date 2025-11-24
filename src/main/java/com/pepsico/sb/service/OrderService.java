package com.pepsico.sb.service;

import com.pepsico.sb.entity.Order;
import com.pepsico.sb.model.*;
import com.pepsico.sb.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public OrderResponse createOrder(OrderRequest request) {
        // basic validation
        if (request.getUserEmail() == null || request.getProductName() == null || request.getQuantity() == null || request.getPrice() == null || request.getOrderDate() == null) {
            throw new IllegalArgumentException("Missing required order fields");
        }

        BigDecimal totalPrice = request.getPrice().multiply(BigDecimal.valueOf(request.getQuantity()));

        String status = (request.getStatus() == null || request.getStatus().isBlank()) ? "CREATED" : request.getStatus();

        Order order = new Order(
                request.getUserEmail(),
                request.getProductName(),
                request.getQuantity(),
                request.getPrice(),
                totalPrice,
                status,
                request.getOrderDate()
        );

        Order saved = repo.save(order);

        return toDto(saved);
    }

    @Transactional(readOnly = true)
    public List<OrderResponse> getAllOrders() {
        return repo.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<OrderResponse> getOrdersByEmail(String email) {
        return repo.findByUserEmail(email).stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public OrderResponse getOrderById(Long id) {
        Order o = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Order not found: " + id));
        return toDto(o);
    }

    private OrderResponse toDto(Order o) {
        return new OrderResponse(
                o.getOrderId(),
                o.getUserEmail(),
                o.getProductName(),
                o.getQuantity(),
                o.getPrice(),
                o.getTotalPrice(),
                o.getStatus(),
                o.getOrderDate()
        );
    }
}