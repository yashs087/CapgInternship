package com.skill.capg.layeredApp.domain;
import java.util.*;
public class HR {
	private static int noEmp=0;
	public static Employee[] e=new Employee[10];
	static Scanner scanner = new Scanner(System.in);
	public void addEmployee()
	{
		System.out.println("Enter Employee Name");
		String name=scanner.next();
		System.out.println("Enter Employee Designation");
		String desig=scanner.next();
		e[noEmp]=new Employee(name,desig);
		noEmp=noEmp+1;
		
		
	}
	static public void updateEmployee()
	{
		System.out.println("Enter the Employee ID");
		int id=scanner.nextInt();
		System.out.println("Update \n1.Name\n2. Designation\n3. Both");
		int choice=scanner.nextInt();
		if (choice==1)
		{
			System.out.println("Enter the Name");
			e[id-1].setName(scanner.next());
		}
		if (choice==2)
		{
			System.out.println("Enter the Designation");
			e[id-1].setDesig(scanner.next());
		}
		if (choice==3)
		{
			System.out.println("Enter the Name and Designation");
			e[id-1].setName(scanner.next());
			e[id-1].setDesig(scanner.next());
		}
		}
	static public void viewEmployee()
	{
		System.out.println("Enter the Employee ID");
		int id=scanner.nextInt();
		System.out.println("Name of Employee"+e[id-1].getName());
		System.out.println("Designation of Employee"+e[id-1].getDesig());
	}
	public void removeEmployee()
	{
		System.out.println("Enter the Employee ID");
		int id=scanner.nextInt();
		for(int i=id;i<noEmp;i++) {
			e[i-1].setName(e[i].getName());
			e[i-1].setDesig(e[i].getDesig());
		}
		noEmp=noEmp-1;
		
	}
}
