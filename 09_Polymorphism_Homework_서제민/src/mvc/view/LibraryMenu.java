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
	System.out.println("이름 : ");
	String name = sc.nextLine();
	System.out.println("나이 : ");
	int age = sc.nextInt();
	
	System.out.println("성별 : ");
	sc.nextLine();
	char gender = sc.nextLine().charAt(0);
    Member mem1 = new Member(name,age,gender);
    im.insertMember(mem1);
    while(true) {
    	System.out.println("===메뉴===");
    	System.out.println("1.마이페이지");
    	System.out.println("2.도서 전체 조회");
    	System.out.println("3.도서 검색");
    	System.out.println("4.도서 대여하기");
    	System.out.println("0.프로그램 종료하기");
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
		System.out.println(i+"번도서 : " + bList[i]);
	}
}
public void searchBook() {
	System.out.println("검색할 제목 키워드 : ");
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
	System.out.println("대여할 도서 번호 선택 : ");
	int num = sc.nextInt();
	int result = im.rentBook(num);
	if(result == 0) {
		System.out.println("성공적으로 대여가 되었습니다");
	}
	else if (result == 1) {
		System.out.println("나이제한으로 대여 불가능 입니다.");
	}
	else {
		System.out.println("성공적으로 대여 되었습니다. 요리학원 쿠폰이 발급되었습니다.마이페이지를 통해 확인하세요");
	}
}
}
