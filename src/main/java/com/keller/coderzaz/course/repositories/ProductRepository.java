package com.keller.coderzaz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keller.coderzaz.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
