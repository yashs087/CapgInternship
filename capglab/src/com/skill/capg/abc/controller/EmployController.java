package com.abc.controller;

import java.util.Scanner;

import com.abc.model.Employ;
import com.abc.service.EmployServiceImpl;
import com.abc.service.IEmployService;
import com.abc.util.InputUtil;

public class EmployController {
	Employ employ;
	int id;
	String name;
	double salary;
	Scanner scanner = InputUtil.getScanner();

	private static IEmployService employService = new EmployServiceImpl();

	public void operations() {
		Scanner scanner = InputUtil.getScanner();
		boolean status = true;
		while (status) {
			System.out.println("---Welcome to Employ operations---");
			System.out.println(
					" 1. register employ \n 2. update employ \n 3. remove employ \n 4. view employ \n 5.All employees \n 6.Exit");

			System.out.println("enter your choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				 employ = readEmployInfo();
				if (employService.add(employ)) {
					System.out.println("employ added with " + employ.getId() + " successfully.!");
				} else {
					System.out.println("employ not added.!");
				}
				break;

			case 2:
				employ=updateEmploy();
				break;
				
			case 3:
				System.out.println("Enter id you want to delete ");
				id=scanner.nextInt();
				if(employService.delete(id))
				employ=delete();
				break;
//			case 4:
//				employ=getEmploy();
			}

		}
	}

	private Employ readEmployInfo() {

		//Scanner scanner = InputUtil.getScanner();
		System.out.println("Enter employ id,name,salary:");
		id = scanner.nextInt();
		name = scanner.next();
		salary = scanner.nextDouble();

		return new Employ(id, name, salary);
	}

	private Employ updateEmploy()
	{
		System.out.println("Enter employ id");
		int id1=scanner.nextInt();
		if(id==id1)
		{
			System.out.println("Enter name to update");
			name=scanner.next();
			System.out.println("updated is "+name +id +salary);
		}
		return new Employ(id, name, salary);
	}
	private Employ delete()
	{
		System.out.println("Enter employ id you want to delete");
		int id1=scanner.nextInt();
		if(id==id1)
		{
			
		}
		return new Employ(id, name, salary);
	}
//	private Employ getEmploy()
//	{
//		
//	}
}
