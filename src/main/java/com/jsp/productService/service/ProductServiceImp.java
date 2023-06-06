package com.jsp.productService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.productService.entity.Product;
import com.jsp.productService.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService{

	
	 @Autowired
		private ProductRepository productRepository;
	 
	@Override
	public void processProduct(Product product) {
		productRepository.createProduct(product);
	}
	
	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAllProducts();
	}
	
}
