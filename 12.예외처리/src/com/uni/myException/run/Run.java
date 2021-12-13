package com.uni.myException.run;

import java.util.Scanner;

import com.uni.myException.exception.MyException;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("�����ϳ��� �Է��ϼ��� ");
        
        int num = sc.nextInt();
        
        try {
			checkNum(num);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void checkNum(int num) throws MyException {
		
		if(num < 10) {
			throw new MyException(num + "��(��) 10���� ���� �� �Դϴ�.");
		}else {
			System.out.println("10���� ũ�ų� ���� �� �̱���");
		}
         
	}

}
