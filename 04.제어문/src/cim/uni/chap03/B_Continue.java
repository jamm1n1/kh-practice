package cim.uni.chap03;

public class B_Continue {
	//continue : 반복문 안에서만 사용 가능 하며 continue 를 만나게 되면 그다음 구문은 
		//			 실행하지 말고 가장 가까운 반복문으로 올라가라는 의미
	
	public void method1() {
		//1부터 10까지 홀수 출력
		
		
	for (int i = 1; i <=10; i++) {
		if (i%2==0) {
			continue;
			
		}
		System.out.println(i+" ");
	}
	}
	
	public void method2() {
		//1부터 100까지 정수들의 합을 출력
		//단, 6의 배수는 제외하고 덧셈연산 계산
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
		//2~9단 까지 구구단 출력중 
		//4의 배수 단은 빼고 출력
		
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
		//2~9 단 까지의 구구단을 출력 할 건데 단 * 수에서 수가 짝수인것을 제외하고 출력하세요.
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
