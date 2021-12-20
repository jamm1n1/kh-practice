package com.hw3.controller;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


import com.hw3.model.vo.Book;


public class BookManager {

	Scanner sc = new Scanner(System.in);
	
	public BookManager() {
		
	}
	public void fileSave() {
		ArrayList<Book> BookList = new ArrayList<Book>();
		BookList.add(new Book("c¾ð¾î","±è¾¾",10000,setCalendar(2012,2-1,2),0.1));
		BookList.add(new Book("ÀÚ¹Ù","ÀÌ¾¾",20000,setCalendar(2013,3-1,3),0.2));
		BookList.add(new Book("c++","¹Ú¾¾",30000,setCalendar(2014,4-1,4),0.3));
		BookList.add(new Book("³ÓÁö","¼­¾¾",40000,setCalendar(2015,5-1,5),0.4));
		BookList.add(new Book("°³¹Ì","ÃÖ¾¾",50000,setCalendar(2016,6-1,6),0.5));
	    
	    try(ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("book.dat"))){
	    	for(int i =0; i <BookList.size(); i++) {
				dos.writeObject(BookList.get(i));
	    }
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	}
	
	public void fileRead () {		
         ArrayList<Book> BookList = new ArrayList<Book>();
		
		try(ObjectInputStream dos = new ObjectInputStream(new FileInputStream("Book.dat"))){
			
			int i = 0;
			while (true) {
				BookList.add( (Book) dos.readObject());
				
				System.out.println(BookList.get(i));
				i++;
			}
			
		}catch(EOFException e ) {
			System.out.println("books.dat ÀÐ±â ¿Ï·á");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Calendar setCalendar(int year,int month,int date) {
		Calendar pDate = Calendar.getInstance();
		pDate.set(year, month-1, date);
		
		return pDate;
	}
	}


