package com.uni.chap01_poiy.part02_electronic.model.vo;

public class Tablet extends Electronic{
private boolean penFlag;



public Tablet() {
	super();
	
}

public Tablet(String brand, String pName, int price,boolean penFlag ) {
	super(brand, pName, price);
	this.penFlag = penFlag;
}

public boolean isPenFlag() {
	return penFlag;
}

public void setPenFlag(boolean penFlag) {
	this.penFlag = penFlag;
}

@Override
public String toString() {
	return "Tablet [penFlag=" + penFlag + ", toString()=" + super.toString() + "]";
}




}
