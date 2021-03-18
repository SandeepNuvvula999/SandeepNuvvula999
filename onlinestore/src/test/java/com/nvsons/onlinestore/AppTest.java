package com.nvsons.onlinestore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.nvsons.onlinestore.model.Product;
import com.nvsons.onlinestore.productDAO.ProductDAOImpl;
import com.nvsons.onlinestore.productservice.ProductSerrviceImpl;
import com.nvsons.onlinestore.restcontroller.OnlneStoreProductcontroller;

@ExtendWith(MockitoExtension.class)
public class AppTest {
	
	@InjectMocks
	OnlneStoreProductcontroller productController;
	
	@Mock
	ProductSerrviceImpl service;
	
	@Mock
	ProductDAOImpl dao;
	
	@Mock
	Product product;
	@Test
	void getAllProductsTest() {
		int id = 358795;
		
		Product product1 = new Product(358795, "oppo f17 pro", "white", 22999.00, "mobile");
		
		Mockito.when(dao.getProductById(id));
		
		Mockito.when(service.getProductById(id));
		
		product = productController.getProductById(id);
		
//		product = (Product) Mockito.when(productController.getProductById(id)).thenReturn(product);
		
		assertThat(product.getProductName()).isEqualTo("oppo f17 pro");
		
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("before all called");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before each called");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("after each called");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("after all called");
	}
	
	@Test
	void add() {
		assertThat(4).isEqualTo(2+2);
	}
	
	@Test
	void negitiveTest() {
		assertThat(4).isNotEqualTo(2);
	}

}
