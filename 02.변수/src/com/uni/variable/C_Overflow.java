package com.uni.variable;

public class C_Overflow {

	public void printVariableSize() {
		System.out.println("byte의 크기 : " + Byte.BYTES + "byte");
		System.out.println("short의 크기  : " + Short.BYTES + "byte");
		System.out.println("int의 크기  : " + Integer.BYTES + "byte");
		System.out.println("long의 크기  : " + Long.BYTES + "byte");
		System.out.println("float의 크기  : " + Float.BYTES + "byte");
		System.out.println("double의 크기  : " + Double.BYTES + "byte");
		System.out.println("char의 크기  : " + Character.BYTES + "byte");
	}
	public void overflow() {
		byte bNum = 127; //byte 최대값
		System.out.println(bNum);
		
		byte result = (byte) (bNum + 3);
		System.out.println("result "+ result);
		
		int num1 =1000000; //100만
		int num2 =700000; //70만
		
		int result2 =num1*num2; //7조
		
		System.out.println("result2 " + result2 );
		
		long result3 = num1*(long)num2;
		System.out.println("result3 " + result3);
	}
}
