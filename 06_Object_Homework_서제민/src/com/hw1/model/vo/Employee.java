package com.hw1.model.vo;

import java.util.Scanner;

public class Employee {



private String empName; //�����
private String dept; //�μ���
private String job; //����
private int age; //����
private char gender; //����
private int salary; //�޿�
private double bonusPoint; //���ʽ�����Ʈ
private String phone; //��ȭ��ȣ
private String address; // �ּ�
	
public Employee(){
	
}
public Employee(String empName,String dept,String job,int age,char gender,int salary,double bonusPoint,String phone,String address) {
this.empName=empName;
this.dept=dept;
this.job=job;
this.age=age;
this.gender=gender;
this.salary=salary;
this.gender=gender;
this.bonusPoint=bonusPoint;
this.phone=phone;
this.address=address;
	
	
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public double getBonusPoint() {
	return bonusPoint;
}

public void setBonusPoint(double bonusPoint) {
	this.bonusPoint = bonusPoint;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String info() {
	String info = "�̸� = " + empName + " �μ� = " + dept + " ���� = " + job + " ���� = " + age + " ���� = " + gender
			+ " �޿� = " + salary + " ���ʽ�����Ʈ = " + bonusPoint + " �ڵ�����ȣ = " + phone + " �ּ� = " + address ;
	return info;
}


}
	
	
	
	
	

