package com.hw1.controller;

import com.hw1.model.vo.Guests;
import com.hw1.model.vo.RollerCoaster;

public class RideController {

	public void cutGuest() {
	Guests[] gs = new Guests[4];
	{
	gs[0] = new Guests("홍길동", 17, 'M', 120.2);
	gs[1] = new Guests("유관순", 20, 'F', 102.3);
	gs[2] = new Guests("김유신", 23, 'M', 110.4);
	gs[3] = new Guests("김흥부", 21, 'M', 112.5);
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
		System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : " +e.getMessage());
		
}finally{
	System.out.println("인원이 가득 찼습니다.");
	System.out.println("이번 차례 탑승 명단 :");
	for(int i = 0; i < onBoard.length; i++)	{
	System.out.println(onBoard[i].toString());
	}
	System.out.println("탑승자 요금 : "+(RollerCoaster.PRICE*2));
	}
}
	}
