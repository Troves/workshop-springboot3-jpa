package com.javatreinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatreinamento.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
