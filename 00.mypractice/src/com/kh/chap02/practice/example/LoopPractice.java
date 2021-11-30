package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println();
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			practice2();

		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println();
			System.out.println("�߸� �Է��ϼ̽��ϴ�.�ٽ� �Է����ּ���");
			practice2();

		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num - 1; i++) {
			System.out.print(i + " + ");
			sum += i;

		}
		System.out.print(num + " = " + sum);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ���� ���� : ");
		int f = sc.nextInt();
		System.out.print("�� ���� ���� : ");
		int s = sc.nextInt();
		if (s <= f && s > 0 && f > 0)
			for (int i = 1; i <= f; i++) {
				if (i >= s) {
					System.out.print(i + " ");
				}
			}
		else if (s >= f && s > 0 && f > 0) {
			for (int i = 1; i <= s; i++) {
				if (i >= f) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");

		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ���� ���� : ");
		int f = sc.nextInt();
		System.out.print("�� ���� ���� : ");
		int s = sc.nextInt();
		if (s <= f && s > 0 && f > 0)
			for (int i = 1; i <= f; i++) {
				if (i >= s) {
					System.out.print(i + " ");
				}
			}
		else if (s >= f && s > 0 && f > 0) {
			for (int i = 1; i <= s; i++) {
				if (i >= f) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
			practice7();

		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		System.out.println("====" + num + "��====");
		for (int i = 1; i <= 9; i++) {

			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		for (int j = num; j <= 9; j++) {
			System.out.println("====" + j + "��====");

			for (int i = 1; i <= 9; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));

			}
		}
		System.out.println("2~9 ������ ���ڸ� �̷����ּ���.");
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		if (num < 10) {
			for (int j = num; j <= 9; j++) {
				System.out.println("====" + j + "��====");

				for (int i = 1; i <= 9; i++) {
					System.out.println(j + " * " + i + " = " + (j * i));
				}

			}
		} else {
			System.out.println("2~9 ������ ���ڸ� �̷����ּ���.");
			practice10();
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
		int minus = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.print(start + " ");
			start += minus;
		}

	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("������(+, -, *, /, %) : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			char c = str.charAt(0);
			System.out.print("����1 : ");
			int a = sc.nextInt();
			System.out.print("����2 : ");
			int b = sc.nextInt();
			sc.nextLine();
			if (c == '+' || c == '-' || c == '/' || c == '*' || c == '%') {

				switch (c) {
				case '+':
					System.out.printf("%d+%d=%d\n", a, b, a + b);
					break;
				case '-':
					System.out.printf("%d-%d=%d\n", a, b, a - b);
					break;
				case '/':
					System.out.printf("%d/%d=%d\n", a, b, a / b);
					break;
				case '*':
					System.out.printf("%d*%d=%d\n", a, b, a * b);
					break;
				case '%':
					System.out.printf("%d" + "%" + "%d=%d\n", a, b, a % b);
					break;

				}
			} else if (c != '+' || c != '-' || c != '/' || c != '*' || c != '%') {
				System.out.println("���� �������Դϴ�.�ٽ� �Է����ּ���");

			}

		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int n = sc.nextInt(); // ���Է�

		int co = 0;
		if (n <= 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			return;
		}
		for (int i = 2; i <= n; i++) { // 1�� �Ҽ��� �ƴϹǷ� 2���� ����

			if (n % i == 0) { // �̷��� �ϴ������� �Ҽ��ΰ��� ī��Ʈ�� 1���� �ö󰡰� �Ҽ����ƴѰ��� �ڽ� �����ŭ ���ڰ�������

				co++;

			}

		}
		if (co == 1) {
			System.out.println("�Ҽ��Դϴ�");
			co = 0; // Ƚ���� 0���� �ʱ�ȭ

		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
			co = 0;
		}
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int n = sc.nextInt(); // ���Է�

		int co = 0;
		if (n <= 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			practice16();
			return;
		}
		for (int i = 2; i <= n; i++) { // 1�� �Ҽ��� �ƴϹǷ� 2���� ����

			if (n % i == 0) { // �̷��� �ϴ������� �Ҽ��ΰ��� ī��Ʈ�� 1���� �ö󰡰� �Ҽ����ƴѰ��� �ڽ� �����ŭ ���ڰ�������

				co++;

			}

		}
		if (co == 1) {
			System.out.println("�Ҽ��Դϴ�");
			co = 0; // Ƚ���� 0���� �ʱ�ȭ

		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
			co = 0;
		}
	}

	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int n = sc.nextInt(); // ���Է�

		int co = 0;
		int a = 0;
		if (n <= 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			practice16();
			return;

		}
		for (int i = 2; i <= n; i++) { // 1�� �Ҽ��� �ƴϹǷ� 2���� ����
			for (int j = 2; j <= i; j++)
				if (i % j == 0) {

					co++;

				}
			if (co == 1) {
				System.out.print(i + " ");
				a++;

			}

			co = 0; // Ƚ���� 0���� �ʱ�ȭ

		}
		System.out.println();
		System.out.println("2���� " + n + "���� �Ҽ��� ������ " + a + "���Դϴ�.");
	}

	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int c = 0;
		int n = sc.nextInt(); // ���Է�
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				c++;
			}

		}

		System.out.println();
		System.out.print("count : " + c);

	}

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		} // �� ����
			// �� ����

	}

	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int a = 1; a <= n; a++) {
			for (int b = n; b > 0; b--) {
				if (b > a) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		}
	}

	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");

			}
			for (int a = 1; a <= i * 2 - 1; a++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n) {
					System.out.print("*");
				} else if (j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		

	}
	public void practice23() {
		for (int i = 1 ; i<=9; i++) {
			for(int j = 0; j<=9-i; j++) {
				System.out.print(" ");
			}
			for(int  k = 0; k <(2*i)-1; k++ ) {
			System.out.print("*");			
			}System.out.println();
		}
		for (int a = 8; a>0; a--) {
			for(int b = 0; b<=9-a; b++) {
				System.out.print(" ");
		}
			for(int c = 1; c<=(2*a)-1; c++) {
				System.out.print("*");
	
	}System.out.println();
}
}
}