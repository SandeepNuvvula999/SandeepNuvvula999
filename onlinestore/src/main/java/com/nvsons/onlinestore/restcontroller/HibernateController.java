package com.nvsons.onlinestore.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvsons.onlinestore.model.Product;
import com.nvsons.onlinestore.productservice.ProducServiceHibernate;

@RestController
@RequestMapping("/hibernate")
public class HibernateController {

	@Autowired
	private ProducServiceHibernate productServiceHibernate;
	
	@PostMapping("/create")
	public Product createProduc(@RequestBody Product product) {
		
		return productServiceHibernate.createProduct(product);
	}
}
