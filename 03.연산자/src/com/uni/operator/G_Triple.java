package com.uni.operator;

import java.util.Scanner;



public class G_Triple {
	/*
	 * * ���� ������ : �׸��� 3���� ������
	 * [ǥ����] ���ǽ� ? ���ǽ��� ���ϰ���� ��1 : ���ǽ��� �����ϰ���� ��2
	 * 
	 * �̶�, ���ǽ��� �ݵ�� true �Ǵ� false�� �����Բ� �ۼ��ؾߵȴ�. 
	 * �ַ� ���ǽĿ��� ��, �� �����ڰ� ���ȴ�.
	 */
	
	public void method1() {
		//�Է¹��� ������ ������� �ƴ��� �Ǻ��� ��� 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
		
		int num = sc.nextInt();
		
		System.out.println(num+"��"+(num > 0 ? "����̴�" : "�����̴�"));
	}
	public void method2() {
Scanner sc = new Scanner(System.in);
		
System.out.println("������ �Է� : ");
		
		int num = sc.nextInt();
		
		String result =  num % 2 ==0 ? "¦���̴�" : "Ȧ���̴�";
         System.out.println(num + " �� "+ result);
	}
	
	public void method3 () {
		
		//����ڰ� �Է��� 2���� �������� ���� ����� 100�̻��� ��� "����� 100�̻��Դϴ�" �ƴѰ�� "����� 100�����۽��ϴ�"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int num1 = sc.nextInt();
	
		System.out.println("������ �Է� : ");
		int num2 = sc.nextInt();
		
		
		String result = num1 * num2 >=100 ? "����� 100�̻��Դϴ�" : "����� 100�����۽��ϴ�";
		
		System.out.println(num1 * num2 + "��"+ result);
	}
	public void method4 () {
		//����ڰ� �Է��� �����ڰ� �빮������ �ҹ������� �Ǻ��� ��� 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
		
	   char ch = sc.nextLine().charAt(0);
	   
	   String result = (ch >= 'A' && ch <= 'Z') ? "�빮�� �Դϴ�." : "�빮�ڰ� �ƴմϴ�.";
	   System.out.println(ch + "��" +result);
		
		
	}
	public void method5 () {
		
	//���׿����� ��ø���
		//�Է¹��� ������ 0���� �ƴ��� �Ǻ��� 0�� �ƴѰ�� ������� �������� �Ǻ� 
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int num= sc.nextInt();
		
		String result = num == 0 ? "0�̴� " :(num > 0 ? "����̴�" : "�����̴�");
				System.out.println(num + "��"+result);
	}
	public void method6 () {
		
		//�μ��� �Է¹ް� 
		//+ �Ǵ� - �� �Է¹޾Ƽ� �˸´� ������� ����ϱ�
		//�� + �Ǵ� - �̿��� �ٸ� ���ڸ� �Է��Ѵ� ��쿡�� "�߸��Է��Ͽ����ϴ�" ���
		

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int num1 = sc.nextInt();
	
		System.out.println("������ �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("������ �Է�(+ or -) : ");
		  char op = sc.nextLine().charAt(0);
		  
		  String result = op == '+' ? String.valueOf(num1+num2) : op == '-' ? num1-num2+"" : "�߸��Է��Ͽ����ϴ�.";
		  System.out.println("��� : " + result);
	}
}
