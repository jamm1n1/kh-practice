package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]);

		}

	}

	public void practice2() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i]);
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a - i;
			System.out.print(arr[i]);
		}

	}

	public void practice4() {
		String[] srr = new String[] { "���", "��", "����", "������", "����" };
		System.out.println(srr[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� : ");
		String a = sc.nextLine();
		char[] srr = new char[a.length()];
		for (int i = 0; i < srr.length; i++) {
			srr[i] = a.charAt(i);
		}

		System.out.println("���� : ");
		char b = sc.nextLine().charAt(0);
		System.out.println(a + "��" + b + "�� �����ϴ� ��ġ (�ε���) : ");

		// ������ ��Ǯ�ڴ� ���� 
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] srr = new String[] { "������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���" };
		System.out.println("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		System.out.println(srr[num]);
		if (num < 0 || num > 6) {

			System.out.println("�߸� �Է� �ϼ˽��ϴ�");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�迭" + i + "���� �ε����� ���� ��");
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("���� : " + (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]));
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int a = sc.nextInt();
		while (a < 2 || a % 2 == 0) {
			System.out.println("�ٽ� �Է��ϼ���");
			practice8();
		}
		int[] arr = new int[a];
		for (int i = 0; i < arr.length - i; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]);

			// 3 121 5 12321 7 1234321 9 123454321 3 -1 5 -2 3 3 5 4 7 5 -1 -2 -3 -4 -5 -6
		}
		int b = 1;

		for (int j = (a / 2) + 1; j < arr.length; j++) {

			arr[j] = j - ((2 * b) - 1);

			b++;

			System.out.print(arr[j]);
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		String [] arr = new String[] {"���", "����", "�Ķ��̵�"};
		
		System.out.println("ġŲ �̸��� �Է��ϼ��� : ");
		String a = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(a)) {
				System.out.println(a + "ġŲ ��� ����");
				return;
			}
		}	System.out.println(a+"ġŲ�� ���� �޴��Դϴ�.");
		
		
		
	}

	

	public void practice10() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(" " + arr[i]);
		}
	}

	public void practice11() {

		int[] arr = new int[10];

		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		

			}
		Arrays.sort(arr);
		System.out.println();
		System.out.println("�ִ밪 : " + arr[9]);
		System.out.println("�ּҰ� : " + arr[0]);

		}
		
		// �̰ŵ� �𸣰ڵ� ����Ǯ����ұ� .. ������Բ� ���� ������� �� Ǯ���� 
		
		
	

	public void practice12() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					i--;
					break;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ(-����) : ");
		String a = sc.nextLine();
		char b[] = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			if (i < 8) {
				System.out.print(b[i]);
			} else {
				System.out.print("*");
			}
		}

	}

	public void practice14() {
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
		arr[i] = (int) (Math.random() * 50 + 1);
		for (int j = 0; j < i;  j++) {
			if(arr[i]==arr[j]) {
				j--;
			}
		
		}
	
	}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
}
}
