package com.nvsons.onlinestore.productservice;

import java.util.List;

import com.nvsons.onlinestore.model.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public Product insertProduct(Product product);

	public Product getProductById(int id);

}
