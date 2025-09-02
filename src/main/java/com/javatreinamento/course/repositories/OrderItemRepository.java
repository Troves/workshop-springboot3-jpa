package com.javatreinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatreinamento.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
