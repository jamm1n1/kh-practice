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
	/*1478 �� "one4seveneight"
	234567 �� "23four5six7"
	10203 �� "1zerotwozero3"*/
	Scanner sc = new Scanner(System.in);
    public void kakao() {
    	String s = sc.nextLine();
        String [] Arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < Arr.length; i++) {
			s = s.replaceAll(Arr[i],String.valueOf(i)); // replaceAll ���ʿ��ִ°� �����ʰɷ� �ٲٴ°�
			System.out.println(s);                      //n.valueOf(i) �տ� int,String�� �� ���������� ��ȯ���ش� .
		}
     
}	
}
  


	
