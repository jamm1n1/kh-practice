package com.hw4.controller;

import java.util.Scanner;

import com.hw4.model.vo.Employee;

public class EmpTest {
	Employee[] arr = new Employee[6];
	{
		arr[0] = new Employee("�蹮��", 24, 1500000, 1.245);
		arr[1] = new Employee("�����", 40, 2500000, 1.4);
		arr[2] = new Employee("�ڱݼ�", 22, 1780000, 1.3);
		arr[3] = new Employee("�ֺ�ȣ", 31, 1950000, 1.365);
		arr[4] = new Employee("ȫ�޸�", 27, 1650000, 1.212);
	}
	public EmpTest() {}
	
	public void setEmp() {
		
		
         Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.println("�޿��� �Է��ϼ��� : ");
		int salary = sc.nextInt();
		
		System.out.println("������ �Է��ϼ��� : ");
		double tax = sc.nextDouble();
		sc.nextLine();
				
	
		arr[5] = new Employee(name, age, salary, tax);
	    
	}
	
	public void printEmp() {
		
		for(int i = 0; i < arr.length; i++) {
           System.out.println(arr[i].toString());
		}
		
	}
	public void nameSortPrint() {
		
		Employee[] emp = new Employee[1];
		Employee temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i].getName().compareTo(arr[j].getName())<0) {//������ 0 ��ȯ 0���� �۾ƾ��ϴ������� ���� �ٸ����ڵ麸�� �ƽ�Ű�ڵ尡 �۱⶧���� -���� ���´�
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
	}
			}
		}
	}
}
