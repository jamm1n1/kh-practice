package com.uni.dimention;

import java.util.Scanner;

public class DArray {

	// ������ �迭 : ������ �迭 �������� �ϳ��� ���� ��

	public void method1() {

		/*
		 * 1. ������ �迭 ���� �ڷ��� �迭��[][]; �ڷ���[] �迭��[]; �ڷ���[][] �迭��;
		 */

		int arr1[][];
		int[] arr2[];
		int[][] arr;
		/*
		 * 2.������ �迭 �Ҵ� �迭�� = new �ڷ��� [��ũ��][��ũ��];
		 */

		arr = new int[3][5]; // �Ҵ��� �ϰ� �Ǹ� heap ������ �ش�ũ�⸸ŭ ������ �Ҵ�

		// ���� ���̸� �˰��� �Ѵٸ�
		System.out.println("���� ���� : " + arr.length);

		// �� �ະ ���Ǳ��̸� �˰����Ѵٸ�

		System.out.println("���� ���� : " + arr[0].length);
		System.out.println("���� ���� : " + arr[1].length);
		System.out.println("���� ���� : " + arr[2].length);

		// *****
		// *****
		// *****

		/*
		 * for(int i =1; i<5; i++) { for(int j =1; j<6; j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void method2() {
		int[][] arr = new int[3][5];

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// �����
		// 1.�ε����� �����ؼ� �� ���
		/*
		 * arr[0][0]=1; arr[0][1]=2; arr[0][2]=3; arr[0][3]=4; arr[0][4]=5; arr[1][0]=6;
		 * arr[1][1]=7; arr[1][2]=8; arr[1][3]=9; arr[1][4]=10; arr[2][0]=11;
		 * arr[2][1]=12; arr[2][2]=13; arr[2][3]=14; arr[2][4]=15;
		 */

		// 2. ��øfor ���� �̿��Ͽ� �����
		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {// ���� �������ִ� for��
				// arr[i][j] = value
				// value ++

				arr[i][j] = value++;
			}
		}
		// 3. ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();

		}
	}

	public void method3() {
		// ������ �迭�� �Ҵ�� �ʱ�ȭ�� ���ÿ�
		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void method4() {
		// ���� �迭
		// ���� ���������� �� �࿡ ���� ���� ������ �������� ���� ����
		// �ڷ����� ���� 1���� �迭 �������� �ϳ��� ���� �� --> 2���� �迭
		// �����ִ� 1���� �迭�� ���̰� �� ���� �ʿ�� ����.
		int[][] arr = new int[3][];// �����迭 �Ҵ� (���� ũ��� 3)

		// ���࿡ �Ǵٸ� �迭�� �����Ҽ� �ֵ��� �Ҵ�
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		// 1. �ε��� ����
		// 2. �ݺ����� ���ؼ�
		// 3. ���
		

	
	}
	public void method5() {
	int[][] arr = new int[3][];		
	arr[0] = new int[2];
	arr[1] = new int[1];
	arr[2] = new int[3];
	arr[0][0] = 1;
	arr[0][1] = 2;		
	arr[1][0] = 3;
	arr[2][0] = 4;
	arr[2][1] = 5;
	arr[2][2] = 6;

	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");
		}
		System.out.println();
}
}
public void method6 () { 
	//�����迭�� �Ҵ�� �ʱ�ȭ ���ÿ�
	int [][] arr = {{1, 2},{3},{4 ,5 , 6}};
	
	for (int i = 0; i < arr.length; i++ ) {
		for(int j = 0;  j < arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");
		}System.out.println();
				
	}
	
}
public void method7 () { 
	
	//��ĳ�ʸ� �̿��ؼ� ���������� ���������� 3�� �� ������ ����� ���Ͻÿ� 
	Scanner sc = new Scanner(System.in);
	
	double[][]arr =new double[2][4];
	//int arrILgth = 0;
	for(int i = 0 ; i< arr.length; i++) {
	//double sum = 0;
		
		////int arrILgth = arr[i].length-1;
		for(int j = 0; j < arr[i].length-1; j++) {
			if(i==0){
				 System.out.print("�������� : ");	   
	              arr[i][j] = sc.nextInt();
			}else {
		
			System.out.print("�������� : ");
		    arr[i][j] = sc.nextInt();
		    /*if(i==0){
				 System.out.print("�������� : ");	   	            
			}else {		
			System.out.print("�������� : ");
		     }
		     arr[i][j] = sc.nextInt();
		     sum+=arr[i][j]
		     }
		     arr[i][arrILgth] = sum;
		     * }
		     * for(int i = 0 ; i< arr.length; i++) {			
					for(int j = 0; j < arr[i].length-1; j++) {
						System.out.println(arr[i][j]);
			}
			System.out.println();
			}
			DecimalFomat f1 = new DecimalFomat("0.00");
			System.out.println("���� ���"+f1.format(arr[0][arrILght]/arrILght));
		    System.out.println("���� ���"+f1.format(arr[0][arrILght]/arrILght));
			
			
		     */
		}
			
	
	}
		
		System.out.println("���� ���"+(arr[0][0]+arr[0][1]+arr[0][2])/3);
		System.out.println("���� ���"+(arr[1][0]+arr[1][1]+arr[1][2])/3);
			}

		
}
public void method8 () {
	//1���� 100������ �������� 3�� 3���� ���� �������� �Ѵ�.
			//�ߺ������ؼ� �־���� 
			
			// 1.������ �迭�� �̿��ؼ� ���� �ߺ����Ÿ� �غ���, ������ �迭�� �̿��ؼ� 9���� �������� �ߺ����� ����
	
	int[] arr = new int[9];
	
	for(int i = 0 ; i < arr.length; i++) {
		arr[i]= (int)(Math.random()*100+1);
		
		for(int j = 0; j < i; j++) {
			if(arr[i]==arr[j]) {
				i--;
				break;
			}
		}
			
	}
		
	for(int i = 0 ; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	System.out.println();int [][] newArr = new int[3][3];
	
	int index = 0;
	
	for (int i=0; i < newArr.length; i++) {
		for(int j = 0; j < newArr[i].length;j++) {
			
			newArr[i][j] = arr[index++];
		}
	}
	for (int i=0; i < newArr.length; i++) {
		for(int j = 0; j < newArr[i].length;j++) {
			
			System.out.print(newArr[i][j] + " " ) ;
	
}
		System.out.println();
	}
}
//����
public void bingo () {
	Scanner sc = new Scanner(System.in);
	
	//1���� �迭�� �ߺ� ������ 25�� ���� ���س��� ������ �迭�� ���� 
	

	 int [] temarr = new int [25];
	 for(int i = 0; i< temarr.length; i++) {
		 temarr[i]= (int)(Math.random()*25+1);
		 
		 for(int j = 0; j < i; j++) {
			 if(temarr[i]==temarr[j]) {
				 i--;
				 break;
			 }
		 }
	 }
	 //������ �迭�� ��� 
	 int[][] arr = new int [5][5]; 
		 
	 int index = 0;
	 for(int i = 0; i < 5;  i++) {
		 for(int j =0; j < 5 ; j++) {
			 arr[i][j]=temarr[index++];
		 }
	 }
	 
	 for (int i=0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.printf("%4d " , arr[i][j]) ;
		
	}
			System.out.println();
	 
}
	 int count = 0;//����Է��ߴ��� ���� �������� ����
	 System.out.println("========================������ӽ���=====================================");
	 
	 while(true) {
		 System.out.println("������ �Է��ϼ��� : ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 
		 
		 count++;
		 
		 for(int i = 0 ; i < 5; i++) {
			 for(int j = 0; j<5; j++) {
				 if(arr[i][j]==num) {
					 arr[i][j] = 0;
				 }
				 System.out.printf("%4d",arr[i][j]);
			 }
			 System.out.println();
		 }
		 System.out.println("������ �����ðڽ��ϱ�?(y/n : ");
		 
		 char ch = sc.nextLine().toUpperCase().charAt(0); //toUpperCase �빮�ڷ� �����
		 
		 if(ch =='Y') {
			 break;
		 }
		 
	 }
	 System.out.println(count + "�� �Է��Ͽ����ϴ�.");
}
}