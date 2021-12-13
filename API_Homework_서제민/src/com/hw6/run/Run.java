package com.hw6.run;

import com.hw6.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		
		DateCalculator day = new DateCalculator();
		if(day.isLeapYear(2021)) {
			System.out.println("올해는 윤년입니다.");
		}else {
			System.out.println("올해는 평년입니다.");
		}
		
		long s = day.leapDate();
		System.out.println("총 날짜 수 : " + s);
	
	}

}
