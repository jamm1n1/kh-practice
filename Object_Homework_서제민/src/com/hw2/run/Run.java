package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;


public class Run {
 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		 Student[] arr = new Student[10];
     int count = 0;
     while(true) {
    	 
    	 System.out.println("�л� ���� �Է� ");
    	 System.out.println("�г� :");
    	 int grade = sc.nextInt();
    	 
    	 System.out.println("�� : ");
    	 int classroom = sc.nextInt();
    	 
    	 sc.nextLine();
    	 System.out.println("�̸� : ");
    	 String name = sc.nextLine();  	
    	 
    	 System.out.println("���� ���� : ");
    	 int kor = sc.nextInt();
    	 
    	 System.out.println("���� ���� :");
    	 int eng = sc.nextInt();
    	 
    	 System.out.println("���� ���� :");
    	 int math = sc.nextInt();
    	 sc.nextLine();
    	 
    	 arr[count++] = new Student(grade,classroom,name,kor,eng,math);
    	 		 
    	
         System.out.println("��� �߰��Ͻðڽ��ϱ�? ����Ϸ��� y ���ƴϸ� n �������ּ���");
         
        char c = sc.nextLine().charAt(0);
         if(c=='n') {
        	       
        break;       
         }
	else {
		 continue;	 
	}
   
	}
     for(int i = 0 ; i<10 ; i++) {
 	      System.out.println(arr[i].information());
}
}
}
