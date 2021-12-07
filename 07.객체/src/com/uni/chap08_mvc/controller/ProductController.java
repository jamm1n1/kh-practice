package com.uni.chap08_mvc.controller;

import com.uni.chap08_mvc.model.vo.Product;
//controller : 사용자의 요청에 의해서 서비스 호출전 파라미터셋팅.(서비스 단을 생략해서 현재는 비즈니스 로직(데이터의 수정,가공처리)을 구현)

public class ProductController {
    private Product pro =null;
	public void insertproduct(String name, String brand, int price) {
		// TODO Auto-generated method stub
		pro = new Product(name, price, brand);
		
		
	}

	public Product selectProduct() {
		return pro;
	}

	public void updateprice(int nPrice) {
		pro.setPrice(nPrice);
		
	}
	
}
