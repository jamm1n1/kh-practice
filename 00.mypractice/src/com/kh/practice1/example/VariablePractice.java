package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���. : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("������ �Է��ϼ���(��/��) : ");
		String sex = sc.nextLine();
		System.out.println("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();

		System.out.printf("Ű %2f��" + "%d��" + "%s��" + "%s�� �ݰ����ϴ�^^", height, age, sex, name);

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("ù ���� ������ �Է��ϼ��� : ");
		int one = sc.nextInt();
		System.out.println("�ι��� ������ �Է��ϼ��� : ");
		int two = sc.nextInt();
		System.out.println("���ϱ� ��� : " + (one + two));
		System.out.println("���� ��� : " + (one - two));
		System.out.println("���ϱ� ��� : " + (one * two));
		System.out.println("������ ��� : " + (one / two));

	}

	public void method3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("���� : ");
		double wid = sc.nextDouble();
		System.out.println("���� : ");
		double ren = sc.nextDouble();

		System.out.println("���� : " + (wid * ren));
		System.out.println("�ѷ� : " + ((wid + ren) * 2));
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		char one = name.charAt(0);
		char two = name.charAt(1);
		char thr = name.charAt(2);
		
		System.out.println("ù ��° ���� : " +one);		
		System.out.println("�� ��° ���� : " +two);		
		System.out.println("�� ��° ���� : " +thr);
//ó���� ���� 		
		
/*		System.out.println("���ڿ��� �Է��ϼ��� : ");
		char one = sc.nextLine().charAt(0);
		char two = sc.nextLine().charAt(1);
		char thr = sc.nextLine().charAt(2);				
	    System.out.println("ù ��° ���� : " +one);		
		System.out.println("�� ��° ���� : " +two);		
		System.out.println("�� ��° ���� : " +thr);*/
		//�̷��������Ͽ� apple�� ���� Ÿ������ 1�ð�30�е��� ��������غ������� �� ������ ���۸����� ���� ^��^
		
// ���۸� ���� �����
	}


	
}