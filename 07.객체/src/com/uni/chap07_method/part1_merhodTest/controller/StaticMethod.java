package com.uni.chap07_method.part1_merhodTest.controller;

public class StaticMethod {

	public static int num1 = 10;
	public static int num2 = 20;
	
	
	public static void method1() {
		
		System.out.println(num1+num2);
		num2++;
	}
	
	public static int method2() {
		return num1+num2;
	}
	
	public static void method3(String name) {
	System.out.println(name + "님 방문을 환영합니다.");
	}
	public static String method4(String name) {
		return name+"님 방문을 환영합니다.";
		
	
	}
}
