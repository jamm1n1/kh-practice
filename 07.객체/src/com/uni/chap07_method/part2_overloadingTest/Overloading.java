package com.uni.chap07_method.part2_overloadingTest;

public class Overloading {

	//�����ε� : ��Ŭ���� ������ ���� �޼ҵ� ������ ������ �� �ִ� ���
	public void test() {}
		
		//public void test() {}
	public void test(int a ) {}
	
	public void test (int a , String s) {}
	
	public void test (String a , String s) {}
	
	public void test (int a , int b) {}
	
//	public void test (int c , int d) {} //�Ű��������� ������� �ڷ����� ������ ���� , Ÿ���� �ٸ��� �ۼ� �Ǿ����
	
	public void test (int a , int b , String str) {}
	
	//public void test (int a , int b , String str) {}//��ȯ���� ����� ����. �Ű������� ���� �ؼ� �����߻�
	
	//private void test (int a , int b , String str) {}// ���������ڴ� �������. �Ű��������� �����ؼ� �����߻�
	
	/*���
	 * �����ε�: ������ �޼ҵ� ���� ����ϴ� �� , �Ű������� �ڷ����� ���� , ������ �ٸ��� �ۼ��Ǿ�� �Ѵ�. (����������,��ȯ���� �������)
	 */
}
