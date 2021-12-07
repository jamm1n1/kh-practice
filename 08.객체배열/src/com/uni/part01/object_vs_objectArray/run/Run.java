package com.uni.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.uni.part01.object_vs_objectArraym.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		//1. �⺻�ڷ��� �迭 
		int[ ]arr = new int [3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		
		//arr�� �ڷ��� : int[]  --> ���۷������� == �ּҰ��� ������ ����
		//arr[index] �� �ڷ��� : int --> �Ϲݺ��� == ���� ���� ������ ����
		
		
		
		
		//2. ��ü�� ������ ������ ��ü �迭 ��� 
		Book[] books = new Book[3];
		//books�� �ڷ��� : Book[]  --> ���۷������� == �ּҰ��� ������ ����
				//books[index] �� �ڷ��� : Book --> ���۷������� == �ּҰ��� ������ ����
				//books[index] = ��ü����;
		
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		System.out.println(books);
		System.out.println(books[0]);
		
		//���� ���� ���ִ� ���� books[index] ��ü�� �ʵ�� ���� �ϸ��
		System.out.println(books[0].getPrice());//books[0].getPrice()�� �ڷ����� int
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println(i+1+"���� ���� ���� �Է�");
			System.out.println("���� : ");
			String title = sc.nextLine();
			System.out.println("���� : ");
			String author = sc.nextLine();
			System.out.println("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println("���ǻ� : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title,author,price,publisher);
			
		}
		
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}
		//�Ϲ� for �� 
		System.out.println("�˻��� å ���� : ");
		String search = sc.nextLine();
		for (int i = 0; i < books.length; i++) {
			if(books[i].getTitle().equals(search))
				System.out.println(books[i].information());
		}
		//for each�� 
		for(int num : arr ) {
			System.out.println("num : " + num);
		}
		for (Book b  : books) {
			System.out.println("b : "+ b.information());
		}
	}

}
