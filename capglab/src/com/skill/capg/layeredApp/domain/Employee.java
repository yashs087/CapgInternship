package com.skill.capg.layeredApp.domain;

public class Employee {
	private int id;
	private String name; //Name of employee
	private String desig; //Designation
	

	Employee(String name, String desig){
		this.name=name;
		this.desig=desig;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
}
