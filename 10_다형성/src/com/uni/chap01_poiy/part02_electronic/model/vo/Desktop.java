package com.uni.chap01_poiy.part02_electronic.model.vo;

public class Desktop extends Electronic {
 public static final String CPU ="intel";
 private String graphic;
 
public Desktop() {
	super();
	// TODO Auto-generated constructor stub
}
public Desktop(String brand, String pName, int price,String graphic) {
	super(brand, pName, price);
	this.graphic = graphic;
	

}
public String getGraphic() {
	return graphic;
}
public void setGraphic(String graphic) {
	this.graphic = graphic;
}
@Override
public String toString() {
	return "Desktop [graphic=" + graphic +"CPU : "+ CPU +", toString()=" + super.toString() + "]";
}
 
 
}
