package com.kh.practice.example;

import java.util.Scanner;

public class Operatorpractice {
	

	 public void practice1(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("舛呪 : ");
		 int a = sc.nextInt();
		 System.out.println(a+"精/澗 "+(a>0 ? "丞呪戚陥" : "製呪戚陥"));
		
	 }
		 public void practice2(){
		
		 Scanner sc = new Scanner(System.in);
			 System.out.println("舛呪 : ");
			 int a = sc.nextInt();
			 
			
			String result = a == 0 ? "0戚陥" : (a > 0 ?  "丞呪戚陥" : "製呪戚陥");
			System.out.println(a +"澗"+result);
			
		 }
			 
	 
		 public void practice3(){
			 Scanner sc = new Scanner(System.in);
			 System.out.println("舛呪 : ");
			 int a = sc.nextInt();
			 System.out.println(a%2 == 0 ? "側呪陥" : "筈呪陥");
		
			
			 }
		 
		 public void practice4(){
			 Scanner sc = new Scanner(System.in);
			 System.out.println("昔据呪 : ");
			 int people = sc.nextInt();
			 System.out.println("紫伝税 鯵呪 : ");
			 int sugar = sc.nextInt();
			 System.out.println("1昔雁 紫伝 鯵呪 : "+sugar/people);
			 System.out.println("害澗 紫伝 鯵呪 : "+sugar%people);
			 
			 
			 
		 }
		 public void practice5(){
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("戚硯");
				String name = sc.nextLine();
				
				System.out.println("俳鰍(収切幻)");
				int grade = sc.nextInt();
				
				System.out.println("鋼(収切幻)");
				int classnum = sc.nextInt();
				
				System.out.println("腰硲(収切幻)");
				int num = sc.nextInt();
				sc.nextLine();
				
				System.out.println("失紺(M/F)");
				char gender = sc.nextLine().charAt(0);
				
				System.out.println("失旋(社呪繊 却属 切軒猿走)");
				double score = sc.nextDouble();
						
				String student = "";
				if (gender=='M' || gender =='m') {
					student="害俳持";		
				}
				else if (gender=='F' || gender =='f') {
					student="食俳持";
				}else
					return;
					
				
				System.out.println(grade + "俳鰍 " + classnum+"鋼 "+ num + "腰 "+name + gender +"税 失旋精 "+ score+"戚陥");
		 }
		 public void practice6(){	 
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("蟹戚 : ");
				int age = sc.nextInt();
				if(age<=13) {
					System.out.println("嬢鍵戚");
				}
				else if(age<=19) {
					System.out.println("短社鰍");
				}else {
					System.out.println("嬢献");
				}
				 
					
		 }
		 public void practice7(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("厩嬢 : ");
				int ko = sc.nextInt();
				System.out.print("慎嬢 : ");
				int en = sc.nextInt();
				System.out.print("呪俳 : ");
				int ma = sc.nextInt();
			 System.out.println("杯域 : "+(ko+en+ma));
			 System.out.println("汝液 : "+(ko+en+ma)/3);
			 int ev = (ko+en+ma/3);
			 if(ko>=40 && en>=40 && ma>=40 && ev>=60) {
				 System.out.println("杯維");
			 }else {
				 System.out.println("災杯維");
				 
			 }
		 }
		 public void practice8(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("爽肯腰硲研 脊径馬室推 (-匂敗) : ");
			 String num = sc.next();
			 
			 char num1 = num.charAt(7);
			 
			 if(num1 == '1' || num1 == '3') {
				 System.out.println("害切");
			 }
			 else if(num1 == '2' || num1 == '4') {
				 System.out.println("食切");
			 }
			 //num1精 char戚糠稽 ''伽隔嬢醤廃陥
}
		 public void practice9(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("舛呪1 : ");
			 int num1 =sc.nextInt();
			
			 System.out.print("舛呪2 : ");
			 int num2 =sc.nextInt();
			 System.out.print("脊径 : ");
			 int c =sc.nextInt();
			 
			
			 if(num1>=c || num2<c) {
				 System.out.println(true);
				 
				 
			 }else {
				 System.out.println(false);
			 }
				 
		 } 
		 public void practice10(){	 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("脊径1 : ");
			 int a =sc.nextInt();
			 System.out.print("脊径2 : ");
			 int b =sc.nextInt();
			 System.out.print("脊径3 : ");
			 int c =sc.nextInt();
			 
		     if(a == b && b==c) {
		    	 System.out.println(true);
		     }else
		    	 System.out.println(false);
			 //a==b==c 戚暗澗 呪俳旋昔暗 戚係惟床走源切 せせせせせせせせせ
		 }
		 public void practice11(){	
			 Scanner sc = new Scanner(System.in);
			 System.out.print("A紫据税 尻裟 : ");
			 double a =sc.nextDouble();
			 System.out.print("B紫据税 尻裟 : ");
			 double b =sc.nextDouble();
			 System.out.print("C紫据税 尻裟 : ");
			 double c =sc.nextDouble();
			double ia=a*1.4;
			double ic=c*1.15;
			 System.out.println("A紫据税 昔湿銅崎 匂敗 尻裟 : " +(ia));
			 System.out.println(ia+a >= 3000 ? "3000戚雌" : "3000耕幻");
			 System.out.println("B紫据税 昔湿銅崎 匂敗 尻裟 : " +b);
			 System.out.println(b >= 3000 ? "3000戚雌" : "3000耕幻");
			 System.out.println("c紫据税 昔湿銅崎 匂敗 尻裟 : " +(ic));
			 System.out.println(ic >= 3000 ? "3000戚雌" : "3000耕幻");
		 }
}