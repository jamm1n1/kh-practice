package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("ex");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		switch (num) {

		case 1:
			System.out.println("�Է� �޴��Դϴ�");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�");
			break;
		case 9:
			System.out.println("���� �޴��Դϴ�");
			break;

		}

	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �� �� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		if(a>0 && a%2==0) {
			System.out.println("¦����");
		}
		else if (a%2==1) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("����� �Է����ּ���");
		}
		
		
		
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int ko = sc.nextInt();
		System.out.print("�������� : ");
		int ma = sc.nextInt();
		System.out.print("�������� : ");
		int en = sc.nextInt();
		int e=(ko+ma+en)/3;
		int all =ko+ma+en;
		if(ko>=40 && ma>=40 && en>=40 && e>=60) {
			System.out.println("���� :" +ko);
			System.out.println("���� :" +ma);
			System.out.println("���� :" +en);
			System.out.println("�հ� :" +all);
			System.out.println("��� :" +e);
			System.out.println("�����մϴ�,�հ��Դϴ�!");
			
		}else {
			System.out.println("���հ��Դϴ�.");
		}
}
	public void practice4() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1~12 ������ ���� �Է� : ");
	int season = sc.nextInt();
	
	switch(season){
	case 1 :
	case 2 :
	case 12 :
		System.out.println(season+"���� �ܿ��Դϴ�.");
		break;
	case 3 :
	case 4 :
	case 5 :
		System.out.println(season+"���� ���Դϴ�.");
		break;
	case 6 :
	case 7 :
	case 8 :
		System.out.println(season+"���� �����Դϴ�.");
		break;
	case 9 :
	case 10 :
	case 11 :
		System.out.println(season+"���� �����Դϴ�.");
		break;
	default :
		System.out.println("�� �� �Է��ϼ̽��ϴ�");
		return;
	}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String id =sc.nextLine();
		System.out.println("��й�ȣ : ");
		int pass =sc.nextInt();
		if(id.equals("user1") && pass ==1234) {
			System.out.println("�α��� ����");
		}
		else if (id.equals("user1") && pass !=1234) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");						
		}else if(!id.equals("user1") && pass ==1234) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�");
			
		}else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
		//String�� ����Ҷ��� .equals����ؾ��Ѵ� ������������ ���ù�m�µ� ��Ծ�����

	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String id = sc.nextLine();
		switch (id) {
		case "������" :
			System.out.println("ȸ������, �Խñ� ����");
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
			System.out.println("�Խñ� ��ȸ");
			break;
		case "ȸ��" :
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
			System.out.println("�Խñ� ��ȸ");
			break;
		case "��ȸ��" :
			System.out.println("�Խñ� ��ȸ");
			break;
		default :
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			return;
		}
	}	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ű(m)�� �Է����ּ��� : ");
		double hi = sc.nextDouble();
		System.out.println("������(kg)�� �Է����ּ��� : ");
		double kg = sc.nextDouble();
		double BMI = kg / (hi*hi);
		System.out.println("BMI ���� : " +BMI);
		if(BMI<18.5) {
			System.out.println("��ü��");
		}
		else if(BMI<23) {
			System.out.println("����ü��");
		}
		else if(BMI<25) {
			System.out.println("��ü��");
		}
		else if(BMI<30) {
			System.out.println("��");
		}else {
			System.out.println("�� ��");
		}
			
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ǿ�����1 �Է� : ");
		int a =sc.nextInt();
		System.out.println("�ǿ�����2 �Է� : ");
		int b =sc.nextInt();
		sc.nextLine();
		System.out.println("�����ڸ� �Է�(+,-,*,/,%) : ");
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
						System.out.println("�� �� �Է��ϼ̽��ϴ�");
				}
		}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�߰� ��� ���� : ");
		int j =sc.nextInt();
		System.out.println("�⸻ ��� ���� : ");
		int k =sc.nextInt();
		System.out.println("���� ���� : ");
		int g =sc.nextInt();
		System.out.println("�⼮ ȸ�� : ");
		int t =sc.nextInt();
		double a = j*0.2;
		double b = k*0.3;
		double c = g*0.3;
		double d = t*5*0.2;
		double all =a+b+c+d;
		
		if(all>=70 && t>14) {
			System.out.println("=======���=======");
			System.out.println("�߰� ��� ���� : "+a);
			System.out.println("�⸻ ��� ���� : "+b);
			System.out.println("���� ���� : "+c);
			System.out.println("�⼮ : "+d);
			System.out.println("���� : "+all);
			System.out.println("PASS");
		}
		else if(all<=70 && t>14){
			System.out.println("=======���=======");
			System.out.println("FAIL [���� �̴�] "+"(����"+all+")");
		}
		else if(all>=70 && t<14) {
			System.out.println("=======���=======");
			System.out.println("FAIL [�⼮ Ƚ�� ����] "+"("+(int)d+"/20)");
		}else {
			System.out.println("FAIL [�⼮ Ƚ�� ����] "+"("+(int)d+"/20)");
			System.out.println("FAIL [���� �̴�] "+"(����"+all+")");
		}
		

	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		System.out.println("���� : ");
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