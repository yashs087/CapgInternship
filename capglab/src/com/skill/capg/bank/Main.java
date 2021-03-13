package com.skill.capg.bank;

public class Main {
	
	public static void main(String[] args) {
		welcome.authenticate();
		int choice=0;
		
		while (choice!=4) {
		welcome.welcome();
		choice=welcome.choice();
		if (choice==1) {
			Transaction.deposit();
		}
		if (choice==2) {
			Transaction.withdraw();
		}
		if (choice==3) {
			Transaction.check_balance();
		}
		
		if (choice==4) {
			Transaction.exit();
		}
		
		}
	}
}
