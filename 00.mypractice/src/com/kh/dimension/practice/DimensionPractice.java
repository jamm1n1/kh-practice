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
	//�̰� Ǯ���� ���������������������������������������������������������������������������������������������ʹ�������ꤾ����������������

		
		}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����ũ�� : ");
		int a = sc.nextInt();
		System.out.println("����ũ�� : ");
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
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��",
			"��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
			for(int j=0; j<strArr.length; j++) {
				for(int i=0; i<strArr[j].length; i++) {
					System.out.print(strArr[i][j]+" ");
				}System.out.println();
				}
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ũ�� : ");
        int  a = sc.nextInt();    
		char[][] arr = new char[a][];
		  char alpa ='a';
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+"���� ũ�� : ");
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
		String[] arr = new String[] {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		String[][] brr = new String[3][2];	
		String[][] crr = new String[3][2];	
		 int index = 0;
		
		for(int i= 0; i < brr.length; i++) {        //�����迭�� �ΰ��̹Ƿ� �ϳ��� �������Ѵ� 
			for(int j = 0 ; j < brr[i].length; j++) {
				
				brr[i][j]=arr[index++];
			}
			}
		
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					
					crr[i][j]=arr[index++]; //�����迭�� 2���ΰ��� �����迭���ϳ��� �׷��Ƿ� int index = 0; �ϳ��� ����Ѵ�
		}
	}
			System.out.println("===1�д�===");
			for(int i= 0; i < brr.length; i++) {
				for(int j = 0 ; j < brr[i].length; j++) {
					System.out.print(brr[i][j]);
	}
				System.out.println();
	}
			System.out.println("===2�д�===");
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					System.out.print(crr[i][j]);
	}
				System.out.println();
}
		
}
	public void practice9() {	
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[] {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		String[][] brr = new String[3][2];	
		String[][] crr = new String[3][2];	
		 int index = 0;
		
		for(int i= 0; i < brr.length; i++) {        //�����迭�� �ΰ��̹Ƿ� �ϳ��� �������Ѵ� 
			for(int j = 0 ; j < brr[i].length; j++) {
				
				brr[i][j]=arr[index++];
			}
			}
		
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					
					crr[i][j]=arr[index++]; //�����迭�� 2���ΰ��� �����迭���ϳ��� �׷��Ƿ� int index = 0; �ϳ��� ����Ѵ�
		}
	}
			System.out.println("===1�д�===");
			for(int i= 0; i < brr.length; i++) {
				for(int j = 0 ; j < brr[i].length; j++) {
					System.out.print(brr[i][j]);
	}
				System.out.println();
	}
			System.out.println("===2�д�===");
			for(int i= 0; i < crr.length; i++) {
				for(int j = 0 ; j < crr[i].length; j++) {
					System.out.print(crr[i][j]);
	}
				System.out.println();
}
		System.out.println("================================");
		System.out.println("�˻��� �л� �̸��� �Է��ϼ���.");
		String a = sc.nextLine();
		for(int i= 0; i < brr.length; i++) {
			for(int j = 0 ; j < brr[i].length; j++) {
		        if(a.equals(brr[i][j])){ //�������� �̿��Ͽ� ���� ã�����ϴ»���� �´��� ������ �ɰ� 
		        if(j==0) {
		        	System.out.println("�˻��Ͻ�"+a+"�л��� 1�д�"+(i+1) +"��° �� ���ʿ� �ֽ��ϴ�.");//i+1�������� i�� 0���������ϱ� ����
		        }
		        //j==0������ j 0�̸� ���� 1�̸� �������̴�
		        else { 
		        	System.out.println("�˻��Ͻ�"+a+"�л��� 1�д�"+(i+1) +"��° �� �����ʿ� �ֽ��ϴ�.");
		        }
		        }
		        }
		        
		        }
		for(int i= 0; i < crr.length; i++) {
			for(int j = 0 ; j < crr[i].length; j++) {
		        if(a.equals(crr[i][j])){
		        if(j==0) {
		        System.out.println("�˻��Ͻ�"+a+"�л��� 2�д�"+(i+1) +"��° �� ���ʿ� �ֽ��ϴ�.");
		        }else {
		        	System.out.println("�˻��Ͻ�"+a+"�л��� 2�д�"+(i+1) +"��° �� �����ʿ� �ֽ��ϴ�.");
			}
		
		
		        }
		        
			}
		}
}
}
