package com.uni.chap02_abstractAndinterface.model.vo;
//�̿ϼ� Ŭ���� : Ŭ���� estens(�ϳ��� ��Ӱ���)
//�������̽� : implements(������ ���� �� �ִ�.)

public class FootBall extends Sports implements ISports1{

	@Override
	public void rule() {
		System.out.println("���̾ƴ� �߷� ���� ����.");
		
		
	}

	@Override
	public void startTime() {
		System.out.println("�������̽� ISports2 �޼ҵ� stratTime()");
		
	}

	@Override
	public void endTime() {
		
		System.out.println("�������̽� ISports2 �޼ҵ� endTime()");
	}


	@Override
	public void rule1() {
		
		System.out.println("�������̽� ISports2 �޼ҵ� rule1()");
		
	}

}
