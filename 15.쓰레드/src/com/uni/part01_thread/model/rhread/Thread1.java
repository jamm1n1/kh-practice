package com.uni.part01_thread.model.rhread;

//������ ����
//1.Thread��ӹޱ� 
public class Thread1 extends Thread{

	@Override
	public void run() {
		
		super.run();
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println("������ 1["+ i +"]");
		}
	}

	
}
