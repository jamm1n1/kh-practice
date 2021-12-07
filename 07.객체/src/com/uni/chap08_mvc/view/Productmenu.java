package com.uni.chap08_mvc.view;

import java.util.Scanner;

import com.uni.chap08_mvc.controller.ProductController;
//mvc 패턴중 view 패키지 : 사용자가 보게될 화면을 담당하는 부분 , 사용자가 보게되면 (print구문)은 반드시 view 패키지 내에서만 작성.
//scanner 사용도 view 패키지 안에서만 작성

public class Productmenu {


		private Scanner sc = new Scanner(System.in);//입력 하기위한 Scanner객체를 전역변수로 미리 생성해놓기
		private ProductController  pc = new ProductController();// 사용자가 키보드로 값을 입력하고 어떤기능을 요청하는 경우 
		                                                        // 현재 이 클래스에서 처리하는것이아니고  Controller 에서 처리하도록 메소드를 호출 할 것이기 떄문에 미리생성
		
		
		
		//1.프로그램 시작하자마자 실행될 메소드
		public void mainMenu() {
			System.out.println("제품명 : ");
			String name = sc.nextLine();
			
			System.out.println("브랜드명 : ");
			String brand = sc.nextLine();
			
			System.out.println("가격 : ");
			int price = sc.nextInt();
			
			pc.insertproduct(name,brand,price);
			
			while(true) {
			 System.out.println("=====메인메뉴=====");
			 System.out.println("1.제품정보조회");
			 System.out.println("2.제품정보수정");
			 System.out.println("9.프로그램종료");
			 
			 int num = sc.nextInt();
			 sc.nextLine();
			 
			 switch(num) {
			 case 1 :
				 System.out.println(pc.selectProduct().information());
				 break;
			 case 2 :
				 updatePrice();
				 break;
			 case 9 : 
				 System.out.println("프로그램을 종료합니다");
				 return;
				 default :
					 System.out.println("메뉴를 다시 선택해 주세요 ");
					 break;
			 }
			}
		}
			private void updatePrice() {
			 System.out.println("수정할 가격을 입력해주세요 : "  );
			 int nPrice = sc.nextInt();
			 pc.updateprice(nPrice);
																	
		}
	}

