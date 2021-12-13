package com.uni.exception.controller;

import java.util.Scanner;

public class A_UnCheckedException {
	// - ����(Exception) : �ҽ� �ڵ� �������� �ذ� ������ ����

			// RuntimeException�̶� : �̸� ���� �Ǿ� �ְ� �̵��� ����ϴ� ���� ��Ȳ��
			//						���α׷��� ����� �̾����� ���� �ڿ������� ��찡 ����.
			//						(��!��!��! ����ó���� ���� ���α׷��� ������� �ʰ� ó�� �� �� �ִ�.)
			
			
			 // - ���� ó�� ���
			 // 	1. if�� : ������ ���� ó����
			 //				 (������ ���α׷��� ������� �ʰ� �� ���� ��Ȳ�� �־�� if����
			 //				  ������� �ʰ� �Ͽ� ���α׷��� �帧�� ������ �� �ִ�.)
			 //				 (������ if���� �ʹ� ���� Ȥ�� ���� ���Ǹ� �װ� ���� ��Ȳ�� ó���ϴ� ������
			 //				  ���α׷� ���� �� �帧 �ڵ������� ������ �ȵȴ�.)
			 //
			 //		2. try-catch�� : ���ܻ�Ȳ�� �߻��� �� �ִ� ������ ���ؼ� ���� ó���� �ϰ�
			 //						��� ó�������� ����
			 //						a. try��� ���� �ϳ��� ���� ����(Ʈ�����)�̴�.
			 //						   ���� ��Ȳ�� �߻��ϴ� �κ�
			 //						b. catch ����� ()���� try��� �ȿ��� �߻��� ����Ŭ������
			 //						   �ν��Ͻ� ����������(��ü�� �ּҰ�)�� �Ѿ�´�.(JVM�� ����)
			 //
			 //     3. throws : ����ó���� ���� �ʰ� �ڽ��� ȣ���� ���� �޼ҵ忡�� ó���� ����
			 //     			main()�޼ҵ���� �����ϰ� ������ throws�� �ϰ� �Ǹ�
			 //     			�������� JVM�� ���� ó���� ��
			 //      
			 //      
			 //   RuntimeException�� �ļյ�
			 // - ArrayIndexOutOfBoundsException : �迭�� ���ٿ� �߸��� �ε��� ���� ����ϴ� ���ܻ�Ȳ --> �����ڰ� �Ǽ� (�ڵ� �ذ��ϸ��)
			 // - ClassCastException : ����� �� ���� ����ȯ�� ����Ǵ� ���� ��Ȳ --> �����ڰ� �Ǽ� (�ڵ� �ذ��ϸ��)
			 // - NegativeArraySizeException : �迭 ���� �������� �迭�� ũ�⸦ ������ �����ϴ� ���ܻ�Ȳ --> �����ڰ� �Ǽ� (�ڵ� �ذ��ϸ��)
			 // - NullPointerException : ���������� null�� �ʱ�ȭ �� ��Ȳ���� �޼ҵ带 ȣ���ϴ� ���ܻ�Ȳ --> �����ڰ� �Ǽ� (�ڵ� �ذ��ϸ��)
			 // - ArithmeticException : ������ ���꿡�� �θ� 0�� ��� �߻��ϴ� ���� ��Ȳ --> �����ڰ� �Ǽ� 
			 //
			 //--> �̷��� RuntimeException ���õ� ���ܴ� ����� ���������� ��Ȳ�� �־ 
			 //    �ƿ� ���ʿ� ���ܰ� �߻��� �ȵǰԲ� if�� �������� ����� ó�� ���� 
		
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : ������ ���꿡�� �θ� 0�� ��� �߻��ϴ� ���� ��Ȳ --> �����ڰ� �Ǽ� 
		System.out.println("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("����2 : ");
		int num2 = sc.nextInt();
		
		//int result = num1/num2;// ����ڰ� num2�� 0�� �Է��ϸ� ����������
		
		int result = 0;
		if(num2 !=0) {//���ʿ� ���ܰ� �߻��� ���� ���� if ������ ���� �˻�
			result=num1/num2;
		}
		
		System.out.println("result "+ result);
		
		// ���� ó�� : ���ܰ� �߻����� �� ó���ϴ� ������ �ۼ��س��°�!
				/*
				 * * try catch ���
				 * 
				 * try {
				 * 		���ܰ� �߻��� �� �ִ� ����;
				 * 
				 * }catch(�߻��ɿ���Ŭ���� �Ű�����) {
				 * 		�ش� ���ܰ� �߻��Ǵ� ��� ó���� ����;
				 * 
				 * }
				 */
		
		int result1 = 0;
		try {
				result1 = num1/num2;
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
    public void method2() {
    	
    	System.out.println("�迭�� ���� : ");//������ Ȯ�� java.lang.NegativeArraySizeException:
    	int num = sc.nextInt();
    	
    /*	if(num > 0) {
    	
    	int arr[] =new int[num];
    	}else {
    		System.out.println("����� �Է��ϼ���");
    	}*/
    	try {   int arr[] =new int[num];
    	
    	}catch(NegativeArraySizeException e ) {
    		System.out.println("����� �Է��ϼ���");
    	}
    	
    	
    	   
    }
 
    //multicatch�� + finally
	public void classNArrayEX() {
		
		try {
		// ClassCastException : �߸��� �ڷ��� ��ȯ�� �߻��ϴ� ���� Ŭ����
		Object obj = 'a'; //char -> (autoBoxing)-> Character-> (������)--> Object
	//String str = (String) obj;//������ ���� x , ��Ÿ�� ���� O
		
		//String str = String.valueOf(obj);
		
			
		int [] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		//arr[2] = 3;
		//ArrayIndexOutOfBoundsException : �迭 ���� �Ѿ� ���� �� �߻��ϴ� ���� Ŭ����
		
		String str1 = null;
		int lenght = str1.length();
		//NullPointerException : Null �� ������ ������ �����ؼ� �޼ҵ带 ������ �Ҷ� �߻��ϴ� ����Ŭ����
		
		/*}catch(ClassCastException e ) {
			System.out.println("�߸��� ����ȯ�� �ϰ��ֽ��ϴ�. ����������");
		}catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭ũ�⸦ �� �� �����ߴ�.");
		}catch(NullPointerException e) {
			System.out.println("��ü���� �޼ҵ带 ������ �ϳ�/");*/
		}catch(ClassCastException|ArrayIndexOutOfBoundsException|NullPointerException e) {
			//Multi catch �� --> ������ �ۼ��ϴ� ��� ���� ���븸 �Բ� ���
			e.printStackTrace();//�����޽��� �״뷯���  �����߻����+ ���θ޼���'
		//	System.out.println(e.getMessage());// �����޽���
		//	System.out.println(e.toString()); ����+ �����޽���
		//	System.exit(0); // ���� ����
			return;
		}finally {
			System.out.println("������ �����ϳ�.");// ������ ����
			
		}
		System.out.println("���α׷� ����");// ������ �߻��ϸ� Ÿ�� �ʴ´�.
	}
}
