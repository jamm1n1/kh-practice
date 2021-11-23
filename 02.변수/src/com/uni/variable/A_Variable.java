package com.uni.variable;//A_Variable ����Ʈ ��Ű���� ���� �� �� �ٸ���Ű�� �̹Ƿ� ���� Ŭ���� ���� ��� ������ �����ʴ´�. 

public class A_Variable {
	// ������ : ��� ���� �޸𸮿� ����ϱ� ���� �����̴� (�ڽ���������)
	/*
	 * ������ ����ϴ� ���� : ������ �켱������ ���� �ǹ̸� �ο��ϱ����� �������� ��� �Ѵ�. (�������� ������) ���� �ѹ����� �����صΰ� ���
	 * ����� �������� ���ȴ�.
	 * 
	 * -> ���������� ���� �ϱ����� ����
	 */

	public void printValue() {
		System.out.println("���������");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);

		double PI = 3.141592648;
		int r = 10;
		int h = 20;
		System.out.println("���������");
		System.out.println(2 * PI * r);
		System.out.println(PI * r * r);
		System.out.println(PI * r * r * h);
		System.out.println(4 * PI * r * r);

	}

	public void declareVariable() {
		/*
		 * ������ ���� (������ ���� ����ϱ� ���� ������ �޸� ������ Ȯ���س��� ����) == ����(�ڽ�)����ڴ�!! [ǥ����] �ڷ��� ������;
		 * 
		 * �ڷ��� : � ���� ��Ƴ���, � ũ���� ���� ��Ƴ����� ���� ����(�ڽ�)�� ũ�� �� ����� ���ϴ� �κ� ������ : ����(�ڽ�)��
		 * �̸��� ���ϴ� �κ� (�ǹ̺ο�) -> ���⼭ ������ �̸����� ������ ȣ��
		 * 
		 * �������� - �������� �ݵ�� ù ���ڰ� �ҹ��ڿ��ߵȴ�. - ������ �����ܾ�� ���� �ִ°�� ����Ǵ� �ܾ��� ù���ڴ� �빮�� - ������
		 * ���������� ���� �Ұ� - �ش� ����({})�� ������ ������ �ش� ���� �ȿ����� ���� ���� �ִ�. (�ٸ� �޼ҵ忡���� ��� �Ұ�) ==
		 * �������� ����
		 * 
		 */

		// �ڷ����� ���� ����

		// 1. ���� boolean isTrue; // true(1), false(0)

		// 2. ������ // 2_1. byte bNum; // 1byte short sNum; // 2byte int iNum; // 4byte
		// -> ������ �߿��� ���� ��ǥ���� �ڷ��� (�⺻��) -21��~21��xxx ���� ���� �ڷ��� long iLum; // 8byte

		// 2_2 �Ǽ��� float fNum; // 4byte double dNum; // 8byte -> �Ǽ��� �߿��� ���� ��ǥ����
		// �ڷ���(�⺻��)

		// 3. ������ char ch; // 2byte

		// -------------------������� �⺻�ڷ��� (8��)

		// 4. ���ڿ�(�����ڷ���) String str;

		/*
		 * ������ �� ���� ������ ���� ������� ������ Ȯ���ߴٸ� �ش� ������ �� ���� ����
		 * 
		 * [ǥ����] ������ = ��;
		 * 
		 * 
		 * /* isTrue = true;
		 * 
		 * bNum = 1; sNum = 2; iNum = 5; iLum = 8L;// L�ٿ�����
		 * 
		 * fNum = 4.0f;// �ݵ�� f �� �ٿ����� dNum = 8.0; // d�� ������ �ʾƵ� ��
		 * 
		 * ch = 'A';// ����ǥ�� ����ؼ� ������ // ch = 'ABC';// ���ڿ��� �ѹ��� ���� �����. ���� ch = '��';
		 * 
		 * str = " ABC "; // �ֵ���ǥ�� ����ؼ� �� ���� str = " A "; // �Ѱ��� ���ڸ� ������ �ֵ���ǥ
		 * 
		 * System.out.println("isTrue��" + isTrue); System.out.println("bNum��" + bNum);
		 * System.out.println("sNum��" + sNum); System.out.println("iNum��" + iNum);
		 * System.out.println("iLum��" + iLum); System.out.println("fNum��" + fNum);
		 * System.out.println("dNum��" + dNum); System.out.println("ch��" + ch);
		 * System.out.println("str��" + str);
		 * 
		 * // ctrl + shift + f ����
		 * 
		 */}

	public void initVariable() {
		/*
		 * ���� ����� ���ÿ� �ʱ�ȭ (=������) [ǥ����] �ڷ��� ������ = ��;
		 */
		byte bNum = 5;
		short sNum = 16;
		int iNum = 15 + 17;
		long iLum = 9234233L;

		float fNum = 7.0f;// �ݵ�� f �� �ٿ�����
		double dNum = 125.0; // d�� ������ �ʾƵ� ��

		char ch = '��';// ����ǥ�� ����ؼ� ������
		// ch = 'ABC';// ���ڿ��� �ѹ��� ���� �����. ����
		char ch1 = '��';

		String str = " ���� ���ѹ̵� ���� "; // �ֵ���ǥ�� ����ؼ� �� ����
		String str1 = " ���� ";

		System.out.println("bNum��" + bNum);
		System.out.println("sNum��" + sNum);
		System.out.println("iNum��" + iNum);
		System.out.println("iLum��" + iLum);
		System.out.println("fNum��" + fNum);
		System.out.println("dNum��" + dNum);
		System.out.println("ch��" + ch);
		System.out.println("ch1��" + ch1);
		System.out.println("str��" + str);
		System.out.println("str1��" + str1);

		// ���� ��� ��Ģ

		//int number;
		// 1) �������� ������ ���� �߻�
		// int number;

		// 2) ��ҹ��� ����
		//int numBer;

		// 3)�����(�̹� �ڹٿ��� ���ǰ� �ִ� Ű����)����ϸ� �����߻�
        //��) int true
		// int class
		
		//4) ���� ���� (��, ���ڷ� �����ϴ� ���� �ȵ�)
		//��) int 1age;
		
		//5) Ư�����ڰ���(�� _ $�̿��� Ư�����ڴ� �Ұ���)
		
		//6) �����ܾ�ε� �������ϰ��, �ٿ�����    ����´� �ܾ��� ù���� �빮�� 
		//Stirng username;//���ʻ� Ʋ��
		//Srirng userName;//���ʻ� �´�ǥ�� 

		//String �̸�;//�ѱ۵� �� ��� �����ʴ´�.
		
		
	}
	public void  quest () {
		boolean v1 = false;
		char v2 = '��';
		double v3 = 3.14;
		int v4 = 30;
		String v5 = "aaa";
				
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}	
}
