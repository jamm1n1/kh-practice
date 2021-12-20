package com.kh.collection.silsub1.view;

import java.util.Scanner;

import com.kh.collection.silsub1.controller.BoardManager;

public class BoardMenu {
Scanner sc = new Scanner(System.in);
BoardManager bm = new BoardManager();

public void mainMenu() {
	System.out.println("1.게시글 쓰기 : ");
	System.out.println("2.게시글 전체 보기 : ");
	System.out.println("3.게시글 한 개 보기 : ");
	System.out.println("4.게시글 제목 수정 : ");
	System.out.println("5.게시글 내용 수정 : ");
	System.out.println("6.게시글 삭제 : ");
	System.out.println("7.게시글 검색 : ");
	System.out.println("8.파일에 저장하기 : ");
	System.out.println("9.정렬하기 : ");
	System.out.println("10.끝내기 : ");
	System.out.println("메뉴 번호 선택 : ");
    int num = sc.nextInt();
    while(true) {
    	switch(num) {
    	
    	case 1 :
    		
    	case 2 :
    		
    	case 3 :
    		
    	case 4 :
    		
    	case 5 :
    		
    	case 6 :
    		
    	case 7 :
    		
    	case 8 :
    		
    	case 9 :
    		sortSubMenu();
    	case 10 :
    		return ;
    	}
    }
}
public void sortSubMenu() {
	System.out.println("****** 게시글 정렬 메뉴 *******");
	System.out.println("1.글번호순 오름차순 정렬 : ");
	System.out.println("2.글번호순 내림차순 정렬 : ");
	System.out.println("3.작성날짜순 오름차순 정렬 : ");
	System.out.println("4.작성날짜순 내림차순 정렬 : ");
	System.out.println("5.글제목순 오름차순 정렬  : ");
	System.out.println("6.글제목순 내림차순 정렬 : ");
	System.out.println("7.이전메뉴로 이동 : ");
	int num1 = sc.nextInt();
	 while(true) {
	    	switch(num1) {
	    	
	    	case 1 :
	    		
	    	case 2 :
	    		
	    	case 3 :
	    		
	    	case 4 :
	    		
	    	case 5 :
	    		
	    	case 6 :
	    		
	    	case 7 :
	    		return;
	    	}
	 }
}
}
