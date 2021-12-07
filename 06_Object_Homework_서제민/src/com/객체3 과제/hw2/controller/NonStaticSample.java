package com.hw2.controller;

import java.util.Arrays;

public class NonStaticSample {

	
	public int[] intArrayAllocation(int lenght) {
		
		int[] arr = new int[lenght];
		for(int i = 0; i<arr.length; i++) {			
		arr[i]=(int)(Math.random()*100)+1;
       
        
        	
	}	
		return arr;
	}

	public void display(int[]arr) {
		System.out.print("크기가 5 인 배열의 랜덤값 : ");
				System.out.println(Arrays.toString(arr));
		
	
		}

	public void swap (int[] arr, int idx1, int idx2) { 
		
		int temp = arr[idx1]; //temp 가 먼저 앞에 와서 값을 받아야한다 거꾸로하면 안된다 
		arr[idx2] = arr[idx1];
		arr[idx2] = temp;
	

	}

	
	public void sortDescending(int arr[]) {
		 System.out.println("내림차순 출력 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
	}
				
}	
		
}
		display(arr);	
}
	public void sortAscending(int[]arr) {
		System.out.println("오름차순 출력");
		Arrays.sort(arr);
		display(arr);
	}
	public int countChar(String str,char c) {
	int co = 0;
	int ch = 0;
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch==c) {
				co += 1;
			}
		}
		System.out.print(str+"문자열에 "+c+"의 갯수: "+co);
		System.out.println();
		return co;
	}
	public int totalValue(int num1,int num2) {
		int a = 0;
		if(num1>num2)
		for(int i = num2+1; i <=num1-1; i++) {
			a+=i;			
		}else {
			if(num2>num1)
				for(int i = num1+1; i <=num2-1; i++) {
					a+=i;											
	}
			
}
		System.out.print(num1+" 과 "+num2+"사이 정수들의 합계: "+ a);
		return a;
		
	}
	public char pCharAt(String str, int index) {
		
		char ch = str.charAt(index);
		System.out.println();
		System.out.println(str+"문자열의 "+ch+"번 인덱스 문자: "+ch);
		return ch;
	}
	public String pConcat(String str1, String str2) {
		String str3 = str1+str2;
		System.out.println(str1+"와"+str2+"을 합친 문자열 : "+str3);
		return str3;
	}
}
