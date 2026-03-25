package com.pepsico.sb.repository;


import com.pepsico.sb.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 *  OrderRepository  class
 *  which does order related transactional activities
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserEmail(String userEmail);
}