package com.uni.chap04_wrapper.controller;

public class A_WrapperTest {

	// Wrapper Ŭ����
		// --> �⺻�ڷ����� ��ü�� �������ִ� Ŭ������ ���� Ŭ����(Wrapper Ŭ����)�̴�.
		
		// - �⺻ �ڷ������� ����� �ص������� ���α׷��� ���� �ش� �⺻ Ÿ���� ��ü�� ����ؾ� �Ǵ� ��찡�ִ�.
		// ex) �޼ҵ��� �Ű������� ��ü Ÿ�Ը��� �䱸�� ��
		//     �������� �����ϰ� ���� ��
		//     Object�� �ִ� �޼ҵ带 ����ϰ� ���� ��

		//		���� ���� ��� �⺻�ڷ����� �����ͷδ� �״�� ����� �� ���� ������ ��ü�� ��ȯ�� �Ŀ� �۾��� �����ؾ��Ѵ�.

		//	�⺻�ڷ���		  WrapperŬ����
		//	boolean  <-->	Boolean
		//	char	 <-->	Character
		//	short	 <-->	Short
		//	byte	 <-->	Byte
		// 	int		 <-->	Integer
		//	long	 <-->	Long
		//	float	 <-->	Float
		//	double	 <-->	Double
	
	public void method1() {
		
		//Boxing : �⺻�ڷ������� --> Wrapper Ŭ���� �ڷ������� �ٲٴ� ��� 
		int num1 = 10;
		int num2 = 15;
		
		//1. ��ü������ ���� �ϴ� ��� 
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1 == i2);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));//�ΰ��� ���ؼ� ������ ũ�� 1 ��ȯ ������ ũ�� -1 ��ȯ , ������ 0��ȯ
		
		//Integer i5 ="123";
		//2. ��ü�������� �ʰ� �ٷ� �����ϴ� ��� (AutoBoxing)
		Integer i3 =num2;
		Integer i4 = new Integer("123");
		System.out.println(i4);
		System.out.println(i3+i4);
		
		//Unboxing : WrapperŬ���� --> �⺻ �ڷ������� �ٲٴ� ��� 
		
		//1.Wrapper Ŭ������ xxxValue() �� ���� ��ȯ

	int num3 = i1.intValue();
	int num4 = i2.intValue();
	
	System.out.println(num3+num4);
	
	//2. �޼ҵ带 ������� �ʰ� �ٷ� ��ȯ (AutoUnBoxing)
	int num5 = /*int*/ i1;
	
	test(i2); 
	test1(i2); 
	test2(i2); 
	}

	private void test2(int i2) {
		System.out.println(i2);
		
	}

	private void test1(Object num) {
		System.out.println(num);
		
	}

	private void test(Integer num) {
		
		System.out.println(num);
		
		
	}
	
}
