package com.uni.variable;

import java.util.Scanner;

public class F_KeyboardInput {

	public void inputScanner() {
		Scanner sc = new Scanner(System.in);// -> �Է¹��� ���� ����Ʈ ������ �޾� ���̰ڴ�.

		System.out.println("����� �̸��� �����Դϱ�?");

		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �żҵ�(next(), nextLine())

		// String name = sc.next();// ������ �ִ°�� ���� �������� �о�´� ��, ���� ������
		String name = sc.nextLine();// ����ڰ� �Է��� �� ��� �о�´�

		System.out.println("����� ���̴� ����Դϱ�?");

		int age = sc.nextInt();// ����ڰ� �Է��� ������ ���� ���� �о�´�.

		System.out.println("����� Ű�� ���Դϱ�.");

		double height = sc.nextDouble();// ����ڰ� �Է��� �Ǽ��� ���� ���� �о�´�.

		System.out.println(name + "����" + age + "���̸�,Ű��" + height + "�Դϴ�");

		// System.out.println(name+ "��");

	}

	public void inputScanner2() {
		/*
		 * sc.nextLine() : ���ۿ��� '����' ���������� ��� ���� ������ �� '����'�� ����ִ� ����
		 * �� ���� �޼ҵ�  : ���ۿ��� '����' ���������� ���� ������ �� '����'�� ������� ����
		 * 
		 * ���� sc.nextInt() �� sc.nextLine()�� ���� �Ǹ� ���ۿ� �����ִ� '����'�� sc.nextLine()�� �ν��Ͽ� ����ڰ�  ���� �Է��ߴٰ� ������ �� �о���� �Ѿ����
		 * 
		 * (���� �� �� sc.nextLine() �����ֱ�) 
		 * sc.nextLine() �޼ҵ带 ������ �ٸ� �޼ҵ�� (sc.next() �Ǵ� sc.nextXXX())��
		 * �ش� ���� �о�� ä ����ڰ� �Է��� '����'�� ���ۿ� �����ְԵȴ�.
		 * 
		 * ������ sc.nextLine() �޼ҵ�� ����ڰ� �Է��� �� �ٿ� ���� ���� ��� 
		 * ��, ���ͱ��� ��� �о�´�. �ٽ� ���ϸ� ���̸� �Է��� �� sc.nextInt() �� �� �����͸� �Է��ϰ� ���͸� ���� �� 
		 * ���� age���� ���� ���� ����ǰ� '����'�� ���ۿ� �����ִ� �����̴�.
		 * 
		 * ���� �ּ� ���� �Է¹��� �� ���Ǵ� sc.nextLine() �޼ҵ尡 ���ۿ� �����ִ� '����'�� �ڵ����� �о�ͼ� �Է��� �����ٰ�
		 * �����ϴ� �� --> address ��� ���ڿ����� ���� ��
		 * 
		 * ��� : sc.nextXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ带 ����ϰ� �ȴٸ� ���ۿ� �����ִ� '����'�� ���ֱ� ����
		 * sc.nextLine() �޼ҵ带 �� �� �� ������
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� �����Դϱ�?");
		String name = sc.nextLine();
		System.out.println("����� ���̴� ����Դϱ�?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("����� �ּҴ� �����Դϱ�?");
		String address = sc.nextLine();
		System.out.println("����� Ű�� ���Դϱ�.");
		double height = sc.nextDouble();
		System.out.printf("%s ����" + "%d ���̸�,��� �� ��"+ "%s �̰�,Ű��"  + "%2f + �Դϴ�",name,age,address,height);

	
		
	}
	
	public void inputScanner3() {
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("�̸� : ");
	   String name = sc.nextLine();
	   
	   //���ڿ� �Է� ������ -> sc.nextLine();
	   //������ �Է� ������ -> sc.nextInt();
	   //�Ǽ��� �Է� ������ -> sc.nextdouble();
	   
	   //sc.nextchar() -> �������� �ʴ´�. CharAt : ���ڿ����� ������ ��ġ�� �ִ� �����ϳ��� �̾Ƴ��� ����� ��. �̶� ��ġ�� ���� �չ��ڰ� 0���� �����ؼ� 1�� ����
	   
	   System.out.println("����(M/F) : ");
	   char gender = sc.nextLine().charAt(0);
	   
	   
	   System.out.println("���� : ");
	   int age = sc.nextInt();
	   
	   System.out.println(name + "���� ��������");
	   System.out.println("���� : "+ gender);
	   System.out.println("���� : "+ age);
	   /*
		 * ** ���� **
		 * 
		 * 1. �ܼ�â��(����ͷ�) ����ϱ����� : System.out.println() �޼ҵ� �̿� 
		 * 2. �ܼ�â��(Ű�����) �Է¹ޱ����� : Scanner sc = new Scanner(System.in); 
		 * 							   sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble() ....
		 * 
		 * �� ��, sc.next() �Ǵ� sc.nextXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ尡 �;ߵǴ� ���
		 * sc.nextLine() �޼ҵ带 �� �� �� ���༭ ���ۿ� ���� '����'�� ���ִ� ���� �ʼ�!
		 * 
		 * �׸��� '����' ���� �Է� �ޱ� ���ؼ��� sc.nextLine() �޼ҵ带 ���� ���ڿ��� ���� �޾��ְ� 
		 * �� �ڿ� .charAt(0) �޼ҵ带 ���� ���ڷ� ��ȯ���ִ� �۾� �����ؾߵȴ�.
		 * 
		 */
	   
	}
	
}
