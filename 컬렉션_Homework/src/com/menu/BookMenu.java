package com.menu;

import java.util.ArrayList;
import java.util.Scanner;

import com.manager.BookManager;
import com.uni.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookManager bm = new BookManager();
	
	
	public void mainMenu() {
		System.out.println("*** ���� ���� ���α׷� ***");
		System.out.println("1. �� ���� �߰� ");
	    System.out.println("2. ���� ���� ");
	    System.out.println("3. ���� �˻� ��� ");
	    System.out.println("4. ��ü ��� ");
	    System.out.println("0. ���� ���� ");
	    System.out.println("�޴� ��ȣ ����");
	    int num = sc.nextInt();
	    while(true) {
	    	switch(num) {
	    	case 1 :
	    		insertBook();
	    		break;
	    	case 2 :
	    		deleteBook();
	    		break;
	    	case 3 :
	    		searchBook();
	    		break;
	    	case 4 :
	    		selectList();
	    		break;
	    	case 0 :
	    	}
	    }
	}
	public void insertBook() {
		 sc.nextLine();
		System.out.println("���� ���� : ");
		String title = sc.nextLine();
		System.out.println("���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ)");
		int category = sc.nextInt();
				
		System.out.println("���� ���� : ");
		
		String author = sc.nextLine();
		Book book = new Book(title,category,author);
	    bm.insertBook(book);
		
		
	}
	public void deleteBook() {
		System.out.println("���� ��ȣ : ");
		int bNo = sc.nextInt();
		int result= bm.deleteBook(bNo);
		if(result == 1) {
			System.out.println("���������� ����");
		}else if(result == 0) {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}
			
		}
	public void searchBook() {
		sc.nextLine();
		System.out.println("�˻��� ���� ���� : ");
		String title = sc.nextLine();
		 ArrayList<Book> searchList = bm.searchBook(title);
		 if(searchList.isEmpty()) {
				System.out.println("�˻������ �������� �ʽ��ϴ�.");
			}else {
				for(int i = 0; i<searchList.size(); i++) {
					System.out.println(searchList.get(i));
		 
		 
	}
	}

}
	public void selectList() {
		
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("��������� �������� �ʽ��ϴ�.");
		}else {
			for(int i = 0; i<bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
	}
}