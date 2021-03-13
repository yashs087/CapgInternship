package com.skill.capg.bank;
import java.util.Scanner;
public class welcome {
	
static void authenticate() {
	System.out.println("---Welcome to the bank---");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Account no.");
	int acc = sc.nextInt();
	System.out.print("Welcome ");
	System.out.println(acc);
}
static void welcome() {
	
	
	System.out.println("1. Deposite amount");
	System.out.println("2. Withdraw amount");
	System.out.println("3. Check balance");
	System.out.println("4. Exit");
	
}
static int choice() {
	Scanner sc= new Scanner(System.in);
	int choice = sc.nextInt();
	//System.out.println(choice);
	return choice;}
}
