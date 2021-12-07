package com.mvc.controller;

import com.mvc.model.vo.Member;

public class MemberController {

	private Member mem = new Member("user01","user02","user03","983456-123456",187);

   
     //이퀄스사용 

    public int login(String id , String pwd) {
    	if(mem.getMemberId().equals(id) && mem.getMemberpwd().equals(pwd)) {
    		return 1;
  
    	}else {
    		return 0;
    	}
    	
    }
 
    public Member readinfo() {
    	return mem;
    }
   public  int readAge() {   	
	   String age = mem.getCitizenNo();
		int age1= Integer.parseInt(age.substring(0,2));
		//Integer.parserInt()는 문자열을 그냥 숫자로 변환시키는거라고한다 . (no.substring(0,2)) 이것은 인덱스 0번부터 2번인덱스가 되기전까지만 출력하라는 것
		//그래서 String형인 주민번호를 숫자로 바꿔주고 인덱스 7번째에있는 번호 1~2면 1900년대 3~4면 2000년대이므로 구분해서 과제MVC안에 있는 힌트를 보고 풀어보자 
		//이거떄매 하루반 생각한 나는 바보인거같다. 과제안에 힌트 들어있는걸 일요일인 오늘봤다 나는 정말 바보인가
		
		char ch = age.charAt(7);
		int age2 = 0;
		
		if(ch == '1'||ch == '2') {
			age2 = 2021-(1900+age1)+1;
		} else if(ch == '3'||ch == '4') {
			age2 = 2021-(2000+age1)+1;
		}
		return age2;
        
	
 
   }
    public void updateHeight(double height) {
    	mem.setHeight(height);
    }
    
}