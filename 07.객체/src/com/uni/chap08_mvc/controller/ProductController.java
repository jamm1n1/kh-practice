package com.uni.chap08_mvc.controller;

import com.uni.chap08_mvc.model.vo.Product;
//controller : ������� ��û�� ���ؼ� ���� ȣ���� �Ķ���ͼ���.(���� ���� �����ؼ� ����� ����Ͻ� ����(�������� ����,����ó��)�� ����)

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
