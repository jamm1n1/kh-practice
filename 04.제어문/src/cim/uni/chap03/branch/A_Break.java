package cim.uni.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method01() {
		//break : ���� ����� �ݺ����� ���������� ����
				// �� switch ������ break�� switch���� ���������� break��
	Scanner sc = new Scanner(System.in);
	/*for(;;) {
	System.out.println("���ڿ� �Է� : ");
	String str = sc.nextLine();
	System.out.println(str);
}*/
/*while() {  -> ���ǽ��� ��������Ѵ�. 
	System.out.println("���ڿ� �Է� : ");
	String str = sc.nextLine();
	System.out.println(str);
}*/
		
	String str="";
	while(true) {
		System.out.println("���ڿ��� �Է��� �ּ���");
		str = sc.nextLine();
		if(str.equals("exit")) {
			break;
		}
	  System.out.println("str : "+ str);
	}
		
		
		System.out.println("exit�� �Է��ؼ� ����Ǿ����ϴ�");
		//���� �ݺ��� �ȿ���break �� ���°�� ���� �ڵ� ���� ->unreachable code ���� ������ �� �����ڵ�, �� ���� ������� ���� �ڵ��̴� 
}
	public void method02() {
		// �Ź� �ݺ������� ������ (1~10) �� �߻���Ų�� ���
				// ��, �� �������� Ȧ���� ��� ��� �����ʰ� �ݺ����� ���������� " ���α׷��� ���� �մϴ� " ���
		while(true) {
			int random = (int)(Math.random() * 10 + 1);
			
			if(random % 2 == 1 ) {
				break;
			}
			System.out.println("������"+ random);
		
		}
		System.out.println("���α׷��� �����մϴ�. ");
	}
}