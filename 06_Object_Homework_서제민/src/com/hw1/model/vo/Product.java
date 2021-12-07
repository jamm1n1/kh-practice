package com.hw1.model.vo;

public class Product {

	private String productid;
	private String productname;
	private String productarea;
	private int price;
	private double tax;
	
	public Product(){
		
	}
	public Product(String productid,String productname,String productarea,int price,double tax) {
		this.productid=productid;
		this.productname=productname;
		this.productarea= productarea;	
		this.price = price;
		this.tax = tax;
				
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductarea() {
		return productarea;
	}
	public void setProductarea(String productarea) {
		this.productarea = productarea;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return  productid+" "+productname+" "+productarea+" "+price+" "+tax  ;
				
	}
	
	

}
