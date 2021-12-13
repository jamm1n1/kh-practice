package com.hw4.controller;

import java.util.Scanner;

import com.hw4.model.vo.Employee;

public class EmpTest {
	Employee[] arr = new Employee[6];
	{
		arr[0] = new Employee("김문말", 24, 1500000, 1.245);
		arr[1] = new Employee("이장소", 40, 2500000, 1.4);
		arr[2] = new Employee("박금순", 22, 1780000, 1.3);
		arr[3] = new Employee("최봉호", 31, 1950000, 1.365);
		arr[4] = new Employee("홍달림", 27, 1650000, 1.212);
	}
	public EmpTest() {}
	
	public void setEmp() {
		
		
         Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		
		System.out.println("세율을 입력하세요 : ");
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
				if(arr[i].getName().compareTo(arr[j].getName())<0) {//같으면 0 반환 0보다 작아야하는이유는 ㄱ이 다른문자들보다 아스키코드가 작기때문에 -값이 나온다
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
	}
			}
		}
	}
}
