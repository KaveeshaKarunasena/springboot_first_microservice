package com.microservicesprintboot.orderservice.repository;

import com.microservicesprintboot.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
