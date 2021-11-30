package cim.uni.chap02.loop;

import java.util.Scanner;

public class B_wihle {
	/*
	 * * while��
	 * 
	 * [�ʱ��]
	 * 
	 * while(���ǽ�) {
	 * 		�ݺ������� ������ �ڵ�;
	 * 		[������]
	 * }
	 * 
	 * ���ǽ��� true�� ��� �ش� �����ڵ� ����
	 * 
	 * ���ǽ� �˻� --> true�� ��� �����ڵ� ����
	 * ���ǽ� �˻� --> true�� ��� �����ڵ� ����
	 * ���ǽ� �˻� --> false�� ��� �����ڵ� ���� X --> �ݺ��� ���� ����
	 * 
	 * 
	 */
	public void method1 () {
		
		int i = 1; 
		while(i<=5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		System.out.println("i : "+ i);
	
		// 5 4 3 2 1
	    i = 5;
		while(i>=1) {
			System.out.print(i +" ");
			i--;
		}
		System.out.println();
		// 1 2 3 4 5 
		i = 1;
		while(i<=5) {
			System.out.print(i +" ");
			i++;
			
		}
	}
	

	public void method2() {
		//1���� 10������ Ȧ���� ���
		
		int i = 1;
		while(i<=10) {
			if(i % 2 == 1 ) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		i=1;
		while(i <= 10) {
			System.out.print(i + " ");
			i +=2;
		}
	}
	public void method3() {
		//1���� � ������ (1~10������ ������ ����) ������ �հ�
		
		int random =(int)(Math.random()*10+1);
		System.out.println("������"+ random);
		
		int sum =0;
		int i =1;
		while(i <= random) {
			sum+=i;
			i++;
			
		}
		System.out.println("1���� "+ random+ "������ �� : "+sum);
	}
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ� �Է� : ");
		int dan = sc.nextInt();
		if(dan > 1 && dan <10) {
	int i= 1;
	while(i<10) {
		
				System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
				i++;
			}
			
		}else{
			System.out.println("2~9 ������ ����� �Է��ؾ��մϴ�.");
		}
	}
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� �Է� : ");
		String str =sc.nextLine();
		 System.out.println("���ڿ��� ����" + str.length());
		 
		 int i =0 ;
		 while(i<=str.length()-1) {			
			 System.out.println(str.charAt(i));
			 i++;
		 }
	
				 
	}
	public void method6() {
		Scanner sc = new Scanner(System.in);
		 while(true) {
			 
			 System.out.println();
			 System.out.println("===�޴�===");
			 System.out.println("1. 1���� 5���� ��� ");//method1
			 System.out.println("2. 1���� 10������ Ȧ���� ���");//method2
			 System.out.println("3. 1~10������ ������ ���� ������ �հ�");//method3
			 System.out.println("9. ���α׷� ����");
			 
			 System.out.print("�޴� ���� : ");
			 int menu = sc.nextInt();
			 
			 switch(menu) {
			 case 1 : method1();
			 break;
			 case 2 : method2();
			 break;
			 case 3 : method3();
			 break;
			 case 9 : 
			 System.out.println("���α׷��� �����մϴ�.");
			 return;
			 default :
				 System.out.println("�� �� �Է��Ͽ����ϴ�");
				 break;
			 
			 }
			 
		 }
			 
		
		
		
	}
	public void method7() {
		Scanner sc = new Scanner(System.in);
		//��� ���ڿ��� �Է� �ް� �׹��ڿ��� ��� �ϰԲ�
		//������ �׹��ڿ��� "exit" �� �ƴҋ� ���� �ݺ�
		String str="";
		while(!str.equals("exit")) {
			System.out.println("���ڿ��� �Է��� �ּ���");
			str = sc.nextLine();
		  System.out.println("str : "+ str);
		}
			
			
			System.out.println("exit�� �Է��ؼ� ����Ǿ����ϴ�");
			
		
		}

	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		//��� ���ڿ��� �Է� �ް� �׹��ڿ��� ��� �ϰԲ�
		//������ �׹��ڿ��� "exit" �� �ƴҋ� ���� �ݺ�
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
			
	}
}