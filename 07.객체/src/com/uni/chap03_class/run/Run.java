package com.uni.chap03_class.run;



import java.util.Scanner;

import com.uni.chap03_class.model.vo.product;

import com.uni.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
	/*	Person p = new Person();
		
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("이효리");
		p.setAge(29);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("lee@iei.or.kr");

		
		
		System.out.println(p.information());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 이름 : ");

		String name = sc.nextLine();
		
		//이름변경
		p.setName(name);
		
		System.out.println(p.information());*/
		
		product c = new product();
	c.setpName("나이키에어조던");
	c.setPrice(260000);
	c.setBrand("나이키");
		System.out.println(c.information());
		product c1 = new product();
		c1.setpName("나이키에어맥스");
		c1.setPrice(260000);
		c1.setBrand("나이키");
			System.out.println(c1.information());
			
		//	DftProduct d  = new DftProduct(); //다른패키지라서 불가능
			//default 클래스는 패키지외부에서 접근불가
	}
	

}
