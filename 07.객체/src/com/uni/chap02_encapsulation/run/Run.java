package com.uni.chap02_encapsulation.run;

import com.uni.chap02_encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student u = new Student();
		/*
		 * 직접 접근 을 통한 초기화 -->private 로 접근제한 되어 직접 접근이 불가능함
		 * u.name = "유재석";
		   u.age = 20;
		   u.height = 180.02;
		   u.kor = 90;
		   u.math = 100;
		 */

		u.setName("유재석");
		u.setAge(20);
		u.setheight(180.02);
		u.setKor(90);
		u.setMath(100);
		//직접 접근을 통한 값 가져오기
	    //System.out.println(u.name+"님의 나이는"+ u.age + "이고,국어점수는 "+ u.kor +"이고 수학점수는"+u.math+"이다");
		System.out.println(u.getName()+"님의 나이는"+ u.getAge() + "이고,국어점수는 "+ u.getKor() +"이고 수학점수는"+u.getMath()+"이다");
		
		System.out.println(u.information());
	}

}
