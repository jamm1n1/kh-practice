package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("ex");
		System.out.println("1. 脊径");
		System.out.println("2. 呪舛");
		System.out.println("3. 繕噺");
		System.out.println("4. 肢薦");
		System.out.println("9. 曽戟");
		System.out.print("五敢 腰硲研 脊径馬室推 : ");
		int num = sc.nextInt();
		switch (num) {

		case 1:
			System.out.println("脊径 五敢脊艦陥");
			break;
		case 2:
			System.out.println("呪舛 五敢脊艦陥");
			break;
		case 3:
			System.out.println("繕噺 五敢脊艦陥");
			break;
		case 4:
			System.out.println("肢薦 五敢脊艦陥");
			break;
		case 9:
			System.out.println("曽戟 五敢脊艦陥");
			break;

		}

	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("収切研 廃 鯵 脊径馬室推 : ");
		int a = sc.nextInt();
		
		if(a>0 && a%2==0) {
			System.out.println("側呪陥");
		}
		else if (a%2==1) {
			System.out.println("筈呪陥");
		}else {
			System.out.println("丞呪幻 脊径背爽室推");
		}
		
		
		
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("厩嬢繊呪 : ");
		int ko = sc.nextInt();
		System.out.print("呪俳繊呪 : ");
		int ma = sc.nextInt();
		System.out.print("慎嬢繊呪 : ");
		int en = sc.nextInt();
		int e=(ko+ma+en)/3;
		int all =ko+ma+en;
		if(ko>=40 && ma>=40 && en>=40 && e>=60) {
			System.out.println("厩嬢 :" +ko);
			System.out.println("呪俳 :" +ma);
			System.out.println("慎嬢 :" +en);
			System.out.println("杯域 :" +all);
			System.out.println("汝液 :" +e);
			System.out.println("逐馬杯艦陥,杯維脊艦陥!");
			
		}else {
			System.out.println("災杯維脊艦陥.");
		}
}
	public void practice4() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1~12 紫戚税 舛呪 脊径 : ");
	int season = sc.nextInt();
	
	switch(season){
	case 1 :
	case 2 :
	case 12 :
		System.out.println(season+"杉精 移随脊艦陥.");
		break;
	case 3 :
	case 4 :
	case 5 :
		System.out.println(season+"杉精 砂脊艦陥.");
		break;
	case 6 :
	case 7 :
	case 8 :
		System.out.println(season+"杉精 食硯脊艦陥.");
		break;
	case 9 :
	case 10 :
	case 11 :
		System.out.println(season+"杉精 亜聖脊艦陥.");
		break;
	default :
		System.out.println("設 公 脊径馬写柔艦陥");
		return;
	}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("焼戚巨 : ");
		String id =sc.nextLine();
		System.out.println("搾腔腰硲 : ");
		int pass =sc.nextInt();
		if(id.equals("user1") && pass ==1234) {
			System.out.println("稽益昔 失因");
		}
		else if (id.equals("user1") && pass !=1234) {
			System.out.println("搾腔腰硲亜 堂携柔艦陥");						
		}else if(!id.equals("user1") && pass ==1234) {
			System.out.println("焼戚巨亜 堂携柔艦陥");
			
		}else {
			System.out.println("焼戚巨 暁澗 搾腔腰硲亜 堂携柔艦陥");
		}
		//String聖 紫遂拝凶澗 .equals紫遂背醤廃陥 せせせせせせ 神潅壕�m澗汽 猿股醸譲革

	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("映廃聖 溌昔馬壱切 馬澗 噺据 去厭 : ");
		String id = sc.nextLine();
		switch (id) {
		case "淫軒切" :
			System.out.println("噺据淫軒, 惟獣越 淫軒");
			System.out.println("惟獣越 拙失, 奇越 拙失");
			System.out.println("惟獣越 繕噺");
			break;
		case "噺据" :
			System.out.println("惟獣越 拙失, 奇越 拙失");
			System.out.println("惟獣越 繕噺");
			break;
		case "搾噺据" :
			System.out.println("惟獣越 繕噺");
			break;
		default :
			System.out.println("設 公 脊径馬写柔艦陥.");
			return;
		}
	}	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("徹(m)研 脊径背爽室推 : ");
		double hi = sc.nextDouble();
		System.out.println("倖巷惟(kg)研 脊径背爽室推 : ");
		double kg = sc.nextDouble();
		double BMI = kg / (hi*hi);
		System.out.println("BMI 走呪 : " +BMI);
		if(BMI<18.5) {
			System.out.println("煽端掻");
		}
		else if(BMI<23) {
			System.out.println("舛雌端掻");
		}
		else if(BMI<25) {
			System.out.println("引端掻");
		}
		else if(BMI<30) {
			System.out.println("搾幻");
		}else {
			System.out.println("壱亀 搾幻");
		}
			
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("杷尻至切1 脊径 : ");
		int a =sc.nextInt();
		System.out.println("杷尻至切2 脊径 : ");
		int b =sc.nextInt();
		sc.nextLine();
		System.out.println("尻紫切研 脊径(+,-,*,/,%) : ");
		String c = sc.nextLine();
	
		
				switch (c) {
				case "+" :
					System.out.printf("%d+%d=%d",a,b,a+b);
					break;
				case "-" :
					System.out.printf("%d-%d=%d",a,b,a-b);
					break;
				case "*" :
					System.out.printf("%d*%d=%d",a,b,a*b);
					break;
				case "/" :
					System.out.printf("%d/%d=%d",a,b,a/b);
					break;
				case "%" :
					System.out.printf("%d%%d=%d",a,b,a%b);
					break;
					default :
						System.out.println("設 公 脊径馬写柔艦陥");
				}
		}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("掻娃 壱紫 繊呪 : ");
		int j =sc.nextInt();
		System.out.println("奄源 壱紫 繊呪 : ");
		int k =sc.nextInt();
		System.out.println("引薦 繊呪 : ");
		int g =sc.nextInt();
		System.out.println("窒汐 噺呪 : ");
		int t =sc.nextInt();
		double a = j*0.2;
		double b = k*0.3;
		double c = g*0.3;
		double d = t*5*0.2;
		double all =a+b+c+d;
		
		if(all>=70 && t>14) {
			System.out.println("=======衣引=======");
			System.out.println("掻娃 壱紫 繊呪 : "+a);
			System.out.println("奄源 壱紫 繊呪 : "+b);
			System.out.println("引薦 繊呪 : "+c);
			System.out.println("窒汐 : "+d);
			System.out.println("恥繊 : "+all);
			System.out.println("PASS");
		}
		else if(all<=70 && t>14){
			System.out.println("=======衣引=======");
			System.out.println("FAIL [繊呪 耕含] "+"(恥繊"+all+")");
		}
		else if(all>=70 && t<14) {
			System.out.println("=======衣引=======");
			System.out.println("FAIL [窒汐 判呪 採膳] "+"("+(int)d+"/20)");
		}else {
			System.out.println("FAIL [窒汐 判呪 採膳] "+"("+(int)d+"/20)");
			System.out.println("FAIL [繊呪 耕含] "+"(恥繊"+all+")");
		}
		

	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("叔楳拝 奄管聖 識澱馬室推.");
		System.out.println("叔楳拝 奄管聖 識澱馬室推.");
		System.out.println("1. 五敢 窒径");
		System.out.println("2. 側呪/筈呪");
		System.out.println("3. 杯維/災杯維");
		System.out.println("4. 域箭");
		System.out.println("5. 稽益昔");
		System.out.println("6. 映廃 溌昔");
		System.out.println("7. BMI");
		System.out.println("8. 域至奄");
		System.out.println("9. Pass/Fail");
		System.out.println("識澱 : ");
		int a = sc.nextInt();
		
		switch(a) {
		
		case 1 :
		    practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
			
	}
		}
		
		
		
		
}