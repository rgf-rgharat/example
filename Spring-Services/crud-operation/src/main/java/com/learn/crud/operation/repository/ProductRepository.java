package com.learn.crud.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.crud.operation.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

}
