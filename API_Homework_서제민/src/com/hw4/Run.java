package com.hw4;

import com.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {
		EmpTest et = new EmpTest();
		et.setEmp();
		System.out.println("-------------���� ����-----------------");
		et.printEmp();
		
		et.nameSortPrint();
		System.out.println("-------------���� ����-----------------");
		et.printEmp();
	}

}
