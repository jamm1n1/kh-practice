package com.uni.operator;

import java.util.Scanner;

public class A_LogicalNegation {

    //���׿�����(�ϳ��� ���� ������ ������)
	// ������������ --> ! : ������ �ݴ�� �ٲٴ� ������
	// ���� : true/false
	public void method1() {
		
			System.out.println("true�� ���� : "+ !true);
			System.out.println("false�� ���� : "+ !false);
			
			
			boolean b1 = true;
			boolean b2 = false;
			
			System.out.println("b1 : "+ b1);
			System.out.println("b1�Ǻ��� : "+ !b1);
			
			System.out.println("b2 : "+ b2);
			System.out.println("b2�Ǻ��� : "+ !b2);
		
	}
	
	public void method2() { 
		//����ڰ� �Է��� ������ ���� 0���� ũ�� true ��������  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϳ� �Է� : ");
		
		int num = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("�Է��� ������ ����ΰ�?"+ (num > 0));
		System.out.println("�Է��� ������ ����ΰ�?"+ !(num < 0));
		
		
	}

}
