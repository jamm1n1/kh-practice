package cim.uni.chap03;

public class B_Continue {
	//continue : �ݺ��� �ȿ����� ��� ���� �ϸ� continue �� ������ �Ǹ� �״��� ������ 
		//			 �������� ���� ���� ����� �ݺ������� �ö󰡶�� �ǹ�
	
	public void method1() {
		//1���� 10���� Ȧ�� ���
		
		
	for (int i = 1; i <=10; i++) {
		if (i%2==0) {
			continue;
			
		}
		System.out.println(i+" ");
	}
	}
	
	public void method2() {
		//1���� 100���� �������� ���� ���
		//��, 6�� ����� �����ϰ� �������� ���
		int sum = 0;
	 for(int i = 1; i<=100; i++) {
		 if(i%6==0) {
			 continue;
		 }
		 sum+=i;
		
	 }
	 System.out.println(sum);
	}
	
	public void method3() {
		//2~9�� ���� ������ ����� 
		//4�� ��� ���� ���� ���
		
		for(int dan = 2; dan <=9; dan++) {
			if(dan%4==0) {
				continue;
			}
			for(int i = 1; i<= 9; i++) {
				System.out.println(dan+" * "+i+"="+(dan*1));
			}
		}
	}
	public void method4() {
		//2~9 �� ������ �������� ��� �� �ǵ� �� * ������ ���� ¦���ΰ��� �����ϰ� ����ϼ���.
		for(int dan = 2; dan <=9; dan++) {
		
			for(int i = 1; i<= 9; i++) {
				if(i%2==0) {
					continue;
				
				}
				System.out.println(dan+" * "+i+"="+(dan*1));
		
	}
			
		}
	}
	
}
