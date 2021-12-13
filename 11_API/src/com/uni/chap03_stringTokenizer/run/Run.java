package com.uni.chap03_stringTokenizer.run;

import java.net.MulticastSocket;
import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {

		// StringTokenizer
		// : String(���ڿ�)�� � Ư�� ��ȣ�� �������� Token ������ ������ ó���Ҷ� ����  //�ܾ��ϳ��ϳ��� ��ū��
		// split �޼ҵ�� �����ϳ� split �޼ҵ带 ���� String �迭�� ó��

		
		String str = "���꽽,����ȣ,�ο�,ī�����,����";
		StringTokenizer st = new StringTokenizer(str,",");
		
		System.out.println(st.countTokens());//��ū ���� ����
		
		while(st.hasMoreTokens()) {// Ŀ�� ������ ��ū�� �ִ��� Ȯ���Ѵ�
			String nStr = st.nextToken(); // ���ڿ��� �ϳ��� ���´�
			System.out.println(nStr);
			System.out.println("��ū�� : "+ st.countTokens());
					
		}
	}
}
