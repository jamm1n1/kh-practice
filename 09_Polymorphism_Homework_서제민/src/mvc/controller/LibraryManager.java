package mvc.controller;

import mvc.model.vo.CookBook;
import mvc.model.vo.Book;
import mvc.model.vo.Member;
import mvc.model.vo.AniBook;
public class LibraryManager {

	private Member mem =null;
	
	private Book[]bList = new Book[5];
	
	{
		bList[0]= new CookBook("�������� ����","������","tvN",true);
		bList[1]= new AniBook("�ѹ� �� �ؿ�", "��Ƽ","�����",19);
		bList[2]= new AniBook("������ ���ǽ�","����","japan",12);
		bList[3]= new CookBook("�������� �󸶳� ���ְԿ�","������","����",false);
		bList[4]= new CookBook("������ �� �����غ�","������","�ұ�å",true);
	}
	
	public void insertMember(Member mem) { //�ּ� �������� this ��� ��������
		
		this.mem = mem;

	}
	public Member myinfo() {
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	public Book[] searchBook(String keyword) {
		int count = 0;
	   Book[] search = new Book[5];
	   for(int i = 0; i < search.length; i++) {
		   if (bList[i].getTitle().contains(keyword)) {
				search[count++] = bList[i];
			}
	   }
	return search;
	}
public int rentBook(int index) {
	int count = 0;
	int result = 0;
	if(bList[index] instanceof AniBook) {
		if(mem.getAge() <= ((AniBook)bList[index]).getAccessAge()) {
			return result = 1;
		}
	}
	else if(bList[index] instanceof CookBook) {
		if(((CookBook)bList[index]).isCoupon() ) {
			mem.setCouponCount(++count);
			return result = 2 ;
			
		}
	}
	return result;
}
	
	
	
		
	}

		
	
	

	
		
	

