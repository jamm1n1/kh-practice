package com.uni.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_OVerlap {

	// �ߺ�����

	public void method1() {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "��°���� �Է� : ");
			arr[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("�ߺ��� ���� �ֽ��ϴ�.");
					i--;

					break;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
	}

	public void method2() {
		int[] arr = new int[5];
		// ������ 1���� 10������ ������ �߻� ���Ѽ� �ߺ����� ���

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

	public void method3() {
		// �迭 10ĭ , ���� 100, �ߺ����� , ��������

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
				 i--;
				 break;
					
					
				}

			}
			
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//��������  5 4  3 2 1 
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
				
					
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
}