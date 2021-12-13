package com.uni.chap01_before_vs_after.after.model.vo;

public class Product {
	protected String brand;//�귣��
	protected String pCode;//��ǰ��ȣ
	protected String pName;//��ǰ��
	protected int price;//����
	
	public Product() {}
	
	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
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
		return "Product [brand=" + brand + ", pCode=" + pCode + ", pName=" + pName + ", price=" + price + "]";
	}
		public void print() {
			System.out.println("�� Product�� !! ");
		}
	
	
	
	
	
}
