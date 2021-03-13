package com.skill.capg.layeredApp.application;

import java.util.Scanner;

import com.skill.capg.layeredApp.domain.HR;

class HRInterface {
	
		static void displayHRInterface() {
		System.out.println("Enter your choice");
		System.out.println("1. Add employee");
		System.out.println("2. Update employee");
		System.out.println("3. View Employee");
		System.out.println("4. Remove Employee");
		System.out.println("5. Exit");
		Scanner sc=new Scanner(System.in);
		HR hr= new HR();
		int choice= sc.nextInt();
		if (choice==1) {
			hr.addEmployee();
		}
		if (choice==2) {
			hr.updateEmployee();
		}
		if (choice==3) {
			hr.viewEmployee();
		}
		if (choice==4) {
			hr.removeEmployee();
		}
		if (choice==5) {
			Welcome.displayWelcome();
		}
		displayHRInterface();
	}
	
}
