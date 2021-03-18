package com.nvsons.onlinestore.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nvsons.onlinestore.model.Product;
import com.nvsons.onlinestore.productDAO.ProductDAO;

@Service
public class ProductSerrviceImpl implements ProductService {
	
	@Autowired
	ProductDAO productDAO;
	@Override
	public List<Product> getAllProducts() {
		
		return productDAO.getAllProducts();
	}
	@Override
	public Product insertProduct(Product product) {
		
		return productDAO.insertProduct(product);
	}
	@Override
	public Product getProductById(int id) {
		
		return productDAO.getProductById(id);
	}

}
