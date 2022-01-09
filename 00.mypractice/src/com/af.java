package com;


import java.util.Scanner;

public class af {
	/*0	zero
	1	one
	2	two
	3	three
	4	four
	5	five
	6	six
	7	seven
	8	eight
	9	nine*/
	/*1478 → "one4seveneight"
	234567 → "23four5six7"
	10203 → "1zerotwozero3"*/
	Scanner sc = new Scanner(System.in);
    public void kakao() {
    	String s = sc.nextLine();
        String [] Arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < Arr.length; i++) {
			s = s.replaceAll(Arr[i],String.valueOf(i)); // replaceAll 왼쪽에있는거 오른쪽걸로 바꾸는거
			System.out.println(s);                      //n.valueOf(i) 앞에 int,String등 이 붙은값으로 반환해준다 .
		}
     
}	
}
  


	
