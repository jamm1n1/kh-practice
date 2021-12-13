package com.hw2.model.vo;

import com.hw2.model.vo.Point;

public class Circle extends Point{

	private int radius;

	public Circle() {
		super();
	}

	public Circle(int x, int y,int radius) {
		super(x,y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		super.draw();
     	System.out.println("면적 : "+(3.14*radius*radius));
		System.out.println("둘레 : "+(3.14*radius*2));
		
	}
	
	
}
