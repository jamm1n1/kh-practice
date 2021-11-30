package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("ex");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch (num) {

		case 1:
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
		case 9:
			System.out.println("종료 메뉴입니다");
			break;

		}

	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요 : ");
		int a = sc.nextInt();
		
		if(a>0 && a%2==0) {
			System.out.println("짝수다");
		}
		else if (a%2==1) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
		}
		
		
		
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		System.out.print("수학점수 : ");
		int ma = sc.nextInt();
		System.out.print("영어점수 : ");
		int en = sc.nextInt();
		int e=(ko+ma+en)/3;
		int all =ko+ma+en;
		if(ko>=40 && ma>=40 && en>=40 && e>=60) {
			System.out.println("국어 :" +ko);
			System.out.println("수학 :" +ma);
			System.out.println("영어 :" +en);
			System.out.println("합계 :" +all);
			System.out.println("평균 :" +e);
			System.out.println("축하합니다,합격입니다!");
			
		}else {
			System.out.println("불합격입니다.");
		}
}
	public void practice4() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1~12 사이의 정수 입력 : ");
	int season = sc.nextInt();
	
	switch(season){
	case 1 :
	case 2 :
	case 12 :
		System.out.println(season+"월은 겨울입니다.");
		break;
	case 3 :
	case 4 :
	case 5 :
		System.out.println(season+"월은 봄입니다.");
		break;
	case 6 :
	case 7 :
	case 8 :
		System.out.println(season+"월은 여름입니다.");
		break;
	case 9 :
	case 10 :
	case 11 :
		System.out.println(season+"월은 가을입니다.");
		break;
	default :
		System.out.println("잘 못 입력하셨습니다");
		return;
	}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id =sc.nextLine();
		System.out.println("비밀번호 : ");
		int pass =sc.nextInt();
		if(id.equals("user1") && pass ==1234) {
			System.out.println("로그인 성공");
		}
		else if (id.equals("user1") && pass !=1234) {
			System.out.println("비밀번호가 틀렸습니다");						
		}else if(!id.equals("user1") && pass ==1234) {
			System.out.println("아이디가 틀렸습니다");
			
		}else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다");
		}
		//String을 사용할때는 .equals사용해야한다 ㅋㅋㅋㅋㅋㅋ 오늘배웟는데 까먹었엇네

	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String id = sc.nextLine();
		switch (id) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리");
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");
			break;
		case "회원" :
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");
			break;
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default :
			System.out.println("잘 못 입력하셨습니다.");
			return;
		}
	}	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키(m)를 입력해주세요 : ");
		double hi = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double kg = sc.nextDouble();
		double BMI = kg / (hi*hi);
		System.out.println("BMI 지수 : " +BMI);
		if(BMI<18.5) {
			System.out.println("저체중");
		}
		else if(BMI<23) {
			System.out.println("정상체중");
		}
		else if(BMI<25) {
			System.out.println("과체중");
		}
		else if(BMI<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
			
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("피연산자1 입력 : ");
		int a =sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int b =sc.nextInt();
		sc.nextLine();
		System.out.println("연사자를 입력(+,-,*,/,%) : ");
		String c = sc.nextLine();
	
		
				switch (c) {
				case "+" :
					System.out.printf("%d+%d=%d",a,b,a+b);
					break;
				case "-" :
					System.out.printf("%d-%d=%d",a,b,a-b);
					break;
				case "*" :
					System.out.printf("%d*%d=%d",a,b,a*b);
					break;
				case "/" :
					System.out.printf("%d/%d=%d",a,b,a/b);
					break;
				case "%" :
					System.out.printf("%d%%d=%d",a,b,a%b);
					break;
					default :
						System.out.println("잘 못 입력하셨습니다");
				}
		}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("중간 고사 점수 : ");
		int j =sc.nextInt();
		System.out.println("기말 고사 점수 : ");
		int k =sc.nextInt();
		System.out.println("과제 점수 : ");
		int g =sc.nextInt();
		System.out.println("출석 회수 : ");
		int t =sc.nextInt();
		double a = j*0.2;
		double b = k*0.3;
		double c = g*0.3;
		double d = t*5*0.2;
		double all =a+b+c+d;
		
		if(all>=70 && t>14) {
			System.out.println("=======결과=======");
			System.out.println("중간 고사 점수 : "+a);
			System.out.println("기말 고사 점수 : "+b);
			System.out.println("과제 점수 : "+c);
			System.out.println("출석 : "+d);
			System.out.println("총점 : "+all);
			System.out.println("PASS");
		}
		else if(all<=70 && t>14){
			System.out.println("=======결과=======");
			System.out.println("FAIL [점수 미달] "+"(총점"+all+")");
		}
		else if(all>=70 && t<14) {
			System.out.println("=======결과=======");
			System.out.println("FAIL [출석 횟수 부족] "+"("+(int)d+"/20)");
		}else {
			System.out.println("FAIL [출석 횟수 부족] "+"("+(int)d+"/20)");
			System.out.println("FAIL [점수 미달] "+"(총점"+all+")");
		}
		

	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택 : ");
		int a = sc.nextInt();
		
		switch(a) {
		
		case 1 :
		    practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
			
	}
		}
		
		
		
		
}