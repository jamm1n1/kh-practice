package com.uni.chap_set.part01_hashset.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.uni.chap_set.part01_hashset.moel.vo.Student;

public class Run {

	public static void main(String[] args) {
		/*
		 * 1. Hash (hash�˰��� ����) :
		 * 		�������� �˻� ���� ����� ���ؼ� ���
		 * 		(hashCode�� equals�� ��� �������̵� �ؾ��Ѵ�.)
		 * 
		 * 2. Set
		 * 		- �������� �ȵ�, �ߺ� ������ ���� �ʴ´�.(���п����� ���� ����)
		 * 		- �����δ� HashSet, LinkedHashSet, TreeSet�� �ִ�.
		 *      
		 * 3. HashSet
		 * 		- ������ �������� �ʴ´�.
		 * 		- hashCode()�� equals()�� �������̵� �Ǿ� �־�� �Ѵ�.
		 * 
		 * 4. LinkedHashSet
		 * 		- �ִ� ������ ���� �ȴ�.
		 * 		(hashCode�� equals�� ��� �������̵� �ؾ��Ѵ�.)
		 * 
		 * 5. TreeSet
		 * 		- ���ı��ش�� ������ ������(�⺻ ��������)
		 * 		- hashCode()�� equals()�� �������̵� �� �ʿ� ���� �˾Ƽ� �ߺ����� ���� �ʴ´�.
		 * 		- ������ �� �־�� ��(Comparable�̳� Comparator ���� Ŭ����)
		 * 
		 * 
		 */

		
		//Set hs = new HashSet();
		//Collection hs1 = new HashSet();//������ ���� 
		HashSet<String> hs1 = new HashSet();
		hs1.add("�ݰ����ϴ�.");
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add("������");
		hs1.add(new String("�ȳ��ϼ���"));
		hs1.add("������");
		hs1.add("1");
		
		System.out.println(hs1);
		System.out.println(hs1.size());
		
		System.out.println(hs1.contains("������"));
		
		//hs1.clear();
		System.out.println(hs1);
		
		Iterator it = hs1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//String Ŭ������ hashcode(), equals()�� �������̵� �Ǿ����� , �׷��� ���� �ʵ尪�� �����Ѱ�� ���ϰ�ü�� �ν�
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student(1,"����"));
		hs2.add(new Student(2,"�ο�"));
		hs2.add(new Student(3,"����"));
		hs2.add(new Student(4,"����"));
		hs2.add(new Student(3,"����"));
		
		System.out.println("hs2 : "+ hs2);
		//�������� ���� �ε����� �ǹ̰� ����  ������� �Ϸ��� ��� ������
		
	/*	ArrayList<Student>list = new ArrayList<>(hs2);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));*/
		
		for(Student s : hs2) {
			System.out.println(s);
		}
	}

}
