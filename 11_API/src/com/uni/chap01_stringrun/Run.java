package com.uni.chap01_stringrun;

public class Run {

	public static void main(String[] args) {
		
		//Run.method1();
		new Run().method2();
	}
	
	private static void method2() {
		String str = "abc";
		//charAt(�ش��ε���) : ���� �̾Ƴ���
		System.out.println(str.charAt(2));
		//concat: ���ڿ� ��ġ�� 
		System.out.println(str.concat("def"));
		
		//contain : ���Կ���Ȯ�� 
		System.out.println(str.contains("ab"));
		
		//equals : ���� ���� Ȯ�� (���ڰ��� ��ġ )
		System.out.println(str.equals("abc"));
		
		//length() :���ڿ��� ����(���ڿ��� ���Ե� ���� ����)
		System.out.println(str.length());
		
		//split : ���� ���� (Ư�� ��ȣ�� �������� ������ ���ڿ� �迭�� �ɰ��� ��ȯ�ϴ� �޼ҵ�) 
		String str1 = "a,bc,de";
		String[] strArr = str1.split(",");
		for (String arr : strArr) {
			System.out.println(arr);
		}
		String strCase1 = "Abc";
		String strCase2 = "aBc";
		//toUpperCase: �빮�ڷ�
	    //tolowerCase: �ҹ��ڷ� 
	    //equalsIgnoreCase : ��ҹ��� ������� ���ڿ� �� (boolean)
		
		System.out.println(strCase1.toUpperCase());
		System.out.println(strCase2.toLowerCase());
		
		System.out.println(strCase1.equalsIgnoreCase(strCase2));
		
		//trim : ���ڿ� ���� ��������
		String str2 = "               ab c              ";
		System.out.println(str2);
		System.out.println(str2.trim());
	}

/*	private static void method1() {
		//1. ���ڿ��� ���ͷ��� ����
		String str = "abc";// heap ��Ʈ���ʵ�
		
		
		String str1 = "abc";
		String str2 = "def";
		
		//2. ���ڿ��� new �����ڷ� ���� 
		String str3 = new String("abc");
		String str4 = new String("abc");
		str = new String("abcd");
		//��� 
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//�߼Ұ� hash�� ��� 
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		//�ּҰ� System.identityhashCode �� ���
 		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		str3+="z";
	}*/

}
