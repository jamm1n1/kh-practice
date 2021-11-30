package com.uni.array;

import java.util.Arrays;

public class C_ArraySort {

	// �迭����

	public void method1() {
		int num1 = 20;
		int num2 = 10;

		System.out.println("������");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		int temp; // �ӽ÷� �Ѱ��� ���� �����ص� ����

		temp = num1; // --> temp : 20
		num1 = num2; // --> num1 :10
		num2 = temp; // --> num2 :20

		System.out.println("������");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

	}

	public void method2() {
		// �ε��� 0��°�� �ε��� 1��° �� , �� ���� 2,1 ��ġ �ٲ㺸��
		int[] arr = { 2, 1, 3 };
		int temp = arr[0]; // --> temp : 2
		arr[0] = arr[1]; // --> arr[0] : 1
		arr[1] = temp;// --> arr[1] : 2

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}

	public void method3() {
		int[] arr = { 2, 5, 4, 1, 3 };
		// ��������(insertion sort)
		// ���� �˰��򿡼� ���� �����ϰ� �⺻�̵Ǵ� �˰���
		// �迭�� n�� �ε������� 0�� ~ n-1 �� �ε��� ���� ��

		// ����ü �񱳴��
		// i=1�϶� j=0~0
		// i=2�϶� j=0~1
		// i=3�϶� j=0~2
		// i=4�϶� j=0~3

		// i=1~�������ε��� //j=0~i-1

		// ������������
		// 1.����ü�� ���ϴ� for��
		for (int i = 1; i < arr.length; i++) {

			// 2. �񱳴���� ���ϴ� for��
			for (int j = 0; j < i; j++) {

				// ����ü�� �� ��󺸴� ������� ���� ��ȯ
				System.out.println("i : " + i + "--> " + arr[i]);
				System.out.println("j : " + j + "--> " + arr[j]);
				if (arr[i] < arr[j]) {
					System.out.println("��ȯ�߻�");
					int temp = arr[i];

					arr[i] = arr[j];
					arr[j] = temp;

					for (int m = 0; m < arr.length; m++) {
						System.out.print(arr[m] + " ");

					}
					System.out.println();
				}
			}

		} // 25413 -> 24513 -> 14523 -> 12543 -> 12453 -> 12354 -> 12345
		System.out.println("���� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void method4() {

		int[] arr = { 2, 5, 4, 1, 3 };
		// �������� (selection sort)
		// �迭�� ���� Ž���Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		// �������� ���� ���� �� ���� ������ ��� ����(��ȯȽ���� ����)
		// ������ �迭�� ���� Ž���Ͽ� �ּҰ��� ã�ƾ� �ϱ� ������ 100�� �̻��� �ڷῡ���� �ް��ϰ� �ӵ� ����
		// �迭�� n�� �ε������� n+1�� ~ ������ �ε������� ��

		// ����ü �񱳴��
		// i=0 �� �� j=1~5
		// i=1 �� �� j=2~5
		// i=2 �� �� j=3~5
		// i=3 �� �� j=4~5
		// i=4 �� �� j=5~5

		// i=0���� ���������� �ݺ��� ��
		// j=i+1���� ���������� �ݺ�

		// �������� ����
		
		
		//1.����ü�� ���ϴ� for��
        for(int i =0; i <arr.length; i++) {
        	//2.�񱳴���� ���ϴ� for �� 
        	for(int j= i+1; j < arr.length; j++) {
        		System.out.println("i : " + i + "--> " + arr[i]);
				System.out.println("j : " + j + "--> " + arr[j]);
        		if (arr[i] > arr[j]) {
					System.out.println("��ȯ�߻�");
					int temp = arr[i];

					arr[i] = arr[j];
					arr[j] = temp;
					for (int m = 0; m < arr.length; m++) {
						System.out.print(arr[m] + " ");

					}
					System.out.println();
					//--> 25413 -->15423 -->14523 -->12543-->12453 -->12345
					
        	}
        	
        } 
		
        }
        }
	public void method5() {
		int[] arr = {2,5,4,1,3};
		
		Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      
	}
	
}
