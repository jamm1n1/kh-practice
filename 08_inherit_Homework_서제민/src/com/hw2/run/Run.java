package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Point;
import com.hw2.model.vo.Rectangle;

public class Run {
   
	public static void main(String[] args) {
		  Point[] p =new Point[2];
		System.out.println("=====circle====="); //for each À½ 
	Circle[] c = new Circle[2];	
	c[0] = new Circle(1,2,3 );
	c[1] = new Circle(3,3,4);		
    for(Circle a : c) {
    	
    	a.draw();
    	
    	}
    
    System.out.println("=====rectangle=====");
	Rectangle[] r = new Rectangle[2];		
	r[0] = new Rectangle(-1,-2,5,2);
	r[1] = new Rectangle(-2,5,2,8);		
    for(Rectangle n : r) {
    	
    	n.draw();
	}
	}
}
