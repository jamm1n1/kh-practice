package com.uni.part01_thread.run;

import com.uni.part01_thread.model.rhread.Thread1;
import com.uni.part01_thread.model.rhread.Thread2;

public class Run {
	// Runnable �������̽� vs Thread Ŭ������ ������
		// - Runnable �������̽��� ������ȭ �� �� �ִ� �޼ҵ� run() �޼ҵ带 �������ִ�. 
		// - Thread Ŭ������ Runnable �������̽��� �����ϰ� ������ �����带 Ȱ��ȭ �ϴ� start() �޼ҵ带 �������ִ�.
		// - Thread Ŭ������ Thread ���¸� ���� �� �� �ִ� �޼ҵ带 ������ �ִ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread1 th1 = new Thread1();
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);
		
		//th1.run
		//th.run
		
		th1.start();
		th.start();
		
		System.out.println("���� �޼ҵ�");
		
		//th1.start(); �ѹ��� ��� �� ���ִ�.
	}

}
