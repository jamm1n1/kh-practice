package com.uni.part02_scheduling.run;

import com.uni.part02_scheduling.model.thread.Thread3;

public class Run {

	public static void main(String[] args) {
		
		Thread3 th3 = new Thread3();
		
		for(int i = 1; i <=100; i++) {
			Thread th = new Thread(th3);//�켱���� �⺻�� 5
			
			if(i % 2  == 0) {
				th.setPriority(Thread.MAX_PRIORITY);//10
				th.setName("thread ¦�� : "+ i);
			}else {
				th.setPriority(Thread.MIN_PRIORITY);//10
				th.setName("thread Ȧ�� : "+ i);
			}
			th.start();
		}
	    

	}

}
