package com.uni.chap01_before_vs_after.before.run;
import com.uni.chap01_before_vs_after.before.model.vo.Smartphone;
import com.uni.chap01_before_vs_after.before.model.vo.Desktop;
import com.uni.chap01_before_vs_after.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
	
		
	Desktop d = new Desktop("�Ｚ","D_01","�����",10000,true);
	Smartphone s = new Smartphone("�Ｚ","D_01","�����",1000,"KT");
	Tv t = new Tv("�Ｚ","D_01","�����",10000,47);
	
	System.out.println(d);
	System.out.println(s);
	System.out.println(t);
	}

}
