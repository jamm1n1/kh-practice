package com.uni.operator;

public class F_Compound {
	/*
	 * * ���� ���� ������ : ��������ڿ� ���Կ����ڸ� �Բ� ����ϴ� ������ ����ó�� �ӵ��� �ξ� �����Ƿ� ����� �����Ѵ�.
	 * 
	 * +=, -=, *=, /=, %=
	 * 
	 * a = a + 3; => a += 3; a = a - 3; => a -= 3; a = a * 3; => a *= 3; a = a / 3;
	 * => a /= 3; a = a % 3; => a %= 3;
	 * 
	 * 
	 * ���� ������(++ --)�� ����� �������� ���������ڴ� ���� 1���� ������ �ȴ�. ������ ���� ���� �����ڴ� ���� ���ϴ� ���ڸ�ŭ ������
	 * ��ų �� �ִ�.
	 */
	public void method1 () {
		int num =12;
		System.out.println("num" + num); //12
		
		//num�� 3 ������Ű��
		
		num=num+3;
		System.out.println("num" + num);// 15
		
		//num�� 3 ������Ű��
		num += 3;
		System.out.println("num" + num);
		
		//num 5 ���ҽ�Ű��
		num-=5;
		System.out.println("num" + num);
		//num 6�� ������Ű�� 
		num*=6;
		System.out.println("num" + num);
		//num 2�� ���� 
		num/=2;
		System.out.println("num" + num);
		//num 4�� �������� ������ 
		num%=4;
		System.out.println("num" + num);
		
		String str = "Hello";
		System.out.println(str);
		
		str += "World";
		System.out.println(str);
		
		str += 1;
		System.out.println(str);
		
	}
}
