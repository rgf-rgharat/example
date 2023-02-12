package com.learn.crud.operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.crud.operation.entity.Product;
import com.learn.crud.operation.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		
		return repository.save(product);
	}
	
	public List<Product> saveAllProducts(List<Product> products){
	
		return repository.saveAll(products);
	}
	
	public List<Product> getAllProducts(){
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	
	
}
