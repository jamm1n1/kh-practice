package com.uni.chap02_intherit.run;


import com.uni.chap02_intherit.model.vo.airplane;
import com.uni.chap02_intherit.model.vo.car;
import com.uni.chap02_intherit.model.vo.ship;
import com.uni.chap02_intherit.model.vo.verhicle;

public class Run  {
	
	public static void main(String[] args) {
		
		
		car c =  new car ("��Ʋ��", 12.5 ,"sedan",4);
		
		airplane a =new airplane("�����",0.021,"��Ʈ��",4, 2);
		
		ship s = new ship("���ù�",3,"�",1);
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
		
		//�������� �����ؼ� how to move ����
		
	    verhicle [] v = new verhicle[3];
	    v[0] = new car ("��Ʋ��", 12.5 ,"sedan",4);
	    v[1] = new airplane("�����",0.021,"��Ʈ��",4, 2);
	    v[2] = new ship("���ù�",3,"�",1);	 	
	    for( verhicle ve : v) {
	    	 if(ve instanceof car) {
	    		 ve.howToMove();
	    	 }
	    }
	    
		
				
	}
}
