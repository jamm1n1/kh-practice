package com.uni.chap02_listSort.model.vo;


public class Travel implements Comparable{
	
	
	private int tNum;
	private String country;
	private String point;
	
	
	public Travel() {
		// TODO Auto-generated constructor stub
	}


	public Travel(int tNum, String country, String point) {
		super();
		this.tNum = tNum;
		this.country = country;
		this.point = point;
	}


	public int gettNum() {
		return tNum;
	}


	public void settNum(int tNum) {
		this.tNum = tNum;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPoint() {
		return point;
	}


	public void setPoint(String point) {
		this.point = point;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Travel [tNum ="+ tNum + ", Country = "+ country + ", point = " +point +" ]";
	}
	/*compareTo()�� int Ÿ���� ��ȯ�ϸ�, �Ķ���ͷ� �� ����� �Ǵ� ��ü�� ������ �ȴ�.
	�� ���ڿ��� �� �������� ��, �񱳴� ���ڿ����ִ� �� ������ ���� �ڵ� ���� ��� .
	return�ϴ� int ���� ������ �ִ�.

	A.compareTo(B) �� �� A<B �� ���� ������ �����ϰ�, A=B�� ���� 0�� �����ϰ�, A>B�� �� ����� �����Ѵ�.

	// this(��)   vs   o(��)
		// Travel          Travel
		
		// Collections.sort(�����ϰ����ϴ¸���Ʈ) ȣ��� 
		// ���������� �ش� ����Ʈ�� ����ִ� ������ Travel ��ü���� ������
		// �ش� �� compareTo �޼ҵ尡 �����̵ȴ�.
		
		// �̶�  �� �޼ҵ��� ��ȯ���� ���� ����� ��� �� ��ü�� ������ �ٲ�� ��! 
		
		// ��, ����� �������� ���� �� �� �ֵ��� �Ϸ���
		
		// this(��)   vs   o(��)
		//  Travel          Travel
		
		//    this(��)�� ����� �� o(��)�� ����� ���� �� ū ���� ��� ������ ��������ߵ� => ��, ����� ��ȯ
		//ex   "��Ȧ"			"�����"
		
	
		// �̶� String Ŭ�������� �����ϴ� compareTo �޼ҵ带 ȣ���ϸ� �˾Ƽ� ����ؼ� ��ȯ����
		// ��  this�� �����.compareTo(o�� �����) �ϰ� �Ǹ�
		// ����ü�� ���� ������ 0, ��ü�� ��󺸴� ũ�� 1 , ��ü�� ��󺸴� ������ -1 ��ȯ*/


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*@Override
	public int compareTo(Object o) {//��������
		
		return this.tNum - ((Travel)o).tNum;
	}*/

/*	@Override
	public int compareTo(Object o) {//��������
		
		return ((Travel)o).tNum - this.tNum;
	}
	@Override
	public int compareTo(Object o) {//��������
		
		System.out.println(" this : "+country  +"   Object : "+ (((Travel)o).country)+" return : "+ country.compareTo(((Travel)o).country) );
		return country.compareTo(((Travel)o).country);
		
	}*/

/*	@Override
	public int compareTo(Travle o) {
		
		return country.compareTo(o.country);
	}*/



	


    
    

}
