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
		System.out.println("양의 정수 : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a - i;
			System.out.print(arr[i]);
		}

	}

	public void practice4() {
		String[] srr = new String[] { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(srr[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String a = sc.nextLine();
		char[] srr = new char[a.length()];
		for (int i = 0; i < srr.length; i++) {
			srr[i] = a.charAt(i);
		}

		System.out.println("문자 : ");
		char b = sc.nextLine().charAt(0);
		System.out.println(a + "에" + b + "가 존재하는 위치 (인덱스) : ");

		// 도저히 못풀겠다 ㅈㅈ 
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] srr = new String[] { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println(srr[num]);
		if (num < 0 || num > 6) {

			System.out.println("잘못 입력 하셧습니다");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열" + i + "번쨰 인덱스에 넣을 값");
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("총힙 : " + (arr[0] + arr[1] + arr[2] + arr[3] + arr[4]));
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int a = sc.nextInt();
		while (a < 2 || a % 2 == 0) {
			System.out.println("다시 입력하세요");
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
		String [] arr = new String[] {"양념", "간장", "후라이드"};
		
		System.out.println("치킨 이름을 입력하세요 : ");
		String a = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(a)) {
				System.out.println(a + "치킨 배달 가능");
				return;
			}
		}	System.out.println(a+"치킨은 없는 메뉴입니다.");
		
		
		
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
		System.out.println("최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);

		}
		
		// 이거도 모르겠따 어케풀어야할까 .. 김민지님꺼 참고 어려워서 못 풀었음 
		
		
	

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
		System.out.println("주민등록번호(-포함) : ");
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
