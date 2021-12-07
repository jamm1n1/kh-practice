package com.hw1.run;

import com.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
	NonStaticSample n = new NonStaticSample();
	System.out.print("랜덤 값 : ");
	n.printLottoNumbers();
	System.out.println();
	System.out.print("a문자 5개 출력");
	n.outputChar(5, 'a');
	System.out.println();
	System.out.print("랜덤 영문자 출력 : ");
    char a = n.alphabette();
    System.out.println(a);
    System.out.println("apple의 2번 4번 인덱스 사이의 값 출력 : ");
	String result=n.mySybstring("apple", 3, 2);
	System.out.println(result);
}
}