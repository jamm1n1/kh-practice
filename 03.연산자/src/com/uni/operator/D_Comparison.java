package com.uni.operator;

public class D_Comparison {
	// �� ������ (���� ������)
			/*
			 * - �� ���� ���ϴ� ������, �ٸ� ���� ���� �����ڶ�� �Ѵ�. 
			 * - �񱳿����ڴ� ������ �����ϸ� true(��), �������� ������ false(����)�� ��ȯ�Ѵ�. 
			 * 
			 *  a < b   : a�� b���� ������ ?
			 *  a > b   : a�� b���� ū�� ? 
			 *  a == b  : a�� b�� ������ ? 
			 *  a != b  : a�� b�� �ٸ��� ? 
			 *  a <= b  : a�� b���� �۰ų� ������ ? 
			 *  a >= b  : a�� b���� ũ�ų� ������ ?:  
			 */
	
	public void method1 () {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a==b "+(a == b));
		System.out.println("a>b "+(a > b));
		System.out.println("a<=b "+(a <= b));
		
		boolean result = (a != b);
		System.out.println(result);
		
		//������� + �񱳿��� 
		
		System.out.println("a �� ¦���ΰ� : " + (a % 2 == 0));
		System.out.println("b �� ¦���ΰ� : " + (b % 2 == 0));
		
		System.out.println("a �� Ȧ���ΰ� : " + (a % 2 == 1));
		System.out.println("b �� Ȧ���ΰ� : " + (b % 2 == 1));
	}
}
