package com.hw1.run;

import com.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
	NonStaticSample n = new NonStaticSample();
	System.out.print("���� �� : ");
	n.printLottoNumbers();
	System.out.println();
	System.out.print("a���� 5�� ���");
	n.outputChar(5, 'a');
	System.out.println();
	System.out.print("���� ������ ��� : ");
    char a = n.alphabette();
    System.out.println(a);
    System.out.println("apple�� 2�� 4�� �ε��� ������ �� ��� : ");
	String result=n.mySybstring("apple", 3, 2);
	System.out.println(result);
}
}