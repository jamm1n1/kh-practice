package com.uni.chap01_poiy.part01_basic.run;

import com.uni.chap01_poiy.part01_basic.mode.vo.Child1;
import com.uni.chap01_poiy.part01_basic.mode.vo.Child2;
import com.uni.chap01_poiy.part01_basic.mode.vo.Parent;

public class Run {
	
	public static void main(String[] args) {
//���ݱ��� ���� = ���Կ������� �翷 �ڷ��� (Ÿ��) �� ���ƾ��Ѵ�.
	
	//1. �θ�Ÿ�� ���۷��� �� �θ�ü�ٷ�� ��� 
	
    System.out.println("1.�θ�Ÿ�� ���۷��� �� �θ�ü �ٷ�°��");

	Parent p1 = new Parent();
	p1.printParent();
	
	//2. �ڽ�Ÿ�� ���۷��� �� �ڽ� ��ü�� �ٷ�� ��� 
	System.out.println("2.�ڽ�Ÿ�� ���۷��� �� �ڽ� ��ü�� �ٷ�� ���");
	Child1 c1 = new Child1();
	
	/*((Parent))*/c1.printParent();
	c1.printChild1();
	
	//c1���۷����� Parent,Child1 �Ѵ� ���ٰ���(Parent ����� ���ٽ� �ڵ����� ����ȯ��ä�� ������ �ǰ� �־�����)
	
	
	//������
	//3. �θ�Ÿ���� ���۷����� �ڽ� ��ü�� �ٷ�� ���
	
	Parent p2 = /*(Parent)*/new Child1();//�ڵ����� ����ȯ �ǰ� �ִ°�
	
	//p2 ���۷����� Parent �� ���ٰ��� 
	//������ Child1�� ������ �ؾ��Ѵٸ� ����ȯ�� �ؾ��� (�����(����) ����ȯ)
	p2.printParent();
	((Child1)p2).printChild1();
	
	// ��ӱ����� Ŭ������ ������ ����ȯ�� �����ϴ�.
	
			// 1. UpCasting
			// �ڽ�Ÿ�� ---> �θ�Ÿ������ ����ȯ
			// ������ �����ϴ� (�ڵ� ����ȯ)
			// ���� �ڽ�.�θ�޼ҵ�() ��� �����ߴ� ��
			
			// 2. DownCasting
			// �θ�Ÿ�� ---> �ڽ�Ÿ������ ����ȯ
			// ������ �Ұ����ϴ� (�ݵ�� �������� �Ѵ�)
			// ((�ڽ�)�θ�).�ڽĸ޼ҵ�() �� ����� ����ȯ �ؾ���
			
			// 3. �Ұ����� ��� : �������� ���Ǵ� �θ�Ÿ������ ���� �Ļ��� �������� Ÿ���� �ڽ� ��ü�� �θ� Ŭ���� Ÿ�� �ϳ��� �ٷ� �� �ִ� ���
	        //Child1 c2 = new Parent();//������ ���� : �ҽ����� ���� ����(Ÿ���� �����ʾƼ� �����߻�)
	        // Child1 c2 = (Child1) new Parent();//��Ÿ�� �����߻� : ���α׷� ����� �߻��ϴ� ���� 
	        // c2.printParent();
	
	
	        Child1[] arr1 = new Child1[2];
	        arr1[0] = new Child1(1,2,4);
	        arr1[1] = new Child1(2,3,5);
	        
	        Child2[] arr2 = new Child2[2];
	        arr2[0] = new Child2(2,1,5);
	        arr2[1] = new Child2(2,7,5);
	        
	        //�������� ����Ȱ�� - �θ� Ÿ���� ���۷����� �پ��� �ڽ� ��ü���� �� �޾��� �� �ִ�.(�ڵ���� ���� , ������ �ڵ�����)

	        Parent[]  arr = new Parent[4];
	        arr[0] = new Child1(1,2,4);
	        arr[1] = new Child1(2,3,5);	        
	        arr[2] = new Child2(2,1,5);
	        arr[3] = new Child2(2,7,5);
	        
	        //������ �ڽ� �޼ҵ带 ���� - > �ڽ� Ÿ������ ����ȯ�� �ؼ� �ڽ� �޼ҵ� ����
	        
	        ((Child1)arr[0]).printChild1();
	        ((Child1)arr[1]).printChild1();
	        ((Child2)arr[2]).printChild2();
	        ((Child2)arr[3]).printChild2();
	        
	        
	        System.out.println("�ݺ����� �̿��ؼ� ��� !! -----------------");
	        
	        
	        for(int i = 0; i < arr.length; i++) {
	        	//instanceof ������ 
				//���� ���۷����� ���� �Ŭ�������� �ּҸ� �����ϰ� �ִ��� Ȯ���Ҷ� ��� 
				//Ŭ����Ÿ���� ��ġ�ϸ�  true, �ƴϸ� false --> ���ǽ��� �̿�
				//���۷���             //Ŭ������(Ÿ��)
	        	
	        if(arr[i] instanceof Child1) {// �ش� �ε����� ���� Child1 Ÿ���� �����ϰ� ������ true �ƴϸ� false
	        	 ((Child1)arr[i]).printChild1();// �ڽ� 1�� ����ȯ
	        }else {
	        	  ((Child2)arr[i]).printChild2(); //�ڽ� 2�� ����ȯ
	        }
	        arr[i].print();
	     // �������̵� ������ �����ϰ� �Ǹ� �ڵ����� ���� ���� �����ϰ��ִ� Ŭ���� �޼ҵ带 ã�ư��� ����
	     			// �������ε� : ���α׷��� ���� �Ǳ����� �������� �Ǹ鼭 ��� �޼ҵ�� �������ε��� �ȴ�.
	     			// �����Ͻÿ� ���� ���ε��� �޼ҵ带 ������ ����� ��ü Ÿ���� �������� ���ε� �Ǵ� ���� ���� ���ε��̶�� �ϰ�
	     			// ��� ����� �̷���� (������ ����) �޼ҵ� �������̵��� �Ǿ� ������
	     			// ���� ���ε� �� �޼ҵ� �ڵ庸�� �������̵� �� �޼ҵ带 �켱������ �����Ѵ�.
	        }
	        // for each�� 
	        for(Parent p : arr) {
	        	
	        	  if(p instanceof Child1) {
	 	        	 ((Child1)p).printChild1();
	 	        }else {
	 	        	  ((Child2)p).printChild2(); 
	 	        }  	
	        }
	Parent pp = new Child1();
	pp.print();
	
	}
}
