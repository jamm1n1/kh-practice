package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
Scanner sc = new Scanner(System.in);

TokenController tc = new TokenController();

public void mainmenu() {
	while(true) {
		System.out.println("1. ���� ���ڿ�");
		System.out.println("2. �Է� ���ڿ�");
		System.out.println("9. ���α׷� ������");
		System.out.println("�޴� ��ȣ : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		 
		case 1 :
			tokenmenu();
			break;
		case 2 :
			inputMenu();
			break;
		case 9 :	
			System.out.println("���α׷��� �����մϴ�.");
			return;
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}
}

public void tokenmenu() {
	String str = "j a v a P r o g r a m";
	System.out.println("��ū ó�� �� ���� : "+str);	
	System.out.println("��ū ó�� �� ���� : "+str.length());
	String s = tc.afterToken(str);
	System.out.println("��ū ó�� �� ���� : " + s);
	System.out.println("��ū ó�� �� ���� : " + s.length());
	System.out.println("��� �빮�ڷ� ��ȯ : " + s.toUpperCase());
}
public void inputMenu() {
System.out.println("���ڿ��� �Է��ϼ��� : ");
String input = sc.nextLine();

String st = tc.firstCap(input);
System.out.println("ù ���� �빮�� : " + st);


System.out.println("ã�� ���� �ϳ��� �Է��ϼ��� : ");
char one = sc.nextLine().charAt(0);

int c = tc.findchar(input, one);
System.out.println(one + "���ڰ� �� ���� : " + c);
}
}
