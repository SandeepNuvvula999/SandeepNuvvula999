package com.nvsons.onlinestore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_table")
public class Product {
	
	@Id
	private int id;
	@Column
	private String productName;
	@Column
	private String productClr;
	@Column
	private double price;
	@Column
	private String category;
	
	public Product(int id, String productName, String productClr, double price, String category) {
		this.id = id;
		this.productName = productName;
		this.productClr = productClr;
		this.price = price;
		this.category = category;
	}

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductClr() {
		return productClr;
	}

	public void setProductClr(String productClr) {
		this.productClr = productClr;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productClr=" + productClr + ", price=" + price
				+ ", category=" + category + "]";
	}
	
	
	
	
}
