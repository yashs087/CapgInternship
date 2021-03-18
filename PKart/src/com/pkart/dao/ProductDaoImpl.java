package com.pkart.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pkart.model.Product;

public class ProductDaoImpl implements IProductDao {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	private static Map<Integer, Product> products;

	public ProductDaoImpl() {

		if (null == products) {
			products = new HashMap<>();
			products.put(1, new Product(1,"Mobile",23000,26,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(2, new Product(2,"Laptop",50000,50,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(3, new Product(3,"Tablet",10000,37,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(4, new Product(4,"Skirt",3000,97,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(5, new Product(5,"TV",2800036,53,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(6, new Product(6,"Cable",1000,75,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(7, new Product(7,"Bluetooth",2000,67,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(8, new Product(8,"Shirt",3000,46,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(9, new Product(9,"Pant",2000,46,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			products.put(10, new Product(10,"Tie",200,79,LocalDate.parse("2020-09-01", formatter),LocalDate.parse("2021-09-01", formatter)));
			
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
	public Product removeProduct(int productId) {

		return products.remove(new Integer(productId));
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
