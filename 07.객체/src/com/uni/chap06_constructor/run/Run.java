package com.uni.chap06_constructor.run;

import com.uni.chap06_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 기본생성자로 객체를 생성 후 해당객체 정보 출력 
		User u1 = new User() ;
		System.out.println(u1); //JVM의 초기값이 담겨있는상태
		
		
		//2.매개변수 3개짜리 생성자로 객체 생성
		User u2 = new User("user02","pass02","유야호");
		System.out.println(u2);
		//3.다른 매개변수 생성자로 객체생성 
		User u3 = new User("user03","pass03","무야호",19,'M');
		System.out.println(u3);
		
		
		
	}

}
