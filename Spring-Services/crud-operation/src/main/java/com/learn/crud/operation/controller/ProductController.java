package com.learn.crud.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.crud.operation.entity.Product;
import com.learn.crud.operation.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addAllProducts")
	public List<Product> saveAllProducts(@RequestBody List<Product> products){
		return service.saveAllProducts(products);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/getProductByName/{name}")
	public Product getProductById(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProductById(@PathVariable int id) {
		return service.deleteProductById(id);
	}
	
	@PutMapping("/update")
	public Product updateProduct (@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	
}
