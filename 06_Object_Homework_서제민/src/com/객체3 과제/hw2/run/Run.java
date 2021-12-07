package com.hw2.run;



import com.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample n = new NonStaticSample();
			
		 int [] arr = n.intArrayAllocation(5)	;	 
		 n.display(arr);
		 n.swap(arr, 1, 4);			
		 n.sortDescending(arr);
		 n.sortAscending(arr);
		 System.out.println();
		 n.countChar("apple", 'p');
		 n.totalValue(13, 7);
		 n.pCharAt("programming", 3);
		 n.pConcat("JAVA", "programming");
		
		
	}
	

	
	}


