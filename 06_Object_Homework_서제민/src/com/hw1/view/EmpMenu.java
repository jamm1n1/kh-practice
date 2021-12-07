package com.hw1.view;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class EmpMenu {





	public void mainmenu(){
		
	Employee emp=null;
Scanner sc = new Scanner(System.in);
Employee e = new Employee();
while(true) {
	System.out.println("============사원 정보 관리 프로그램================");
	System.out.println("1. 새 사원 정보 입력 : ");
	System.out.println("2. 사원 정보 수정 : ");
	System.out.println("3. 사원 정보 삭제 : ");
	System.out.println("4. 사원 정보 출력 : ");
	System.out.println("9. 프로그램 종료 : ");
	System.out.println("메뉴 번호 선택 : ");	
int num =sc.nextInt();
		switch(num) {
		case 1 :			
			emp=inputEmployee();
			break;
			
		case 2 :
			System.out.println("사원 정보 수정 ");
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
	System.out.println("이름: ");
	String empName = sc.nextLine();
	
	
	System.out.println("부서명 : ");
	String dept = sc.nextLine();

	
	System.out.println("직급 :");
	String job = sc.nextLine();


	System.out.println("나이 : ");
	int age = sc.nextInt();
	sc.nextLine();
	
	System.out.println("성별 : ");
	char gender = sc.nextLine().charAt(0);
	
	System.out.println("급여 : ");
	int salary = sc.nextInt();
	
	System.out.println("보너스포인트 : ");
	double bonusPoint = sc.nextDouble();
	
	sc.nextLine();
	System.out.println("전화번호 : ");
	String phone = sc.nextLine();
	
	
	System.out.println("주소 : ");
	
	String adress = sc.nextLine();
    Employee emp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, adress);
    return emp;
	
}
	
		
	
	

	public void modifyEmployee(Employee emp) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
				case 1:
					System.out.println("변경할 이름 : ");
					String changeName = sc.nextLine();
					emp.setEmpName(changeName);
					break;
				case 2:
					System.out.println("변경할 급여 값: ");
					int changeSalary = sc.nextInt();
					sc.nextLine();
					emp.setSalary(changeSalary);
					break;
				case 3:
					System.out.println("변경할 부서 : ");
					String changeDept = sc.nextLine();
					emp.setDept(changeDept);
					break;
				case 4:
					System.out.println("변경할 직급 : ");
					String changeJob = sc.nextLine();
					emp.setJob(changeJob);
					break;
				case 9:
					return;
       
	}





		}
	}
}
	
	
	
	
	
	
	
	

