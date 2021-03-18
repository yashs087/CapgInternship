package com.skill.caog.assig8.product;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

class ProductComparator implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		long noOfDaysBetweeno1 = ChronoUnit.DAYS.between(o1.dateOfExpiry, o1.dateOfManufacture);
		long noOfDaysBetweeno2 = ChronoUnit.DAYS.between(o2.dateOfExpiry, o2.dateOfManufacture);
//		LocalDate time1 = (LocalDate)Period.between(o1.dateOfExpiry, o1.dateOfManufacture);
//		LocalDate time2 = (LocalDate)Period.between(o2.dateOfExpiry, o2.dateOfManufacture);
		int a1=(int)noOfDaysBetweeno1;
		int a2=(int)noOfDaysBetweeno2;
		return a2-a1;
	}
	
}
public class Main  {
	static ArrayList<Product> tr=new ArrayList<Product>(); 
	public static void main(String[] args) {
		System.out.println("Enter the no of product");
		Scanner scanner=new Scanner(System.in);
		int noOfProduct=scanner.nextInt();
		
		
		for(int i=0;i<noOfProduct;i++)
		{
			System.out.println("Enter id name price dateOfExpiry dateOfManufacture ");
			int productId=scanner.nextInt();
			String name=scanner.next();
			int price=scanner.nextInt();
			String dateOfExpiry=scanner.next();
			String dateOfManufacture=scanner.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//Product product=new Product();
			
			tr.add(new Product(productId,name,price,LocalDate.parse(dateOfExpiry,formatter),LocalDate.parse(dateOfManufacture,formatter)));
			
		}
		Collections.sort(tr,new ProductComparator());
		Collections.reverse(tr);
		System.out.println("product added succesfully");
		for ( Product p :tr ) {
			System.out.println(p);
		}
	}

}