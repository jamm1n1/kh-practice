package com.mvc.view;

import java.util.Scanner;

import com.mvc.controller.MemberController;


public class MemberView {
private Scanner sc = new Scanner(System.in);
private MemberController mc = new MemberController();  



public void maimMenu() {
	System.out.println("���̵� �Է��Ͻÿ� : ");
	String id = sc.nextLine();
	
	System.out.println("��й�ȣ�� �Է��Ͻÿ� : ");
	String pwd = sc.nextLine();
	
	int result =mc.login(id,pwd);
	
	if (result == 1){	
		while(true) {
		System.out.println("=== ȸ�� ���α׷� ===");
		System.out.println("1. ������ ����");
		System.out.println("2. �� ���� ��ȸ�ϱ�");
		System.out.println("3. Ű �����ϱ�");
		System.out.println("9 ���α׷� �����ϱ�");
		System.out.println("�޴� ��ȣ ���� : ");
		int num = sc.nextInt();
		
            switch(num) {
            case 1 :
                mc.readinfo();
                System.out.println(mc.readinfo().toString());
            	 break;
            case 2 :
            	mc.readAge();
            	System.out.println(mc.readAge());           	
            	break;
            case 3 :
            	System.out.println("������ Ű�� �Է��Ͻÿ� : ");
            	double updateHeight=sc.nextDouble();
            	mc.updateHeight(updateHeight);
            	break;
            case 9 :
            	System.out.println("���α׷��� �����մϴ�");
            	return;
       
            	
            
            }
            

		}
	}
	else{
		System.out.println("���α׷�����");
		return;		
}
}
}