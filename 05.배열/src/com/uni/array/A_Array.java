package com.uni.array;

import java.util.Scanner;

public class A_Array {

	
	public void method1() {
		//�Ϲ� ��������
		int i; //�޸𸮰��� ���� ����� ���� ���� ���� --> �� �޸� �߿��� stack ������ �Ҵ�Ǵ� �� 
		
		//1.�迭����
		int[] iArr; //�迭�� �����ϰԵǸ� ���� ����� ���������� stack ������ �ڽ��� ����� �̹ڽ��� ���� ���� ������� �뵵�� �ƴϰ� '�ּҸ� �����ϴ� ����'
		
	    double[]dArr;
	    
	    /*
		 * 
		 * ���� ���� ��� ������ �׳� ������� �ϰ�
		 * �ּҰ��� ��� ������ ���۷��� ����(���� ����)��� ǥ���Ѵ�.
		 * 
		 * �⺻ �ڷ���(boolean, char, byte, short, int, long, float, double) �� ������ ����
		 * ->> ��¥ ��(���ͷ�)�� ��� ����--> ����
		 * 
		 * 
		 * �� �� �ڷ���(String, int[], char[]....)
		 * --> �ּҰ��� ��� ����--> ���۷��� ����(��������)
		 * 
		 */
		
		/* 2. �迭 �Ҵ�
		 * �迭�� ���� ������ � ���� �迭 �Ҵ����� ũ�⸦ �ݵ�� �̸� �����صξ�� �Ѵ�.
		 * iArr = new int[] <--ũ�⸦ �������� ������ �����߻�
		 * 
		 * 
		 */
	    
	    iArr = new int[5];
	    dArr = new double[10];
	    
	    
	    //�迭 ����� �Ҵ��� ���ÿ� 
	    
	    int[]iArr2 = new int[5];
	    double[] dArr2 = new double[10];
	    
	    System.out.println("iArr"+iArr);
	    System.out.println("dArr"+dArr);
	    System.out.println("iArr2"+iArr2);
	    System.out.println("idrr"+dArr2);
	    
	    //�ּҰ� ��� -> heap �޸� ������ ������ ����ٰų� ���������� �������� ���ϴ� �����̰� �ּҰ��� ���ؼ� ã�ư� �� �ִ�.
	    
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
			// �迭�� ���� �ʱ�ȭ �����ʴ´ٸ� JVM �� ������ �ڷ����� �⺻������ �迭�� �ʱ�ȭ�Ѵ�. 
			// heap �������� ���� ���� ������ ������ �� ����. --> JVM �� �ڵ����� �ʱⰪ �ο� 
			
			//���ڿ� ���� : length()
			//�迭�� ���� : length
			System.out.println("dArr�� ���� " + dArr.length);
			System.out.println("dArr�� ���� " + iArr.length);

	}
	public void method3() {
	//�迭���� �� �Ҵ� 	
	int [] iArr = new int [5];
	
	//�迭�ʱ�ȭ 
	/*iArr[0] = 1;
	iArr[1] = 2;
	iArr[2] = 3;
	iArr[3] = 4;
	iArr[4] = 5;*/
	
	// �ݺ����� ���ؼ�
	for (int i = 0; i<iArr.length; i++) {
		iArr[i] = i+1;
		System.out.println("iArr[" + i +"] = " + iArr[i]);
		
			}
	System.out.println(iArr);//�ּҰ�
	System.out.println(iArr.hashCode()); //�ּҰ��� 10������
	
		}
		
	public void method4() {
		//����ڤ� �Է��� ���� ������ �迭�� ���̸� �����غ��� 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Ҵ��� �迭�� ���� : ");
		
		int i = sc.nextInt();
		
		double [] dArr = new double[i];
		
		System.out.println(dArr);
		System.out.println("dArr�� ���� : " + dArr.length );
	}
	
