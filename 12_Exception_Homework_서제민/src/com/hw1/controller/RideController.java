package com.hw1.controller;

import com.hw1.model.vo.Guests;
import com.hw1.model.vo.RollerCoaster;

public class RideController {

	public void cutGuest() {
	Guests[] gs = new Guests[4];
	{
	gs[0] = new Guests("ȫ�浿", 17, 'M', 120.2);
	gs[1] = new Guests("������", 20, 'F', 102.3);
	gs[2] = new Guests("������", 23, 'M', 110.4);
	gs[3] = new Guests("�����", 21, 'M', 112.5);
	}
	Guests[] onBoard = new Guests[RollerCoaster.PERMITNUMBER];
	
	try {
		int adult = 0;
		for(int i = 0; i < gs.length; i++) {
			if(gs[i].getHeight()>RollerCoaster.CUTHEIGHT) {
			onBoard[adult++] = gs[i];
			}
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		String str = e.getMessage();
		System.out.println("������ �߻��� �ش� �迭�� �ε��� ��ȣ : " +e.getMessage());
		
}finally{
	System.out.println("�ο��� ���� á���ϴ�.");
	System.out.println("�̹� ���� ž�� ��� :");
	for(int i = 0; i < onBoard.length; i++)	{
	System.out.println(onBoard[i].toString());
	}
	System.out.println("ž���� ��� : "+(RollerCoaster.PRICE*2));
	}
}
	}
