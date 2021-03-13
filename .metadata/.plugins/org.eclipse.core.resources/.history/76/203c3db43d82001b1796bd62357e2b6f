package com.skill.capg.layeredApp.application;

import java.util.Scanner;

import com.skill.capg.layeredApp.domain.EmployeeBO;

class EmpInterface {
	static void displayEmpInterface() {
	System.out.println("Enter your choice");
	System.out.println("1. View company");
	System.out.println("2. View your profile");
	System.out.println("3. Update your profile");
	Scanner sc=new Scanner(System.in);
	
	int choice= sc.nextInt();
	EmployeeBO e =new EmployeeBO();
	if (choice==1) {
		e.viewCompany();
	}
	if (choice==2) {
		e.viewProfile();
	}
	if (choice==3) {
		e.updateProfile();
	}
	if (choice==4) {
		Welcome.displayWelcome();
	}
	displayEmpInterface();
	}
}
