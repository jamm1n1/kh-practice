package com.kh.collection.silsub1.view;

import java.util.Scanner;

import com.kh.collection.silsub1.controller.BoardManager;

public class BoardMenu {
Scanner sc = new Scanner(System.in);
BoardManager bm = new BoardManager();

public void mainMenu() {
	System.out.println("1.�Խñ� ���� : ");
	System.out.println("2.�Խñ� ��ü ���� : ");
	System.out.println("3.�Խñ� �� �� ���� : ");
	System.out.println("4.�Խñ� ���� ���� : ");
	System.out.println("5.�Խñ� ���� ���� : ");
	System.out.println("6.�Խñ� ���� : ");
	System.out.println("7.�Խñ� �˻� : ");
	System.out.println("8.���Ͽ� �����ϱ� : ");
	System.out.println("9.�����ϱ� : ");
	System.out.println("10.������ : ");
	System.out.println("�޴� ��ȣ ���� : ");
    int num = sc.nextInt();
    while(true) {
    	switch(num) {
    	
    	case 1 :
    		
    	case 2 :
    		
    	case 3 :
    		
    	case 4 :
    		
    	case 5 :
    		
    	case 6 :
    		
    	case 7 :
    		
    	case 8 :
    		
    	case 9 :
    		sortSubMenu();
    	case 10 :
    		return ;
    	}
    }
}
public void sortSubMenu() {
	System.out.println("****** �Խñ� ���� �޴� *******");
	System.out.println("1.�۹�ȣ�� �������� ���� : ");
	System.out.println("2.�۹�ȣ�� �������� ���� : ");
	System.out.println("3.�ۼ���¥�� �������� ���� : ");
	System.out.println("4.�ۼ���¥�� �������� ���� : ");
	System.out.println("5.������� �������� ����  : ");
	System.out.println("6.������� �������� ���� : ");
	System.out.println("7.�����޴��� �̵� : ");
	int num1 = sc.nextInt();
	 while(true) {
	    	switch(num1) {
	    	
	    	case 1 :
	    		
	    	case 2 :
	    		
	    	case 3 :
	    		
	    	case 4 :
	    		
	    	case 5 :
	    		
	    	case 6 :
	    		
	    	case 7 :
	    		return;
	    	}
	 }
}
}
