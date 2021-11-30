package cim.uni.chap01.condition;

import java.util.Scanner;

public class B_ELse {
	/*
	 * * if-else��
	 * 
	 *  �� ������ ��� ������Ű�� �� ������ �ƴ϶�� ������ �� �����Ű�� ����
	 *  
	 *  if(���ǽ�){
	 *  	.. ���� �ڵ�1 ..
	 *  }else {
	 *  	.. ���� �ڵ�2 ..
	 *  }
	 *  
	 *  ���ǽ��� ����� true�� ��� �����ڵ� 1 ���� �� if-else�� ��������
	 *  ������ ���ǽ��� ����� false �� ��� ������ ���� �ڵ� 2 ����
	 */
	
	/*
	 * * if-else if��
	 * 
	 *  ���� �� ������� �������� ������ ������ ��� 
	 *  
	 *  if(���ǽ�1){
	 *  	.. ���� �ڵ� 1 ..
	 *  }else if(���ǽ�2){
	 *  	.. ���� �ڵ� 2 ..
	 *  }else if(���ǽ�3) {
	 *  	.. ���� �ڵ� 3 ..
	 *  }[else {
	 *  	.. ���� ���ǵ��� �� false�� ��� ������ �ڵ� ..
	 *  }]
	 * 
	 *  ���ǽ� 1�� ����� true�� ��� ���� �ڵ� 1 �����ϰ� ��������
	 *  ������ ���ǽ�1�� ����� false�� ��� ���ǽ�2 ����
	 *  ���ǽ�2�� ����� true�� ��� ���� �ڵ� 2 �����ϰ� �������� 
	 *  �ƴϸ� �� ���� ���ǽ� ����.. �̷��� ����
	 *  �� else���� ���õǾ� ���� ��� ���� ������ �� false�� ������ �Ǹ� ������ else ���� ����
	 * 	
	 */
	public void method1 () {
Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
		
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("�����");
		}
		else if(num < 0) {
			System.out.println("������");		
		}else {
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
			    else {
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
			else if(gender == 'F' || gender == 'f') {
				student = "���л�";
				
				
			}
			else
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				 return;//return �� ��� ���� �޼ҵ��� �ڿ� �ڵ带 �������� �ʰ� �ٷ� �� �޼ҵ带 ȣ���� ������ ����������
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
		else if(age <=19) {
		 result = "û�ҳ�";
	 }
		else {
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
		//String �񱳽� String Ŭ�������� �����ϴ� equals() �޼ҵ带 �̿��ؼ� ���Ѵ�.
		if (name.equals ("��ȿ��")) {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("������ �ƴմϴ�");
	}
			

			
	}
	public void method6() {
		// ����ڿ��� Ű����� ������ �Է� �޾� �������� ����� ������ ������ ����� ����ϴ� �޼ҵ� 
		
				//90�� �̻��� A���
				//90�� �̸� 80�� �̻��� B���
				//80�� �̸� 70�� �̻��� C���
				//70�� �̸� 60�� �̻��� D���
				//60�� �̸��� F���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int score = sc.nextInt();
		String result = "";
		if(score < 60) {
			result = "F";
		}
			else if(score < 70) {
				result = "D";
			}
				else if(score < 80) {
					result = "C";
				}
					else if(score < 90) {
						result = "B";
					}
						else {
							result ="A";
						}
		System.out.println(result);
						
						
			
			
		}
			
	}
	


