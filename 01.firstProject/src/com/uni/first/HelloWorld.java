package com.uni.first;//유사한 클래스를 묶어주는 패키지 선언 
/**
 * 
 * @author SEOJEMIN
 * 최초작성자 :
 * DATE:
 * 설명 :
 * **/
//ctrl + y 실행을 앞으로
//public : 메인메소드는 외부에서 호출 할 수 있다.(접근제어자)
//static : 객체를 생성하지 않고도 실행 시킬 수 있다.
//void : 반환값이 없다
public class HelloWorld {//클래스 
	
	public static void main(String[] args) {//실행메소드
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.println("HelloWorld");//출력문
        System.out.println("안녕하세요");//syso 적고 컨트롤 + 스페이스
       System.out.print("안녕하세요"); // \n -> 줄바꿈
    
	}

}
