package com.skill.capg.lab5.com.cg.eis.exception;
import java.util.Scanner;

class EmpException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmpException(){
		System.out.println("The Salary is below 3000");
	}
}

public class EmployeeException{
	public static void main(String[] args) {
		System.out.println("Enter your salary");
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		try {
			if(salary<3000) {
				throw new EmpException();
			}
			else {
				System.out.println("The salary is "+salary);
			}
		}
		catch(Exception e) {
			
		}
		}
	}

