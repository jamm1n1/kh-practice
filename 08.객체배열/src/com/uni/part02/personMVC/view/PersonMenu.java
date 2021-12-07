package com.uni.part02.personMVC.view;

import java.util.Scanner;

import com.uni.part02.personMVC.controller.PersonController;
import com.uni.part02.personMVC.model.vo.Person;

public class PersonMenu {

private Scanner sc = new Scanner(System.in);
private PersonController pc = new  PersonController();
	public void mainMenu() {
		while (true) {
			System.out.println("=====�޴�=====");
			System.out.println("1.ȸ�� �߰�");
			System.out.println("2.ȸ�� ��ü��ȸ");
			System.out.println("3.ȸ�� �̸��˻�");
			System.out.println("4.ȸ�� ��������ȸ");
			System.out.println("9.���α׷�����");
			System.out.println("�޴����� : ");
			
			
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 : 
				insertPerson();
				break;
			case 2 :
				printPerson();
				break;
			case 3 : 
				searchPerson();
				break;
			case 4 : 
				System.out.println("������ : "+ pc.getAvgWealth());
				break;
			case 9 : 
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
			    break;
			}
		}
		
		
	}
	private void searchPerson() {
	
		System.out.println("===��������˻�===");
		System.out.println("�˻��� �̸� : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search);
		
		if(searchPerson == null) {
			System.out.println("�˻��� ����� �����ϴ�.");
		}else {
			System.out.println(searchPerson.information());
		}
	}
	private void printPerson() {
		System.out.println("===���������ȸ===");
		int cnt = pc.getCount();
		if(cnt == 0){
			System.out.println("���� �߰��� ȸ���� �����ϴ�.");
			
		}else {
			Person[] peo = pc.getPeople();
			
			for(int i =0; i < cnt; i++) {
				System.out.println(peo[i].information());
			}
		}
		
	}
	private void insertPerson() {
		System.out.println("===��������Է�===");
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println("���� : ");
		int age  = sc.nextInt();
		
		System.out.println("��� : ");
		int wealth = sc.nextInt();
		sc.nextLine();
		
		boolean in = pc.insertPerson(name,age,wealth);
		
		if(!in) {
			System.out.println("���̻� �߰� �� �� �����ϴ�.");
			
		}
	}
}
