package com.uni.operator;

public class C_Arithmetic {
	
	public void method1 () {
		
		int num1 = 10;
		int num2 = 3;
		
		
		System.out.println("num1 + num2 = "+ (num1 + num2));
		System.out.println("num1 - num2 = "+ (num1 - num2));
		System.out.println("num1 * num2 = "+ (num1 * num2));// ���ϱ�
		System.out.println("num1 / num2 = "+ (num1 / num2));// �������� ��
		System.out.println("num1 % num2 = "+ (num1 % num2));// �������� ������
		
		
		// �� % 2 == 0 --> ¦�� 
		// �� % 2 == 1 --> Ȧ��
		
		
		// �� % 5 == 0 --> 5�� ���
		

	}
	public void method2 () {
		
		double a = 35;
		double b = 10;
		
		
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		double sum = a + b; 
		System.out.println("a + b = "+ sum);
		
		
		double sub = a - b; 
		System.out.println("a - b = "+ sub);
		
		
		double mul = a * b; 
		System.out.println("a * b = "+ mul);
		
		
		double div = a / b; 
		System.out.println("a / b = "+ div);
		
		double mod = a % b;
		System.out.println("a % b  = " + mod);
		
		
		int c = 27; 
		System.out.println("c ="+ c);
		
		double result = a + a * b % c - a / b;
		
		System.out.println(result);
		/* 1. a * b = 350.0
		 * 2. 350.0 % 7 = 26.0
		 * 3. a / b = 3.5 
		 * 4. a + 26.0 - 3.5 = 57.5
		 */
		
	}
	public void method3() {
		
		int a = 5;
		int b = 10;
		 
		//  
		int c = (++a) + b;    // a = 6,  b = 10, c = 16
		int d = c / a;     // a= 6  c= 16 d= 2
		int e = c % a;     // a = 6 c = 16 e = 4
		int f = e++; 	   // e = 4(5) f = 4 
		int g = (--b)+ (d--);  //b = 9 d =2(1) g = 11
		int h = 2;			
		int i = a++ + b / (--c / f ) * (g-- - d) % (++e + h); //a=6(7) b = 9 c = 15 d = 1 e = 6 f = 4 g = 11(10) h = 2 i = 12
		                            //6+3*10%8
		System.out.println("a : " + a);	// 7
		System.out.println("b : " + b);	// 9
		System.out.println("c : " + c);	// 15
		System.out.println("d : " + d); // 1
		System.out.println("e : " + e); // 6
		System.out.println("f : " + f); // 4
		System.out.println("g : " + g); // 10
		System.out.println("h : " + h); // 2
		System.out.println("i : " + i); // 12
		
	}
}
