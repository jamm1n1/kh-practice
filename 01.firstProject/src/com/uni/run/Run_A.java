package com.uni.run;

import com.uni.first.A_MethodPrinter;// ��Ʈ�� + ����Ʈ + o

public class Run_A {

	public static void main(String[] args) {
		/*1) ������ �޼ҵ尡 �ִ� Ŭ������ ���� (new)
		 * [ǥ����] Ŭ������ ����� �̸� = new Ŭ������();
		 * 
		 */
       A_MethodPrinter a =  new A_MethodPrinter();
       /*
        * 2)������ �޼ҵ� ���� (ȣ��)
        * [ǥ����] ����� �̸�, ������ �޼ҵ��();
        */
      /* a.methodA();// ������̸�.�޼ҵ��() ���� ȣ�� 
       a.methodB();
       a.methodC();*/
       a.methodA();
       
	}

}
