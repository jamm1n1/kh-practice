package com.uni.chap02_intherit.run;


import com.uni.chap02_intherit.model.vo.airplane;
import com.uni.chap02_intherit.model.vo.car;
import com.uni.chap02_intherit.model.vo.ship;
import com.uni.chap02_intherit.model.vo.verhicle;

public class Run  {
	
	public static void main(String[] args) {
		
		
		car c =  new car ("벤틀리", 12.5 ,"sedan",4);
		
		airplane a =new airplane("비행기",0.021,"제트기",4, 2);
		
		ship s = new ship("낚시배",3,"어선",1);
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
		
		//다형성을 적용해서 how to move 적용
		
	    verhicle [] v = new verhicle[3];
	    v[0] = new car ("벤틀리", 12.5 ,"sedan",4);
	    v[1] = new airplane("비행기",0.021,"제트기",4, 2);
	    v[2] = new ship("낚시배",3,"어선",1);	 	
	    for( verhicle ve : v) {
	    	 if(ve instanceof car) {
	    		 ve.howToMove();
	    	 }
	    }
	    
		
				
	}
}
