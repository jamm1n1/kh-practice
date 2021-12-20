package com.manager;

import java.util.ArrayList;


import com.uni.Book;



public class BookManager {

	ArrayList<Book> bookList = new ArrayList<Book>();

	
	public void insertBook(Book book) {
		bookList.add(book);
		int lastNo = 0;
		try {
		lastNo = bookList.get(bookList.size()-1).getbNo()+1;
		book.setbNo(lastNo);
		bookList.add(book);
		}catch(IndexOutOfBoundsException e) {
			
			lastNo = 1;
			book.setbNo(lastNo);
			bookList.add(0, book);
		}
	}
	public int deleteBook(int bNo) {
		
		for(int i = 0; i <bookList.size(); i++) {
			if(bNo==bookList.get(i).getbNo()) {
				bookList.remove(i);
				return 1;
				
			}else {
				return 0;
			}
		}
		return 0;
	}
	public ArrayList<Book> searchBook(String title) {
		ArrayList<Book> searchList= new ArrayList<Book>();
		for(int i = 0; i <bookList.size(); i++) {
			searchList.add(bookList.get(i));
		}
		return searchList;
	}
	public ArrayList<Book> selectList() {
		return bookList;
	}
}
