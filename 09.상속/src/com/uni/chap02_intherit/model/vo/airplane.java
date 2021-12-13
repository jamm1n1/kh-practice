package com.uni.chap02_intherit.model.vo;

public class airplane extends verhicle{

	private int tire;
	private int wing;
	
	public airplane (){
	}

	public airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	@Override
	public String toString() {
		return "airplane [super.toString() +tire=" + tire + ", wing=" + wing + ", toString()=" +  "]";
	}
	public void howtomove() {
		System.out.println("날개를 가지고 날아간다.");
	}
	
	
}
