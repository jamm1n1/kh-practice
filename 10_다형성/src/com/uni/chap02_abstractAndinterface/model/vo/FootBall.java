package com.uni.chap02_abstractAndinterface.model.vo;
//미완성 클래스 : 클래스 estens(하나만 상속가능)
//인터페이스 : implements(여러개 적을 수 있다.)

public class FootBall extends Sports implements ISports1{

	@Override
	public void rule() {
		System.out.println("손이아닌 발로 공을 찬다.");
		
		
	}

	@Override
	public void startTime() {
		System.out.println("인터페이스 ISports2 메소드 stratTime()");
		
	}

	@Override
	public void endTime() {
		
		System.out.println("인터페이스 ISports2 메소드 endTime()");
	}


	@Override
	public void rule1() {
		
		System.out.println("인터페이스 ISports2 메소드 rule1()");
		
	}

}
