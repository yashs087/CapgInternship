package com.pkart.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainController {

	public static void main(String[] args) {

		runApplication();

	}

	private static void runApplication() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AdminController adminController = new AdminController();
		LogIn logIn = new LogIn();
		Boolean action = true;
		
		// test code comment this before running full code
		
		//CustomerController customerController = new CustomerController();
		//customerController.operations();
		
		// test code ends 
		while (action) {

			System.out.println("======= WELCOME TO EKART =======");
			System.out.println(" 1.Admin Pannel \n 2.Customer Pannel\n 3.Exit");

			try {
				char ch = br.readLine().charAt(0);
				switch (ch) {
				case '1': // Admin controller
					adminController.operations();
					break;
				case '2': // Customer comtroller
					
					logIn.operations();
					break;
				case '3': //Exit
					System.out.println("-----------EXIT------------");
					System.out.println("Exiting From The System \nThankyou.");
					action = false;
					break;
				default:
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}
}
