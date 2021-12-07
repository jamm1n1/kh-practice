package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	
	
	public static final int size = 10;
	
	private int memberCount;
	
	private Member[] mem = new Member[size];//초기화 블럭이란 중괄호만으로 이루져있거나 static{}을 말한다

	private Member searchMember;
	 {
	
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	
}
		public int getMemberCount() {
			return memberCount;
		}
		public Member[]getMem(){
			return mem;
		}
		public Member checkid(String userid) {
			Member m = null;
		
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getUserId().equals(userid)) 
					return mem[i];
			
			}
			return m;
		}
		public void insertMember(Member m) {			
			mem[memberCount++] = m;
		}
		
		public Member searchMember(int menu ,String search) {
			searchMember = null;
			if(menu ==1) {
				for(int i = 0; i < memberCount; i++) {
					if(mem[i].getUserId().equals(searchMember)) return mem[i]; //for문을 통해 mem [i]아이디로 검색하여 이퀄스를
				}
			}else if(menu == 2) {
				for(int i = 0; i < memberCount; i++) {
					if(mem[i].getName().equals(searchMember)) return mem[i];
				}
			}else {
				for(int i = 0; i < memberCount; i++) {
					if(mem[i].getEmail().equals(searchMember)) return mem[i];
				}
			}
			return searchMember;
			
		}
		public void updateMember(Member m ,int menu, String update) {
			if(menu==1) {
				
				m.setUserPwd(update);
			}else if (menu ==2 ) {
				m.setName(update);
			}else {
				m.setEmail(update);
			}
		
		}
		public void deleteMember(String userid) { //배열이 다차지 않아서 오류가 발생하는거같다?
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getUserId().equals(userid)) { //중복된 아이디 존재할경우
					for(int j = i+1; j <memberCount; j++) {//카운트를 한칸식 땅기고
						mem[j-1] = mem[j];
					}
					break;
				}
			}
			mem[memberCount -1] = null;// 멤버 하나 비웠으니 -1
			memberCount--;
		}
		//정렬부분 가이드보고 다시 공부하기 너무어렵다 여기만넘ㅇ으면되는데 
	/*	public Member[] sortIdAsc() {//이부분은 다른사람껄 가져왔다 근데 전혀 모르겠다 왜 이렇게하는거지 ?  이부분은 가이드를 보고 다시 공부해야할거같다
			//compareTo : 숫자의 비교 같은 경우는 단순히 크다(1), 같다(0), 작다(-1) 의 관한 결과값을 리턴해주는 반면

                                          //문자열의 비교 같은 경우는 같다(0), 그 외 양수/음수값 같이 참 재미난 결과를 반환해준다.



				Member [] copy = mem.clone();
				for(int i = 0; i < memberCount - 1; i++) {
					for(int j = 0; j < memberCount - 1 - i; j++) {
						if(copy[j].getUserId().compareTo(copy[j+1].getUserId()) > 0) {
							Member tmp = copy[j];
							copy[j] = copy[j+1];
							copy[j+1] = tmp;
						}
					}
				}
				return copy;
			}
			public Member[] sortIdDesc() {
				Member [] copy = mem.clone();
				for(int i = 0; i < memberCount - 1; i++) {
					for(int j = 0; j < memberCount - 1 - i; j++) {
						if(copy[j].getUserId().compareTo(copy[j+1].getUserId()) < 0) {
							Member tmp = copy[j];
							copy[j] = copy[j+1];
							copy[j+1] = tmp;
						}
					}
				}
				return copy;
			}
			public Member[] sortAgeAsc() {
				Member [] copy = mem.clone();
				for(int i = 0; i < memberCount - 1; i++) {
					for(int j = 0; j < memberCount - 1 - i; j++) {
						if(copy[j].getAge() - copy[j+1].getAge() > 0) {
							Member tmp = copy[j];
							copy[j] = copy[j+1];
							copy[j+1] = tmp;
						}
					}
				}
				return copy;
			}
			public Member[] sortAgeDesc() {
				Member [] copy = mem.clone();
				for(int i = 0; i < memberCount - 1; i++) {
					for(int j = 0; j < memberCount - 1 - i; j++) {
						if(copy[j].getAge() - copy[j+1].getAge() < 0) {
							Member tmp = copy[j];
							copy[j] = copy[j+1];
							copy[j+1] = tmp;
						}
					}
				}
				return copy;
			}
			public Member[] sortGenderDesc() {
				Member [] copy = mem.clone();
				for(int i = 0; i < memberCount - 1; i++) {
					for(int j = 0; j < memberCount - 1 - i; j++) {
						if(copy[j].getGender() - copy[j+1].getGender() < 0) {
							Member tmp = copy[j];
							copy[j] = copy[j+1];
							copy[j+1] = tmp;
						}
					}
				}
				return copy;
			}*/
		}
