package com.uni.chap07_method.part1_merhodTest.run;

import com.uni.chap06_constructor.model.vo.User;
import com.uni.chap07_method.part1_merhodTest.controller.NonStaticMethod;
import com.uni.chap07_method.part1_merhodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
	
	//------------------NonStaticMethod test--------------------------
		NonStaticMethod  test = new NonStaticMethod();
		
		//1. �Ű����� ���� ��ȯ���嵵 ���� �޼ҵ�
        test.method1();
        
      //2. �Ű������� ���� ��ȯ���� �ִ� �޼ҵ� - ��ȯ�Ǵ� ���� ����ϱ� ���� ������ �ۼ��ؼ� �޾����� 
        String str = test.method2();
        System.out.println("str : "+ str);
        
      //3.�Ű������� �ְ� ��ȯ���� ���� �޼ҵ� 
               
        test.method3(10, 20);
        
        
        //4. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ� 
        
        int result = test.method4(3, 5);
        System.out.println(result);
        
        
        User u1 = new User("user01","pass01" ,"�ο�" );
        System.out.println(u1.toString());
        
        test.method(u1);
        
        System.out.println(u1.toString());
	//---------------------Static Method test------------------------------
		
		//��ü ������ �ʿ� ���� -> �̹� ���α׷� ���۽� �ö��ִ�
		// Ŭ������.�޼ҵ��([���ް�])
		
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("���缮");
		System.out.println(StaticMethod.method4("���缮"));
	} 

	
}
