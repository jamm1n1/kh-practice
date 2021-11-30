package cim.uni.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	/*
	 * * switch��
	 * 
	 * switch(������Ҵ����){ // ���⼭ ������� ����ڴ� �ݵ�� int���̳�, char, String �ۿ� �Ұ�!! case ��1
	 * : �����ڵ�1; break; case ��2 : �����ڵ�2; break; case ��3 : �����ڵ�3; break; ... default :
	 * ���� ���ǿ� �� �������� ���� ��� ������ �ڵ�; }
	 * 
	 * ���Ҵ���� == ��1 �� ��� �����ڵ�1�� �����ϰ� break�� ���� ����������. if-else if���� �޸� �����ڵ� �����ϰ� �ڵ�����
	 * ���������� ����.. break�� �ɾ���ߵ�
	 */
	public void method1() {
		// 1~3 ������ ������ �Է� �޾�
		// 1�ΰ�� "������ �Դϴ�."
		// 2�ΰ�� "�Ķ��� �Դϴ�."
		// 3�ΰ�� "�ʷϻ� �Դϴ�."
		// �߸� �Է� �Ͽ��� ��� "�߸� �Է� �Ͽ����ϴ�. "
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
		 * System.out.println("���� : ");  if(num == 1) {
		 * System.out.println("������ �Դϴ�."); } else if(num == 2) {
		 * System.out.println("�Ķ��� �Դϴ�."); } else if(num == 3) {
		 * System.out.println("�ʷϻ� �Դϴ�."); }else { System.out.println("�� �� �Է��ϼ̽��ϴ�."); }
		 */

		switch(num) {

		case 1:
			System.out.println("������ �Դϴ�.");
			break;
		case 2:
			System.out.println("�Ķ��� �Դϴ�.");
			break;
		case 3:
			System.out.println("�ʷϻ� �Դϴ�.");
			break;
		case 4:
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			break;
			
		}

	}
	public void method2() {
		//Ű����� ���� �̸��� �Է¹޾Ƽ�
		//fruit + "������" + price + "�Դϴ�"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �̸��� �Է��ϼ��� : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
	switch(fruit) {
	case "����" :
		price = 1000;
		break;
	case "���" :
		price = 2000;
		break;
	case "Ű��" :
		price = 3000;
		break;
	case "�ٳ���" :
		price = 4000;
		break;
		default : 
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			//break;
			return;
					
	}
		System.out.println(fruit + "������" + price + "�Դϴ�");
	}
	public void method3() {
	//1~12�� ���� �Է¹޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���.
	Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		
	   int month = sc.nextInt();
	    
		switch(month){
			case 1 :			
		    case 3 :				
			case 5 :				
			case 7 :							
			case 8 :									
			case 10 :			
			case 12 :
			System.out.println("�Է��Ͻ� ���� 31�� �����Դϴ�.");
				break;			
		    case 4 :				
			case 6 :				
			case 9 :							
			case 11 :									
				System.out.println("�Է��Ͻ� ���� 30�� �����Դϴ�.");			
				break;
			case 2 :
				System.out.println("�Է��Ͻ� ���� 28�� Ȥ�� 29�� �����Դϴ�.");
				break;
			default : 
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				return;
		}	
	}
	
}
