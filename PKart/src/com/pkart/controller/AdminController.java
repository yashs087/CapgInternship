package com.pkart.controller;
import com.pkart.util.ParseDate;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.pkart.model.Customer;
import com.pkart.model.Product;
import com.pkart.service.CustomerServiceImp;
import com.pkart.service.ICustomerService;
import com.pkart.service.IProductService;
import com.pkart.service.ProductServiceImpl;


public class AdminController {

	private static IProductService productService;
	private static ICustomerService customerService;
	Scanner scanner = new Scanner(System.in);
	private static ParseDate dateParse;
	public AdminController() {

		if (null == productService) {
			productService = new ProductServiceImpl();
			customerService = new CustomerServiceImp();
			dateParse = new ParseDate();
		}
	}
	
	///////// ProductOperations void method

	public void productOperations(){
		boolean status =true;
		while(status) {
		
		
		System.out.println(" 1.Add/Update Product \n 2.View Product \n 3.View All Products \n 4.Remove \n 5.Exit");
		System.out.println("Enter the choice:");
		int choice = scanner.nextInt();
		
		switch (choice) {

		case 1: //Add Product
			System.out.println("enter product id, name,price: ");
			int id = scanner.nextInt();
			String name = scanner.next();
			double price = scanner.nextDouble();
			int quantity = scanner.nextInt();
			String DOM = scanner.next();
			String DOE = scanner.next();
			
			Product p = new Product();
			p.setId(id);
			p.setName(name);
			p.setPrice(price);
			p.setQuantity(quantity);
			p.setDateOfManufacture(dateParse.parseDate(DOM));
			p.setDateOfExpiry(dateParse.parseDate(DOE));
			
			if (productService.add(p)) {
				System.out.println("Product added successfully.");
			} else {
				System.out.println("Product not added.");
			}
			break;


		case 2: // View Product
			System.out.println("enter product id:");
			id = scanner.nextInt();
			Product product = productService.getProduct(id);
			System.out.println(product);
			break;
		case 3: // View All Products
			List<Product> allProducts = productService.getAllProducts();

			for (Product prod : allProducts) {
				System.out.println(prod);
			}
			break;
			
		case 4:
			System.out.println("enter product id:");
			id = scanner.nextInt();
			boolean isRemoved = productService.removeProduct(id);
			if(isRemoved==true){
				System.out.println(id+"is removed form the list");
			}
			else {
				System.out.println(id+"is not removed form the list");
			}
			break;
		case 5:
			System.out.println("Exiting Product operations..!");
			status = false;

		}
		}

	}
	
///////// CustomerOperations void method
	
	
	public void customerOperations(){
		boolean status =true;
		while(status) {
		
		
		System.out.println(" 1. View customer \n 2. View All Customer \n 3. Remove customer \n 4. Exit");
		System.out.println("Enter the choice:");
		int choice = scanner.nextInt();
		
		switch (choice) {

		case 1: // View customer
			System.out.println("enter customer id:");
			int id = scanner.nextInt();
			Customer customer = customerService.viewProfile(id);
			System.out.println(customer);
			break;
		case 2: // View All Customers
			List<Customer> allCustomers = customerService.getAllCustomer();

			for (Customer customers : allCustomers) {
				System.out.println(customers);
			}
			break;
			
		case 3:
			System.out.println("enter customer id:");
			id = scanner.nextInt();
			customerService.removeCustomer(id);
			
			break;

		case 4:
			System.out.println("Exiting Product operations..!");
			status = false;

		}
		}

	}
	
	
	
	////// Admin Operations Operations
	
	
	
	public void operations() {

		
		boolean status = true;
		while (status) {
			System.out.println("------Admin Operations----");

			System.out.println(" 1. Product operations \n 2. Customer opertions \n 3. Exit");
			System.out.println("Enter the choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1: //Add Product
				productOperations();
				break;
				
			case 2:
				customerOperations();
				break;
				
			case 3: //Exiting Admin operations
				System.out.println("Exiting Admin operations..!");
				status = false;

		}

	}
	}

}
