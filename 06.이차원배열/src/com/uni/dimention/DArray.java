package com.uni.dimention;

import java.util.Scanner;

public class DArray {

	// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것

	public void method1() {

		/*
		 * 1. 이차원 배열 선언 자료형 배열명[][]; 자료형[] 배열명[]; 자료형[][] 배열명;
		 */

		int arr1[][];
		int[] arr2[];
		int[][] arr;
		/*
		 * 2.이차원 배열 할당 배열명 = new 자료형 [행크기][열크기];
		 */

		arr = new int[3][5]; // 할당을 하게 되면 heap 영역에 해당크기만큼 공간이 할당

		// 행의 길이를 알고자 한다면
		System.out.println("행의 길이 : " + arr.length);

		// 각 행별 열의길이를 알고자한다면

		System.out.println("열의 길이 : " + arr[0].length);
		System.out.println("열의 길이 : " + arr[1].length);
		System.out.println("열의 길이 : " + arr[2].length);

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
		// 값기록
		// 1.인덱스에 접근해서 값 기록
		/*
		 * arr[0][0]=1; arr[0][1]=2; arr[0][2]=3; arr[0][3]=4; arr[0][4]=5; arr[1][0]=6;
		 * arr[1][1]=7; arr[1][2]=8; arr[1][3]=9; arr[1][4]=10; arr[2][0]=11;
		 * arr[2][1]=12; arr[2][2]=13; arr[2][3]=14; arr[2][4]=15;
		 */

		// 2. 중첩for 문을 이용하여 값기록
		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {// 열을 지정해주는 for문
				// arr[i][j] = value
				// value ++

				arr[i][j] = value++;
			}
		}
		// 3. 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();

		}
	}

	public void method3() {
		// 이차원 배열의 할당과 초기화를 동시에
		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void method4() {
		// 가변 배열
		// 행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		// 자료형이 같은 1차원 배열 여러개를 하나로 묶은 게 --> 2차원 배열
		// 묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.
		int[][] arr = new int[3][];// 가변배열 할당 (행의 크기는 3)

		// 각행에 또다른 배열을 참조할수 있도록 할당
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		// 1. 인덱스 접근
		// 2. 반복문을 통해서
		// 3. 출력
		

	
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
	//가변배열의 할당과 초기화 동시에
	int [][] arr = {{1, 2},{3},{4 ,5 , 6}};
	
	for (int i = 0; i < arr.length; i++ ) {
		for(int j = 0;  j < arr[i].length; j++) {
			System.out.print(arr[i][j] + "\t");
		}System.out.println();
				
	}
	
}
public void method7 () { 
	
	//스캐너를 이용해서 국어점수와 영어점수를 3번 찍어서 각각의 평균을 구하시오 
	Scanner sc = new Scanner(System.in);
	
	double[][]arr =new double[2][4];
	//int arrILgth = 0;
	for(int i = 0 ; i< arr.length; i++) {
	//double sum = 0;
		
		////int arrILgth = arr[i].length-1;
		for(int j = 0; j < arr[i].length-1; j++) {
			if(i==0){
				 System.out.print("국어점수 : ");	   
	              arr[i][j] = sc.nextInt();
			}else {
		
			System.out.print("영어점수 : ");
		    arr[i][j] = sc.nextInt();
		    /*if(i==0){
				 System.out.print("국어점수 : ");	   	            
			}else {		
			System.out.print("영어점수 : ");
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
			System.out.println("국어 평균"+f1.format(arr[0][arrILght]/arrILght));
		    System.out.println("영어 평균"+f1.format(arr[0][arrILght]/arrILght));
			
			
		     */
		}
			
	
	}
		
		System.out.println("국어 평균"+(arr[0][0]+arr[0][1]+arr[0][2])/3);
		System.out.println("영어 평균"+(arr[1][0]+arr[1][1]+arr[1][2])/3);
			}

		
}
public void method8 () {
	//1부터 100사이의 랜덤값을 3행 3열에 값을 넣으려고 한다.
			//중복제거해서 넣어보세요 
			
			// 1.일차원 배열을 이용해서 먼저 중복제거를 해보자, 일차원 배열을 이용해서 9개의 난수값을 중복없이 셋팅
	
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
//빙고
public void bingo () {
	Scanner sc = new Scanner(System.in);
	
	//1차원 배열로 중복 제거한 25개 값을 구해놓고 이차원 배열에 대입 
	

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
	 //이차원 배열로 담기 
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
	 int count = 0;//몇번입력했는지 갯수 세기위한 변수
	 System.out.println("========================빙고게임시작=====================================");
	 
	 while(true) {
		 System.out.println("정수를 입력하세요 : ");
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
		 System.out.println("게임을 끝내시겠습니까?(y/n : ");
		 
		 char ch = sc.nextLine().toUpperCase().charAt(0); //toUpperCase 대문자로 만든다
		 
		 if(ch =='Y') {
			 break;
		 }
		 
	 }
	 System.out.println(count + "번 입력하였습니다.");
}
}