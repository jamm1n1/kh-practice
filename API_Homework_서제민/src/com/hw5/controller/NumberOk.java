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
			
			System.out.println("1���� 100 ������ ������ �ϳ� �Է��ϼ���: ");
			int num = sc.nextInt();
			sc.nextLine();
            if(ran != num) {
				
				if(ran > num) {
					count++;
					System.out.println(num+"���� Ů�ϴ�."+ count + "��° ����!!");
					
				} else {
					count++;
					System.out.println(num+"���� �۽��ϴ�."+ count + "��° ����!!");
				}
				
			} else if (ran == num){
				
				count++;
				System.out.println(count + "�� ���� ������ϴ�!");
				break;
			}
	}
}
}
