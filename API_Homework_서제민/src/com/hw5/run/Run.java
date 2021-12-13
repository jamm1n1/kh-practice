package com.hw5.run;

import java.util.Scanner;

import com.hw5.controller.NumberOk;

public class Run {

	public static void main(String[] args) {
		
		
			NumberOk n = new NumberOk();
			Scanner sc = new Scanner(System.in);
			while(true) {
			n.numGame();	
			
			System.out.println("계속 하시겠습니까?(y/n): ");
			String ch = sc.nextLine();
			
			if(ch.equalsIgnoreCase("y")) {// 대소문자 구분없이 비교
				System.out.println("새로운 게임을 시작합니다!!");
				n.numGame();
				
			} else if (ch.equalsIgnoreCase("n")) {
				System.out.println("게임을 종료합니다.");
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");

			}
			
		}
		return;
}
	
}


