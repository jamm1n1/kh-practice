package com.uni.chap07_method.part1_merhodTest.controller;

import com.uni.chap06_constructor.model.vo.User;

public class NonStaticMethod {
	// �޼ҵ�
		/*
		 * [����������] [�����] ��ȯ�Ұ����ڷ��� �޼ҵ��([�ڷ��� �Ű�������, �ڷ��� �Ű�������, ...]) {
		 * 		���೻��;
		 * 		[return ��ȯ��;]
		 * }
		 */
		//�Ű������� ������ ��ȯ�� ������ ���� ����
		
		//1.�Ű��������� ��ȯ���� ���� �޼ҵ�  -  �ƹ� ���� ��ȯ���� �ʰ� �޼ҵ� ���븸 ������ �޼ҵ� ����
	
	public void method1 () {
		System.out.println("�Ű������� ��ȯ�� �Ѵ� ���� �޼ҵ� �Դϴ�.");
		//return; ��ǻ� ���  �޼ҵ忡 return�� �ִ�. �ٸ� ��ȯ���� �������� JVM �� �ڵ����� ����
	}
		//2. �Ű������� ���� ��ȯ���� �ִ� �޼ҵ� - ��ȯ�Ǵ� ���� ����ϱ� ���� ������ �ۼ��ؼ� �޾����� 
	
		public String method2() {
			return"�Ű������� ��ȯ�� �Ѵ� ���� �޼ҵ� �Դϴ�.";
		
	}
		
		//3.�Ű������� �ְ� ��ȯ���� ���� �޼ҵ� 
		public void method3(int num1, int num2) {//�� �޼ҵ带 ȣ���ϴ� ������ ���޵Ǵ� ���� �ޱ����� �����ϴ°��� �Ű����� 
			System.out.println(num1-num2);
			
			
		}
		//4. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ� 
		public int method4(int num1, int num2) {
			return num1+num2;
		}
		
		//------------------------�߰� : �Ű������� ��ü�� ���޹���
		
		public void method(User u) {
		u.setAge(20);
		
		
		}
}
