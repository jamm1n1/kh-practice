package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
Scanner sc = new Scanner(System.in);

TokenController tc = new TokenController();

public void mainmenu() {
	while(true) {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("9. 프로그램 끝내기");
		System.out.println("메뉴 번호 : ");
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
			System.out.println("프로그램을 종료합니다.");
			return;
		default :
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}
}

public void tokenmenu() {
	String str = "j a v a P r o g r a m";
	System.out.println("토큰 처리 전 글자 : "+str);	
	System.out.println("토큰 처리 전 개수 : "+str.length());
	String s = tc.afterToken(str);
	System.out.println("토큰 처리 후 글자 : " + s);
	System.out.println("토큰 처리 후 개수 : " + s.length());
	System.out.println("모두 대문자로 변환 : " + s.toUpperCase());
}
public void inputMenu() {
System.out.println("문자열을 입력하세요 : ");
String input = sc.nextLine();

String st = tc.firstCap(input);
System.out.println("첫 글자 대문자 : " + st);


System.out.println("찾을 문자 하나를 입력하세요 : ");
char one = sc.nextLine().charAt(0);

int c = tc.findchar(input, one);
System.out.println(one + "문자가 들어간 개수 : " + c);
}
}
