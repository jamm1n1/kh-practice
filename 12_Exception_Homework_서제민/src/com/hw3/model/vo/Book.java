package com.hw3.model.vo;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8810636047502860718L;
	
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discount;
	
	
	
	public Book() {

	}



	public Book(String title, String author, int price, Calendar dates, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discount = discount;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Calendar getDates() {
		return dates;
	}



	public void setDates(Calendar dates) {
		this.dates = dates;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates=" + dates + ", discount="
				+ discount + "]";
	}
	
	
}
