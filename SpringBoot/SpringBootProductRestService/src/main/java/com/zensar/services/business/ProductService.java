package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Product;

public interface ProductService {
	
	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	Product findProductById(int productId);
	List<Product> findAllProducts();
	
}
