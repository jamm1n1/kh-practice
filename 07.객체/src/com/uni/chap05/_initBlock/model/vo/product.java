package com.uni.chap05._initBlock.model.vo;

public class product {

	
	
	/*private String pName ;
	private int price;
	private static String brand;*/
	
	//1.�ƹ� �ʱ�ȭ ���� Product ��ü �����ؼ� ��½� jvm�� ���� �⺻ ������ ��ü �����Ǿ�����
		////�ν��Ͻ� ���� == �������
		/*product p = new product();
		System.out.println(p.toString());*/
		//�ν��Ͻ� ���� == �������
			/*	product p = new product();
				System.out.println(p.toString());*/
		
		//2. �ʵ忡 ����� �ʱ�ȭ�� �� �� ��ü�����ؼ� ���
	
		private String pName ="������";
		private int price = 1000000;
		
		private static String brand ="�Ｚ";
	
		
		//3. stratic ��� - Ŭ���� ������ �ʱ�ȭ ��Ű�� ������ ���α׷� ���۽� �� �ѹ��� �ʱ�ȭ , Ŭ���� �ʱ�ȭ
		static {
		//	pName = "g" --> static ��Ͽ����� �ν��Ͻ� ������ �ʱ�ȭ ���� .
		//	price=10000;
			
			brand = "����";
		}
		//4. �ν��Ͻ� ��� - �ν��Ͻ� ������ �ʱ�ȭ ��Ű�� ������ �ν��Ͻ� (��ü) ������ ���� �ʱ�ȭ�ȴ�
		{
			pName = "g" ;
			price=10000;
			
			brand = "����"; //--> ��ü ���� ���Ŀ� ���� �ʱ�ȭ �ϴ� �ν��Ͻ� ���� �ʱ�ȭ ������ ���� ���Եȴ�.
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
