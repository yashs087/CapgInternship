package com.pkart.dao;

import java.util.HashMap;
import java.util.Map;

import com.pkart.model.Customer;
import com.pkart.model.Product;

public class CustomerDaoImp implements ICustomerDao{

	
	private static Map<Integer, Customer> customers;

	public CustomerDaoImp() {

		if (null == customers) {
			customers = new HashMap<>();
			customers.put(2001, new Customer(2001,"Ramesh","ramesh@gmail.com",987140185,"Faridabad",12345));
			customers.put(2002, new Customer(2002,"Ram","ram@gmail.com",98714000,"Haydrabad",12345));
			customers.put(2003, new Customer(2003,"Mahesh","mahesh@gmail.com",987145185,"Delhi",12345));
			customers.put(2004, new Customer(2004,"Ganesh","ganesh@gmail.com",985620185,"Delhi",12345));
			customers.put(2005, new Customer(2005,"Rameshwar","rameshwar@gmail.com",98895662,"Faridabad",12345));
			customers.put(2006, new Customer(2006,"Jitu","jitu@gmail.com",98895623,"Banglore",12345));
			customers.put(2007, new Customer(2007,"Bholu","bholu@gmail.com",852440185,"Faizabad",12345));
			customers.put(2008, new Customer(2008,"Naira","naira@gmail.com",995640185,"Meerut",12345));
			customers.put(2009, new Customer(2009,"Shruti","sharuti@gmail.com",856140185,"Faizadabad",12345));
			customers.put(20010, new Customer(20010,"Sapna","sapna@gmail.com",756420185,"Hisaar",12345));
		}

	}
	
	
	@Override
	public void register(Customer customer) {
		
		customers.put(customer.getId(), customer);
	}

	@Override
	public void update(Customer customer) {
		
		customers.put(customer.getId(), customer);
	}

	@Override
	public Customer viewProfile(int customerId) {
		
		return customers.get(customerId);
	}


	@Override
	public boolean search(int customerId) {
		if (customers.containsKey(customerId)) {
			return true;
		}
		
		return false;
	}


	@Override
	public int vailidate(int customerId) {
		Customer customer= customers.get(customerId);
		return customer.getPassword();
		
	}
	
}
