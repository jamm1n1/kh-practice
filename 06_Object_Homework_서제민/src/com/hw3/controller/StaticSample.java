package com.hw3.controller;

public class StaticSample {

	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper() {//각문자에 -32하면 대문자이다 거꾸로 +32하면 소문자가 된다 
		
		 String input=value;
	        char[] arr;
	        arr= input.toCharArray();//toCharArray문자열을 하나씩 나누어 char로 만들어주는거
	        
	        for(int i=0; i<arr.length; ++i){
	            if(97<=arr[i] && arr[i]<=122){
	                arr[i]=(char)(arr[i]-32);		
	                }
	            
	}
	        System.out.println(arr);
	}
	public static int valueLength (){
		int length = value.length();
		System.out.print(length);
		return length;
		

		}

		public static String valueConcat(String str) {
			String sum = null;
			sum = StaticSample.value+str;
			System.out.println(sum);
			return sum;
		}
		public static void setChar(int index, char c) {
			
			 String input=value;
		        char[] arr;
		        arr= input.toCharArray();		       
		        	arr[index] =c;
		        	System.out.println(arr);
		        }
		}
	

	
	
	
	
	

