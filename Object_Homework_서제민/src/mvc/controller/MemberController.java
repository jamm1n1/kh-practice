package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	
	
	public static final int size = 10;
	
	private int memberCount;
	
	private Member[] mem = new Member[size];//�ʱ�ȭ ���̶� �߰�ȣ������ �̷����ְų� static{}�� ���Ѵ�

	private Member searchMember;
	 {
	
		mem[0] = new Member("user01", "pass01", "������", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "�̼���", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "������", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "�����ҹ�", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "�Ż��Ӵ�", 45, 'F', "shin@naver.com");
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
					if(mem[i].getUserId().equals(searchMember)) return mem[i]; //for���� ���� mem [i]���̵�� �˻��Ͽ� ��������
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
		public void deleteMember(String userid) { //�迭�� ������ �ʾƼ� ������ �߻��ϴ°Ű���?
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getUserId().equals(userid)) { //�ߺ��� ���̵� �����Ұ��
					for(int j = i+1; j <memberCount; j++) {//ī��Ʈ�� ��ĭ�� �����
						mem[j-1] = mem[j];
					}
					break;
				}
			}
			mem[memberCount -1] = null;// ��� �ϳ� ������� -1
			memberCount--;
		}
		//���ĺκ� ���̵庸�� �ٽ� �����ϱ� �ʹ���ƴ� ���⸸�Ѥ�����Ǵµ� 
	/*	public Member[] sortIdAsc() {//�̺κ��� �ٸ������ �����Դ� �ٵ� ���� �𸣰ڴ� �� �̷����ϴ°��� ?  �̺κ��� ���̵带 ���� �ٽ� �����ؾ��ҰŰ���
			//compareTo : ������ �� ���� ���� �ܼ��� ũ��(1), ����(0), �۴�(-1) �� ���� ������� �������ִ� �ݸ�

                                          //���ڿ��� �� ���� ���� ����(0), �� �� ���/������ ���� �� ��̳� ����� ��ȯ���ش�.



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
