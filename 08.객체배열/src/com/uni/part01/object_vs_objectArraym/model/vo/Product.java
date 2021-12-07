package com.uni.part01.object_vs_objectArraym.model.vo;

public class Product {

	private String pName;
	private int Price;
	private String Brand;

	public Product() {
		
	}



	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		Price = price;
		Brand = brand;
	}
	public String getpName() {
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
}
	

