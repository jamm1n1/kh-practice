package com.hw1.run;

import com.hw1.model.vo.Student;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
	
		Student[]stu = new Student[3];
	{
	    stu[0] = new Student("ȫ�浿",20,178.2,70,1,"�����ý��۰��а�");
		stu[1] = new Student("�踻��",21,187.2,70,2,"�濵�а�");
		stu[2] = new Student("������",23,167,745,4,"������Ű��а�");	
		
	}
	for(int i = 0 ; i < 3; i++) {
		System.out.println(stu[i]);
	}
	Scanner sc = new Scanner(System.in);
Employee[] e =new Employee[10];
int count = 0 ;
if(count >10) {
 System.out.println("�߰��Ҽ������ϴ�.");
}else {
	

while(true){
	System.out.println("�̸� : ");
	String name =sc.nextLine();
	System.out.println("���� : ");
	int age = sc.nextInt();
	System.out.println("Ű  : ");
	double height = sc.nextDouble();
	System.out.println("������ : ");
	double weight = sc.nextDouble();
	System.out.println("�޿� : ");
	int salaly = sc.nextInt();
	sc.nextLine();
	System.out.println("�μ� : ");
	String dept = sc.nextLine();
	
    e[count++] =new Employee(name,age,height,weight,salaly,dept);
	
	System.out.println("��� �߰��Ͻðڽ��ϱ� Y/N");
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