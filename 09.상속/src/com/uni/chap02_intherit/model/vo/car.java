package com.uni.chap02_intherit.model.vo;



public class car extends verhicle {

	private int tire;
	
	public car() {}
			
	public car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
		 
}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return "car [tire=" + tire + ", toString()=" + super.toString() + "]";
	}

	 public void howToMove() {
		 System.out.println("움직인다");
	 }
}