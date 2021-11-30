package cim.uni.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * �ݺ��� : ���α׷��� �����帧�� �����ϴ� ����� �ϳ�, � �����ڵ带 �ݺ������� ��������ش�.
	 * 
	 * for��/while��( do- while��)
	 * 
	 * *for��
	 * 
	 * for(�ʱ��;���ǽ�;������){//�ݺ� Ƚ���� �����ϱ����ؼ� �����ϴ°͵� 
	 * ..�ݺ������� �����Ű���� �ϴ� ���� ����..
	 * 
	 * }
	 * 
	 * -�ʱ�� : �ݺ����� ����ɶ� "�� �ѹ��� ����Ǵ� ����" 
	 * 			(���� �ݺ��� �ȿ��� ���� ������ �����ϰ� �ʱⰪ�� �����ϴ� ����) 
	 * -���ǽ� : "�ݺ����� ����� ����" �� �ۼ��ϴ� ���� 
	 * 			���ǽ��� true�� ��� �ش� ���� ������ ���� 
	 * 			���ǽ��� false�� ��� �ݺ��� ���߰� �������� (���� �ʱ�Ŀ��� ���� ������ ������ ���ǽ��� �ۼ�) 
	 * -������ : �ݺ����� �����ϴ� �������� ������Ű�� �κ� 
	 * 			(�ַ� �ʱ�Ŀ� ������ ������ ������ ���� ������ ���)
	 * 
	 * 
	 * for�� �ʱ��--> ���ǽ� �˻� -> true�� ��� ���౸���� ���� --> ������ 
	 * 			 --> ���ǽ� �˻� -> true�� ��� ���౸���� ���� --> ������ 
	 * 			 --�ݺ�-- 
	 * 			 --> ���ǽ� �˻� -> false�� ��� ���౸���� ���� ���� ���� --> �ݺ����� ��������
	 * 
	 * * �˾ƵѰ� ~
	 *   for ���ȿ� �ִ� �ʱ��, ���ǽ�, �������� ��� ���� ���� �ϱ� ��(������ ; �� �ݵ�� �ʼ� �ۼ�)
	 *   ��,for() �ȿ����� ���� �ɻ� ��� �ʿ��� �����.  
	 */
	
	public void method1() {
	//"�ȳ��ϼ���" �� 5�� �ݺ��ؼ� ��� �ϰ��� �Ҷ�
		for(int i =1; i<= 5; i++)
			System.out.println("�ȳ��ϼ���"+i);
		
		
		/*���������� : ++,--

        ++ ������ : �ܵ� ���ÿ��� ���� ��/�� ���о�����, �ٸ� ���̳� ������ �Ϻη� ���� �տ� ���Ǹ�  
        ������ ��ó��, ���� �ڿ� ���Ǹ� ��ó�� �������� �ǹ̸� ������.
        -- ������ : �ܵ� ���ÿ��� ���� ��/�� ���о�����, �ٸ� ���̳� ������ �Ϻη� ���� �տ� ���Ǹ� �� 
        ���� ��ó��, ���� �ڿ� ���Ǹ� ��ó�� �İ����� �ǹ̸� ������.
		*/
	}
	
	public void method2 () {
		// 1 2 3 4 5  ���·� ��� �ϰ��� �Ѵٸ�?
		
		
	for(int i=1; i<6; i++) {
		System.out.print(i+" ");
	}
	// 5 4 3 2 1���·� ��� �ϰ��� �Ѵٸ�?
	for(int i=5; i>=1; i--) {
		System.out.print(i+" ");
	}
	}
	public void method3 () {
		//1���� 10������ Ȧ���� ����϶�
				
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				System.out.println(i);		
			}
			
			
		}
		
	}
	public void method4() {
		//1 2 3 4 .... 9 10
		for(int i = 0; i <=9; i++) {
			
			System.out.print(i+1+" ");
			
		}
	}
	public void method5() {
		//1���� 10������ �հ�
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum+=i;
			
		}
		System.out.println(sum);
	}
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		
		int num =sc.nextInt();
		
		//1���� num ����ִ� �������� ���� �հ�
		/*sum +=1; 
		 * 
		 */
		int sum = 0;
		for(int i =1; i<=num; i++) {
			
			sum+=i;
			
			
		}
		System.out.println(sum);
	}
	public void method7() {
		//��������� ���ڿ��� �Է¹޾Ƽ� �� �ε��� ���� ���ڸ� ���� �����Ͻÿ�
		
		/*Stirng str = apple
		 * a -> str.charAt(0)
		 * p -> str.charAt(1)
		 * p -> str.charAt(2)
		 * l -> str.charAt(3)
		 * e -> str.charAt(4)
		 * apple �� ���ڿ��� ���̴� :5
		 * 01234 
		 * 
		 * ������ �ε����� �׻� ���ڿ� ���� -1 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� �Է� : ");
		String str =sc.nextLine();
	    System.out.println("���ڿ��� ����" + str.length());
	    
	    for(int i = 0; i <= str.length()-1; i++) {
	    	System.out.println(str.charAt(i));
	    }
		
	}
	public void method8() {
		//2�� ����ϱ� 
		
		System.out.println("�ܼ� �Է� : ");
		
		
		for(int i = 1; i<=9; i++) {
			System.out.println(2+"*"+i+"="+2*i);
		}
			
		
	}
	public void method9() {
		//99�� ����ϱ� 
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ� �Է� : ");
		
		/*int num =sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);*/
			
			/* dan * 1 =
			 * dan * 2 =
			 * dan * 3 =
			 * dan * 4 =
			 * ...
			 * dan * 9 = 
			 */
		int dan = sc.nextInt();
			if(dan > 1 && dan <10) {
				
				for(int i = 1; i<10; i++) {
					System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
				}
				
			}else {
				System.out.println("2~9 ������ ����� �Է��ؾ��մϴ�.");
			}
	
	}
	public void method10() {
	//1���� � ������ (1~10������ ������ ���� ) ������ �հ� 
			/*
			 * java.lang.Math Ŭ�������� �����ϴ� random()�޼ҵ带 ����ؼ� ������ �߻���ų �� �ִ�. 
			 * 
			 * Math.random() ȣ��� --> 0.0 ~ 0.999999 ������ ������ �߻� ������ (0.0 <= ������  < 1.0)
			 */
			
			//int random = Math.random(); // double���̶� �ȵ�
			// 			0.0 <=   < 1.0		--> 0.0 ~ 0.99999...
			
			//int random = Math.random() * 10;
			//			0.0 <=   < 10.0		--> 0.0 ~ 9.99999...
			
			//int random = Math.random() * 10 + 1;
			//			1.0 <=   < 11.0		--> 1.0 ~ 10.9999...
		int random =(int) (Math.random() * 10 + 1);
		
		
		int sum =0;
		for(int i =1; i <= random; i++) {
			sum +=i;
		}
		System.out.println("1����"+random+"������ �� : "+sum);
	}
	public void method11() {
		//2���� 9������ �������� ����ϱ� 
		int random =(int)(Math.random() * 8+2);
		System.out.println(random+"��");
	 for(int i = 1; i<10; i++) {
		 System.out.println(random+" * "+i+" = "+random*i);
	 }
	}
	// ��ø for��
			/*
			 * for(�ʱ��1; ���ǽ�1; ������1) {
			 * 		������ ���� 1;
			 * 	
			 * 		for(�ʱ��2; ���ǽ�2; ������2){
			 * 			������ ���� 2;
			 * 		}
			 * 
			 * 		������ ���� 3;
			 * }
			 * 
			 */
	public void method12() {
		//1���� 5���� ���̾ ��µǴ� ������ 3�� ���
		//1 2 3 4 5 
		//1 2 3 4 5
		//1 2 3 4 5
		
		for(int i = 1; i <=3; i++) {
			for(int j =1; j <=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			/**
			 * i=1 true 
			 * 			j=1 true 1��� j++
			 * 			j=2 true 2��� j++
			 * 			...
			 * 			j=5 true 5��� j++
			 * 			j=6 false �ݺ�������
			 * 			���� ��� i++
			 * 
			 * i=2 true
			 * 			j=1 true 1��� j++
			 * 			j=2 true 2��� j++
			 * 			...
			 * 			j=5 true 5��� j++
			 * 			j=6 false �ݺ�������
			 * 			���� ��� i++
			 * 
			 * i=3 true
			 * 			j=1 true 1��� j++
			 * 			j=2 true 2��� j++
			 * 			...
			 * 			j=5 true 5��� j++
			 * 			j=6 false �ݺ�������
			 * 			���� ��� i++
			 * 
			 * i=4 false �ݺ��� ����
			 * 
			 */
		}
		
	}
 public void method13() {
	//2�ܺ��� 9�ܱ��� ��� 
			//�� 		 2~9 ���� 1�� ���� ,--> �ٱ� for��
			//�������¼�    �Ŵܸ��� 1���� 9���� 1�� ����, -->���� for ������ �ذ� ����
			

			// == 2�� ==
			// 2 * 1 = 2
			// 2 * 2 = 4
			// 2 * 3 = 6
			//  ...
			// 2 * 9 = 18
			
			// == 3�� ==
			// 3 * 1 = 3
			// 3 * 2 = 6
			// 3 * 3 = 9
			// ...
			// 3 * 9 = 27
	 
	 for (int dan = 2; dan<= 9; dan++) {
		 System.out.println("=="+ dan + "�� ==");
		 for (int su =1; su <= 9; su++) {
			 System.out.println(dan + " * "+ su +"="+(dan*su));
		 }
		 System.out.println();
	 }
 }
 public void method14() {
	//*****
	//*****
	//*****
	//*****
	 //���� 1~4 ���� �ݺ� (4��) --> �ٱ��� for��
	 //���� 1~5 ���� �ݺ� (5��) --> ���� for��
	 for(int i =1; i<5; i++) {
		 for(int j =1; j<6; j++) {
			 System.out.print("*");
		 }
			 System.out.println();
	 }
	 
 }
 public void method15() {
	 //1***
	 //*2**
	 //**3*
	 //***4
	 //���� 1~4 ���� �ݺ� (4��) --> �ٱ��� for��
	 //���� 1~4 ���� �ݺ� (4��) --> ���� for��
	 
	 for(int i = 1; i<=4; i++) {
		 for(int j = 1; j<=4; j++) {
			 if(i==j) {
				 System.out.print(i);
			 }else {
				 System.out.print("*");
			 }
		 }
		 System.out.println();
	 }
 }
	 public void method16() {
			// *
			// **
			// ***
			// ****
			// *****
		 for(int i = 1; i<=5; i++) {
			// System.out.println("�ٱ��� i :" +i);
			 for(int j = 1; j<=i; j++) {
				// System.out.println("���� i :" +i);
				// System.out.println("���� j :" +j);
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 
 }   
}