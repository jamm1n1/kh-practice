package com.uni.part03_control.model.thread;

import java.util.Scanner;

public class InterruptSample {

	public void sleepInterrupt() {
		Thread5 th5 = new Thread5();
		Thread th = new Thread(th5);
		
		th.start();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ����̳� �Է��ϼ���");
		String input = sc.nextLine();
		
		
		System.out.println("�Է��� ��"+ input);
		
		th.interrupted(); //�Ͻ������� �ϰ����ִ� ��ɾ�
	}
}
