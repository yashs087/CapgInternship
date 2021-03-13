package com.skill.capg.layeredApp.application;
import java.util.*;
public class Welcome {
	static void displayWelcome(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello welcome to the Capgemini");
		System.out.println("Login as");
		System.out.println("1. HR");
		System.out.println("2. Employee");
		int choice= sc.nextInt();
		if (choice==1) {
			
			HRInterface.displayHRInterface();
		}
		else {
			System.out.println("Enter you EMP ID");
			int id =sc.nextInt();
			EmpInterface.displayEmpInterface();
		}
	}
	
	public static void main(String[] args) {
		
		displayWelcome();
	}
}
