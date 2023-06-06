package com.jsp.productService.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.productService.entity.Product;
import com.jsp.productService.service.ProductServiceImp;

@RestController
public class RegisterRestController {
	

	@Autowired
	private ProductServiceImp productServiceImp;
	
	@GetMapping(value="getAllProduct")
	public @ResponseBody List<Product>getAllProduct(){
		return productServiceImp.getAllProduct();
	}
	
//	@RequestMapping(value="/saveRegisterDeatils",method=RequestMethod.GET)
	
	@PostMapping(value="/saveProductDeatils")
	public void saveProductDeatils(@RequestBody Product product) {
		productServiceImp.processProduct(product);
	}
	
	@GetMapping(value="getproductbyname")
	public String getProductByName(@RequestParam("name") String name){
			return name;
		}

}
