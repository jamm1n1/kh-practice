package com.hw5.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;

	public NumberOk() {}

	public void numGame() {
Scanner sc  = new Scanner(System.in);
		
		ran = (int)(Math.random() * 100 +1);
		int count = 0;
		
		while (true) {
			
			System.out.println("1부터 100 사이의 정수를 하나 입력하세요: ");
			int num = sc.nextInt();
			sc.nextLine();
            if(ran != num) {
				
				if(ran > num) {
					count++;
					System.out.println(num+"보다 큽니다."+ count + "번째 실패!!");
					
				} else {
					count++;
					System.out.println(num+"보다 작습니다."+ count + "번째 실패!!");
				}
				
			} else if (ran == num){
				
				count++;
				System.out.println(count + "번 만에 맞췄습니다!");
				break;
			}
	}
}
}
