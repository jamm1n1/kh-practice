package com.uni.part01_thread.run;

import com.uni.part01_thread.model.rhread.Thread1;
import com.uni.part01_thread.model.rhread.Thread2;

public class Run {
	// Runnable 인터페이스 vs Thread 클래스의 차이점
		// - Runnable 인터페이스는 스레드화 될 수 있는 메소드 run() 메소드를 가지고있다. 
		// - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고있다.
		// - Thread 클래스는 Thread 상태를 제어 할 수 있는 메소드를 가지고 있다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread1 th1 = new Thread1();
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);
		
		//th1.run
		//th.run
		
		th1.start();
		th.start();
		
		System.out.println("메인 메소드");
		
		//th1.start(); 한번만 사용 할 수있다.
	}

}
