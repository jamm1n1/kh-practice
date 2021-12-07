package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
       Employee[] e = new Employee[3];
       e[0] = new Employee();
       e[1] = new Employee(1," È«±æµ¿ ",19,'m',"01022223333","¼­¿ï Àá½Ç");
       e[2] = new Employee(2," °­¸»¼ø "," ±³À°ºÎ "," °­»ç ",20,'F',100000,0.01," 01011112222 "," ¼­¿ï ¸¶°î ");
       for(int i =0; i < e.length ; i++) {
    	   System.out.println(e[i].infomation());
    	 	   
       }
       System.out.println("===========================================");  
       e[0] = new Employee(0, " ±è¸»¶Ë "," ¿µ¾÷ºÎ " ," ÆÀÀå " , 30, 'M',300000,0.2 , "01055559999"," Àü¶óµµ ±¤ÁÖ ");
       e[1] = new Employee(1," È«±æµ¿ "," ±âÈ¹ºÎ ", " ºÎÀå ",19,'M',400000, 0.3 ," 01022223333 "," ¼­¿ï Àá½Ç ");
       for(int i = 0; i < 2; i++) {
    	   System.out.println(e[i].infomation());
    	   
       }
       double a = ((e[0].getSalary()+e[0].getSalary()*e[0].getBonusPoint())*12);
       double b = ((e[1].getSalary()+e[1].getSalary()*e[1].getBonusPoint())*12);
       double c = ((e[2].getSalary()+e[2].getSalary()*e[2].getBonusPoint())*12);
       System.out.println("===========================================");
       System.out.println("±è¸»¶ËÀÇ ¿¬ºÀ : "+((e[0].getSalary()+(e[0].getSalary()*e[0].getBonusPoint()))*12)+"¿ø");      
       System.out.println("È«±æµ¿ÀÇ ¿¬ºÀ : "+((e[1].getSalary()+(e[1].getSalary()*e[1].getBonusPoint()))*12)+"¿ø");
       System.out.println("°­¸»¼øÀÇ ¿¬ºÀ : "+((e[2].getSalary()+(e[2].getSalary()*e[2].getBonusPoint()))*12)+"¿ø");     
       System.out.println("===========================================");
       System.out.println("Á÷¿øµéÀÇ ¿¬ºÀÀÇ Æò±Õ : "+((a+b+c)/3)+"¿ø");
       
	}
	

}
