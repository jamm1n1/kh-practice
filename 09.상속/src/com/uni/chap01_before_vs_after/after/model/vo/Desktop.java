package com.uni.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product {
	
	private boolean allInOne;//��ü����
	
	public Desktop() {}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode , pName , price);
		/*super.brand = brand;// ���� ���� �϶��� �θ��ʵ��� ���������ڰ� protected �����Ѵ�.
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;*/
		this.allInOne = allInOne;
		/*
		 * super. �� super �� �ش簴ü�� �θ��ּҸ� ����ִ�
		 * ���� super. ���� �θ� ���ٰ����ϴ�.
		 * �� �����ϰ��� �ϴ� �ʵ尡 private �϶��� ���ٺҰ�
		 * ->�θ��ʵ带 �ڽı����� ���� ������
		 */
	}

	

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  super.toString()+" allInOne : "+ allInOne;
	}
}
