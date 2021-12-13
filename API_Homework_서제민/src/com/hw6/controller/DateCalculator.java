package com.hw6.controller;

import java.util.GregorianCalendar;

public class DateCalculator {


	public DateCalculator() {
		
	}
	
	public long leapDate() {
		GregorianCalendar gc = new GregorianCalendar();	// 현재시간
		int year = 0;
	
		for(int i  = 1; i < gc.get(GregorianCalendar.YEAR); i ++) {
			if(i % 4 == 0 && i %100 != 0 || i %400 == 0) {
				year += 366;
			}else {
				year += 365;
			}
		}
		return year;
	}
	public boolean isLeapYear(int year) {
		if(year %4 == 0 && year %100 != 0 || year %400 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
