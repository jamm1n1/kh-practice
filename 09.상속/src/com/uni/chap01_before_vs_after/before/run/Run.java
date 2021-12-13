package com.uni.chap01_before_vs_after.before.run;
import com.uni.chap01_before_vs_after.before.model.vo.Smartphone;
import com.uni.chap01_before_vs_after.before.model.vo.Desktop;
import com.uni.chap01_before_vs_after.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
	
		
	Desktop d = new Desktop("삼성","D_01","모니터",10000,true);
	Smartphone s = new Smartphone("삼성","D_01","모니터",1000,"KT");
	Tv t = new Tv("삼성","D_01","모니터",10000,47);
	
	System.out.println(d);
	System.out.println(s);
	System.out.println(t);
	}

}
