package com.hw3.run;

import com.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		
		System.out.print("valur: ");
		StaticSample.setValue("java");
		System.out.println(StaticSample.getValue());

		System.out.print("대문자로 :");
		StaticSample.toUpper();
		
		System.out.print("길이 : ");
		StaticSample.valueLength();
		
	    System.out.println();
		System.out.print("PROGRAMMING 붙여서 : ");
		StaticSample.valueConcat("PROGRAMMING");
		 
		System.out.print("J=>C : ");
		StaticSample.setChar(0,'C');
		
	}

}
