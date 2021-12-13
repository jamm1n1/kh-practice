package mvc.view;

import mvc.controller.LibraryManager;
import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {
private LibraryManager im = new LibraryManager();	
private Scanner sc = new Scanner(System.in);
	
public void mainMenu() {
	System.out.println("�̸� : ");
	String name = sc.nextLine();
	System.out.println("���� : ");
	int age = sc.nextInt();
	
	System.out.println("���� : ");
	sc.nextLine();
	char gender = sc.nextLine().charAt(0);
    Member mem1 = new Member(name,age,gender);
    im.insertMember(mem1);
    while(true) {
    	System.out.println("===�޴�===");
    	System.out.println("1.����������");
    	System.out.println("2.���� ��ü ��ȸ");
    	System.out.println("3.���� �˻�");
    	System.out.println("4.���� �뿩�ϱ�");
    	System.out.println("0.���α׷� �����ϱ�");
    	int num1 = sc.nextInt();
    	switch (num1) {
    	case 1 :
    		 im.myinfo();
    		 System.out.println(mem1);
    		 break;
    	case 2 :
    		selectAll();
    		break;
    	case 3 :
    		searchBook();
    		break;
    	case 4 :
    		rentBook();
    		break;
    	case 0 :
    		return;
    		
    	}
    }
}
public void selectAll() {	
	Book[]bList = im.selectAll();
	for(int i = 0; i <bList.length; i++) {
		System.out.println(i+"������ : " + bList[i]);
	}
}
public void searchBook() {
	System.out.println("�˻��� ���� Ű���� : ");
	sc.nextLine();
	String keyword = sc.nextLine();
	Book[]searchList = im.searchBook(keyword);
	for(Book b  : searchList) {
		if(b instanceof AniBook) {
			System.out.println(((AniBook)b).toString());
		} else if(b instanceof CookBook) {
			System.out.println(((CookBook)b).toString());
		}
	}
}

public void rentBook() {
	selectAll();
	System.out.println("�뿩�� ���� ��ȣ ���� : ");
	int num = sc.nextInt();
	int result = im.rentBook(num);
	if(result == 0) {
		System.out.println("���������� �뿩�� �Ǿ����ϴ�");
	}
	else if (result == 1) {
		System.out.println("������������ �뿩 �Ұ��� �Դϴ�.");
	}
	else {
		System.out.println("���������� �뿩 �Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����ϴ�.������������ ���� Ȯ���ϼ���");
	}
}
}
