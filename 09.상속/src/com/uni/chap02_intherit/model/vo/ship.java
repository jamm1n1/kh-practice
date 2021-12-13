package com.uni.chap02_intherit.model.vo;

public class ship extends verhicle {

	private int propeller;
	
	public ship() {
		
	}

	public ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
		
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	@Override
	public String toString() {
		return "ship [propeller=" + propeller + ", toString()=" + super.toString() + "]";
	}  
	
	 public void howToMove() {
		 System.out.println("움직인다");

	 }
}
