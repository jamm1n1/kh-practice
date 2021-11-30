package com.kh.dimension.practice;

import java.util.Scanner;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class DimensionPractice {

	public void practice1() {
		int[][]arr= new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j ++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
				
	}
	public void practice2() {
		int[][]arr= new int[][] {{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j ++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
}
}
	public void practice3() {
		String[][]arr= new String[3][3];
		arr[0][0]="(0,0)";
		arr[0][1]="(0,1)";
		arr[0][2]="(0,2)";
		arr[1][0]="(1,0)";
		arr[1][1]="(1,1)";
		arr[1][2]="(1,2)";
		arr[2][0]="(2,0)";
		arr[2][1]="(2,1)";
		arr[2][2]="(2,2)";
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j ++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
	}
	public void practice4() {
	int[][] arr = new int[4][4];
	int to = 0;
	for (int i=0; i < arr.length-1; i++) {	
		for(int j = 0; j < arr[i].length;j++) {
			arr[i][j]=(int)(Math.random()*10+1);
			arr[0][3] = arr[0][0]+arr[0][1]+arr[0][2];
		    arr[1][3] = arr[1][0]+arr[1][1]+arr[1][2];
			arr[2][3] = arr[2][0]+arr[2][1]+arr[2][2];			
		
		System.out.print(arr[i][j]+"\t");
	}System.out.println();
	}
	for (int i=0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length;j++) {
			to+=arr[j][i];
				
			}
		System.out.print(to+"\t");
		to=0;
			}
	//이걸 풀었따 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ너무기분좋닿ㅎㅎㅎㅎㅎㅎㅎㅎㅎ

		
		}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행의크기 : ");
		int a = sc.nextInt();
		System.out.println("열의크기 : ");
		int b = sc.nextInt();
		char[][]arr=new char[a][b];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char) ((int)(Math.random()*26)+65);
				System.out.print(arr[i][j]+" ");
			}	System.out.println();
		
			}
	
	}
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			for(int j=0; j<strArr.length; j++) {
				for(int i=0; i<strArr[j].length; i++) {
					System.out.print(strArr[i][j]+" ");
				}System.out.println();
				}
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 크기 : ");
        int  a = sc.nextInt();    
		char[][] arr = new char[a][];
		  char alpa ='a';
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+"행의 크기 : ");
			int b = sc.nextInt();
			arr[i]=new char[b];
		for(int j = 0; j < arr[i].length; j++) {		
		     arr[i][j]=alpa++;
		     
		}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
				
				
			}System.out.println();
			
			}
	}
	public void practice8() {	
		String[] arr = new String[] {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] brr = new String[3][2];	
		String[][] crr = new String[3][2];	
		 int index = 0;
		
		for(int i= 0; i < brr.length; i++) {        //이차배열이 두개이므로 하나더 만들어야한다 
			for(int j = 0 ; j < brr[i].length; j++) {
				
				brr[i][j]=arr[index++];
			}
			}
		
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					
					crr[i][j]=arr[index++]; //이차배열이 2개인거지 일차배열은하나다 그러므로 int index = 0; 하나만 써야한다
		}
	}
			System.out.println("===1분단===");
			for(int i= 0; i < brr.length; i++) {
				for(int j = 0 ; j < brr[i].length; j++) {
					System.out.print(brr[i][j]);
	}
				System.out.println();
	}
			System.out.println("===2분단===");
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					System.out.print(crr[i][j]);
	}
				System.out.println();
}
		
}
	public void practice9() {	
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[] {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] brr = new String[3][2];	
		String[][] crr = new String[3][2];	
		 int index = 0;
		
		for(int i= 0; i < brr.length; i++) {        //이차배열이 두개이므로 하나더 만들어야한다 
			for(int j = 0 ; j < brr[i].length; j++) {
				
				brr[i][j]=arr[index++];
			}
			}
		
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					
					crr[i][j]=arr[index++]; //이차배열이 2개인거지 일차배열은하나다 그러므로 int index = 0; 하나만 써야한다
		}
	}
			System.out.println("===1분단===");
			for(int i= 0; i < brr.length; i++) {
				for(int j = 0 ; j < brr[i].length; j++) {
					System.out.print(brr[i][j]);
	}
				System.out.println();
	}
			System.out.println("===2분단===");
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					System.out.print(crr[i][j]);
	}
				System.out.println();
}
		System.out.println("================================");
		System.out.println("검색할 학생 이름을 입력하세요.");
		String a = sc.nextLine();
		for(int i= 0; i < brr.length; i++) {
			for(int j = 0 ; j < brr[i].length; j++) {
		        if(a.equals(brr[i][j])){ //이퀄스를 이용하여 내가 찾고자하는사람이 맞는지 조건을 걸고 
		        if(j==0) {
		        	System.out.println("검색하신"+a+"학생은 1분단"+(i+1) +"번째 줄 왼쪽에 있습니다.");//i+1인이유는 i가 0부터있으니까 ㅋㅋ
		        }
		        //j==0인이유 j 0이면 왼쪽 1이면 오른쪽이다
		        else { 
		        	System.out.println("검색하신"+a+"학생은 1분단"+(i+1) +"번째 줄 오른쪽에 있습니다.");
		        }
		        }
		        }
		        
		        }
		for(int i= 0; i < crr.length; i++) {
			for(int j = 0 ; j < crr[i].length; j++) {
		        if(a.equals(crr[i][j])){
		        if(j==0) {
		        System.out.println("검색하신"+a+"학생은 2분단"+(i+1) +"번째 줄 왼쪽에 있습니다.");
		        }else {
		        	System.out.println("검색하신"+a+"학생은 2분단"+(i+1) +"번째 줄 오른쪽에 있습니다.");
			}
		
		
		        }
		        
			}
		}
}
}
