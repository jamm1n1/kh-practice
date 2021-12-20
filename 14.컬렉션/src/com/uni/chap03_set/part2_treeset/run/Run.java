package com.uni.chap03_set.part2_treeset.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import com.uni.chap02_listSort.model.vo.Travel;
import com.uni.chap03_set.part2_treeset.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		// String�� compareto�� ���ԵǾ� ������������ ���� 
		//TreeSet�� ���� ������ �־���Ѵ� .
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add(new String("������"));
		ts.add(new String("������"));
		ts.add(new String("������"));
		ts.add(new String("�ٴٴ�"));
		ts.add(new String("������"));

		System.out.println(ts);
		
		TreeSet<Student> ts1 = new TreeSet<>();
		
		ts1.add(new Student("����",30,100));
		ts1.add(new Student("��ȿ��",20,90));
		ts1.add(new Student("���缮",40,60));
		ts1.add(new Student("����",10,100));
		
		System.out.println(ts1);
		//TreeSet �ǰ�� hashCode, equals �� �ߺ��Ǵ��� �����ʰ�
		//compareTo �� ���õǾ��ִ� �ʵ�� �ߺ� ó���� ���ش�.(���ϰ�ü �Ǵ�)
		
		//1.for each
		for(Student t :ts1) {
			System.out.println(t);
		}
		
		
		//2.list
		ArrayList <Student> list = new ArrayList<>(ts1);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	    
		
		
		//3.iterator
	   Iterator<Student> it = ts1.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	}

}
