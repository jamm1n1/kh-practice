package com.uni.variable;//A_Variable 디폴트 패키지로 만든 것 과 다른패키지 이므로 같은 클래스 명을 적어도 에러가 나지않는다. 

public class A_Variable {
	// 변수란 : 어떠한 값을 메모리에 기억하기 위한 공간이다 (박스같은개념)
	/*
	 * 변수를 사용하는 이유 : 변수는 우선적으로 값에 의미를 부여하기위한 목적으로 사용 한다. (가독성이 좋아짐) 또한 한번값을 저장해두고 계속
	 * 사용할 목적으로 사용된다.
	 * 
	 * -> 유지보수를 쉽게 하기위한 목적
	 */

	public void printValue() {
		System.out.println("변수사용전");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);

		double PI = 3.141592648;
		int r = 10;
		int h = 20;
		System.out.println("변수사용후");
		System.out.println(2 * PI * r);
		System.out.println(PI * r * r);
		System.out.println(PI * r * r * h);
		System.out.println(4 * PI * r * r);

	}

	public void declareVariable() {
		/*
		 * 변수의 선언 (저장할 값을 기록하기 위한 변수를 메모리 공간에 확보해놓는 과정) == 변수(박스)만들겠다!! [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 대해 변수(박스)의 크기 및 모양을 정하는 부분 변수명 : 변수(박스)의
		 * 이름을 정하는 부분 (의미부여) -> 여기서 지정한 이름으로 앞으로 호출
		 * 
		 * 주의할점 - 변수명은 반드시 첫 문자가 소문자여야된다. - 하지만 여러단어로 엮어 있는경우 연결되는 단어의 첫글자는 대문자 - 동일한
		 * 변수명으로 선언 불가 - 해당 영역({})에 선언한 변수는 해당 지역 안에서만 꺼내 쓸수 있다. (다른 메소드에서는 사용 불가) ==
		 * 지역변수 개념
		 * 
		 */

		// 자료형에 대한 개념

		// 1. 논리형 boolean isTrue; // true(1), false(0)

		// 2. 숫자형 // 2_1. byte bNum; // 1byte short sNum; // 2byte int iNum; // 4byte
		// -> 정수형 중에서 가장 대표적인 자료형 (기본형) -21억~21억xxx 값이 담기는 자료형 long iLum; // 8byte

		// 2_2 실수형 float fNum; // 4byte double dNum; // 8byte -> 실수형 중에서 가장 대표적인
		// 자료형(기본형)

		// 3. 문자형 char ch; // 2byte

		// -------------------여기까지 기본자료형 (8개)

		// 4. 문자열(참조자료형) String str;

		/*
		 * 변수에 값 대입 위에서 값을 담기위한 공간을 확보했다면 해당 변수에 값 대입 가능
		 * 
		 * [표현법] 변수명 = 값;
		 * 
		 * 
		 * /* isTrue = true;
		 * 
		 * bNum = 1; sNum = 2; iNum = 5; iLum = 8L;// L붙여야함
		 * 
		 * fNum = 4.0f;// 반드시 f 를 붙여야함 dNum = 8.0; // d를 붙이지 않아도 됨
		 * 
		 * ch = 'A';// 따옴표를 사용해서 값대입 // ch = 'ABC';// 문자에는 한문자 값이 저장됨. 에러 ch = '강';
		 * 
		 * str = " ABC "; // 쌍따옴표를 사용해서 값 대입 str = " A "; // 한개의 문자만 쓰더라도 쌍따옴표
		 * 
		 * System.out.println("isTrue값" + isTrue); System.out.println("bNum값" + bNum);
		 * System.out.println("sNum값" + sNum); System.out.println("iNum값" + iNum);
		 * System.out.println("iLum값" + iLum); System.out.println("fNum값" + fNum);
		 * System.out.println("dNum값" + dNum); System.out.println("ch값" + ch);
		 * System.out.println("str값" + str);
		 * 
		 * // ctrl + shift + f 정렬
		 * 
		 */}

	public void initVariable() {
		/*
		 * 변수 선언과 동시에 초기화 (=값대입) [표현법] 자료형 변수명 = 값;
		 */
		byte bNum = 5;
		short sNum = 16;
		int iNum = 15 + 17;
		long iLum = 9234233L;

		float fNum = 7.0f;// 반드시 f 를 붙여야함
		double dNum = 125.0; // d를 붙이지 않아도 됨

		char ch = '나';// 따옴표를 사용해서 값대입
		// ch = 'ABC';// 문자에는 한문자 값이 저장됨. 에러
		char ch1 = '랑';

		String str = " 너의 그한미디 말도 "; // 쌍따옴표를 사용해서 값 대입
		String str1 = " 에잉 ";

		System.out.println("bNum값" + bNum);
		System.out.println("sNum값" + sNum);
		System.out.println("iNum값" + iNum);
		System.out.println("iLum값" + iLum);
		System.out.println("fNum값" + fNum);
		System.out.println("dNum값" + dNum);
		System.out.println("ch값" + ch);
		System.out.println("ch1값" + ch1);
		System.out.println("str값" + str);
		System.out.println("str1값" + str1);

		// 변수 명명 규칙

		//int number;
		// 1) 변수명이 같으면 에러 발생
		// int number;

		// 2) 대소문자 구분
		//int numBer;

		// 3)예약어(이미 자바에서 사용되고 있는 키워드)사용하면 에러발생
        //예) int true
		// int class
		
		//4) 숫자 가능 (단, 숫자로 시작하는 것은 안됨)
		//예) int 1age;
		
		//5) 특수문자가능(단 _ $이외의 특수문자는 불가능)
		
		//6) 여러단어로된 변수명일경우, 붙여쓰고    연결돠눈 단어의 첫글자 대문자 
		//Stirng username;//관례상 틀림
		//Srirng userName;//관례상 맞는표현 

		//String 이름;//한글도 잘 사용 하지않는다.
		
		
	}
	public void  quest () {
		boolean v1 = false;
		char v2 = '가';
		double v3 = 3.14;
		int v4 = 30;
		String v5 = "aaa";
				
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}	
}
