package com.uni.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * * �� ������
	 * - �� ������ �����ϴ� ������ 
	 * - �� �������� ����� ���� ����
	 * 
	 * ���� && ���� : ����, ������ �� �� true�� ��� true (AND) �̰� ,  �̸鼭 
	 * ���� || ���� : ����, ������ �� �߿� �ϳ��� true�� ��� true (OR) �̰ų�, �Ǵ� 
	 * 
	 * �̻� ���� >= <=
	 * �ʰ� �̸� > <
	 */
	
	public void method1 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϳ� �Է� : ");
		
		int num = sc.nextInt();
		
		boolean result;
	//	result = (1<= num <=100); -->�̷��� �Ⱦ�
		result = (num>=1 && num<=100);
		System.out.println("����ڰ� �Է��� num ���� 1�̻��̰� 100������ ���ΰ��� ?" + result);
				
		
	}
	
	public void method2 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϳ� �Է� : ");
		
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch >= 'A') && (ch <= 'Z');
		//char ���� ������ ������
		//'A'~'Z' ���� ������ ��ǻ�Ϳ����� 65~90 ������ ���ڰ� ���޾� ���� ���� ���� ���̹Ƿ� ��Һ� ����
		
		System.out.println((int)ch);		
		System.out.println("����ڰ� �Է��� ���ڰ� ����빮�� �Դϱ� ? "+ result);
		
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����Ϸ��� y Ȥ�� Y �� �Է��ϼ���");
		
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch=='y')||(ch=='Y');
		
		System.out.println("����ڰ� �Է��� ���ڰ� y �Ǵ� Y �Դϱ�" + result);
	}
	
	/* short cut
	 *  && : �� ���� ������ ��� true ���� ������� true�̴�. (AND)
	 *  
	 *  true && true 	=> true
	 *  true && false 	=> false
	 *  false && true	=> false
	 *  false && false 	=> false
	 *  
	 *  --> && �����ڸ� �������� ���� ����� false���� ���´ٸ� ���� ������ ���� �������� �ʴ´�. 
	 *  
	 *  || : �� ���� ������ �ϳ��� true��� ������� true�̴�. (OR)
	 *  
	 *  true || true 	=> true
	 *  true || false 	=> true
	 *  false || true	=> true
	 *  false || false	=> false
	 * 
	 * --> || �����ڸ� ���������� ���� ����� true�� ���´ٸ� ���� ������ ���� �������� �ʴ´�. 
	 */
	
	public void method4() {
		
		int num = 10;
		System.out.println("&& �������� num �� : " + num);
		
		boolean result1 =(num < 5) && (++num>0);
		System.out.println("result : "+ result1);
		System.out.println("&& �������� num �� : "+ num);
		
		System.out.println("======================================");
		
		boolean result2 = (num <20 || (++num > 0));
		System.out.println("result2 : "+result2 );
		System.out.println("&& �������� num �� :" + num);
	}
}
