package com.pkart.service;



import java.util.List;

import com.pkart.dao.CustomerDaoImp;
import com.pkart.dao.ICustomerDao;
import com.pkart.model.Customer;


public class CustomerServiceImp implements ICustomerService{

	private static ICustomerDao customerDao;

	public CustomerServiceImp() {

		if (null == customerDao)
			customerDao = new CustomerDaoImp();

	}
	
	
	@Override
	public boolean register(Customer customer) {
		customerDao.register(customer);

		Customer savedCustomer = customerDao.viewProfile(customer.getId());

		if (savedCustomer != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean update(Customer customer) {
		
		customerDao.update(customer);

		Customer savedCustomer = customerDao.viewProfile(customer.getId());

		if (savedCustomer != null)
			return true;
		else
			return false;
		
	}

	@Override
	public Customer viewProfile(int customerId) {
		
		return customerDao.viewProfile(customerId);
	}


	@Override
	public boolean isRegistered(int customerId) {
		
		return customerDao.search(customerId);
	}


	@Override
	public boolean vailidate(int customerId, int pass) {
		
		if( customerDao.vailidate(customerId)==pass) {
			return true;
		}
		return false;
	}


	@Override
	public List<Customer> getAllCustomer() {
		return customerDao.allCustomer();
	}


	@Override
	public boolean removeCustomer(int customerId) {
		customerDao.removeCustomer(customerId);
		if (customerDao.viewProfile(customerId)==null) {
			return true;
		}
		return false;
	}

}
