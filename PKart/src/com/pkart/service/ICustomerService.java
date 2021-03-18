package com.pkart.service;

import java.util.List;

import com.pkart.model.Customer;
import com.pkart.model.Product;

public interface ICustomerService {

	boolean register(Customer customer);

	boolean update(Customer customer);

	Customer viewProfile(int customerId);
	
	boolean isRegistered(int customerId);
	
	boolean vailidate(int customerId, int pass);
	
	List<Customer> getAllCustomer();
	
	boolean removeCustomer(int customerId);
}
