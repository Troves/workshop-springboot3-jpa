package com.javatreinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatreinamento.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
