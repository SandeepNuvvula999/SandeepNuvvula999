package com.nvsons.onlinestore.productDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nvsons.onlinestore.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	

	JdbcTemplate jdbcTemplate;
	
	
	
	@Autowired
	public ProductDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Product> getAllProducts(){
		
		
		List<Product> list = new ArrayList<Product>();
		
		list =jdbcTemplate.query("select * from product", BeanPropertyRowMapper.newInstance(Product.class));
		
		return list;
	}

	@Override
	public Product insertProduct(Product product) {
		System.out.println(product);
		Product prod = new Product();
			if(product.getId()!=0 && product.getProductName()!=null && product.getProductClr()!=null && product.getPrice()!=0 && product.getCategory()!=null ) {
				prod.setId(product.getId());
				prod.setProductName(product.getProductName());
				prod.setProductClr(product.getProductClr());
				prod.setPrice(product.getPrice());
				prod.setCategory(product.getCategory());
			}else {
				System.out.println("field in product is empty");
			}
		return prod;
	}

	@Override
	public Product getProductById(int id) {
		Product product = null;
		if(id == 254782) {
			product = new Product(254782, "redmi note 7s", "blak", 9999.00, "mobile");
		}else if(id ==857945) {
			product = new Product(857945, "redmi 10t", "silver", 21999.00, "mobile");
		}else if(id== 358795) {
			product = new Product(358795, "oppo f17 pro", "white", 22999.00, "mobile");
		}else if(id == 965874){
			product = new Product(965874, "one plus 8t", "mate black", 42999.00, "mobile");
		}else if(id == 487595) {
			product = new Product(487595, "apple", "gold", 81999.00, "mobile");
		}else {
			product = new Product();
		}
	
		return product;
	}

}
