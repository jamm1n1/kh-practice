package com.uni.variable;

public class E_Printf {
	//System.out.printf("����", ����ϰ����ϴ� ��, ��, ...);
	  // ����ϰ��� �ϴ� ������ ���õ� ����(����)�� ���缭 ��¸� ���� --> ���ٶ���� ����
	  // %d : ����
	  // %c : ����
	  // %s : ���ڿ� �Ǵ� ���ڵ� ����
	  // %f : �Ǽ�
	
	/*   \t : ������ ������ŭ ����
		 \n : ����ϰ� ������������ �ű�
		 
		 ���Ĺ��
			%5d : 5ĭ�� Ȯ���ϰ� ������ ����
			%-5d : 5ĭ�� Ȯ���ϰ� ���� ����
			%.2f : �Ҽ��� �Ʒ� 2�ڸ������� ǥ��

	*/
	public void printfMethod() {
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		System.out.printf("%d\n", iNum1);
		System.out.printf("%d\n", iNum1,iNum2);
		//System.out.printf("%d%d\n", iNum1); ������ 2���ε� ���� ��� �����߻�
		System.out.printf("%d%d\n", iNum1,iNum2);
		
		System.out.printf("%d + %d = %d\n", iNum1,iNum2, iNum1+iNum2);
		System.out.printf("%5d\n", iNum1);
		
		float fNum = 1.2345458f;
		double dNum = 4.53;
		
		System.out.printf("%f\t%f\n", fNum, dNum);//%f - �Ǽ� ���� �Ҽ��� �Ʒ� 6�ڸ� ���� ������
												  // �Ѿ�ԵǸ� �ݿø�, �Ҽ��� �Ʒ� �������� 0���� ä��
		
		System.out.printf("%.3f\t%.3f\n", fNum, dNum);//�Ҽ��� ����¥������
		
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", ch , str);//a Hello
		System.out.printf("%c %s\n", ch , ch);//a a --> %s �� char ���� ���� 
		
		System.out.printf("%C %S\n", ch , str);//�빮�ڷ�
		
		
		//����
		System.out.println(" 100 �� 10�� : " + 100);
		System.out.println(0x100);  //0x 16����  16^2
		System.out.println(0100);   //0 8����    8^2
		System.out.println(0144);   //8^2 + 8^1*4 + 8^0*4
	}
}
