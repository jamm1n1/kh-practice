package com.uni.chap04_field.run;

import com.uni.chap04_field.model.vo.FieldTest1;
import com.uni.chap04_field.model.vo.FieldTest2;
import com.uni.chap04_field.model.vo.FieldTest3;
import com.uni.chap04_field.model.vo.FieldTest4;



public class Run {

	public static void main(String[] args) {
		
		//------------------1. fieldTest1
		//FieldTest1 f1 = new FieldTest1();
		
		//f1.test(20);

		
		//------------------2. fieldTest2
	/*	
		FieldTest2 f2 = new FieldTest2();
		
		//public --> ��𼭵� ���ٰ���
		System.out.println(f2.pub);
		
		//protected --> ������Ű����, ��ӱ��������� ���ٰ���
		//System.out.println(f2.pro); -->�ٸ���Ű���̸鼭, ��ӱ����� �ƴϱ⶧���� ���ٺҰ�
		System.out.println(f2.getPro());
		
		//defualt --> ������Ű�� �������� ��밡�� 
		//System.out.println(f2.def); -- > �ٸ���Ű���̱⋚���� ���� �Ұ�
		System.out.println(f2.getDef());
		
		//private --> ���� Ŭ���� �������� ���ٰ��� 
		//System.out.println(f2.pri);
		System.out.println(f2.getPri());*/
		
		
		//------------------3. fieldTest3
		
		//FieldTest3 f3 = new FieldTest3(); ��ü���� �� �ʿ���� 
		//public static
	   System.out.println(FieldTest3.pubSta);//��ü���� �ʿ���� �ٷ� Ŭ������ ���� ���ٰ����ϴ�
	   System.out.println(Math.PI);
	   FieldTest3.pubSta="������";//��������
	   System.out.println(FieldTest3.pubSta);
	   //private static
	 //  System.out.println(FieldTest.prista);//private �̱⋚���� �ٷ� ���� �ȵ�
	   System.out.println(FieldTest3.getPriSta());
	   
	   
	 //------------------4. fieldTest4
	   
	  System.out.println(FieldTest4.NUM);
	  //FieldTest4.NUM = 3 ; �����Ұ�
	}

}
