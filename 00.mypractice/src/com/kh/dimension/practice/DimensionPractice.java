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
	//戚杏 熱醸魚 せせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせせ格巷奄歳疏願ぞぞぞぞぞぞぞぞぞ

		
		}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("楳税滴奄 : ");
		int a = sc.nextInt();
		System.out.println("伸税滴奄 : ");
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
		String[][] strArr = new String[][] {{"戚", "猿", "尽", "蒋", "毘"}, {"託", "走", "柔", "生", "垣"}, {"据",
			"伸", "艦", "稽", "獣"}, {"壕", "宿", "陥", "岨", "陥"}, {"伸", "備", "! ", "希", "!! "}};
			for(int j=0; j<strArr.length; j++) {
				for(int i=0; i<strArr[j].length; i++) {
					System.out.print(strArr[i][j]+" ");
				}System.out.println();
				}
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("楳税 滴奄 : ");
        int  a = sc.nextInt();    
		char[][] arr = new char[a][];
		  char alpa ='a';
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+"楳税 滴奄 : ");
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
		String[] arr = new String[] {"悪闇悪","害蟹蟹","亀企眼","嫌虞虞","庚耕耕","酵左壕","勺失叔","星森税","遭仙爽","託探逐","杷燃妊","畠馬馬"};
		String[][] brr = new String[3][2];	
		String[][] crr = new String[3][2];	
		 int index = 0;
		
		for(int i= 0; i < brr.length; i++) {        //戚託壕伸戚 砧鯵戚糠稽 馬蟹希 幻級嬢醤廃陥 
			for(int j = 0 ; j < brr[i].length; j++) {
				
				brr[i][j]=arr[index++];
			}
			}
		
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					
					crr[i][j]=arr[index++]; //戚託壕伸戚 2鯵昔暗走 析託壕伸精馬蟹陥 益君糠稽 int index = 0; 馬蟹幻 潤醤廃陥
		}
	}
			System.out.println("===1歳舘===");
			for(int i= 0; i < brr.length; i++) {
				for(int j = 0 ; j < brr[i].length; j++) {
					System.out.print(brr[i][j]);
	}
				System.out.println();
	}
			System.out.println("===2歳舘===");
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					System.out.print(crr[i][j]);
	}
				System.out.println();
}
		
}
	public void practice9() {	
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[] {"悪闇悪","害蟹蟹","亀企眼","嫌虞虞","庚耕耕","酵左壕","勺失叔","星森税","遭仙爽","託探逐","杷燃妊","畠馬馬"};
		String[][] brr = new String[3][2];	
		String[][] crr = new String[3][2];	
		 int index = 0;
		
		for(int i= 0; i < brr.length; i++) {        //戚託壕伸戚 砧鯵戚糠稽 馬蟹希 幻級嬢醤廃陥 
			for(int j = 0 ; j < brr[i].length; j++) {
				
				brr[i][j]=arr[index++];
			}
			}
		
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					
					crr[i][j]=arr[index++]; //戚託壕伸戚 2鯵昔暗走 析託壕伸精馬蟹陥 益君糠稽 int index = 0; 馬蟹幻 潤醤廃陥
		}
	}
			System.out.println("===1歳舘===");
			for(int i= 0; i < brr.length; i++) {
				for(int j = 0 ; j < brr[i].length; j++) {
					System.out.print(brr[i][j]);
	}
				System.out.println();
	}
			System.out.println("===2歳舘===");
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					System.out.print(crr[i][j]);
	}
				System.out.println();
}
		System.out.println("================================");
		System.out.println("伊事拝 俳持 戚硯聖 脊径馬室推.");
		String a = sc.nextLine();
		for(int i= 0; i < brr.length; i++) {
			for(int j = 0 ; j < brr[i].length; j++) {
		        if(a.equals(brr[i][j])){ //戚禎什研 戚遂馬食 鎧亜 達壱切馬澗紫寓戚 限澗走 繕闇聖 杏壱 
		        if(j==0) {
		        	System.out.println("伊事馬重"+a+"俳持精 1歳舘"+(i+1) +"腰属 匝 図楕拭 赤柔艦陥.");//i+1昔戚政澗 i亜 0採斗赤生艦猿 せせ
		        }
		        //j==0昔戚政 j 0戚檎 図楕 1戚檎 神献楕戚陥
		        else { 
		        	System.out.println("伊事馬重"+a+"俳持精 1歳舘"+(i+1) +"腰属 匝 神献楕拭 赤柔艦陥.");
		        }
		        }
		        }
		        
		        }
		for(int i= 0; i < crr.length; i++) {
			for(int j = 0 ; j < crr[i].length; j++) {
		        if(a.equals(crr[i][j])){
		        if(j==0) {
		        System.out.println("伊事馬重"+a+"俳持精 2歳舘"+(i+1) +"腰属 匝 図楕拭 赤柔艦陥.");
		        }else {
		        	System.out.println("伊事馬重"+a+"俳持精 2歳舘"+(i+1) +"腰属 匝 神献楕拭 赤柔艦陥.");
			}
		
		
		        }
		        
			}
		}
}
}
