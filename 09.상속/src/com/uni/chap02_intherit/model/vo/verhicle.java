package com.uni.chap02_intherit.model.vo;

public class verhicle {
 protected String name;
 protected double mileage;
 protected String kind;

public verhicle() {
	super();
	// TODO Auto-generated constructor stub
}
public verhicle(String name, double mileage, String kind) {
	super();
	this.name = name;
	this.mileage = mileage;
	this.kind = kind;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMileage() {
	return mileage;
}
public void setMileage(double mileage) {
	this.mileage = mileage;
}
public String getKind() {
	return kind;
}
public void setKind(String kind) {
	this.kind = kind;
}
@Override
public String toString() {
	return "verhicle [name=" + name + ", mileage=" + mileage + ", kind=" + kind + "]";
}
 public void howToMove() {
	 System.out.println("�����δ�");
 }
 
}

