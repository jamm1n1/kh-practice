package com.uni.chap08_mvc.view;

import java.util.Scanner;

import com.uni.chap08_mvc.controller.ProductController;
//mvc ������ view ��Ű�� : ����ڰ� ���Ե� ȭ���� ����ϴ� �κ� , ����ڰ� ���ԵǸ� (print����)�� �ݵ�� view ��Ű�� �������� �ۼ�.
//scanner ��뵵 view ��Ű�� �ȿ����� �ۼ�

public class Productmenu {


		private Scanner sc = new Scanner(System.in);//�Է� �ϱ����� Scanner��ü�� ���������� �̸� �����س���
		private ProductController  pc = new ProductController();// ����ڰ� Ű����� ���� �Է��ϰ� ������ ��û�ϴ� ��� 
		                                                        // ���� �� Ŭ�������� ó���ϴ°��̾ƴϰ�  Controller ���� ó���ϵ��� �޼ҵ带 ȣ�� �� ���̱� ������ �̸�����
		
		
		
		//1.���α׷� �������ڸ��� ����� �޼ҵ�
		public void mainMenu() {
			System.out.println("��ǰ�� : ");
			String name = sc.nextLine();
			
			System.out.println("�귣��� : ");
			String brand = sc.nextLine();
			
			System.out.println("���� : ");
			int price = sc.nextInt();
			
			pc.insertproduct(name,brand,price);
			
			while(true) {
			 System.out.println("=====���θ޴�=====");
			 System.out.println("1.��ǰ������ȸ");
			 System.out.println("2.��ǰ��������");
			 System.out.println("9.���α׷�����");
			 
			 int num = sc.nextInt();
			 sc.nextLine();
			 
			 switch(num) {
			 case 1 :
				 System.out.println(pc.selectProduct().information());
				 break;
			 case 2 :
				 updatePrice();
				 break;
			 case 9 : 
				 System.out.println("���α׷��� �����մϴ�");
				 return;
				 default :
					 System.out.println("�޴��� �ٽ� ������ �ּ��� ");
					 break;
			 }
			}
		}
			private void updatePrice() {
			 System.out.println("������ ������ �Է����ּ��� : "  );
			 int nPrice = sc.nextInt();
			 pc.updateprice(nPrice);
																	
		}
	}

