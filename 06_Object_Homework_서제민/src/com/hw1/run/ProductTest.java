package com.hw1.run;

import com.hw1.model.vo.Product;



public class ProductTest {

	public static void main(String[] args) {
			
	
		Product p1 = new Product("ssgnote9","�����ó�Ʈ9","��⵵ ����",960000,10.0);
		System.out.println(p1);
		Product p2 = new Product("lgxnote","LG����Ʈ��5","��⵵ ����",780000,0.7);
		System.out.println(p2);
		Product p3 = new Product("ktsnote","KT����Ʈ��3","����� ����",250000,0.3);
		System.out.println(p3);
		
		System.out.println("====================================================================");
		
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("====================================================================");
		
		System.out.println("��ǰ�� = " + p1.getProductname());
		System.out.println("�ΰ��� ���԰��� = "+ p1.getPrice()*(p1.getTax()+1));
		System.out.println("��ǰ�� = " + p2.getProductname());
		System.out.println("�ΰ��� ���԰��� = "+ p2.getPrice()*(p2.getTax()+1));
		System.out.println("��ǰ�� = " + p3.getProductname());
		System.out.println("�ΰ��� ���԰��� = "+ p3.getPrice()*(p3.getTax()+1));
		
		
		
		
		
		
		
		
	}
	
     
}
