package com.uni.chap4_map.run;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.uni.chap4_map.model.vo.Student;

public class Run {

	/*
	 * Map : �����͸� �����Ҷ� ������ �ڷḦ ���������� �ִ� ������ ���� ���Ͽ� �ش簪���� �����Ҽ� �ִ� ���� ��ü�� ���� �Բ� �����ϴ�
	 * �ڷ� ���� Ŭ����. �ش簴ü�� �����Ҷ� key(�����ǰ� ) �� set �� Ư������ value(������ü)�� List �� Ư������ �����Ѵ�.
	 * ������ ũ�� HashMap, HashTable(�������� -HashMap�� ���� �����弼�������ִ� ), TreeMap, Properties
	 * ���� �ִ�.
	 * 
	 * - map�� key�� value�� ���еǾ� �ְ� �̰� �α��� �� �� ID�� PWDó�� �����ϸ� ���ϴ�. (ID�� �ߺ� �Ұ���, �� Set��
	 * ������ ������ �� �� �ִ�.)
	 * 
	 * - key�� value�� ��� Entry��� �Ѵ�.
	 * 
	 * - key���� ���� String���� �ϴµ�, ������ int�� ���� ArrayList�� ���̰� ���� �����̴�.
	 */
	private static HashMap<String, Student> stdMap = new HashMap<>();

	public static void main(String[] args) {

		test();
	}

	private static void test() {

		HashMap map = new HashMap();

		map.put(1, "a");
		map.put(2, "4");
		map.put(22, "6");
		map.put(4, "22");

		System.out.println(map);

		stdMap.put("Ŀ��", new Student(1, "����"));
		stdMap.put("����", new Student(2, "�����"));
		stdMap.put("���", new Student(3, "������"));

		System.out.println(stdMap);
		stdMap.put("Ŀ��", new Student(1, "���¿�"));
		System.out.println(stdMap);
		stdMap.put("����", new Student(1, "���¿�"));
		System.out.println(stdMap);

		Student s = stdMap.get("Ŀ��");
		System.out.println(s);

		Student d = stdMap.remove("Ŀ��");
		System.out.println(d);

		System.out.println(stdMap);

		// keySet
		// - Value�� ����� �Ҷ� Set �� Ű���� �̾ƿͼ� Set ���� ��Ƽ� ���
		// - Key ���� Set<String> ���� ���� iterator �� �̴´�.
		
		Set<String> kset = stdMap.keySet();
		
		Iterator<String> iter = kset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Student val = stdMap.get(key);
			
			System.out.println(key+" "+val);
			
			//2.values �޼ҵ带 ��� (���� �̱�)
			
			Collection values = stdMap.values();
			
			Iterator iter1 = values.iterator();
			while(iter1.hasNext()) {
				System.out.println(iter1.next());
			}
			//3.EntrySet
			//key �� value �� ���� �������� �Ҷ� Map�� ���� �������̽� �� Entry Ÿ���� �̿�
			//key�� value �� ��� Entry
			//-entrySet : Map.Entry �� ���� ����
			
			Set<Entry<String,Student>> eSet1 = stdMap.entrySet();
				
			Iterator<Entry<String,Student>> it1 = eSet1.iterator();
			
			while(it1.hasNext()) {
				Entry<String,Student> entry = (Entry)it1.next();
				System.out.println(entry.getKey()+"      " + entry.getValue());
			}
			}
	}
}
