package com.uni.chap02_abstractAndinterface.run;

import com.uni.chap02_abstractAndinterface.model.vo.BasketBall;
import com.uni.chap02_abstractAndinterface.model.vo.FootBall;
import com.uni.chap02_abstractAndinterface.model.vo.Sports;

public class Run {
	// �߻�Ŭ����
		// - �̿ϼ� Ŭ����
		// - �߻�޼ҵ带 ������ Ŭ���� (��, �Ϲ��ʵ� + �Ϲݸ޼ҵ� + [�߻�޼ҵ�])
		// --> �߻�޼ҵ带 ���� Ŭ������ �ݵ�� �߻�Ŭ������ ����ؾߵ�
		
		// - +�Ϲ����� ���(����, �޼ҵ�)�� ���� ����
		// - �̿ϼ��� Ŭ�����̱� ������  new ��� �����ڸ� ���� ���� �Ұ���
		// --> �� ���۷��� (������ ������ Ÿ��)�δ� ��밡��
		// --> ��� ����� �����Ǿ� ���� �״� �θ� ���۷����� �ڽ� ��ü ���� ���� (������ ����)
		
		// �߻�޼ҵ�
		// - �̿ϼ��� �޼ҵ�� �����({})�� �����Ǿ� ���� �ʴ� �޼ҵ�
		// - �߻�Ŭ������ ��� ���� �ڽ� Ŭ�������� �ݵ�� �������̵� �ؾߵ�
		// --> �������̵� ������ ������ ���� �߻�
		// --> �޼ҵ� ����� ���ϼ� Ȯ�� ����
		// --> ǥ��ȭ �� Ʋ�� ���� �� �������� ���

	public static void main(String[] args) {
		
	//	Sports s1 = new Sports();//��ü ���� �Ұ� 
		
		Sports s ;//���۷���(��������)�� ��밡�� , �������� ����Ǽ� �ڽİ�ü�� �����Ͽ� �޾� �� �� �ִ�.
        s = new FootBall();
        
        Sports[]arr = new Sports[2];
        arr[0] = new FootBall();
        arr[1] = new BasketBall();
        
/*        //for
        for(int i = 0; i < arr.length; i++) {
        	arr[i].rule();
        }   
        //for each
        
        for( Sports spo  : arr) {
        	if(spo instanceof FootBall) {
        		spo.rule();
        	}else 
        		if(spo instanceof BasketBall) {
            		spo.rule();           		
        }
        
	}*/
	}
}
