package com.uni.chap03_class.run;



import java.util.Scanner;

import com.uni.chap03_class.model.vo.product;

import com.uni.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
	/*	Person p = new Person();
		
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("��ȿ��");
		p.setAge(29);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("lee@iei.or.kr");

		
		
		System.out.println(p.information());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �̸� : ");

		String name = sc.nextLine();
		
		//�̸�����
		p.setName(name);
		
		System.out.println(p.information());*/
		
		product c = new product();
	c.setpName("����Ű��������");
	c.setPrice(260000);
	c.setBrand("����Ű");
		System.out.println(c.information());
		product c1 = new product();
		c1.setpName("����Ű����ƽ�");
		c1.setPrice(260000);
		c1.setBrand("����Ű");
			System.out.println(c1.information());
			
		//	DftProduct d  = new DftProduct(); //�ٸ���Ű���� �Ұ���
			//default Ŭ������ ��Ű���ܺο��� ���ٺҰ�
	}
	

}
