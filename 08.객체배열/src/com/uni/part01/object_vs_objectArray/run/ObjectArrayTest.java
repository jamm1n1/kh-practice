package com.uni.part01.object_vs_objectArray.run;

import com.uni.part01.object_vs_objectArraym.model.vo.Product;

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		//��ǰ�� �Ҵ���� product ��ü �迭 ũ�� 3
		Product [] arr = new Product[3];
		//�� �ε��� ���� ��ü���� 
		arr[0] = new Product("��",10000000,"�츮��");
		arr[1] = new Product("��1",10000000,"�츮��");
		arr[2] = new Product("��2",10000000,"�츮��");
		// for������ ������� 
		
		for(Product p : arr) {
			System.out.println(p.information());
		}
		
		}
		
	}


