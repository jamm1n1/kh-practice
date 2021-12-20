package com.uni.chap03_set.part2_treeset.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import com.uni.chap02_listSort.model.vo.Travel;
import com.uni.chap03_set.part2_treeset.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		// String에 compareto가 포함되어 오름차순으로 나옴 
		//TreeSet은 정렬 기준이 있어야한다 .
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add(new String("하하하"));
		ts.add(new String("나나나"));
		ts.add(new String("가가가"));
		ts.add(new String("다다다"));
		ts.add(new String("하하하"));

		System.out.println(ts);
		
		TreeSet<Student> ts1 = new TreeSet<>();
		
		ts1.add(new Student("공유",30,100));
		ts1.add(new Student("이효리",20,90));
		ts1.add(new Student("유재석",40,60));
		ts1.add(new Student("공유",10,100));
		
		System.out.println(ts1);
		//TreeSet 의경우 hashCode, equals 로 중복판단을 하지않고
		//compareTo 에 제시되어있는 필드로 중복 처리를 해준다.(동일객체 판단)
		
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
