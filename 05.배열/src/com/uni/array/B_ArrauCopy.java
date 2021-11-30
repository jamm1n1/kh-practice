package com.uni.array;

import java.util.Arrays;

public class B_ArrauCopy {
	/*
	 * �迭�� ���� -�������� : �迭�� �ּҸ��� ���� -�������� : ������ �迭�� �ϳ��� �����ؼ� ���� ���ΰ����� ����
	 */

	public void method1() {
		int[] origin = { 1, 2, 3, 4, 5 };

		// �����迭 ���
		for (int i = 0; i < origin.length; i++) {
			System.out.println(origin[i]);

		}
		int[] copy = origin;
		// ���纻 �迭 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}

		// ���纻 copy�� 2�� �ε����� ���� 99�� ����
		copy[2] = 99;// 1,2,99,4,5
		// �����迭 ���
		for (int i = 0; i < origin.length; i++) {
			System.out.println(origin[i]);
		}
		// ���纻 �迭 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}

		System.out.println("origin �ּҰ�" + origin.hashCode());
		System.out.println("origin �ּҰ�" + copy.hashCode());
	}

	public void method2() {
		// ���� ����
		// 1.for ����� - ���ο� �迭�� �����ؼ� �ݺ����� ���ؼ� ���� ���� �־��ִ� ���

		// 0 1 2 3 4
		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[5]; // ũ�Ⱑ 5�� ��迭�� ���� , ���� �� 0���� �ʱ�ȭ

		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
			System.out.println("���纻 �迭 ���");
		}
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "] = " + copy[i]);
		}
		// ���纻 �迭 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}

		// ���纻 copy�� 2�� �ε����� ���� 99�� ����
		copy[2] = 99;// 1,2,99,4,5
		// �����迭 ���
		for (int i = 0; i < origin.length; i++) {
			System.out.println(origin[i]);
		}
		// ���纻 �迭 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}

		System.out.println("origin �ּҰ�" + origin.hashCode());
		System.out.println("copy �ּҰ�" + copy.hashCode());
	}

	public void method3() {
		// 2 ���ο� �迭�� �����ϰ� SystemŬ������ arraycopy() �޼ҵ带 �̿��� ����
		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[10];
		// System.arraycopy(�����迭�� ,��������� �ε���, ���纻 �迭�� ,���纻 �迭�� ����� ������ġ ,������� )
		// ���� ��� ���纻 ��� ����
		System.arraycopy(origin, 0, copy, 2, origin.length);
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "] �� ��" + copy[i]);
		}
		System.out.println("origin ����" + origin.length);
		System.out.println("copy ����" + copy.length);
		System.out.println("origin �ּҰ�" + origin.hashCode());
		System.out.println("copy �ּҰ�" + copy.hashCode());
	}

	public void method4() {
		// 3.Arrays Ŭ�������� �����ϴ� copyOf()�޼ҵ� ���

		int[] origin = { 1, 2, 3, 4, 5 };

		// Arrays.copyOf(�����迭�� , �����ұ��� (�������� ����, ��� �ڵ����� 0���� �ֱ�ȭ �Ǿ� ����)
		// ���� ������ ���̸�ŭ ������ �Ҵ� 
		int[] copy = Arrays.copyOf(origin, 7);
		
		
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "] �� ��" + copy[i]);
		}
		System.out.println("origin ����" + origin.length);
		System.out.println("copy ����" + copy.length);
		System.out.println("origin �ּҰ�" + origin.hashCode());
		System.out.println("copy �ּҰ�" + copy.hashCode());
		
		
		/*System.arraycopy() �޼ҵ�� ���� ���� �ϰ����Ҷ� �ε����� ������ �����ϰ� ������ ���, ���纻 �迭�� ũ�Ⱑ �״�� ���� 
		 * copy = Arrays.copyOf() �޼ҵ�� ���� �����ϰ��� �ϴ� ���� ���� �ϰ� ũ�⵵ �ٽ� ���� �ϰ� ������ ��� 
		 * 
		 * */
	}
	
	
	
	public void method5() {
		//4. clone() �޼ҵ带 �̿��� ���� 
		//�����ε��� �����ȵ�, �����迭�� ��í�� �����ؼ� ���ο� �迭 �Ҵ� 
		
		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = origin.clone();
		
		copy[2]=99;
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.println("origin[" + i + "] �� ��" +origin[i]);
		}
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "] �� ��" + copy[i]);
		}
		System.out.println("origin ����" + origin.length);
		System.out.println("copy ����" + copy.length);
		System.out.println("origin �ּҰ�" + origin.hashCode());
		System.out.println("copy �ּҰ�" + copy.hashCode());
	}
}
