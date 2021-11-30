package com.kh.practice.example;

import java.util.Scanner;

public class Operatorpractice {
	

	 public void practice1(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("정수 : ");
		 int a = sc.nextInt();
		 System.out.println(a+"은/는 "+(a>0 ? "양수이다" : "음수이다"));
		
	 }
		 public void practice2(){
		
		 Scanner sc = new Scanner(System.in);
			 System.out.println("정수 : ");
			 int a = sc.nextInt();
			 
			
			String result = a == 0 ? "0이다" : (a > 0 ?  "양수이다" : "음수이다");
			System.out.println(a +"는"+result);
			
		 }
			 
	 
		 public void practice3(){
			 Scanner sc = new Scanner(System.in);
			 System.out.println("정수 : ");
			 int a = sc.nextInt();
			 System.out.println(a%2 == 0 ? "짝수다" : "홀수다");
		
			
			 }
		 
		 public void practice4(){
			 Scanner sc = new Scanner(System.in);
			 System.out.println("인원수 : ");
			 int people = sc.nextInt();
			 System.out.println("사탕의 개수 : ");
			 int sugar = sc.nextInt();
			 System.out.println("1인당 사탕 개수 : "+sugar/people);
			 System.out.println("남는 사탕 개수 : "+sugar%people);
			 
			 
			 
		 }
		 public void practice5(){
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("이름");
				String name = sc.nextLine();
				
				System.out.println("학년(숫자만)");
				int grade = sc.nextInt();
				
				System.out.println("반(숫자만)");
				int classnum = sc.nextInt();
				
				System.out.println("번호(숫자만)");
				int num = sc.nextInt();
				sc.nextLine();
				
				System.out.println("성별(M/F)");
				char gender = sc.nextLine().charAt(0);
				
				System.out.println("성적(소수점 둘째 자리까지)");
				double score = sc.nextDouble();
						
				String student = "";
				if (gender=='M' || gender =='m') {
					student="남학생";		
				}
				else if (gender=='F' || gender =='f') {
					student="여학생";
				}else
					return;
					
				
				System.out.println(grade + "학년 " + classnum+"반 "+ num + "번 "+name + gender +"의 성적은 "+ score+"이다");
		 }
		 public void practice6(){	 
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("나이 : ");
				int age = sc.nextInt();
				if(age<=13) {
					System.out.println("어린이");
				}
				else if(age<=19) {
					System.out.println("청소년");
				}else {
					System.out.println("어른");
				}
				 
					
		 }
		 public void practice7(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("국어 : ");
				int ko = sc.nextInt();
				System.out.print("영어 : ");
				int en = sc.nextInt();
				System.out.print("수학 : ");
				int ma = sc.nextInt();
			 System.out.println("합계 : "+(ko+en+ma));
			 System.out.println("평균 : "+(ko+en+ma)/3);
			 int ev = (ko+en+ma/3);
			 if(ko>=40 && en>=40 && ma>=40 && ev>=60) {
				 System.out.println("합격");
			 }else {
				 System.out.println("불합격");
				 
			 }
		 }
		 public void practice8(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("주민번호를 입력하세요 (-포함) : ");
			 String num = sc.next();
			 
			 char num1 = num.charAt(7);
			 
			 if(num1 == '1' || num1 == '3') {
				 System.out.println("남자");
			 }
			 else if(num1 == '2' || num1 == '4') {
				 System.out.println("여자");
			 }
			 //num1은 char이므로 ''꼭넣어야한다
}
		 public void practice9(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("정수1 : ");
			 int num1 =sc.nextInt();
			
			 System.out.print("정수2 : ");
			 int num2 =sc.nextInt();
			 System.out.print("입력 : ");
			 int c =sc.nextInt();
			 
			
			 if(num1>=c || num2<c) {
				 System.out.println(true);
				 
				 
			 }else {
				 System.out.println(false);
			 }
				 
		 } 
		 public void practice10(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("입력1 : ");
			 int a =sc.nextInt();
			 System.out.print("입력2 : ");
			 int b =sc.nextInt();
			 System.out.print("입력3 : ");
			 int c =sc.nextInt();
			 
		     if(a == b && b==c) {
		    	 System.out.println(true);
		     }else
		    	 System.out.println(false);
			 //a==b==c 이거는 수학적인거 이렇게쓰지말자 ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		 }
		 public void practice11(){	
			 Scanner sc = new Scanner(System.in);
			 System.out.print("A사원의 연봉 : ");
			 double a =sc.nextDouble();
			 System.out.print("B사원의 연봉 : ");
			 double b =sc.nextDouble();
			 System.out.print("C사원의 연봉 : ");
			 double c =sc.nextDouble();
			double ia=a*1.4;
			double ic=c*1.15;
			 System.out.println("A사원의 인센티브 포함 연봉 : " +(ia));
			 System.out.println(ia+a >= 3000 ? "3000이상" : "3000미만");
			 System.out.println("B사원의 인센티브 포함 연봉 : " +b);
			 System.out.println(b >= 3000 ? "3000이상" : "3000미만");
			 System.out.println("c사원의 인센티브 포함 연봉 : " +(ic));
			 System.out.println(ic >= 3000 ? "3000이상" : "3000미만");
		 }
}