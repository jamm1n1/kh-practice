package com.uni.chap01_poiy.part02_electronic.model.vo;

public class Notebook extends Electronic {
   private int usbPort;
   

public Notebook() {
	super();
	
}

public Notebook(String brand, String pName, int price, int usbPort) {
	super(brand, pName, price);
	this.usbPort = usbPort;
}

public int getUsbPort() {
	return usbPort;
}

public void setUsbPort(int usbPort) {
	this.usbPort = usbPort;
}

@Override
public String toString() {
	return "Notebook [usbPort=" + usbPort + ", toString()=" + super.toString() + "]";
}
   
   
}
