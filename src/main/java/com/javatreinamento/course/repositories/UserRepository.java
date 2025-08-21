package com.javatreinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatreinamento.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
