package com.uni.chap06_constructor.run;

import com.uni.chap06_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. �⺻�����ڷ� ��ü�� ���� �� �ش簴ü ���� ��� 
		User u1 = new User() ;
		System.out.println(u1); //JVM�� �ʱⰪ�� ����ִ»���
		
		
		//2.�Ű����� 3��¥�� �����ڷ� ��ü ����
		User u2 = new User("user02","pass02","����ȣ");
		System.out.println(u2);
		//3.�ٸ� �Ű����� �����ڷ� ��ü���� 
		User u3 = new User("user03","pass03","����ȣ",19,'M');
		System.out.println(u3);
		
		
		
	}

}
