package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SetDate {
	
public SetDate() {
		
	}
	
	public String todayPrint() {
		
		Date time = new Date();
		int y = time.getYear() +1900;
		int m = time.getMonth() +1;
		int d = time.getDate();
		int h = time.getHours();
		int mi = time.getMinutes();
		int sc = time.getSeconds();
		
		String gold = "";
		gold = y + "�� " + m + "�� " + d + "�� " + h + "�� " + mi + "�� " + sc + "��";
		return gold;
	}
	public String setDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2011, 2, 21);
		int t = calendar.get(GregorianCalendar.DAY_OF_WEEK);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		String T = sdf1.format(calendar.getTime());
		return T;
	}
}
