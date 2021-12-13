package com.uni.chap01_poiy.part02_electronic.run;

import com.uni.chap01_poiy.part02_electronic.controller.ElectronicComtroller2;
import com.uni.chap01_poiy.part02_electronic.controller.ElectronicContoller;
import com.uni.chap01_poiy.part02_electronic.model.vo.Desktop;
import com.uni.chap01_poiy.part02_electronic.model.vo.Electronic;
import com.uni.chap01_poiy.part02_electronic.model.vo.Notebook;
import com.uni.chap01_poiy.part02_electronic.model.vo.Tablet;
public class Run {

	public static void main(String[] args) {
		
     //1.다형성을 적용안했을경우
		
/*	ElectronicContoller ec = new ElectronicContoller();
	ec.insert(new Desktop("삼성","데스크탑",100000,"Geforce1070"));
	ec.insert(new Notebook("LG","그램",200000,3));
	ec.insert(new Tablet("애플","아이패드",300000,false));
		
	Desktop d = ec.selectDesktop();
	Notebook n = ec.selectNotebook();
	Tablet t = ec.selectTablet();
	
	System.out.println(d);
	System.out.println(n);
	System.out.println(t);*/
	
	
	//2. 다형성을 적용한 경우
		
		ElectronicComtroller2 ec = new ElectronicComtroller2();
		
		ec.insert(new Desktop("삼성","데스크탑",100000,"Geforce1070"));
		ec.insert(new Notebook("LG","그램",200000,3));
		ec.insert(new Tablet("애플","아이패드",300000,false));
		
		 Electronic d = ec.select(0);
		 Electronic n = ec.select(1);
		 Electronic t = ec.select(2);
		 
		 System.out.println(d);
			System.out.println(n);
			System.out.println(t);
			
			 Electronic[] el = ec.selectAll();
			 for(int i = 0; i < el.length; i++) {
				if(el[i] instanceof Desktop) {
					((Desktop)el[i]).setGraphic("Geforce 1080");
					
					System.out.println(((Desktop)el[i]).getGraphic());
				}else if (el[i] instanceof Notebook) {
					System.out.println(((Notebook)el[i]).getUsbPort());
				}else {
					System.out.println(((Tablet)el[i]).isPenFlag());
				}
			 }
			 //for each
			 for(Electronic ele : el) {
				 if(ele instanceof Desktop) {
						((Desktop)ele).setGraphic("Geforce 1080");
						
						System.out.println(((Desktop)ele).getGraphic());
					}else if (ele instanceof Notebook) {
						System.out.println(((Notebook)ele).getUsbPort());
					}else {
						System.out.println(((Tablet)ele).isPenFlag());
			 }
			 
			 
			 
			 
			 /* 다형성을 사용하는 이유 
				 * 1. 부모타입의 객체배열로 다양한 자식들을 받아 올수 있다. 
				 * --> 부모타입 하나로 다양한 자식을 다룰수 있다. 
				 * 
				 * 2. 매개변수에 다형성을 적용하는 경우 메소드갯수가 줄어든다. 
				 */
	}
	}
}
