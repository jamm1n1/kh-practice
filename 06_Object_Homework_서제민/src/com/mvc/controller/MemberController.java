package com.mvc.controller;

import com.mvc.model.vo.Member;

public class MemberController {

	private Member mem = new Member("user01","user02","user03","983456-123456",187);

   
     //��������� 

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
		//Integer.parserInt()�� ���ڿ��� �׳� ���ڷ� ��ȯ��Ű�°Ŷ���Ѵ� . (no.substring(0,2)) �̰��� �ε��� 0������ 2���ε����� �Ǳ��������� ����϶�� ��
		//�׷��� String���� �ֹι�ȣ�� ���ڷ� �ٲ��ְ� �ε��� 7��°���ִ� ��ȣ 1~2�� 1900��� 3~4�� 2000����̹Ƿ� �����ؼ� ����MVC�ȿ� �ִ� ��Ʈ�� ���� Ǯ��� 
		//�̰ŋ��� �Ϸ�� ������ ���� �ٺ��ΰŰ���. �����ȿ� ��Ʈ ����ִ°� �Ͽ����� ���úô� ���� ���� �ٺ��ΰ�
		
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