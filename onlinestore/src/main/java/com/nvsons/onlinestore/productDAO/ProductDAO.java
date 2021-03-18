package com.nvsons.onlinestore.productDAO;

import java.util.List;

import com.nvsons.onlinestore.model.Product;

public interface ProductDAO  {
	
	public List<Product> getAllProducts();

	public Product insertProduct(Product product);

	public Product getProductById(int id);

}
