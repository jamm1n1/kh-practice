package com.uni.part02.personMVC.run;

import com.uni.part02.personMVC.view.PersonMenu;

public class Run {

	public static void main(String[] args) {
		//MVC����
		// Model : �����͸� ����ϴ� ����
		// View  : ������� �ð����� ��Ҹ� ����ϴ� ���� (ȭ�鰰����)  --> ����ڿ��� ����� ���شٰų�, ����ڷκ��� ���� �Է¹޴� �������� ������ ����
		// Controller : ����ڰ� ��û�ϴ� ����� ó�����ִ� ���� 
		
		/*
		 *  Run  		->   View  		 -> 	 Controller
		 *  ùȭ�� ����		��¹��Է� 		��û		������� ��û�� ó������
		 *  							<--
		 *  				������		 ��û ó����� ��ȯ
		 */
		int sum = 7445;
		int count = 3;
		double avg1 = Math.round(((double)sum/count) *1000)/1000.00;
		double avg4 = Math.round(((double)sum/count) *100)/100.0;

		double avg = (double)sum/count;
		String avg2 = String.format("%.3f",avg1);
		String avg3 = String.format("%.2f",avg1);
		System.out.println(avg+"   "+String.valueOf(avg1)+"  "+avg2+" "+avg3 +" "+ String.valueOf(avg4));

		new PersonMenu().mainMenu();
	}

}
