package com.hw6.run;

import com.hw6.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		
		DateCalculator day = new DateCalculator();
		if(day.isLeapYear(2021)) {
			System.out.println("���ش� �����Դϴ�.");
		}else {
			System.out.println("���ش� ����Դϴ�.");
		}
		
		long s = day.leapDate();
		System.out.println("�� ��¥ �� : " + s);
	
	}

}
