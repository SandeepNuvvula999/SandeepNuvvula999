package com.nvsons.consumeonlinestore.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nvsons.consumeonlinestore.model.Product;

@RestController
@RequestMapping("/consume")
public class ProductController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	

	@GetMapping("/getproducts")
	public List<Object> getProducts(){
		
		String url = "http://localhost:8080/onlinestore/getallproducts";
		
		Object[] object = restTemplate.getForObject(url, Object[].class);
		
		return Arrays.asList(object);
	}
	
	@GetMapping("/getproductsforentity")
	public List<Product> getProductss(){
		
		String url = "http://localhost:8080/onlinestore/getallproducts";
		
		ResponseEntity<Product>  product = restTemplate.getForEntity(url, Product.class);
		
		return (List<Product>) product;
	}
}
