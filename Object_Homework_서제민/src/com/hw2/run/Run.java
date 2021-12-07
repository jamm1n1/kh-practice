package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;


public class Run {
 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		 Student[] arr = new Student[10];
     int count = 0;
     while(true) {
    	 
    	 System.out.println("학생 정보 입력 ");
    	 System.out.println("학년 :");
    	 int grade = sc.nextInt();
    	 
    	 System.out.println("반 : ");
    	 int classroom = sc.nextInt();
    	 
    	 sc.nextLine();
    	 System.out.println("이름 : ");
    	 String name = sc.nextLine();  	
    	 
    	 System.out.println("국어 성적 : ");
    	 int kor = sc.nextInt();
    	 
    	 System.out.println("영어 성적 :");
    	 int eng = sc.nextInt();
    	 
    	 System.out.println("수학 성적 :");
    	 int math = sc.nextInt();
    	 sc.nextLine();
    	 
    	 arr[count++] = new Student(grade,classroom,name,kor,eng,math);
    	 		 
    	
         System.out.println("계속 추가하시겠습니까? 계속하려면 y 를아니면 n 을눌러주세요");
         
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
