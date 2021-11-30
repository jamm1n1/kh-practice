package com.uni.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_OVerlap {

	// 중복제거

	public void method1() {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째정수 입력 : ");
			arr[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("중복된 값이 있습니다.");
					i--;

					break;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
	}

	public void method2() {
		int[] arr = new int[5];
		// 임의의 1부터 10사이의 난수를 발생 시켜서 중복없이 출력

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
		// 배열 10칸 , 난수 100, 중복제거 , 오름차순

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
		
		//내림차순  5 4  3 2 1 
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