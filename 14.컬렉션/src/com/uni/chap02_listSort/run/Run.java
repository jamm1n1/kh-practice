package com.uni.chap02_listSort.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import com.uni.chap02_listSort.model.comparator.AscCountry;
import com.uni.chap02_listSort.model.comparator.AscTravelNum;
import com.uni.chap02_listSort.model.comparator.DescTravelNum;
import com.uni.chap02_listSort.model.vo.Travel;

public class Run {

	public static void main(String[] args) {
		// 1. Comparable(java.lang) : Ŭ������ �⺻ ���� ������ ����
		// - vo Ŭ������ �����ϰ� � ������ ���������� �������� �� �ѹ��� �ϳ��� ��������
		// - Integer,Double,String ���� �⺻ �����Ǵ� Ŭ�������� �̹� ����
		// - �ݵ�� compareTo �޼ҵ带 �������̵� �ؾ� ��

		// 2. Comparator(java.util) : ���ϴ� ���� ���ش�� ���� (����� ����)
		// - ���� Comparator�� �����ϴ� Ŭ�������� ����� ���������� ���������� ���� ����
		// Ŭ���� �����ؼ� ��� ���� (���ظ�ŭ Ŭ������ ������ ��, �� Ŭ������ �� ���� ����)
		// - �ݵ�� compare �޼ҵ带 �������̵� �ؾ���
		
		
		
		ArrayList<Travel> a1 = new ArrayList<Travel>();
		a1.add(new Travel(1,"���̽�����","���ζ�"));
		a1.add(new Travel(3,"�����","����"));
		a1.add(new Travel(2,"��Ȧ","��Ų�����"));
		a1.add(new Travel(5,"���𺸽���","�߷�"));
		a1.add(new Travel(4,"ũ�ξ�Ƽ��","��������"));
		//a1.add(new String("abc"));
		
		//1.Collections Ŭ���� Ȱ�� 
		//Comparable����
		
		Collections.sort(a1);// �������� (ASC- Ascending) <-> �������� (DESC- Descending)
		
		 //comparater����
		//Collections.sort(a1,new AscTravelNum());
		//Collections.sort(a1,new DescTravelNum());
		//Collections.sort(a1,new AscCountry());
		//�ѹ��� ���
		//System.out.println(a1);
		
		//2.list.sort
		//Comparable ��� 
		//a1.sort(null);
		 //comparater����
		a1.sort(new DescTravelNum());
		/*for(Object c : a1) {
			
			System.out.println((Travel)c);
		}*/
		
		
		// �ݺ��� Iterator
		Iterator<Travel> it =a1.iterator();// a1�� �ִ� ��ü���� Iterator
        while(it.hasNext()){//���� ��Ұ� �ִ��� Ȯ�� 
        	System.out.println(it.next());//�����Ҹ� ������ ���
        }
     /*   Iterator<Travel> it1 = new LinkedList(a1).descendingIterator();
        while(it.hasNext()){//���� ��Ұ� �ִ��� Ȯ�� 
        	System.out.println(it.next());//�����Ҹ� ������ ���*/
        
	}
	}
//}
