package com.uni.part01_thread.model.rhread;
//2. Runnable �������̽� ���� �ϴ� ���
public class Thread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10 ; i++) {
			System.out.println("������ 2 ["+ i +"]");
		}
	}

}
