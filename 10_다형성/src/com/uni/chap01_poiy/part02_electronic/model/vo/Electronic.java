package com.uni.chap01_poiy.part02_electronic.model.vo;

public class Electronic {

	protected String brand;//�귣��	
	protected String pName;//��ǰ��
	protected int price;//����
	
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
			System.out.println("�� Product�� !! ");
		}
	
	
	
	
	
}

