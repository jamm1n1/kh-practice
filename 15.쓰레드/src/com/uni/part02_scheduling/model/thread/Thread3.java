
package com.uni.part02_scheduling.model.thread;


public class Thread3 implements Runnable{
	/*�ھ�: �߾� ó�� ��ġ�� ������ �ϴ� ������� 
	 *  �ѽ̱� �ھ� ȯ��:�ѹ��� �ΰ��� �۾��� ���ÿ� ó���� ���ִ� CPU �ھ �Ѱ��� �̱�, �ΰ��� ���, �װ��� ������ �ϸ�,
	 *  �ھ� ���� �������� �ѹ��� �������� ���� ���ÿ� �����Ͽ� ó�� �ӵ��� ������ 
	 * �̱� �ھ� ȯ�濡�� �켱���� ����� ����ϸ�
	 * �켱 ������ ���� ������ �ϼ��� �� ���� ���� ���� �ð��� �־�����.
	 * (��Ƽ �ھ� ȯ�濡���� �켱������ ���� ���̰� ���� ��Ÿ���� ����)
	 */
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//�켱������ �׳��� ����ǰ� �ϱ����� edlay �ڵ� (�����ڵ�)
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			for(int j = 0 ; j < Integer.MAX_VALUE; j++) {
				
			}
		}
		System.out.println(Thread.currentThread().getName());
	}

}
