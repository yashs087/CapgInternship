package com.pkart.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pkart.model.Product;

public class ProductDaoImpl implements IProductDao {

	private static Map<Integer, Product> products;

	public ProductDaoImpl() {

		if (null == products) {
			products = new HashMap<>();
			products.put(1, new Product(1,"Mobile",23000));
			products.put(2, new Product(2,"Laptop",50000));
			products.put(3, new Product(3,"Tablet",10000));
			products.put(4, new Product(4,"Skirt",3000));
			products.put(5, new Product(5,"TV",28000));
			products.put(6, new Product(6,"Cable",1000));
			products.put(7, new Product(7,"Bluetooth",2000));
			products.put(8, new Product(8,"Shirt",3000));
			products.put(9, new Product(9,"Pant",2000));
			products.put(10, new Product(10,"Tie",200));
			
		}

	}

	@Override
	public void add(Product product) {

		products.put(product.getId(), product);

	}

	@Override
	public void update(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public Product getProduct(int productId) {

		return products.get(new Integer(productId));
	}

	@Override
	public List<Product> getAllProducts() {
		ArrayList<Product> list = new ArrayList<>();

		Collection<Product> productList = products.values();

		for (Product p : productList) {
			list.add(p);
		}

		return list;

	}
}
