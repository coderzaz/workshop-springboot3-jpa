package com.keller.coderzaz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keller.coderzaz.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
