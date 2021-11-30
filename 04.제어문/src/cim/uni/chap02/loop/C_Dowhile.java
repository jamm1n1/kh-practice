package cim.uni.chap02.loop;

import java.util.Scanner;



public class C_Dowhile {
	/*
	 * * do-while��
	 * 
	 * [�ʱ��]
	 * 
	 * do{
	 * 		�ݺ������� ������ �ڵ�;
	 * 
	 * 		[������]
	 * 
	 * }while(���ǽ�); 
	 * 
	 * 
	 * �ʱ��  --> ������ �ѹ��� ���� --> ������ 
	 * ���ǽ� --> true�� ��� ���� --> ������
	 * ���ǽ� --> true�� ��� ���� --> ������
	 * ���ǽ� --> false�� ��� ��������
	 * 
	 * while���� �ٸ� ���� while���� ó�� ����ɶ��� ���ǽ��� �˻��ϰ� ���� ���ǽ��� true�� ��� ����Ǵµ�
	 * do while���� ù ������ ���ǽľ��� ������ ����ȴٴ� ��
	 * 
	 */
	
	
	public void method1 () {
		int num = 1;
		do {
			System.out.println(num);
		
		}while(num==0);
	}
	public void method2 () {
		//1 2 3 4 5
		int num = 1;
		do {
			System.out.println(num);
			num++;
		}while(num<6);
		
	}
	public void method3 () {
		int random =(int)(Math.random()*10+1);
		System.out.println("������"+random);
		
		int sum = 0;
		int i=1;
		do {
			sum+=i;			
			i++;
			
		}while(i<=random);
		
		System.out.println("1���� "+ random+ "������ �� : "+sum);
		}
	
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ� �Է� : ");
		int dan = sc.nextInt();
		if(dan > 1 && dan <10) {
	int i= 1;
	do {
		System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
		i++;
	}
	while(i<10) ;
		
				System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
				i++;
			
			
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
		 do {
			 System.out.println(str.charAt(i));
			 i++;
			
		 }
		 while(i<=str.length()-1) ;
			
			 
	}
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		String str="";
		do {
			System.out.println("���ڿ��� �Է��� �ּ���");
			str = sc.nextLine();
		  System.out.println("str : "+ str);
		}
		while(!str.equals("exit")) ;
		System.out.println("exit�� �Է��ؼ� ����Ǿ����ϴ�");
		
			
			
			
			
	}
	
}

