package com.uni.first; // ��Ű������ �׻� �ҹ��ڷ� �����Ѵ�.

public class A_MethodPrinter { // Ŭ�������� �׻� �빮�ڷ� �����Ѵ� 
	
	public void methodA(){//�޼ҵ���� �׻� �ҹ��ڷ� �����Ѵ�.
		System.out.println("method A ��¹�");
		methodB();
	}
	public void methodB() {
		System.out.println("method B ��¹�");
		int a = methodC(1000);
		System.out.println(a);
	}
	public int methodC(int y) {
		System.out.println("method C ��¹�"+y);
		return y+100;
	}
	

}
