package com.javatreinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatreinamento.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
