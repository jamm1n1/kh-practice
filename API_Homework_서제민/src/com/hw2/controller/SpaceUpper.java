package com.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public SpaceUpper() {
		
	}
	public void spaceToUpper() {
Scanner sc = new Scanner(System.in);
		
		System.out.println("영어를 입력하시오(띄어쓰기 포함): ");
		String str = sc.nextLine();
StringTokenizer st = new StringTokenizer(str, " ");
				
		for(int i = 0; i < str.length(); i++) {
			while(st.hasMoreTokens()) {
				String nStr = st.nextToken();				
				String s = nStr.substring(0, 1).toUpperCase()+nStr.substring(1).toLowerCase(); 						
				System.out.print(s + " ");
			}
		}
	}
}
	

