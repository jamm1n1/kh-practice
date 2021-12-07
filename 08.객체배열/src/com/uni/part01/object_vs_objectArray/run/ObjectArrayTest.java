package com.uni.part01.object_vs_objectArray.run;

import com.uni.part01.object_vs_objectArraym.model.vo.Product;

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		//제품을 할당받을 product 객체 배열 크기 3
		Product [] arr = new Product[3];
		//각 인덱스 별로 객체생성 
		arr[0] = new Product("집",10000000,"우리미");
		arr[1] = new Product("집1",10000000,"우리미");
		arr[2] = new Product("집2",10000000,"우리미");
		// for문으로 정보출력 
		
		for(Product p : arr) {
			System.out.println(p.information());
		}
		
		}
		
	}


