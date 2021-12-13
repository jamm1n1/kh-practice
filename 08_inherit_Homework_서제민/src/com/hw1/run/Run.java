package com.hw1.run;

import com.hw1.model.vo.Student;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
	
		Student[]stu = new Student[3];
	{
	    stu[0] = new Student("홍길동",20,178.2,70,1,"정보시스템공학과");
		stu[1] = new Student("김말똥",21,187.2,70,2,"경영학과");
		stu[2] = new Student("강개순",23,167,745,4,"정보통신공학과");	
		
	}
	for(int i = 0 ; i < 3; i++) {
		System.out.println(stu[i]);
	}
	Scanner sc = new Scanner(System.in);
Employee[] e =new Employee[10];
int count = 0 ;
if(count >10) {
 System.out.println("추가할수없습니다.");
}else {
	

while(true){
	System.out.println("이름 : ");
	String name =sc.nextLine();
	System.out.println("나이 : ");
	int age = sc.nextInt();
	System.out.println("키  : ");
	double height = sc.nextDouble();
	System.out.println("몸무게 : ");
	double weight = sc.nextDouble();
	System.out.println("급여 : ");
	int salaly = sc.nextInt();
	sc.nextLine();
	System.out.println("부서 : ");
	String dept = sc.nextLine();
	
    e[count++] =new Employee(name,age,height,weight,salaly,dept);
	
	System.out.println("계속 추가하시겠습니까 Y/N");
	char a = sc.nextLine().charAt(0);
	if(a=='Y'||a=='y') {
		continue;
	}else {
		break;
	}
	
}
for(int i = 0; i < 10; i++) {
	System.out.println(e[i]);
}
}
}
}