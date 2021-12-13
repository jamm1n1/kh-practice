package com.uni.chap02_stringbuffer_stringBuilder.run;

public class Run {

	public static void main(String[] args) {
		// String Ŭ������ ����
				// String a ���� �Լ� ���� ���ذ��� ��� ���ο� String Ŭ������ ���������.
				
				// StringBuffer �� StringBuilder�� ����
				
				// ���ο� ��ü�� ������Ű�� �ʰ�, ������ �ִ� ��ü�� ũ�⸦ ������Ű�鼭 ���� ���Ѵ�.
				// * ����ð�
				// String > StringBuffer > StringBuilder
				// * �޸�
				// String > StringBuffer == StringBuilder
				
				/*
				 * StringBuffer�� StringBuilder�� mutable�̴�.(����)
				 * 16���� ���ڸ� ������ �� �ִ� ������ �����ȴ�.
				 * ó���� � ũ��� ���� ���ؼ� ������ ���� �ִ�.
				 */
		
		
		//method1();
		//method2();
		//method3();
		method4();
	}

	private static void method3() {
		StringBuilder sb  = new 	StringBuilder("��");
		
		//append : �ڿ� ���� �߰� 
		sb.append("�谡 ������").append("!!!!");//�޼ҵ�ü�̴� : �����޼ҵ带 �̾ ȣ���ϴ� ���� 
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//insert : ����
		sb.insert(1, "���ɽð����̶�.");
		System.out.println(sb);
		
		//delete : ����
		sb.delete(0, 8);
		System.out.println(sb);
		
		
		//reverse : ����
		sb.reverse();
		System.out.println(sb);
	}
	public static void method4() {
		
		
		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder stringBuilder = new StringBuilder();
		new Thread(() -> {
			int a = 0;
		    for(int i=0; i<10000; i++) {
		    	
		    	a = i;
		        stringBuffer.append(1);
		        stringBuilder.append(1);
		    }
		   System.out.println(a+1);
		}).start();

		new Thread(() -> {
			int b = 0;
		    for(int i=0; i<10000; i++) {
		    
		    	b=i;
		        stringBuffer.append(1);
		        stringBuilder.append(1);
		    }
		    System.out.println(b+1);
		}).start();

		new Thread(() -> {
		    try {
		        Thread.sleep(5000);
		        
		        System.out.println("StringBuffer.length: "+ stringBuffer.length());
		        System.out.println("StringBuilder.length: "+ stringBuilder.length());
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}).start();

		}

	private static void method2() {
		String str = "�ݰ���";
		
		System.out.println("str ���� : "+str +" �ּ� : "+ System.identityHashCode(str));
		str+="�� ��Ʈ���̶����";
		System.out.println("str ���� : "+str +" �ּ� : "+ System.identityHashCode(str));
		
		
		StringBuffer sbf = new StringBuffer("�ȳ�~~");
		System.out.println("sbf ���� : "+sbf +" �ּ� : "+ System.identityHashCode(sbf));
		sbf.append("�� ��Ʈ�� ���۾�");
		System.out.println("sbf ���� : "+sbf +" �ּ� : "+ System.identityHashCode(sbf));
		
		StringBuilder sbd = new StringBuilder("wow");
		System.out.println("sbd ���� : "+sbd +" �ּ� : "+ System.identityHashCode(sbd));
		sbd.append("�� ��Ʈ�� ������");
		System.out.println("sbd ���� : "+sbd +" �ּ� : "+ System.identityHashCode(sbd));
		
	}

	private static void method1() {
		
		StringBuilder sb = new StringBuilder("ȯ�ҿ�����");
		System.out.println(sb.capacity()); //sbũ��
		System.out.println(sb.length());// ���ڿ��Ǳ���

		StringBuilder sb1 = new StringBuilder(20);//�⺻ �޸� Ȯ�� ũ�⸦ ���ؼ� ������ ���� �մ�.
		 System.out.println(sb1.capacity());
	}

}
