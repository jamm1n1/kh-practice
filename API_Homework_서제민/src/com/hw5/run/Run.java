package com.hw5.run;

import java.util.Scanner;

import com.hw5.controller.NumberOk;

public class Run {

	public static void main(String[] args) {
		
		
			NumberOk n = new NumberOk();
			Scanner sc = new Scanner(System.in);
			while(true) {
			n.numGame();	
			
			System.out.println("��� �Ͻðڽ��ϱ�?(y/n): ");
			String ch = sc.nextLine();
			
			if(ch.equalsIgnoreCase("y")) {// ��ҹ��� ���о��� ��
				System.out.println("���ο� ������ �����մϴ�!!");
				n.numGame();
				
			} else if (ch.equalsIgnoreCase("n")) {
				System.out.println("������ �����մϴ�.");
				break;
				
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");

			}
			
		}
		return;
}
	
}


