package com.uni.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.uni.part01.object_vs_objectArraym.model.vo.Book;

public class objectTest {

	public static void main(String[] args) {
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
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
			
			if(i == 0 ) {
				bk1 = new Book(title,author,price,publisher);
				
			}else if (i == 1) {
				bk2 = new Book(title,author,price,publisher);
			}else if (i == 2) {
				bk3 = new Book(title,author,price,publisher);
			}
		}
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		

		// ���� �������� �˻� 
		System.out.println("�˻��� å ���� : ");
		String search = sc.nextLine();
		if( search.equals(bk1.getTitle())){
    		System.out.println(bk1.information());
  
    	}else if(search.equals(bk2.getTitle())) {
    		System.out.println(bk2.information());
    	}else if(search.equals(bk3.getTitle())){
    		System.out.println(bk3.information());
    	}else {
    		System.out.println("�˻��� ������ �����ϴ�.");
	   
	    
       
	
		
		
		}
	}
}



