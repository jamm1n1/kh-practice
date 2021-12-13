package com.uni.chap03_overrider.run;

import com.uni.chap03_overrider.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book bk1 = new Book("����ǿµ�","�̱���",20000 );
		Book bk2 = new Book("����","�������������޸�",20000);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		System.out.println(bk1.toString());//��¹����� JVM�� �ڵ����� ���۷���.toString()ȣ���� ���ش�
		System.out.println(bk1);//toString()�� ��������ʾƵ� �˾Ƽ� ȣ���̵ȴ�
		//��� Ŭ������ object �� �ļ��̴�. �� �ֻ��� Ŭ������ object
				//--> Object �� �ִ� �޼ҵ���� ��� ������ ������ �Ҽ� �ִٴ� �ǹ�
		//1.toString()
		//�������̵� �� : Object Ŭ������ toString()�� ���� --> Ǯ��Ű���� @ �ؽ��ڵ� 16���� ���� ���� 
		//�������̵� �� : Book Ŭ������ �ִ� toString()���� --> ���� ������ �Ѵ�� �ش� ��ü�� �������ִ� �ʵ尪�� ���� ������ ����.
		System.out.println(bk1);
		System.out.println(bk2);
		
		//-------------------------------------equals(),hashCode()
				//2.equals()-------------------------------------------------------------------------------------
		
		Book bk3 = new Book("����� �µ�","�̱���",20000);//bk1�� ������ �ʵ尪�� ���� bk3 ��ü�� ����
		System.out.println("bk1�� bk3�� ���� å�Դϱ� ?  "+(bk1==bk3));//false -->�ּҰ� �� �̱⶧����
		System.out.println("bk1�� bk3�� ���� å�Դϱ� ? " + (bk1.equals(bk3)));
		
		//�������̵� �� : Object Ŭ������ equals �޼ҵ尡 ���� -> ���ּҰ��� �� 
				//�������̵� �� : �ΰ�ü�� �ּҰ� �񱳰� �ƴ� ���� �ʵ� ������ ������� true�� ��ȯ�ϵ��� ������ 
				
				//���ü : ���� �ʵ尪�� ������ �ؽ��ڵ尪�� �ٸ���� 
				//���ϰ�ü : ���� �ʵ尪�� ���� �ؽ��ڵ� ���� ������� --> ���� ��ü��°� �ߺ��ȴٴ� �Ҹ�
	}

}
