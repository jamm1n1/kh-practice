package com.kh.hw1.controller;

import java.util.StringTokenizer;



public class TokenController {

	public String afterToken(String str){		
		StringTokenizer st = new StringTokenizer(str," ");
		String s = "";
		while(st.hasMoreTokens()) {//커서 다음 토큰이있느지
			String nStr = st.nextToken();//문자열 하나씩 빼기
			s+=nStr;
		}
		return s;
	}
	public String firstCap(String input) {
		
		String a = input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();
		return a;
	
	}
	public int findchar(String input,char one) { //매개변수 문자가 몇개인지 반환
		int count = 0;
		for(int i =0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
			}
		return count;
	}
}
