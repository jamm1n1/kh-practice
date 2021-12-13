package com.uni.chap01_poiy.part02_electronic.run;

import com.uni.chap01_poiy.part02_electronic.controller.ElectronicComtroller2;
import com.uni.chap01_poiy.part02_electronic.controller.ElectronicContoller;
import com.uni.chap01_poiy.part02_electronic.model.vo.Desktop;
import com.uni.chap01_poiy.part02_electronic.model.vo.Electronic;
import com.uni.chap01_poiy.part02_electronic.model.vo.Notebook;
import com.uni.chap01_poiy.part02_electronic.model.vo.Tablet;
public class Run {

	public static void main(String[] args) {
		
     //1.�������� ������������
		
/*	ElectronicContoller ec = new ElectronicContoller();
	ec.insert(new Desktop("�Ｚ","����ũž",100000,"Geforce1070"));
	ec.insert(new Notebook("LG","�׷�",200000,3));
	ec.insert(new Tablet("����","�����е�",300000,false));
		
	Desktop d = ec.selectDesktop();
	Notebook n = ec.selectNotebook();
	Tablet t = ec.selectTablet();
	
	System.out.println(d);
	System.out.println(n);
	System.out.println(t);*/
	
	
	//2. �������� ������ ���
		
		ElectronicComtroller2 ec = new ElectronicComtroller2();
		
		ec.insert(new Desktop("�Ｚ","����ũž",100000,"Geforce1070"));
		ec.insert(new Notebook("LG","�׷�",200000,3));
		ec.insert(new Tablet("����","�����е�",300000,false));
		
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
			 
			 
			 
			 
			 /* �������� ����ϴ� ���� 
				 * 1. �θ�Ÿ���� ��ü�迭�� �پ��� �ڽĵ��� �޾� �ü� �ִ�. 
				 * --> �θ�Ÿ�� �ϳ��� �پ��� �ڽ��� �ٷ�� �ִ�. 
				 * 
				 * 2. �Ű������� �������� �����ϴ� ��� �޼ҵ尹���� �پ���. 
				 */
	}
	}
}
