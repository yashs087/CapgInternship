package com.skill.caog.assig8;

import java.time.LocalDate;

public class Employee {
	
	private int employId;
	private String name;
	private int salary;
	private LocalDate dateOfJoin;
	private String designation;
	
	public Employee(int employId, String name, int salary, LocalDate dateOfJoin, String designation) {
		super();
		this.employId = employId;
		this.name = name;
		this.salary = salary;
		this.dateOfJoin = dateOfJoin;
		this.designation = designation;
	}
	
	
	public int getEmployId() {
		return employId;
	}
	public void setEmployId(int employId) {
		this.employId = employId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [employId=" + employId + ", name=" + name + ", salary=" + salary + ", dateOfJoin=" + dateOfJoin
				+ ", designation=" + designation + "]";
	}

}
