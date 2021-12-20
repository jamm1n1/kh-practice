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
		
		System.out.println("�� �Խñ� ���� �Դϴ�.");
		System.out.println("�� ���� : ");
		String title = sc.nextLine();
		System.out.println("�ۼ��� : ");
		String writer = sc.nextLine();
		Date d =new Date();
		
		System.out.println("�� ���� : ");
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
	System.out.println("��ȸ�� �� ��ȣ : ");
	int serch = sc.nextInt();
	Board b = bd.displayBoard(serch);
	System.out.println(b);
	bd.upReadCount(serch);
	if(b == null) {
		System.out.println("��ȸ�� ���� �����ϴ�");
		return;
	}
	}
	public void modifyTitle() {
		System.out.println("������ �� ��ȣ : ");
		int no = sc.nextInt();
		Board b = bd.displayBoard(no);
		System.out.println(b);
		if(b == null) {
			System.out.println("��ȸ�� ���� �����ϴ�");
			return;
		}
		System.out.println("������ �� ���� : ");
		String title = sc.nextLine();
		bd.modifyTitle(no, title);
		
	}
	public void modifyContent() {
		System.out.println("������ �� ��ȣ : ");
		int no = sc.nextInt();
		Board b =bd.displayBoard(no);	
		if(b == null) {
			System.out.println("��ȸ�� ���� �����ϴ�");
			return;
		}
		System.out.println(no);
		System.out.println("������ �� ���� : ");
		sc.nextLine();
		String title = sc.nextLine();
		bd.modifyContend(no, title);
		
	}
	public void deleteBoard() {
		System.out.println("������ �� ��ȣ : ");
		int delete = sc.nextInt();
		Board b = bd.displayBoard(delete);
		if(b == null) {
			System.out.println("��ȸ�� ���� �����ϴ�");
			return;
		}
		System.out.println(delete);
		System.out.println("������ �����Ͻðڽ��ϱ�? (y/n) :");
		String ch = sc.nextLine();
		if(ch.equalsIgnoreCase("y")) {
			bd.deleteBoard(delete);
			System.out.println("�����߽��ϴ�.");
		}else {
			System.out.println("������ ��ҵǾ����ϴ�.");
		}
			
			
			}

	public void serachboard() {
		System.out.println("�˻��� ���� : ");
		sc.nextLine();
	    String title = sc.nextLine();
	    ArrayList<Board> list = bd.searchBoard(title); //list �ιޱ�
	    if(list.size() == 0) {
			System.out.println("�˻� ����� �����ϴ�");
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
