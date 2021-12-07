package com.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {
		
		int[] a = new int [6];
		for(int i = 0;  i < a.length; i++) {
			a[i] = (int)(Math.random()*46);		
			for(int j = 0; j < i; j++) {
				if(a[j]==a[i]) {
					i--;									
				}
				}
					
		}
		for(int i = 0;  i < a.length; i++) {
			for(int j = 0; j < i; j++) {
				
				
				
			}
			
	
	}Arrays.sort(a);
	System.out.print(Arrays.toString(a));
	}
	
	public void outputChar(int num, char c) { 
		System.out.println();
		for(int i = 1; i<=num; i++) {
			System.out.print(c+" ");
		}
			
		
	}
	public char alphabette() {  //대문자   = 65  ~90  소문자는 97 ~122 122-65 =57
		char[]arr = new char [1];
		for(int i = 0; i < arr.length; i++) {
		arr[i]=(char) ((int)(Math.random()*57)+65);
		if(arr[i]<91 || arr[i]>97) {
		for(int j = 0; j <1;  j++) {
			System.out.println(arr[i]);
			
	}
		}	
}
		return 0;
}
	public String mySybstring(String str, int index1,int index2) {
		String str1 = str;
		char s = str1.charAt(index2);
		char t = str1.charAt(index1);
		System.out.print(s);
		System.out.println(t);
		return str1;
		
				
	}
}