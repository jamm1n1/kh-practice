package com.uni.chap02_listSort.model.comparator;

import java.util.Comparator;

import com.uni.chap02_listSort.model.vo.Travel;

public class AscTravelNum implements Comparator<Travel> {

	@Override
	public int compare(Travel o1, Travel o2) {
		//10 �� 100���� ũ�� 10-100 �ϸ� - �ϱ�  
				//������ - �� ���� �۴�   +��  ����ũ�� �̷��� �ؼ� �ڸ��� �ٲ��ܱ��ظ�����ָ� ������ ���ش�.
				
				/*	
				 *  1 - 3 = -2 >0  false  1 3 2 5 4
					1 - 2 = -1 >0  false  1 3 2 5 4	
					..
					3 - 2 =  1 > 0 true   1 2 3 5 4 
					3 - 5 = -2 > 0 false  1 2 3 4 5 
					..
					5 - 4 =  1 > 0 true  1 2 3 4 5 
				*/
		return o1.gettNum()-o2.gettNum();
		
		
		
		
		
	}

}
