package com.kh.hw1.controller;

import java.util.StringTokenizer;



public class TokenController {

	public String afterToken(String str){		
		StringTokenizer st = new StringTokenizer(str," ");
		String s = "";
		while(st.hasMoreTokens()) {//Ŀ�� ���� ��ū���ִ���
			String nStr = st.nextToken();//���ڿ� �ϳ��� ����
			s+=nStr;
		}
		return s;
	}
	public String firstCap(String input) {
		
		String a = input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();
		return a;
	
	}
	public int findchar(String input,char one) { //�Ű����� ���ڰ� ����� ��ȯ
		int count = 0;
		for(int i =0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
			}
		return count;
	}
}
