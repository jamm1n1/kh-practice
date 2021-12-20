package com.uni.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		/*
		 *  1. �÷��� �����ӿ�ũ��?
		 *  	- java.util ��Ű���� ���� ��
		 *  	- �ټ��� �����͸� ���� ȿ�������� ó���� �� �ִ� ǥ��ȭ�� ����� �����ϴ� Ŭ������ ����
		 *  		(�����͸� �����ϴ� �ڷ� ������ �����͸� ó���ϴ� �˰����� ����ȭ(Ʋ) �� ����)
		 *  
		 *  2. �迭�� ������ �÷����� ����
		 *  	- �迭�� ����
		 *  	 a. �ѹ� ũ�⸦ �����ϸ� ����(x), ó���� ũ�� ����(o)
		 *  	 b. �迭 �߰��� �߰�, ������ �����ϴ�.
		 *  	 c. �� Ÿ�Ը� ���� ����
		 *  
		 *  	- �÷����� ����
		 *  	 a. �����ϴ� ũ���� ������ ����.
		 *  	 b. �߰�, ����, ���� ���� ���ó���� �����ϴ�.
		 *  	 c. ���� Ÿ���� ���� ���� (�⺻ �ڷ����� Wrapper Ŭ�����ν� ���� �� : ��ü�� ���� �Ǳ� ����)
		 */
		
		
		/*List : �ڷḦ �����ϴ� ���� ������ ������ �����ǰ� �ߺ��� ��� �ϴ� �ڷ� ���� ����� ���Ѵ� 
		 *  �ڹٿ����� ArrayList,Vector,LinkedList �����ִ� 
		 *  ���� ArrayList �� Vector �� ����� �����ϳ�
		 *  Vector �� ThreadSafe ����� �ְ�  ArrayList�� ThreadSafe ����� ���� Ŭ�����̴�
		 *  
		 *  ThreadSafe: ���ÿ� ���������� ���� �����϶�� �켱������ ������
		 */
		
	/*	ArrayList a1 = new ArrayList();
		vector a1 = new Vector();
		LinkedList a1 = new LinkedList();*/
		
		List a1 = new ArrayList();//����������
		
		//add() : ArrayList������ �߰� 
		//add�� ���콺�� �ø��� Object Ÿ������ ���°��� �� �� �ִµ� �̰��� �÷����� ��ü Ÿ�Ը� �޾��ֱ� ������ �⺻�ڷ����� �߰��ϸ� ���������� 
		//AutoBoxing �� ���� WrapperClass �� �����Ǿ� ��ü�� ����.
		a1.add(true);
		a1.add("��ȿ��");
		a1.add('��');
		a1.add(20);
		a1.add(new Date());
		
		
		//get(index) : ArrayList������ ���� 
		
		for(int i = 0; i < a1.size(); i++) {
			System.out.println("�ε��� "+i +"���� ��"+ a1.get(i));
		}
			
		System.out.println(a1.toString());
		
		
		//remove(�ε���) : ���ϴ� �ε�����° �� ���� 
		a1.remove(1);
		System.out.println("1�� �ε��� ������ "+a1);
		
		//add() : �߰��� ���߰�, ���ϴ� �ε��� ���� 
		a1.add(3,37.85);
		System.out.println("3�� �ε��� �߰��� "+a1);
		
		//set(�ε���, ������ ��) : ���ϴ� �ε��� ���� �� ���� 
		a1.set(3, "abc");
		System.out.println("3�� �ε��� ������ "+a1);
		
		//indexOf(ã�� �� ) : ã�����ϴ� ���� �ε���Ȯ�� 
		System.out.println(a1.indexOf("abc"));
		
		//contains(ã�� ��) : ã�� ���� ���� �ߴ��� (boolean)
		System.out.println(a1.contains('��'));
		
		//a1.clear();//���� ���� ��� ����
		a1.get(0); // ����� ũ�Ⱑ 0 �� ,IndexOutOfBoundsException
		
		
		for(Object o : a1) {
			if(o instanceof String) {
				System.out.println((String)o);
			}
		}
	}

}
