package com.uni.chap04_field.model.vo;

public class FieldTest3 {

	//���������� ������ Ŭ���� ������ static ���� ���� ���� 
	
		//static -> ���α׷� �������ڸ��� static �޸� ������ �Ҵ�� ,static �� ������ ���� ,
		//�Ϲݸ�� ������ �� Ŭ������ ��ü�� �����ؾ߸� �׺����� �޸𸮿� �ö󰣴ٸ� static �� ���� ������ ���α׷� ����� ���ÿ� �޸𸮿� �ö�.
	
	public static String pubSta = "public static";
	
    private static String priSta = "private static";
    
    
    

	public static String getPriSta() {
		return priSta;
	}

	public static void setPriSta(String priSta) {
		FieldTest3.priSta = priSta;//static �� ��ü�� ���������ʰ� ���α׷� ����� ���ÿ� static ������ �Ҵ�Ǳ� ������ this�� ���������ʴ´�
	}
    
    
}
