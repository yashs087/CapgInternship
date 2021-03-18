package com.skill.caog.assig8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		runApplication();
	}
	
	public static void runApplication() {
		//NameSort nameCompare = new NameSort();
		TreeSet<Employee> empSet = new TreeSet<Employee>();
		
		System.out.println("Enter number of employees to be added:");
		
		int num = scanner.nextInt();
		
		empSet = getEmployeeDetails(num);
		Iterator<Employee> i = empSet.iterator();
		
		System.out.println("Sorted order based on \n1. Employee id \n2. Name \n3. Salary \n4. Date of joining");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			while(i.hasNext()) {
				Employee emp = (Employee)i.next();
				System.out.println(emp.toString());
			}
			break;
			
		case 2:
			while(i.hasNext()) {
				Employee emp = (Employee)i.next();
				//nameCompare.compare(i, i.next());
				System.out.println(emp.toString());
			}
		}
	}
	
	public static TreeSet<Employee>  getEmployeeDetails(int num) {
		
		TreeSet<Employee> empSet = new TreeSet<Employee>();
		
		for(int i = 0; i < num; i++) {
			System.out.println("Enter id, name , salary, date of joining, designation:");
			int id = scanner.nextInt();
			String name = scanner.next();
			double salary = scanner.nextDouble();
			String dateStr = scanner.next();
			Date doj = null;
			try {
				doj = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String designation = scanner.next();
		
			//Employee emp = new Employee(id,name,salary,doj,designation);
			//empSet.add(emp);
		}
		return empSet;
		
	}
}