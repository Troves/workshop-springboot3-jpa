package com.javatreinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatreinamento.course.entities.OrderItem;
import com.javatreinamento.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
