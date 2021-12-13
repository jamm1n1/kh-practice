package com.hw1.model.vo;

public class Employee extends person{

	private int salary;
	private String dept;
	
	 
	
	
	
	public Employee() {
		super();		
	}

	
	public Employee(String name, int age, double height, double weight,int salary, String dept) {
		super(name, salary, height, height);
		this.salary = salary;
		this.dept = dept;
	}


	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "[ + super.toString() + Employee salary=\" + salary + \", dept=\" + dept]";
	}
	
	
}
