package com.hw1.view;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class EmpMenu {





	public void mainmenu(){
		
	Employee emp=null;
Scanner sc = new Scanner(System.in);
Employee e = new Employee();
while(true) {
	System.out.println("============��� ���� ���� ���α׷�================");
	System.out.println("1. �� ��� ���� �Է� : ");
	System.out.println("2. ��� ���� ���� : ");
	System.out.println("3. ��� ���� ���� : ");
	System.out.println("4. ��� ���� ��� : ");
	System.out.println("9. ���α׷� ���� : ");
	System.out.println("�޴� ��ȣ ���� : ");	
int num =sc.nextInt();
		switch(num) {
		case 1 :			
			emp=inputEmployee();
			break;
			
		case 2 :
			System.out.println("��� ���� ���� ");
			modifyEmployee(emp);
			break;
			
		case 3 :
			emp = null;
			break;
		case 4 :
			
			System.out.println(e.info());
			break;
		case 9 :
			
			return;
		}
}
	  
}
public Employee inputEmployee() {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("�̸�: ");
	String empName = sc.nextLine();
	
	
	System.out.println("�μ��� : ");
	String dept = sc.nextLine();

	
	System.out.println("���� :");
	String job = sc.nextLine();


	System.out.println("���� : ");
	int age = sc.nextInt();
	sc.nextLine();
	
	System.out.println("���� : ");
	char gender = sc.nextLine().charAt(0);
	
	System.out.println("�޿� : ");
	int salary = sc.nextInt();
	
	System.out.println("���ʽ�����Ʈ : ");
	double bonusPoint = sc.nextDouble();
	
	sc.nextLine();
	System.out.println("��ȭ��ȣ : ");
	String phone = sc.nextLine();
	
	
	System.out.println("�ּ� : ");
	
	String adress = sc.nextLine();
    Employee emp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, adress);
    return emp;
	
}
	
		
	
	

	public void modifyEmployee(Employee emp) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==== ��� ���� ���� �޴� ====");
			System.out.println("1. �̸� ����");
			System.out.println("2. �޿� ����");
			System.out.println("3. �μ� ����");
			System.out.println("4. ���� ����");
			System.out.println("9. ���� �޴���");
			
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
				case 1:
					System.out.println("������ �̸� : ");
					String changeName = sc.nextLine();
					emp.setEmpName(changeName);
					break;
				case 2:
					System.out.println("������ �޿� ��: ");
					int changeSalary = sc.nextInt();
					sc.nextLine();
					emp.setSalary(changeSalary);
					break;
				case 3:
					System.out.println("������ �μ� : ");
					String changeDept = sc.nextLine();
					emp.setDept(changeDept);
					break;
				case 4:
					System.out.println("������ ���� : ");
					String changeJob = sc.nextLine();
					emp.setJob(changeJob);
					break;
				case 9:
					return;
       
	}





		}
	}
}
	
	
	
	
	
	
	
	

