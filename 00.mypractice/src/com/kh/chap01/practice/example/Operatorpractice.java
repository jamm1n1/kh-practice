package com.kh.practice.example;

import java.util.Scanner;

public class Operatorpractice {
	

	 public void practice1(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("���� : ");
		 int a = sc.nextInt();
		 System.out.println(a+"��/�� "+(a>0 ? "����̴�" : "�����̴�"));
		
	 }
		 public void practice2(){
		
		 Scanner sc = new Scanner(System.in);
			 System.out.println("���� : ");
			 int a = sc.nextInt();
			 
			
			String result = a == 0 ? "0�̴�" : (a > 0 ?  "����̴�" : "�����̴�");
			System.out.println(a +"��"+result);
			
		 }
			 
	 
		 public void practice3(){
			 Scanner sc = new Scanner(System.in);
			 System.out.println("���� : ");
			 int a = sc.nextInt();
			 System.out.println(a%2 == 0 ? "¦����" : "Ȧ����");
		
			
			 }
		 
		 public void practice4(){
			 Scanner sc = new Scanner(System.in);
			 System.out.println("�ο��� : ");
			 int people = sc.nextInt();
			 System.out.println("������ ���� : ");
			 int sugar = sc.nextInt();
			 System.out.println("1�δ� ���� ���� : "+sugar/people);
			 System.out.println("���� ���� ���� : "+sugar%people);
			 
			 
			 
		 }
		 public void practice5(){
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("�̸�");
				String name = sc.nextLine();
				
				System.out.println("�г�(���ڸ�)");
				int grade = sc.nextInt();
				
				System.out.println("��(���ڸ�)");
				int classnum = sc.nextInt();
				
				System.out.println("��ȣ(���ڸ�)");
				int num = sc.nextInt();
				sc.nextLine();
				
				System.out.println("����(M/F)");
				char gender = sc.nextLine().charAt(0);
				
				System.out.println("����(�Ҽ��� ��° �ڸ�����)");
				double score = sc.nextDouble();
						
				String student = "";
				if (gender=='M' || gender =='m') {
					student="���л�";		
				}
				else if (gender=='F' || gender =='f') {
					student="���л�";
				}else
					return;
					
				
				System.out.println(grade + "�г� " + classnum+"�� "+ num + "�� "+name + gender +"�� ������ "+ score+"�̴�");
		 }
		 public void practice6(){	 
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("���� : ");
				int age = sc.nextInt();
				if(age<=13) {
					System.out.println("���");
				}
				else if(age<=19) {
					System.out.println("û�ҳ�");
				}else {
					System.out.println("�");
				}
				 
					
		 }
		 public void practice7(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("���� : ");
				int ko = sc.nextInt();
				System.out.print("���� : ");
				int en = sc.nextInt();
				System.out.print("���� : ");
				int ma = sc.nextInt();
			 System.out.println("�հ� : "+(ko+en+ma));
			 System.out.println("��� : "+(ko+en+ma)/3);
			 int ev = (ko+en+ma/3);
			 if(ko>=40 && en>=40 && ma>=40 && ev>=60) {
				 System.out.println("�հ�");
			 }else {
				 System.out.println("���հ�");
				 
			 }
		 }
		 public void practice8(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("�ֹι�ȣ�� �Է��ϼ��� (-����) : ");
			 String num = sc.next();
			 
			 char num1 = num.charAt(7);
			 
			 if(num1 == '1' || num1 == '3') {
				 System.out.println("����");
			 }
			 else if(num1 == '2' || num1 == '4') {
				 System.out.println("����");
			 }
			 //num1�� char�̹Ƿ� ''���־���Ѵ�
}
		 public void practice9(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("����1 : ");
			 int num1 =sc.nextInt();
			
			 System.out.print("����2 : ");
			 int num2 =sc.nextInt();
			 System.out.print("�Է� : ");
			 int c =sc.nextInt();
			 
			
			 if(num1>=c || num2<c) {
				 System.out.println(true);
				 
				 
			 }else {
				 System.out.println(false);
			 }
				 
		 } 
		 public void practice10(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("�Է�1 : ");
			 int a =sc.nextInt();
			 System.out.print("�Է�2 : ");
			 int b =sc.nextInt();
			 System.out.print("�Է�3 : ");
			 int c =sc.nextInt();
			 
		     if(a == b && b==c) {
		    	 System.out.println(true);
		     }else
		    	 System.out.println(false);
			 //a==b==c �̰Ŵ� �������ΰ� �̷��Ծ������� ������������������
		 }
		 public void practice11(){	
			 Scanner sc = new Scanner(System.in);
			 System.out.print("A����� ���� : ");
			 double a =sc.nextDouble();
			 System.out.print("B����� ���� : ");
			 double b =sc.nextDouble();
			 System.out.print("C����� ���� : ");
			 double c =sc.nextDouble();
			double ia=a*1.4;
			double ic=c*1.15;
			 System.out.println("A����� �μ�Ƽ�� ���� ���� : " +(ia));
			 System.out.println(ia+a >= 3000 ? "3000�̻�" : "3000�̸�");
			 System.out.println("B����� �μ�Ƽ�� ���� ���� : " +b);
			 System.out.println(b >= 3000 ? "3000�̻�" : "3000�̸�");
			 System.out.println("c����� �μ�Ƽ�� ���� ���� : " +(ic));
			 System.out.println(ic >= 3000 ? "3000�̻�" : "3000�̸�");
		 }
}