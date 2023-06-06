package com.jsp.productService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.productService.entity.Product;
import com.jsp.productService.service.ProductServiceImp;

@Controller
public class ProductController {
	
	@Autowired
	private ProductServiceImp productServiceImpl;
	
	@RequestMapping(value = "/saveProductDetails")
	public ModelAndView saveProductDetails(Product product) {
		System.out.println(product);
		productServiceImpl.processProduct(product);
		return new ModelAndView("index.jsp");
	}
	
	@RequestMapping(value = "/getProducts")
	public void getProducts() {
		
	}
	
}
