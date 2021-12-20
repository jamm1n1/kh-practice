package com.uni.part01_thread.model.rhread;

//쓰레드 생성
//1.Thread상속받기 
public class Thread1 extends Thread{

	@Override
	public void run() {
		
		super.run();
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println("쓰레드 1["+ i +"]");
		}
	}

	
}
