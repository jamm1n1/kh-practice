package com.uni.chap04_wrapper.controller;

public class B_WrapperStringTest {
   //�⺻�ڷ��� <--> String
	public void method1() {
		
		
		String str1 = "10";
		String str2 = "15.3";
	
		System.out.println(str1 + str2);//���ڿ��� ��µȴ�. ���ڿ� - > ���ڷ� �ٲٴ� �۾��� �ȿ� 
		
		
		//String --> �⺻ �ڷ��� : �ش� WrapperŬ������.parseXXX() ��� 
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
		
		//2. �⺻�ڷ��� --> String ���� �ٲٱ� ���� 
				// �⺻�ڷ��� --> Wrapper-->String
				// �ش�Wrapper Ŭ����.valueOf().toString()
				
				
				String strI1 = Integer.valueOf(i).toString();
				String strD1 = Double.valueOf(d).toString();
				
				String strI = String.valueOf(i);
				String strD = String.valueOf(d);
				
				
				System.out.println(strI1);
				System.out.println(strI);
	}
}
