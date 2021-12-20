package com.uni.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone  implements Serializable{

	
	/*
	 *  ����ȭ  : ��ü�� ����� �ϰ��� �Ѵٸ� �ݵ�� ����ȭ�� �ʿ��ϴ�
	 *  ��ü�� ����Ʈ�� �迭�� ��ȯ�� �ؼ� �����̳� �޸� ���� �����ϴ� ���� , ����Ȱ��� �ٽ� ��ü�� ��ȯ �ϴ°��� ������ȭ ��� �Ѵ�. 
	 *  
	 */
	
	
	private static final long serialVersionUID = 510194549677934739L;
	private String brand;
	private int price;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Phone [ brand = "+brand +" , price = "+ price+ "]";
	}
}
