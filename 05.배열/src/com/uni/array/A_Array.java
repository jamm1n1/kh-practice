package com.uni.array;

import java.util.Scanner;

public class A_Array {

	
	public void method1() {
		//일반 변수선언
		int i; //메모리공간 값을 기록해 놓기 위한 공간 --> 그 메모리 중에서 stack 영역에 할당되는 것 
		
		//1.배열선언
		int[] iArr; //배열을 선언하게되면 변수 선언과 마찬가지로 stack 영역에 박스가 생기고 이박스는 실제 값을 담기위한 용도가 아니고 '주소를 보관하는 공간'
		
	    double[]dArr;
	    
	    /*
		 * 
		 * 따라서 값을 담는 변수는 그냥 변수라고 하고
		 * 주소값을 담는 변수는 레퍼런스 변수(참조 변수)라고 표현한다.
		 * 
		 * 기본 자료형(boolean, char, byte, short, int, long, float, double) 로 선언한 변수
		 * ->> 진짜 값(리터럴)을 담는 변수--> 변수
		 * 
		 * 
		 * 그 외 자료형(String, int[], char[]....)
		 * --> 주소값을 담는 변수--> 레퍼런스 변수(참조변수)
		 * 
		 */
		
		/* 2. 배열 할당
		 * 배열에 담을 값들이 몇개 들어갈지 배열 할당으로 크기를 반드시 미리 지정해두어야 한다.
		 * iArr = new int[] <--크기를 지정하지 않으면 에러발생
		 * 
		 * 
		 */
	    
	    iArr = new int[5];
	    dArr = new double[10];
	    
	    
	    //배열 선언과 할당을 동시에 
	    
	    int[]iArr2 = new int[5];
	    double[] dArr2 = new double[10];
	    
	    System.out.println("iArr"+iArr);
	    System.out.println("dArr"+dArr);
	    System.out.println("iArr2"+iArr2);
	    System.out.println("idrr"+dArr2);
	    
	    //주소값 출력 -> heap 메모리 영역은 변수를 만든다거나 직접적으로 접글하지 못하는 영역이고 주소값을 통해서 찾아갈 수 있다.
	    
	}
	
	public void method2() {
		double [] dArr = new double[3];
		int[] iArr = new int [5];
		
		for(int i = 0; i < dArr.length ; i++) {
			System.out.println(dArr[i]);
		}
		
		
		System.out.println("=============================");
		
			for(int j = 0;  j<iArr.length; j++) {
				System.out.println(iArr[j]);
			}
			// 배열을 따로 초기화 하지않는다면 JVM 이 지정한 자료형의 기본값으로 배열을 초기화한다. 
			// heap 영역에는 값이 없는 공간이 존재할 수 없다. --> JVM 이 자동으로 초기값 부여 
			
			//문자열 길이 : length()
			//배열의 길이 : length
			System.out.println("dArr의 길이 " + dArr.length);
			System.out.println("dArr의 길이 " + iArr.length);

	}
	public void method3() {
	//배열선언 및 할당 	
	int [] iArr = new int [5];
	
	//배열초기화 
	/*iArr[0] = 1;
	iArr[1] = 2;
	iArr[2] = 3;
	iArr[3] = 4;
	iArr[4] = 5;*/
	
	// 반복문을 통해서
	for (int i = 0; i<iArr.length; i++) {
		iArr[i] = i+1;
		System.out.println("iArr[" + i +"] = " + iArr[i]);
		
			}
	System.out.println(iArr);//주소값
	System.out.println(iArr.hashCode()); //주소값의 10진수값
	
		}
		
	public void method4() {
		//사용자ㅏ 입력한 정수 값으로 배열의 길이를 지정해보자 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 할당할 배열의 길이 : ");
		
		int i = sc.nextInt();
		
		double [] dArr = new double[i];
		
		System.out.println(dArr);
		System.out.println("dArr의 길이 : " + dArr.length );
	}
	
