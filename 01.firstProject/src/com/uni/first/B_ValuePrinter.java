package com.uni.first;

public class B_ValuePrinter {
	/*
	 *  ** ��Ģ ** 
	 *  1. Ŭ������ --> �빮�ڷ� ����
	 *  2. ��Ű���� --> �ҹ��ڷ� ����
	 *  3. �޼ҵ�� --> �ҹ��ڷ� ����
	 *  4. ������    --> �ҹ��ڷ� ����
	 *  
	 *  ��, �������� �ܾ ���� ���� �ܾ� ���ڸ����� �빮�ڷ� !! == ��Ÿ ǥ���(�����ڰ��� ����)
	 *  
	 *  ex) Ŭ������ Methodprinter --> MethodPrinter
	 *      �޼ҵ�� testprint --> testPrint
	 *  
	 *  �׸��� �׻� �ǹ��ְ� �̸�����!!
	 */
	
	public void Value() { 
		//1. ������� --> ����ǥ���� ~~
		System.out.println(123);//������
		System.out.println(1.23);//�Ǽ���
		
		//2. ���� (�ѱ���) ��� -->����ǥ �ϳ� 
		System.out.println('a');
		System.out.println('b');
		
		//3.���ڿ� (��������) ��� --> �ֵ���ǥ �̿� 
		System.out.println("a");
		System.out.println("�ȳ��ϼ���");
		
		//4. ������ ��� ���� ��� ���� 
		System.out.println(123+456);
		System.out.println(1.23+0.56);
		
		
		//5. ���ڿ� ������ ������ �����ϴ�
		System.out.println('a'+1);
		
		//6. ���ڿ� ("")�� ���̿��� ������ �������� --> ���ڿ�ȭ
		System.out.println("���"+'a'+1234);
	}
}
