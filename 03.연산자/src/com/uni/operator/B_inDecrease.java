package com.uni.operator;

public class B_inDecrease {
	/*
	 * * ����������(�ܵ����ô� �׳� 1����) ++ : ���� 1 ������Ű�� ������ ++�� (���� ������), ��++ (���� ������) -- : ����
	 * 1 ���ҽ�Ű�� ������ --�� (���� ������), ��-- (���� ������)
	 * 
	 * (����������)�� : ���� ������ --> ������ ��ó�� ��(����������) : ���� ������ --> ��ó�� ������
	 */

	public void method1() {
		// ���� ������ �׽�Ʈ
		int num1 = 10;
		System.out.println("���������� ������ num1 �� �� " + num1);// 10
		System.out.println("1ȸ���� �� ��� " + ++num1);// 11
		System.out.println("2ȸ���� �� ��� " + ++num1);// 12
		System.out.println("3ȸ���� �� ��� " + ++num1);// 13
		System.out.println("���������� ������ num1 �� �� " + num1);// 13

		int num2 = 10;
		System.out.println("���������� ������ num2 �� �� " + num2);// 10
		System.out.println("1ȸ���� �� ��� " + num2++);// 10
		System.out.println("2ȸ���� �� ��� " + num2++);// 11
		System.out.println("3ȸ���� �� ��� " + num2++);// 12
		System.out.println("���������� ������ num2 �� �� " + num2);// 13
	}

	public void method2() {
		
		//����������
		int a = 10;
		int b = ++a;
		
		System.out.println("a : "+ a + " b:"+ b);
		
		//����������
		int c = 10;
		int d = c++;
		
		System.out.println("c : "+ c + " d:"+ d);
		
		System.out.println("================================");
		
		int num = 20;
		System.out.println("���� num : "+ num );//20
		
		System.out.println("++num : "+ ++num);//21
		System.out.println("num++ : "+ num++);//21(22)
		System.out.println("--num : "+ --num);//21
		System.out.println("num-- : "+ num--);//21(20)
		
		System.out.println("���� num : "+ num );//20
		
		
	}
	public void method3 () {
		int num1 = 20;
		
		int result = num1++ *3; //result :60    num1 : 20(21)
		
		System.out.println(result);//60
		System.out.println(num1);//21
		
		int num2 = 20;
		int result2 = ++num2*3;
		
		System.out.println(result2);//63
		System.out.println(num2);//21
		
	}
	public void method4 () {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);// a = 10(11)
		System.out.println((++a)+(b++)); //  a:12 b:20(21) --> 32
		System.out.println((a++)+(--b)+(--c)); // a=12(13) b=20 c=29 --> 61
		
		System.out.println("a�� ���� :"+ a);
		System.out.println("b�� ���� "+ b);
		System.out.println("c�� ���� " + c);
	}

}
