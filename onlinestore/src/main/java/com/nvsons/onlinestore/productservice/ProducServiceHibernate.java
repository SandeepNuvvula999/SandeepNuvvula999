package com.nvsons.onlinestore.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nvsons.onlinestore.model.Product;
import com.nvsons.onlinestore.productDAO.ProductRepositort;
@Service
public class ProducServiceHibernate {
	
	@Autowired
	private ProductRepositort productRepositort;

	public Product createProduct(Product product) {
		
		return productRepositort.save(product);
	}

}
