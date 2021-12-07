package com.mvc.view;

import java.util.Scanner;

import com.mvc.controller.MemberController;


public class MemberView {
private Scanner sc = new Scanner(System.in);
private MemberController mc = new MemberController();  



public void maimMenu() {
	System.out.println("아이디를 입력하시오 : ");
	String id = sc.nextLine();
	
	System.out.println("비밀번호를 입력하시오 : ");
	String pwd = sc.nextLine();
	
	int result =mc.login(id,pwd);
	
	if (result == 1){	
		while(true) {
		System.out.println("=== 회원 프로그램 ===");
		System.out.println("1. 내정보 보기");
		System.out.println("2. 내 나이 조회하기");
		System.out.println("3. 키 수정하기");
		System.out.println("9 프로그램 종료하기");
		System.out.println("메뉴 번호 선택 : ");
		int num = sc.nextInt();
		
            switch(num) {
            case 1 :
                mc.readinfo();
                System.out.println(mc.readinfo().toString());
            	 break;
            case 2 :
            	mc.readAge();
            	System.out.println(mc.readAge());           	
            	break;
            case 3 :
            	System.out.println("수정할 키를 입력하시오 : ");
            	double updateHeight=sc.nextDouble();
            	mc.updateHeight(updateHeight);
            	break;
            case 9 :
            	System.out.println("프로그램을 종료합니다");
            	return;
       
            	
            
            }
            

		}
	}
	else{
		System.out.println("프로그램종료");
		return;		
}
}
}