	public void method5() {
		
		//�迭 ����� ���ÿ� �ʱ�ȭ �ϱ�
		int[] arr1 = {1,2,3,4,5}; //�߰�ȣ ���� ����ϴ� ��쿡�� new �����ڸ� ��������ʾƵ� �ǰ� ���������� ���� ������ŭ �ڵ����� ũ�Ⱑ �Ҵ��
        
	    int [] arr2 = new int [] {1,2,3,4,5};
	    
	    System.out.println("arr1�� ����" + arr1.length);
	    System.out.println("arr1�� ����" + arr2.length);
	    
	    System.out.println(arr1 == arr2);// arr1, arr2 ���� ������ ���۷���(����) �����̱⋚���� �ּҰ��� ������ ����.
		
		
		
	}
	
	
	public void method6 () {
		String [] sArr = new String[5];
		
		for(int i = 0; i<sArr.length ; i++) {
			System.out.println(sArr[i]);// String �� JVM �� �ο��ϴ� �ʱⰪ�� null�̴�
			
		}
		
		// ����ڿ��� ���ڿ��� �Է¹޾Ƽ� �ش� �ε����� ����ڰ� �Է��� �� �ֱ� 
		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i< sArr.length; i++) {
			System.out.println("���� : " );
			sArr[i] =  sc.nextLine();
			
		}
		for(int i = 0; i< sArr.length; i++) {
			System.out.println(sArr[i]);
			// java.lang.ArrayIndexOutOfBoundsException ����� ����
		}
	}
	
	public void method7 () {
		
		//ũ�Ⱑ 10�� ������ �迭�� ����� , ������(1~100)���� �߻����Ѽ� ��Ƽ� ����ϼ��� 
		int [] iArr = new int [10];	
				for(int i = 0; i<iArr.length; i++) {
					int random =(int)(Math.random()*100+1);
					iArr[i] = random;
					System.out.println("iArr[" + i +"] = " + iArr[i]);
					
				}
				
					
					
				}
		
	
public void method8 () {
	// ���� �迭 ũ�� 5, 1~10 ������ ¦�� (2,4,6,8,10)
	
	int [] iArr = new int [5];
	
	int num = 0;
	
	for(int i = 0; i < iArr.length; i++) {
		iArr[i] = num +=2;
	}
	for(int i = 0; i < iArr.length; i++) {
		System.out.println(iArr[i]);
		
	}
	System.out.println("iArr�� ���� "+ iArr.length);
	System.out.println("iArr�� �ּҰ� "+ iArr.hashCode());
	//iArr[5] = 12;  // �迭�� index�� ����� �����߻� 
	
	//�迭�� ����  - �ѹ������� ũ��� ������ �Ұ����ϴ�. -> ũ�⸦ �ٲٰ��� �ϸ� ���� �Ҵ�
	iArr = new int [10];
	// --new int[5]�� (ó�����������) heap�� �ִ� �����̶� ����Ǿ��ִ� ���� ������ (�������÷���) ���� �ð��� ������ (�ڵ� �޸� ����)
	
	
	System.out.println("ũ�⺯���� iArr ====================");
	System.out.println("iArr�� ���� "+ iArr.length);
	System.out.println("iArr�� �ּҰ� "+ iArr.hashCode());
	
	for(int i = 0 ; i <iArr.length; i++) {
		System.out.println(iArr[i]);
	}
	iArr = null;//���۷���(����)������ null���� ���� �Ǹ� �ּҰ��� null �ٲ�� 
	            //�����ϰ� �ִ� �ּҰ� ���ٴ�  ����. -> heap���� ������� ������.
	            //heap������ ���� �Ǵ� ������� �������� ���� �ð��� �����Ŀ� 
	            //���̻� ������ٰ� �Ǵ��̵Ǹ� ������ �÷��Ͱ� ���� ���ش�.
	

	System.out.println("������ iArr ====================");
	System.out.println("iArr�� ���� "+ iArr.length);
	System.out.println("iArr�� �ּҰ� "+ iArr.hashCode());
	 //java.lang.NullPointerException: -> null�ϋ��� �ƹ��͵� �����ϰ� ���� �ʱ⋚���� ���� ���� �� ���� 
	// �ƹ��͵� �������� �ʰ� null�̶�� Ư���� ���� �����ϰ� ���� �� �߻�  
}
}
		
	
	
