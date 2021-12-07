package mvc.view;


import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;
public class MemberMenu {
	
private MemberController mc = new MemberController();
Scanner sc = new Scanner(System.in);

public void mainMenu() {
	while(true) {
	System.out.println("=========ȸ������ �޴�=====================");
	System.out.println("1. �ű� ȸ�� ��� ");
	System.out.println("2. ȸ�� ���� �˻�");
	System.out.println("3. ȸ�� ���� ����");
	System.out.println("4. ȸ�� ���� ����");
	System.out.println("5. ȸ�� ���� ���");
	System.out.println("6. ȸ�� ���� ����");
	System.out.println("9. ���α׷� ����");

	int menu = sc.nextInt();
	sc.nextLine();
	
	switch(menu) {
	case 1:
		insertMember();
		break;
	case 2:
		searchMember();
		break;
	case 3: 
		updateMember();
		break;
	case 4:
		deleteMember();
		break;
	case 5:
		printAllMember();
		break;
	case 6:
		sortMember();
		break;
	case 9:
		System.out.println("���α׷��� �����մϴ�.");
		return;
	
	}
	}
}

public void insertMember() { 
	if(mc.getMemberCount() > MemberController.size) {
		return;		
}else {
	System.out.println("���̵� : ");
	String id = sc.nextLine();
	Member m = mc.checkid(id);
	if(m != null) {
		System.out.println("������ ���̴ٰ� �����մϴ�. ȸ�� ��� ����");
	}else {
		System.out.println("��й�ȣ : ");
		String pwd = sc.nextLine();
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println("���� : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.println("����(M/F) : ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
		
		System.out.println("�̸��� : ");
		String email = sc.nextLine();
		mc.insertMember(new Member(id,pwd,name,age,gender,email)); // �μ�Ʈ ����ȿ��� ���ο� ��ü�� �����ؾ��ϳ���  mc.insertMember() = new Member(id,pwd,name,age,gender,email)�ȵ�
		System.out.println("���������� ȸ���� ��ϵǾ����ϴ�.");
	}
}
}public void searchMember() {
	while(true) { //switch ���� ����ϴ� ������� �׳����� 
	System.out.println("====ȸ�� ���� �˻�=====");
	System.out.println("1. ���̵�� �˻��ϱ�");
	System.out.println("2. �̸����� �˻��ϱ�");
	System.out.println("3. �̸��Ϸ� �˻��ϱ�");
	System.out.println("9. ���� �޴��� ");
	System.out.println("�޴� ���� : ");
	System.out.println("�˻� ���� : ");
	int menu = sc.nextInt();
	if(menu == 9) return;
	System.out.println("�˻� ���� : ");
	String search = sc.nextLine();
	Member m = mc.searchMember(menu, search);
	if(m == null) {
		System.out.println("�˻��� ����� �����ϴ�.");
	}else {
		System.out.println(m.information());
	}
	}
	
}
public void updateMember() {
	System.out.println("====ȸ�� ���� ����=====");
	System.out.println("1.��й�ȣ ����");
	System.out.println("2.�̸� ����");
	System.out.println("3.�̸��� ����");
	System.out.println("9.���� �޴��� ");
	
	System.out.println("�޴� ���� : ");
	int menu = sc.nextInt();
	if(menu == 9) return;
	
	sc.nextLine();
	System.out.println("������ ȸ�� ���̵� : ");
	String userId = sc.nextLine();	
	Member m = mc.checkid(userId);
	if(m == null) System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
	else {
		System.out.println("== ȸ�� ���� ==");
		System.out.println(m.information());
		
		System.out.println("���� ���� : ");
		String update = sc.nextLine();
		
		mc.updateMember(m,menu,update);
		System.out.println("ȸ���� ������ ����Ǿ����ϴ�.");
	}
}
public void deleteMember() {
	System.out.println("������ ȸ�� ���̵� : ");
	String userid = sc.nextLine();
	Member m = mc.checkid(userid);
	if(m == null) {
		System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
	}
	else {
		System.out.println("=== ȸ�� ���� ===");
		System.out.println(m.information());
		System.out.println("���� �����Ͻðڽ��ϱ�? (y/n)");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			mc.deleteMember(userid);
			System.out.println("ȸ���� ������ �����Ǿ����ϴ�.");
		}else {
			return;
}
}
}
public void printAllMember() {
	Member[] mem = mc.getMem();
}
public void sortMember() {
	
	
		Member[] sortMem = null;
		
		while(true) {
			System.out.println("===== ȸ�� ���� ���� =====");
			System.out.println("1.���̵� �������� ����");
			System.out.println("2.���̵� �������� ����");
			System.out.println("3.���� �������� ����");
			System.out.println("4.���� �������� ����");
			System.out.println("5.���� �������� ����(������)");
			System.out.println("9.���� �޴���");
			System.out.println("�޴� ���� : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1: sortMem =mc.sortIdAsc();
					break;
				case 2: sortMem = mc.sortIdDesc();
					break;
				case 3: sortMem = mc.sortAgeAsc();
					break;
				case 4: sortMem = mc.sortAgeDesc();
					break;
				case 5: sortMem = mc.sortGenderDesc();
					break;
				case 9: 
					return;
			}
			for(int i = 0; i < mc.getMemberCount(); i++) {
				System.out.println(sortMem[i].information());
			}
			
		}
}
}