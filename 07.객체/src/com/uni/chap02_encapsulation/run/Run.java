package com.uni.chap02_encapsulation.run;

import com.uni.chap02_encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student u = new Student();
		/*
		 * ���� ���� �� ���� �ʱ�ȭ -->private �� �������� �Ǿ� ���� ������ �Ұ�����
		 * u.name = "���缮";
		   u.age = 20;
		   u.height = 180.02;
		   u.kor = 90;
		   u.math = 100;
		 */

		u.setName("���缮");
		u.setAge(20);
		u.setheight(180.02);
		u.setKor(90);
		u.setMath(100);
		//���� ������ ���� �� ��������
	    //System.out.println(u.name+"���� ���̴�"+ u.age + "�̰�,���������� "+ u.kor +"�̰� ����������"+u.math+"�̴�");
		System.out.println(u.getName()+"���� ���̴�"+ u.getAge() + "�̰�,���������� "+ u.getKor() +"�̰� ����������"+u.getMath()+"�̴�");
		
		System.out.println(u.information());
	}

}
