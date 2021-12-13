package com.uni.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product {
	
	private boolean allInOne;//일체여부
	
	public Desktop() {}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode , pName , price);
		/*super.brand = brand;// 직접 접근 일때는 부모필드의 접속제어자가 protected 여야한다.
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;*/
		this.allInOne = allInOne;
		/*
		 * super. 의 super 는 해당객체의 부모주소를 담고있다
		 * 따라서 super. 으로 부모에 접근가능하다.
		 * 단 접근하고자 하는 필드가 private 일때는 접근불가
		 * ->부모필드를 자식까지만 접근 가능하
		 */
	}

	

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  super.toString()+" allInOne : "+ allInOne;
	}
}
