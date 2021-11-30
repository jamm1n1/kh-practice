package com.kh.pratice2.example;

import java.util.Scanner;

public class CastingPractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char fir = sc.nextLine().charAt(0);
		System.out.println("A Unicode : "+ (int)fir );
		
		
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double ko = sc.nextDouble();
		System.out.print("영어 : ");
		double en = sc.nextDouble();
		System.out.print("수학 : ");
		double ma = sc.nextDouble();
		System.out.println("총점 : " + (int)(ko+en+ma));
		System.out.print("평균 : " + (int)((ko+en+ma)/(3)));
	}
	public void method3() {
		
			int iNum1 = 10;
			int iNum2 = 4;
			float fNum = 3.0f;
			double dNum = 2.5;
			char ch = 'A';
			System.out.println( iNum1%iNum2 ); // 2
			System.out.println( (int)dNum ); // 2
			System.out.println( iNum2*dNum ); // 10.0
			System.out.println( (double)iNum1 ); // 10.0
			System.out.println( iNum1/(double)iNum2 ); // 2.5
			System.out.println( dNum ); // 2.5
			System.out.println( (int)fNum ); // 3
			System.out.println( iNum1/(int)fNum ); // 3
			System.out.println( iNum1/fNum );// 3.3333333
			System.out.println( (double)iNum1/fNum ); // 3.333333333333335
			System.out.println( "\'"+ch+"\'"); // 'A'
			System.out.println( (int)ch ); // 65
			System.out.println(  ch+iNum1 ); // 75
			System.out.println(  "\'"+((char)(ch+iNum1))+"\'"); // 'K'
			}
	}

