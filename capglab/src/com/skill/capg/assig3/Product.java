package com.skill.capg.assig3;

public class Product {
	private long id;
	private String productName;
	private String supplierName;
	
	Product(){
		
	}
	
	Product(long id, String productName, String supplierName){
		this.id=id;
		this.productName=productName;
		this.supplierName=supplierName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	void display() {
		System.out.println("Product id is: "+this.getId());
	    System.out.println("Product product name is: "+this.getProductName());
	    System.out.println("Product supplier name is: "+this.getSupplierName());
	}
	
}
