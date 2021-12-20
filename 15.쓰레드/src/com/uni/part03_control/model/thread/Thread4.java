package com.uni.part03_control.model.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		
		
			try {
				for(int i = 1; i<=10; i++) {
				Thread.sleep(1000);
				
				System.out.println(i+"초");
				}
				
				System.out.println("카운트 종료.");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	
	
}
