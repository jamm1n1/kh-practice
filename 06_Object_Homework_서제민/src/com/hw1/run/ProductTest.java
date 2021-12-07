package com.hw1.run;

import com.hw1.model.vo.Product;



public class ProductTest {

	public static void main(String[] args) {
			
	
		Product p1 = new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		System.out.println(p1);
		Product p2 = new Product("lgxnote","LG스마트폰5","경기도 평택",780000,0.7);
		System.out.println(p2);
		Product p3 = new Product("ktsnote","KT스마트폰3","서울시 강남",250000,0.3);
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
		
		System.out.println("상품명 = " + p1.getProductname());
		System.out.println("부가세 포함가격 = "+ p1.getPrice()*(p1.getTax()+1));
		System.out.println("상품명 = " + p2.getProductname());
		System.out.println("부가세 포함가격 = "+ p2.getPrice()*(p2.getTax()+1));
		System.out.println("상품명 = " + p3.getProductname());
		System.out.println("부가세 포함가격 = "+ p3.getPrice()*(p3.getTax()+1));
		
		
		
		
		
		
		
		
	}
	
     
}
