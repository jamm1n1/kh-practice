package com.uni.chap02_encapsulation.model.vo;



public class Student {
	//�ʵ�� 
		/* 1. �ʵ� : ��ü�� �Ӽ��� �����ϱ����� ����
		 * 
		 * 
		 * ������� == �ν��Ͻ����� 
		 * <ǥ����>
		 * ���������� [�����] �ڷ��� ������; 
		 * 
		 * �ʵ�ο� ���������ڴ� private ���� �ϴ°� ��ü���⼳���Ģ �� �ϳ��̴�. --> ĸ��ȭ
		 * */
	
	
    private String name;
    private int age;
    private double height;
    private int kor;
    private int math;
	
    // �����ں� 
 	/*
 	 * 2. ������ 
 	 * - ��ü�� �����ϱ� ���� ������ �޼ҵ�
 	 * 
 	 * <ǥ����>
 	 * ���������� Ŭ������([�Ű�����]){
 	 * 
 	 * }
 	 * 
 	 * */
    
    public Student() {
    	//�Ű����� ���� �����ڸ� �⺻������ ��� �Ѵ� .(����, �������� ���������Ѵ�.)
    }
    	// �޼ҵ��
    	/*
    	 * 3. �޼ҵ�
    	 * -����� �����ϴ� �κ�
    	 * 
    	 * <ǥ����>
    	 * [����������] [�����] ��ȯ�� �޼ҵ�� ([�ڷ��� �Ű�������]){
    	 * 		//��ɱ���
    	 * }
    	 *
    	 **/
    
    /* 3_1. �����͸� ��� �� �����ϴ� ����� �ϴ� �޼ҵ� (setter�޼ҵ�)
	 * 		�̶� �޼ҵ�� ���ٰ����ϵ��� �ؾ��ϱ� ������ public ���������ڸ� ����ؾ���.
	 * 
	 * public void setName(String newName){
	 * 		//�Ű����� : �ش� �޼ҵ� ȣ��� ���޵Ǵ� ���� �޾��ֱ����� ���� ����, �� �޼ҵ� �������� ��밡�� 
	 * 		
	 * 		name = newName; // �ʵ忡 ���޹��� �Ű������� ����
	 * }
	 * 		* ���ʻ� �޼ҵ���� �ʵ���̶� �Ȱ������ش� setXxx
	 * */
    
     public void setName(String name) {
    	name = name; // �Ű����� name = �Ű����� name; �ش��ϴ� �޼ҵ� ������ ������� ��������(�Ű�����) �켱������ ����
    	
    	//�ʵ�� name = �Ű����� name
    	
    	this.name = name;//this ���� �ش� ��ü�� �ּҰ��� �������ִ�.
    	
     }
    
     
     public void setAge(int age) {
     
       this.age=age;
     }
     
     public void setheight(double height) {
         
         this.height=height;
         
     
    }
     public void setKor(int kor) {
        
        this.kor=kor;
    
       
   } 
     public void setMath(int math) {
	     
	     this.math=math;
	     
	 
	    
	}
     /* 3_2 �����͸� ��ȯ���ִ� ����� �ϴ� �޼ҵ� (getter�޼ҵ�) getXxx
 	 * �ش� �ʵ忡 ����ִ� ���� ��ȯ�� �����ָ� �Ǳ� ������ �� �޼ҵ�� ���޵Ǵ� ��������. (��, �Ű������� ����)
 	 * ��, ��ȯ�� ������ϱ� ������ ���� ��ȯ�ϰ��ϴ� ���� �ڷ����� ��ȯ���� ����� �Ѵ�. 
 	 * 
 	 * */
    public String getName() {
    	return this.name;
    	
    }
    public int getAge() {
    	return this.age;
    }
    public double getHeight() {
    	return this.height;
    }
    public int getMath() {
    	return this.math;
    }
    public int getKor() {
    	return this.kor;
    }

	public String information() {
		// TODO Auto-generated method stub
		String info = "�̸� : "+name+",���� : "+age+" �������� : "+kor;
		return info;
		
	}
}

    
    

