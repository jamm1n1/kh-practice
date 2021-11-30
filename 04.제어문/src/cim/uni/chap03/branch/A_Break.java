package cim.uni.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method01() {
		//break : 가장 가까운 반복문을 빠져나가는 문구
				// 단 switch 문안의 break는 switch문을 빠져나가는 break문
	Scanner sc = new Scanner(System.in);
	/*for(;;) {
	System.out.println("문자열 입력 : ");
	String str = sc.nextLine();
	System.out.println(str);
}*/
/*while() {  -> 조건식을 적어줘야한다. 
	System.out.println("문자열 입력 : ");
	String str = sc.nextLine();
	System.out.println(str);
}*/
		
	String str="";
	while(true) {
		System.out.println("문자열을 입력해 주세요");
		str = sc.nextLine();
		if(str.equals("exit")) {
			break;
		}
	  System.out.println("str : "+ str);
	}
		
		
		System.out.println("exit를 입력해서 종료되었습니다");
		//무한 반복문 안에서break 가 없는경우 다음 코드 오류 ->unreachable code 절대 도달할 수 없는코드, 즉 절대 실행될일 없는 코드이다 
}
	public void method02() {
		// 매번 반복적으로 랜덤값 (1~10) 을 발생시킨후 출력
				// 단, 그 랜덤값이 홀수일 경우 출력 하지않고 반복문을 빠져나간후 " 프로그램을 종료 합니다 " 출력
		while(true) {
			int random = (int)(Math.random() * 10 + 1);
			
			if(random % 2 == 1 ) {
				break;
			}
			System.out.println("랜덤값"+ random);
		
		}
		System.out.println("프로그램을 종료합니다. ");
	}
}