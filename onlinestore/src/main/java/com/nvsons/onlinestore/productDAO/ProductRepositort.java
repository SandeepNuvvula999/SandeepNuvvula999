package com.nvsons.onlinestore.productDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nvsons.onlinestore.model.Product;
@Repository
public interface ProductRepositort extends JpaRepository<Product, Integer> {

}
