package com.uni.chap01_before_vs_after.after.model.vo;



public class Smartphone extends Product {
	private String mobileAgency;//Ελ½Ε»η
	
	public Smartphone() {}

	public Smartphone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode , pName , price);
		
		this.mobileAgency = mobileAgency;
		
	}

	

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
		
		
	}

	@Override
	public String toString() {
		
		return  "mobileAgency=" + mobileAgency  ;
	}

}
