package com.uni.chap01_before_vs_after.after.run;

import com.uni.chap01_before_vs_after.before.model.vo.Desktop;
import com.uni.chap01_before_vs_after.before.model.vo.Smartphone;
import com.uni.chap01_before_vs_after.before.model.vo.Tv;

public class Run {

	
		// TODO Auto-generated method stub

		/* ���
		 *  [����������][��Ÿ������] class Ŭ������ extends ���� Ŭ������ [implements �������̽�]
		 *  
		 *  # this,super ==> static �޼ҵ忡���� ��� �� �� ����.
		 *  super : ���� Ŭ������ ����Ű�� ���۷��� ����, ���к����� �ҷ��´�.
		 *  this : Ŭ���� �ν��Ͻ� �� �ڽ��� ��Ÿ���� ���۷��� ����
		 *  
		 *  this(),super() : ������ ȣ�� : ������ ���� ù��° �ٿ��� ���
		 *  
		 *  ����� ����
		 *  - ���� ���� ���� �ڵ�� ���ο� Ŭ������ �ۼ� ����
		 *  - �ڵ带 ���������� �����ϱ� ������ �ڵ��� �߰�, ���濡 ����
		 *  - �ڵ��� �ߺ��� �����ؼ� ���α׷��� ���꼺�� ���������� ũ�� �⿩
		 *  
		 *  ����� Ư¡
		 *  - Ŭ������ ����� ���ϻ�Ӹ� ���� (���߻�� �Ұ���) extends Product, SmartPhone �Ұ���
		 *  - ��õǾ� ���� ������ ��� Ŭ������ object Ŭ������ �ļ��̴�. --> �� object Ŭ������ �����ϴ� �޼ҵ带 �������̵��Ͽ� �޼ҵ� �����Ǹ� �� �� �ִ�.
		 *  - �θ�Ŭ������ �����ڿ� �ʱ�ȭ ����� ����� �Ұ����ϴ� (�ڽ� Ŭ���� ������ �θ�Ŭ���� �����ڰ� ��������)
		 *  - �θ��� private ���(�ʵ�, �޼ҵ�)�� ����� ������ ���� ������ �Ұ����ϴ� (��, protected�� �ϰ� �Ǹ� �ļ�Ŭ������ ���� ������ �����ϴ�.)
		 *  
		 *  
		 */
	public static void main(String[] args) {
		
		Desktop  d = new Desktop("�Ｚ","d_01","����ũž",1000000,true); 	
		Smartphone  s = new Smartphone("�Ｚ","d_01","����Ʈ��",1000,"Kt"); 	
		Tv t = new Tv("�Ｚ","d_01","Ƽ��",1000000,46); 	


		System.out.println(d);
		System.out.println(s);
		System.out.println(t);
		
		t.setBrand("LG");
		System.out.println(t);
		
		d.print();//�����ϰ����ϴ� �޼ҵ尡 �ڽĿ� ������ �θ�޼ҵ尡 �����
		          //��, �ڽ��� �������̵� �ؼ� ������ ������ �ڽ��� �޼ҵ尡 �켱���� ���� 
		          // �������̵� - �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� �������ؼ� ����ϴ� ��
	}

}
