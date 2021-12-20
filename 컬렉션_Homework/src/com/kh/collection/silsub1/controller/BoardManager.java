package com.kh.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub1.model.dao.BoardDao;
import com.kh.collection.silsub1.model.vo.Board;


public class BoardManager {
BoardDao bd = new BoardDao();

Scanner sc = new Scanner(System.in);
	public void writeBoard() {
		
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.println("글 제목 : ");
		String title = sc.nextLine();
		System.out.println("작성자 : ");
		String writer = sc.nextLine();
		Date d =new Date();
		
		System.out.println("글 내용 : ");
		String n = sc.nextLine();
		if(n.equals("exit")) {
	    
		}
		int num= bd.getLastBoardNo();
		Board b = new Board(num,title,writer,d);
		try {
			bd.writeBoard(b);
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		
		
	}
	public void displayAllList(){
ArrayList<Board> list =bd.displayAllList();
  Iterator<Board> a1 = list.iterator();
		while(a1.hasNext()) {
		System.out.println(a1.next());
		}
	}
	public void displayBoard() {
	System.out.println("조회할 글 번호 : ");
	int serch = sc.nextInt();
	Board b = bd.displayBoard(serch);
	System.out.println(b);
	bd.upReadCount(serch);
	if(b == null) {
		System.out.println("조회된 글이 없습니다");
		return;
	}
	}
	public void modifyTitle() {
		System.out.println("수정할 글 번호 : ");
		int no = sc.nextInt();
		Board b = bd.displayBoard(no);
		System.out.println(b);
		if(b == null) {
			System.out.println("조회된 글이 없습니다");
			return;
		}
		System.out.println("변경할 글 제목 : ");
		String title = sc.nextLine();
		bd.modifyTitle(no, title);
		
	}
	public void modifyContent() {
		System.out.println("수정할 글 번호 : ");
		int no = sc.nextInt();
		Board b =bd.displayBoard(no);	
		if(b == null) {
			System.out.println("조회된 글이 없습니다");
			return;
		}
		System.out.println(no);
		System.out.println("변경할 글 제목 : ");
		sc.nextLine();
		String title = sc.nextLine();
		bd.modifyContend(no, title);
		
	}
	public void deleteBoard() {
		System.out.println("삭제할 글 번호 : ");
		int delete = sc.nextInt();
		Board b = bd.displayBoard(delete);
		if(b == null) {
			System.out.println("조회된 글이 없습니다");
			return;
		}
		System.out.println(delete);
		System.out.println("정말로 삭제하시겠습니까? (y/n) :");
		String ch = sc.nextLine();
		if(ch.equalsIgnoreCase("y")) {
			bd.deleteBoard(delete);
			System.out.println("삭제했습니다.");
		}else {
			System.out.println("삭제가 취소되었습니다.");
		}
			
			
			}

	public void serachboard() {
		System.out.println("검색할 제목 : ");
		sc.nextLine();
	    String title = sc.nextLine();
	    ArrayList<Board> list = bd.searchBoard(title); //list 로받기
	    if(list.size() == 0) {
			System.out.println("검색 결과가 없습니다");
			return;
		}else {
			for(Board bo : list) {
				System.out.println(bo);
				
			}
		}
	}
	    public void saveListFile() {
			bd.saveListFile();
			
		}
		
		public void sortList(int item, Boolean isDesc) {
			 ArrayList<Board> list =bd.displayAllList();
	
		}
		}
