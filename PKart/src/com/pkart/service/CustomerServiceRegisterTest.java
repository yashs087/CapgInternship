package com.pkart.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.pkart.model.Customer;

public class CustomerServiceRegisterTest {
	
	ICustomerService customerService = new CustomerServiceImp();
	Customer customer = new Customer(12,"Aayush","A@gamil.com",8522369,"Delhi",123456);
	Customer customer1 = new Customer(1,"A","Aayus@gamil.com",8522369,"Delhi");
	Customer customer2 = new Customer(20010,"Sapna","sapna@gmail.com",756420185,"Hisaar",12345);
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class is going to launch");  
    }  
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before is setup");  
    }  
	
	@Test
	public void register() {
		
		assertEquals(true,customerService.register(customer));
		fail("registration failed");
	}
	
	@Test
	public void update() throws Exception {
		
		assertEquals(false,customerService.update(customer));
		fail("customer not updated");
	}
	
	@Test
	public void checkRegister() {
		
		assertEquals(false,customerService.isRegistered(customer.getId()));
		fail("customer is not registered");
	}
	
	@Test
	public void validatePassword() {
		
		assertEquals(false,customerService.vailidate(1234,4567));
		fail("Wrong Password");
	}
	
	
	@Test
public void wrongParameter() {
		
		assertEquals(true,customerService.register(customer));
		fail("Wrong parameter");
	}
	
	@Test
	public void lessParameter() throws Exception {
		
		assertEquals(false,customerService.update(customer));
		fail("it is having less paramter");
	}
	
	@Test
	public void alreadyRegisted() {
		
		assertEquals(false,customerService.isRegistered(customer.getId()));
		fail("check is registed or not");
	}
	
	@Test
	public void checkIfValid() {
		
		assertEquals(false,customerService.vailidate(1234,4567));
		fail("Check if valid or not");
	}
	
	
	 @Parameters
	   public  void checkingParameterised() {
		 assertEquals(false,customerService.vailidate(1234,4567));
		 fail("Check if valid or not");
		
	   }
	@After  
    public void tearDown() throws Exception {  
        System.out.println("after is being executed");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class is being ended ");  

}
}