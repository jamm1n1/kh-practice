package com.uni.chap07_method.part2_overloadingTest;

public class Overloading {

	//오버로딩 : 한클래스 내에서 같은 메소드 명으로 정의할 수 있는 방법
	public void test() {}
		
		//public void test() {}
	public void test(int a ) {}
	
	public void test (int a , String s) {}
	
	public void test (String a , String s) {}
	
	public void test (int a , int b) {}
	
//	public void test (int c , int d) {} //매개변수명은 상관없이 자료형의 갯수와 순서 , 타입이 다르게 작성 되어야함
	
	public void test (int a , int b , String str) {}
	
	//public void test (int a , int b , String str) {}//반환형은 상관이 없다. 매개변수가 동일 해서 에러발생
	
	//private void test (int a , int b , String str) {}// 접근제한자는 상관없다. 매개개변수가 동일해서 에러발생
	
	/*결론
	 * 오버로딩: 동일한 메소드 명을 사용하는 것 , 매개변수의 자료형과 갯수 , 순서가 다르게 작성되어야 한다. (접근제한자,반환형은 상관없음)
	 */
}
