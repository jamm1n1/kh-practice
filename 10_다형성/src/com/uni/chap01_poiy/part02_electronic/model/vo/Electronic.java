package com.uni.chap01_poiy.part02_electronic.model.vo;

public class Electronic {

	protected String brand;//브랜드	
	protected String pName;//상품명
	protected int price;//가격
	
	public Electronic() {}
	
	public Electronic(String brand, String pName, int price) {
		super();
		this.brand = brand;		
		this.pName = pName;
		this.price = price;
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", pName=" + pName + ", price=" + price + "]";
	}
		public void print() {
			System.out.println("나 Product야 !! ");
		}
	
	
	
	
	
}

