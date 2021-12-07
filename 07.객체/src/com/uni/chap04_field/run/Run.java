package com.uni.chap04_field.run;

import com.uni.chap04_field.model.vo.FieldTest1;
import com.uni.chap04_field.model.vo.FieldTest2;
import com.uni.chap04_field.model.vo.FieldTest3;
import com.uni.chap04_field.model.vo.FieldTest4;



public class Run {

	public static void main(String[] args) {
		
		//------------------1. fieldTest1
		//FieldTest1 f1 = new FieldTest1();
		
		//f1.test(20);

		
		//------------------2. fieldTest2
	/*	
		FieldTest2 f2 = new FieldTest2();
		
		//public --> 어디서든 접근가능
		System.out.println(f2.pub);
		
		//protected --> 같은패키지내, 상속구조에서만 접근가능
		//System.out.println(f2.pro); -->다른패키지이면서, 상속구조도 아니기때문에 접근불가
		System.out.println(f2.getPro());
		
		//defualt --> 같은패키지 내에서만 사용가능 
		//System.out.println(f2.def); -- > 다른패키지이기떄문에 접근 불가
		System.out.println(f2.getDef());
		
		//private --> 같은 클래스 내에서만 접근가능 
		//System.out.println(f2.pri);
		System.out.println(f2.getPri());*/
		
		
		//------------------3. fieldTest3
		
		//FieldTest3 f3 = new FieldTest3(); 객체생성 할 필요없음 
		//public static
	   System.out.println(FieldTest3.pubSta);//객체생성 필요없이 바로 클래스명 으로 접근가능하다
	   System.out.println(Math.PI);
	   FieldTest3.pubSta="값변경";//수정가능
	   System.out.println(FieldTest3.pubSta);
	   //private static
	 //  System.out.println(FieldTest.prista);//private 이기떄문에 바로 접근 안됨
	   System.out.println(FieldTest3.getPriSta());
	   
	   
	 //------------------4. fieldTest4
	   
	  System.out.println(FieldTest4.NUM);
	  //FieldTest4.NUM = 3 ; 수정불가
	}

}
