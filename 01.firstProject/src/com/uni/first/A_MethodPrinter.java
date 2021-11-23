package com.uni.first; // 패키지명은 항상 소문자로 시작한다.

public class A_MethodPrinter { // 클래스명은 항상 대문자로 시작한다 
	
	public void methodA(){//메소드명은 항상 소문자로 시작한다.
		System.out.println("method A 출력문");
		methodB();
	}
	public void methodB() {
		System.out.println("method B 출력문");
		int a = methodC(1000);
		System.out.println(a);
	}
	public int methodC(int y) {
		System.out.println("method C 출력문"+y);
		return y+100;
	}
	

}
