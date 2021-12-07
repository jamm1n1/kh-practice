package com.uni.chap07_method.part1_merhodTest.run;

import com.uni.chap06_constructor.model.vo.User;
import com.uni.chap07_method.part1_merhodTest.controller.NonStaticMethod;
import com.uni.chap07_method.part1_merhodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
	
	//------------------NonStaticMethod test--------------------------
		NonStaticMethod  test = new NonStaticMethod();
		
		//1. 매개변수 없고 반환ㄱ밧도 없는 메소드
        test.method1();
        
      //2. 매개변수가 없고 반환값은 있는 메소드 - 반환되는 값을 기록하기 위한 변수를 작성해서 받아주자 
        String str = test.method2();
        System.out.println("str : "+ str);
        
      //3.매개변수가 있고 반환값이 없는 메소드 
               
        test.method3(10, 20);
        
        
        //4. 매개변수가 있고 반환값이 없는 메소드 
        
        int result = test.method4(3, 5);
        System.out.println(result);
        
        
        User u1 = new User("user01","pass01" ,"로운" );
        System.out.println(u1.toString());
        
        test.method(u1);
        
        System.out.println(u1.toString());
	//---------------------Static Method test------------------------------
		
		//객체 생성할 필요 없음 -> 이미 프로그램 시작시 올라가있다
		// 클래스명.메소드명([전달값])
		
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("유재석");
		System.out.println(StaticMethod.method4("유재석"));
	} 

	
}
