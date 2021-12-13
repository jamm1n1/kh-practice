package com.hw4.model.vo;

public class Employee {
private String name;
private int age;
private int salary;
private double taxrate;

public Employee() {	
}

public Employee(String name, int age, int salary, double taxrate) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.taxrate = taxrate;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public double getTaxrate() {
	return taxrate;
}

public void setTaxrate(double taxrate) {
	this.taxrate = taxrate;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", taxrate=" + taxrate + "]";
}


}
