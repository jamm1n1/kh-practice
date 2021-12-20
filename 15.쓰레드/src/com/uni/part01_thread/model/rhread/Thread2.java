package com.uni.part01_thread.model.rhread;
//2. Runnable 인터페이스 구현 하는 방법
public class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10 ; i++) {
			System.out.println("쓰레드 2 ["+ i +"]");
		}
	}

}
