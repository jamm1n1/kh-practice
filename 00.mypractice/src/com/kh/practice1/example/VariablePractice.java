package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요. : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요(남/여) : ");
		String sex = sc.nextLine();
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();

		System.out.printf("키 %2f인" + "%d살" + "%s자" + "%s님 반갑습니다^^", height, age, sex, name);

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번쨰 정수를 입력하세요 : ");
		int one = sc.nextInt();
		System.out.println("두번쨰 정수를 입력하세요 : ");
		int two = sc.nextInt();
		System.out.println("더하기 결과 : " + (one + two));
		System.out.println("빼기 결과 : " + (one - two));
		System.out.println("곱하기 결과 : " + (one * two));
		System.out.println("나누기 결과 : " + (one / two));

	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("가로 : ");
		double wid = sc.nextDouble();
		System.out.println("세로 : ");
		double ren = sc.nextDouble();

		System.out.println("면적 : " + (wid * ren));
		System.out.println("둘레 : " + ((wid + ren) * 2));
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String name = sc.nextLine();
		
		char one = name.charAt(0);
		char two = name.charAt(1);
		char thr = name.charAt(2);
		
		System.out.println("첫 번째 문자 : " +one);		
		System.out.println("두 번째 문자 : " +two);		
		System.out.println("세 번째 문자 : " +thr);
//처음에 한짓 		
		
/*		System.out.println("문자열을 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		char two = sc.nextLine().charAt(1);
		char thr = sc.nextLine().charAt(2);				
	    System.out.println("첫 번째 문자 : " +one);		
		System.out.println("두 번째 문자 : " +two);		
		System.out.println("세 번째 문자 : " +thr);*/
		//이런식으로하여 apple을 세번 타이핑함 1시간30분동안 여러방법해보았으나 다 실패후 구글링으로 성공 ^오^
		
// 구글링 역시 대단해
	}


	
}