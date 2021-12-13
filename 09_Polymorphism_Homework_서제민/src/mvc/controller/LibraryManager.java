package mvc.controller;

import mvc.model.vo.CookBook;
import mvc.model.vo.Book;
import mvc.model.vo.Member;
import mvc.model.vo.AniBook;
public class LibraryManager {

	private Member mem =null;
	
	private Book[]bList = new Book[5];
	
	{
		bList[0]= new CookBook("백종원의 집밥","백종원","tvN",true);
		bList[1]= new AniBook("한번 더 해요", "미티","원모어",19);
		bList[2]= new AniBook("루피의 원피스","루피","japan",12);
		bList[3]= new CookBook("이혜정의 얼마나 맛있게요","이혜정","문학",false);
		bList[4]= new CookBook("최현석 날 따라해봐","최현석","소금책",true);
	}
	
	public void insertMember(Member mem) { //주소 값대입은 this 사용 숙지하자
		
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

		
	
	

	
		
	

