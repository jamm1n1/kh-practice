package com.uni.chap03_class.model.vo;

public class product {

	
private String pName;
private int Price;
private String Brand;

public product() {
	// TODO Auto-generated constructor stub
}

public String getpName() {//알트+쉬프트+s
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public product(String pName, int price, String brand, DftProduct d, String dName) {
	super();
	this.pName = pName;
	Price = price;
	Brand = brand;
	this.d = d;
	this.dName = dName;
}

public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public String information() {
	String info = pName+" "+Price+" "+Brand;
	return info;
}
DftProduct d  = new DftProduct(); //같은패키지라서 가능

class DftProduct {

	
	}

	private String dName;

	
	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
	
}

 
	


