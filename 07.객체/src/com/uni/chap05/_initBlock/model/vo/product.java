package com.uni.chap05._initBlock.model.vo;

public class product {

	
	
	/*private String pName ;
	private int price;
	private static String brand;*/
	
	//1.아무 초기화 없이 Product 객체 생성해서 출력시 jvm이 정한 기본 값으로 객체 생성되어있음
		////인스턴스 변수 == 멤버변수
		/*product p = new product();
		System.out.println(p.toString());*/
		//인스턴스 변수 == 멤버변수
			/*	product p = new product();
				System.out.println(p.toString());*/
		
		//2. 필드에 명시적 초기화를 한 후 객체생성해서 출력
	
		private String pName ="갤럭시";
		private int price = 1000000;
		
		private static String brand ="삼성";
	
		
		//3. stratic 블록 - 클래스 변수를 초기화 시키는 블럭으로 프로그램 시작시 딱 한번만 초기화 , 클래스 초기화
		static {
		//	pName = "g" --> static 블록에서는 인스턴스 변수를 초기화 못함 .
		//	price=10000;
			
			brand = "엘지";
		}
		//4. 인스턴스 블록 - 인스턴스 변수를 초기화 시키는 블럭으로 인스턴스 (객체) 생성시 마다 초기화된다
		{
			pName = "g" ;
			price=10000;
			
			brand = "애플"; //--> 객체 생성 이후에 값을 초기화 하는 인스턴스 블럭의 초기화 값으로 덮어 쓰게된다.
		}

	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static String getBrand() {
		return brand;
	}
	public static void setBrand(String brand) {
		product.brand = brand;
	}
	@Override
	public String toString() {
		return "product [pName=" + pName + ", price=" + price + ",brand="+brand +"]";
	}
	
	
	
	
	
	
}
