package com.uni.chap06_deate.run;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

	/*
	 * 1. Date (java.util ��Ű��)
	 * - Date�� ��¥�� �ٷ�� ���� �����Ǵ� Ŭ����
	 * - �ڹٰ��� �ʱ⿡ ���ϰ� ���� �ϼ����� ����, �ٱ������� ���⵵ �������� ����
	 * - 1970�� 1�� 1�� 0�� 0�� 0�ʸ� �������� milliseconds ������ �����
	 * - Date�� �⵵�� +1900, ���� +1�� ���������� �Ѵ�.
	 */
	public static void main(String[] args) {
		// Date

		
		// ���� �ð�(Date �⺻ ����) : ��ǻ���� �ð�
		Date today = new Date();
		System.out.println(today);
		
		// ���� ���ϴ� ��¥(Date�� �Ű����� �ִ� ������)
		Date today1 = new Date(120, 0, 28);	// 2020.01.28 -> (120+1900, 0+1, 28)
		System.out.println(today1);
		
		/*@Deprecated
		public Date(int year,
		                        int month,
		                        int date)

		Deprecated. As of JDK version 1.1,replaced by Calendar.set(year + 1900, month, date)or GregorianCalendar(year + 1900, month, date).
		*/
		// ���ϴ� �������� �̾ƺ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E����");
		System.out.println(sdf.format(today1));
	
		
		// �ð��� ���� ���ϴ� �� �̾� ����
		System.out.println("�ð� : " + today.getTime());
		System.out.println("��¥ : " + today.getDate());
		System.out.println("���� : " + today.getDay());
		System.out.println("�� : " + today.getHours());
		System.out.println("�� : " + today.getMinutes());
		System.out.println("�� : " + (today.getMonth() + 1));	// ����
		System.out.println("�� : " + today.getSeconds());
		System.out.println("�� : " + (today.getYear() + 1900));	// ����
		
		String curTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		
		System.out.println("curTime"+curTime);
		
		System.out.println("------------ Ķ���� -------------");
		// 2. Calendar
		// - ���� +1 (�⵵�� �����Է�)
		//   ex) 20��� ������ �׳� 20�⵵�� �ν�, 2020�� �Է��ؾ� �� ���� 2020�� �Է�
		// - TimeZone ��� ����
		// - filed number ���� ����(�޼ҵ� ���� ���� ���� ����)
		
		Calendar calendar = Calendar.getInstance();	// ���� �ð�
							// new Calendar()�� �� �� ����. (�⺻�����ڰ� protected�̱� ������)
		
		calendar.set(2020, 0, 28); // set�޼ҵ带 ���ؼ� �ð��� ����
									// �⵵�� full�� �� ����, ���� Date���� ���������� -1�� ���� �־���� ��
		calendar.set(2008, 2-1, 29);
		// �ð��� ���� ���ϴ� �� �̱�
		System.out.println("��¥ : " + calendar.get(GregorianCalendar.DATE));
		System.out.println("���� : " + calendar.get(GregorianCalendar.DAY_OF_WEEK));
		System.out.println("�� : " + calendar.get(GregorianCalendar.HOUR));
		System.out.println("�� : " + calendar.get(GregorianCalendar.MINUTE));
		System.out.println("�� : " + (calendar.get(GregorianCalendar.MONTH)+1));	// ����
		System.out.println("�� : " + calendar.get(GregorianCalendar.SECOND));
		System.out.println("�� : " + calendar.get(GregorianCalendar.YEAR));	
		
		// ���ϴ� format����..
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd E���� hh:mm:ss a");
		System.out.println(sdf1.format(calendar.getTime()));
		
		System.out.println("------------ �׷����� Ķ���� -------------");
		// �����̶�? �⵵��(4�� ����̸鼭, 100�� ����� �ƴϰų�)
		//              (400�� �����)�� �Ǵ� �ذ� ����(1���� 366�Ϸ� ���(=2���� 29���� ��))
		
		// �����콺���� �ټ��� ���� ���� ������ �׷�����
		// (1���� 365 1/4��(365.2422��))
		// 1) �� ���� ������ 4�� ����� �ƴϸ� ������� 2���� 28�ϸ� �ִ�.
		// 2) ���� ������ 4�� ����鼭 100�� ����� �ƴϸ� ����(2�� 29��)�� �����Ѵ�.
		// 3) ���� ������ 100�� ����̸鼭 400�� ����� �ƴ� �� �� �ش� ������� �����Ѵ�.
		// 4) ���� ������ 400�� ����� ����(2�� 29��)�� �����Ѵ�.
		
		// 2)�� ��
		// 2008�� (����, 366��)
		
		// 3)�� ��
		// 2300�� (���, 365��)
		
		// 4)�� ��
		// 2400�� (����, 366��)
		
		GregorianCalendar gc = new GregorianCalendar();	// ����ð�
		
		// �ð��� ���� ���ϴ� �� �̱�
		System.out.println("��¥ : " + gc.get(GregorianCalendar.DATE));
		System.out.println("���� : " + gc.get(GregorianCalendar.DAY_OF_WEEK));
		System.out.println("�� : " + gc.get(GregorianCalendar.HOUR));
		System.out.println("�� : " + gc.get(GregorianCalendar.MINUTE));
		System.out.println("�� : " + (gc.get(GregorianCalendar.MONTH)+1));	// ����
		System.out.println("�� : " + gc.get(GregorianCalendar.SECOND));
		System.out.println("�� : " + gc.get(GregorianCalendar.YEAR));
		
		gc.set(2020, 5-1, 27);
		gc.set(2008, 2-1, 29);
		System.out.println(gc.getTime());
}
}