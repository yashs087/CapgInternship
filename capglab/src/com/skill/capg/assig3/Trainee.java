package com.skill.capg.assig3;

import java.util.Scanner;

public class Trainee {
	private static String COHORT_CODE="CHNAJ19004";
	int empid;
	String name;
	
	Trainee(int empid, String name){
		this.empid=empid;
		this.name=name;
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Employee ID: "+empid+"\n"+"Name: "+name+"\n"+"Cohort code: "+COHORT_CODE+"\n");
	}
	
public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		int empid=sc.nextInt();
		System.out.println("Enter the employee name: ");
		String name=sc.next();
		
		Trainee t1= new Trainee(1,"harsh");
		t1.display();}
}





