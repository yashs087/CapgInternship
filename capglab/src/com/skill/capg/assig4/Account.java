package com.skill.capg.assig4;
import java.util.Scanner;
public class Account {
	private String accountNumber;
	private int balance;
	Account(String accountNumber,int balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	public void diposite(int transactionAmount) {
		balance=balance+transactionAmount;
		System.out.println("Balance is: "+balance);
	}
	
	public void withdraw(int transactionAmount) {
		if (balance-transactionAmount>0) {
		balance=balance-transactionAmount;
		System.out.println("Balance is"+balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account number");
		String AccNo = scanner.next();
		System.out.println("Enter the account balance");
		int balance = scanner.nextInt();
		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
		int choice = scanner.nextInt();
		if (choice==1){
			System.out.println("Enter the amount to deposite");
			int transAmt = scanner.nextInt();
			Account a1= new Account(AccNo,balance);
			a1.diposite(transAmt);
		}
		else {
			System.out.println("Enter the amount to withdraw");
			int transAmt = scanner.nextInt();
			Account a1= new Account(AccNo,balance);
			a1.withdraw(transAmt);
		}
	}
	
}
