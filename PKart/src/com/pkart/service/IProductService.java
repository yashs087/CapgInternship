package com.pkart.service;

import java.util.List;

import com.pkart.model.Product;

public interface IProductService {

	boolean add(Product product);

	boolean update(Product product);

	Product getProduct(int productId);

	List<Product> getAllProducts();

	boolean removeProduct(int productId);
}
