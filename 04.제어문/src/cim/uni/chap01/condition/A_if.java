package cim.uni.chap01.condition;

import java.util.Scanner;

public class A_if {
	/*�ܵ� if �� ��� 
	 * if(���ǽ�){
	 *		....������ �ڵ� ....;
	 * }
	 * 
	 * -> ���ǽ��� ��� ���� ��(true) �̸� �߰�ȣ ���� �ڵ� ���� 
	 * -> ���ǽ��� ��� ���� ����(false) �̸� �߰�ȣ ���� �ڵ� �����ϰ� �Ѿ.
	 * */
	
	public void method1 () {
Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
		
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("�����");
		}
		if(num < 0) {
			System.out.println("������");		
		}
		if(num == 0) {
			System.out.println("0�̴�");		
		}
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
				
				int num = sc.nextInt();
				
				if(num%2 ==0) {
					System.out.println("¦���Դϴ�");					
				}
				if(num%2 ==1) {
					System.out.println("Ȧ���Դϴ�");	
				}
	}
	public void method3() {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�");
		String name = sc.nextLine();
		
		System.out.println("�г�(���ڸ�)");
		int grade = sc.nextInt();
		
		System.out.println("��(���ڸ�)");
		int classnum = sc.nextInt();
		
		System.out.println("��ȣ(���ڸ�)");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("����(M/F)");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("����(�Ҽ��� ��° �ڸ�����)");
		double score = sc.nextDouble();
		
		String student ="";
		
	
		
		if(gender == 'M' || gender == 'm') {
			student ="���л�";
			
			
		}
		if(gender == 'F' || gender == 'f') {
			student = "���л�";
			
			
		}
			if(gender !='M' && gender !='F' && gender != 'm' && gender != 'f') {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			 return;//return �� ��� ���� �޼ҵ��� �ڿ� �ڵ带 �������� �ʰ� �ٷ� �� �޼ҵ带 ȣ���� ������ ����������
			}
		
			System.out.println(grade + "�г�" + classnum+"��"+ num + "��"+name + student +"�� ������ "+ score+"�Դϴ�.");
		

				
	}
	public void method4() {
		//13�� �̸��� ���, 14����� 19����� û�ҳ� ,20����� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�");
		int age = sc.nextInt();
		
		String result ="";
		
		if(age <= 13 ) {
			result = "���";
		}
	 if(age > 13 && age <=19) {
		 result = "û�ҳ�";
	 }
	 if(age > 19) {
		 result = "����";
	 }
	 System.out.println(result);
	}
	public void method5() {
		// �Էµ� ���� �����̸��� �´��� Ȯ���ϴ� �޼ҵ� 
Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�");
		String name = sc.nextLine();
		
	/*	if (name == "��ȿ��") {
			System.out.println("�����Դϴ�");
		}
		if (name != "��ȿ��") {
			System.out.println("������ �ƴմϴ�");
		}*/
		if (name.equals ("��ȿ��")) {
			System.out.println("�����Դϴ�");
		}
		if (!name.equals("��ȿ��") ) {
			System.out.println("������ �ƴմϴ�");
	}
}
}
