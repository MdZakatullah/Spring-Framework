package com.jsp.productService.service;

import java.util.List;


import com.jsp.productService.entity.Product;

public interface ProductService {
	
	public void processProduct(Product product);
	
	public List<Product> getAllProduct(); 

}
