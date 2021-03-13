package com.skill.capg.assig3;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// for profit calss
		
		Scanner sc=new Scanner(System.in);

	    System.out.println("Enter the number of dozens of toys purchased");
	    int x=sc.nextInt();
	    System.out.println("Enter the price per dozen");
	    int y=sc.nextInt();
	    System.out.println("Enter the selling price of 1 toy");
	    int z=sc.nextInt();
	    //System.out.println(calculateProfit(x,y,z)+"%");
		System.out.println(Profit.calculateProfit(20,375,33)+"%");
		
		/**
		//for Product class
		Scanner sc=new Scanner(System.in);
		
		Product p1= new Product();
	    System.out.println("Enter the product id");
	    long x=sc.nextLong();
	    p1.setId(x);
	    System.out.println("Enter the product name");
	    String y=sc.next();
	    p1.setProductName(y);
	    System.out.println("Enter the supllier name");
	    String z=sc.next();
	    p1.setSupplierName(z);
	    
	    
	    System.out.println("Product id is"+p1.getId());
	    System.out.println("Product id is"+p1.getId());
	    System.out.println("Product id is"+p1.getId());
	    
		System.out.println("Enter the product id: ");
		long id=sc.nextLong();
		System.out.println("Enter the product name: ");
	    String pName=sc.next();
	    System.out.println("Enter the supllier name: ");
	    String sName=sc.next();
		Product p1= new Product(id,pName,sName);
		
	    p1.display();
		*/
	}
}