	public void method5() {
		
		//배열 선언과 동시에 초기화 하기
		int[] arr1 = {1,2,3,4,5}; //중괄호 블럭을 사용하는 경우에는 new 연산자를 사용하지않아도 되고 내부적으로 값의 개수만큼 자동으로 크기가 할당됨
        
	    int [] arr2 = new int [] {1,2,3,4,5};
	    
	    System.out.println("arr1의 길이" + arr1.length);
	    System.out.println("arr1의 길이" + arr2.length);
	    
	    System.out.println(arr1 == arr2);// arr1, arr2 값은 같지만 레퍼런스(참조) 변수이기떄문에 주소값이 같을수 없다.
		
		
		
	}
	
	
	public void method6 () {
		String [] sArr = new String[5];
		
		for(int i = 0; i<sArr.length ; i++) {
			System.out.println(sArr[i]);// String 의 JVM 이 부여하는 초기값은 null이다
			
		}
		
		// 사용자에게 문자열을 입력받아서 해당 인덱스에 사용자가 입력한 값 넣기 
		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i< sArr.length; i++) {
			System.out.println("과일 : " );
			sArr[i] =  sc.nextLine();
			
		}
		for(int i = 0; i< sArr.length; i++) {
			System.out.println(sArr[i]);
			// java.lang.ArrayIndexOutOfBoundsException 방부족 에러
		}
	}
	
	public void method7 () {
		
		//크기가 10인 정수열 배열을 만들고 , 랜덤값(1~100)까지 발생시켜서 담아서 출력하세요 
		int [] iArr = new int [10];	
				for(int i = 0; i<iArr.length; i++) {
					int random =(int)(Math.random()*100+1);
					iArr[i] = random;
					System.out.println("iArr[" + i +"] = " + iArr[i]);
					
				}
				
					
					
				}
		
	
public void method8 () {
	// 정수 배열 크기 5, 1~10 사이의 짝수 (2,4,6,8,10)
	
	int [] iArr = new int [5];
	
	int num = 0;
	
	for(int i = 0; i < iArr.length; i++) {
		iArr[i] = num +=2;
	}
	for(int i = 0; i < iArr.length; i++) {
		System.out.println(iArr[i]);
		
	}
	System.out.println("iArr의 길이 "+ iArr.length);
	System.out.println("iArr의 주소값 "+ iArr.hashCode());
	//iArr[5] = 12;  // 배열의 index를 벗어나면 오류발생 
	
	//배열의 단점  - 한번지정한 크기는 변경이 불가능하다. -> 크기를 바꾸고자 하면 새로 할당
	iArr = new int [10];
	// --new int[5]는 (처음에만들었던) heap에 있는 공간이랑 연결되어있는 고리가 끊어짐 (가지비컬렉션) 일정 시간이 지나면 (자동 메모리 관리)
	
	
	System.out.println("크기변경후 iArr ====================");
	System.out.println("iArr의 길이 "+ iArr.length);
	System.out.println("iArr의 주소값 "+ iArr.hashCode());
	
	for(int i = 0 ; i <iArr.length; i++) {
		System.out.println(iArr[i]);
	}
	iArr = null;//레퍼런스(참조)변수에 null값이 들어가게 되면 주소값이 null 바뀌고 
	            //참조하고 있는 주소가 없다는  말임. -> heap과의 연결고리가 끊어짐.
	            //heap에서는 참조 되는 연결고리가 끊어져서 일정 시간이 지난후에 
	            //더이상 쓸모없다고 판단이되면 가비지 컬렉터가 삭제 해준다.
	

	System.out.println("삭제후 iArr ====================");
	System.out.println("iArr의 길이 "+ iArr.length);
	System.out.println("iArr의 주소값 "+ iArr.hashCode());
	 //java.lang.NullPointerException: -> null일떄는 아무것도 참조하고 있지 않기떄문에 값을 얻어올 수 없다 
	// 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있을 때 발생  
}
}
		
	
	
