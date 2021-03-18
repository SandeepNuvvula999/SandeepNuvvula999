package com.nvsons.onlinestore.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvsons.onlinestore.model.Product;
import com.nvsons.onlinestore.productservice.ProductService;

@RestController
@RequestMapping("/onlinestore")
public class OnlneStoreProductcontroller {

	@Autowired
	ProductService productService;
	
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
	}
	
	@PostMapping("/insert")
	public Product insertProduct(@RequestBody Product product) {
		
		return productService.insertProduct(product);
		
	}
	
	@GetMapping("/getbyid/{id}")
	public Product getProductById(@PathVariable int id) {
		
		return productService.getProductById(id);
		
	}
}
