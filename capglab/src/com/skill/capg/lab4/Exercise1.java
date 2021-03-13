package com.skill.capg.lab4;
import java.util.Scanner;

class Person
{
	String name;
	float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
class Account extends Person
{
	Person accHolder;
	long accNum;
	double balance;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double depositAmount)
	{
		balance=balance+depositAmount;
	}
	void withdraw(double withdrawAmount)
	{
		balance=balance-withdrawAmount;
	}
	double getbalance()
	{
		return balance;
	}
	
}
class SavingsAccount extends Account
{
	int minimumBalance=500;
	void withdraw(double withdrawAmount)
	{
		if(withdrawAmount<minimumBalance)
		{
			System.out.println("Your Balance is low");
		}
		else {
			withdraw(withdrawAmount);
		}
	}
}
class CurrentAccount extends Account
{
	int overDraftLimit=1000;
	void withdraw(double withdrawAmount)
	{
		if(overDraftLimit<withdrawAmount)
			System.out.println("Overdraw limit reached");
		else {
			withdraw(withdrawAmount);
		}
	}
	
}

public class Exercise1 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Account acc[]=new Account[2];
		acc[0]=new Account();
		acc[1]=new Account();
		
		acc[0].setName("Smith");
		acc[0].setBalance(2000.0);
		acc[1].setName("Kathy");
		acc[1].setBalance(3000.0);
		acc[0].deposit(2000.0);
		acc[1].withdraw(2000.0);
		System.out.println(acc[0].getbalance());
		System.out.println(acc[1].getbalance());

	}

}