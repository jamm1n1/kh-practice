package com.uni.chap04_field.model.vo;

public class FieldTest1 {
	/*
	 * 클래스 == "필드" + 생성자 + 메소드   의 조합
	 * 
	 * >> 변수구분
	 * 
	 * - 전역변수 : 클래스 영역에 바로 선언하는 변수 --> 클래스 내에서면 어디서든 사용 가능
	 * - 지역변수 : 클래스 영역안의 어떤 특정한 구역 ({})에 선언하는 변수  --> 그 지역에서만 사용 가능
	 *           메소드, 제어문(if, for) 등등 
	 *           
	 * 1. 전역변수
	 * -  멤버변수 (인스턴스 변수)
	 *    생성 시점 : new 연산자를 통해서 객체 생성 시 멤버변수 --> 메모리 할당
	 *    소멸 시점 : 객체 소멸 시 같이 소멸
	 *    
	 * -  클래스변수 (static 변수) : static이라는 예약어가 붙은 변수
	 *    생성 시점 : 프로그램 실행(해당 객체 생성이 안되도)과 동시에 무조건 static 메모리 영역에 할당
	 *    소멸 시점 : 프로그램이 종료될 때 소멸
	 *    >> 클래스변수는 어떤걸 의미하냐면 프로그램 실행과 동시에 메모리에 올려놓고 공유하면서 쓸 목적으로 선언하는거임!!
	 * 
	 * 2. 지역변수
	 *    생성 시점 : 특정한 구역({}) 실행(호출)시 메모리 영역에 할당 (ex. 메소드 실행시)
	 *    소멸 시점 : 특정한 구역({}) 종료 시 소멸 (ex. 메소드 종료시)
	 *    
	 */
	
	//변수선언 위치에 따른 구분을 보기 위한 클래스 (전역,지역,매개)
	
	// 멤버변수(인스턴스 변수) == 필드 
	private int global;
	
	public FieldTest1() {
		// TODO Auto-generated constructor stub
	}
	public void test(int num) {//test 메소드 영역이 시작
		// num -> 매개변수 (메소드 괄호안에 작성하는 변수), 일종의 지역변수, 이 메소드 영역 안에서만 사용 
		
		//지역변수(특정구역 , 즉 메소드영역 내에서 작성하는 변수)
		int local = 10 ;//지역변수는 접근제한자를 붙이지 않는다 
		
		System.out.println(global);
		System.out.println(local);//지역변수는 반드시 초기화하자
		
		System.out.println(num);//매개 변수는 메소드 호출시 반드시 값이 전달이 되어온다.
		
	}//test 메소드 영역 끝 --> 지역변수 소멸 
	
}
