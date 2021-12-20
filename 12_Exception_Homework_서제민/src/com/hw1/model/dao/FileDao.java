package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class FileDao {

	Scanner sc = new Scanner(System.in);

public FileDao () {
	
}
public void fileSave() {
	StringBuilder sb = new StringBuilder();
	
	while(true) {
		System.out.println("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�. (exit�� �Է��ϸ� �����Է� ��)");
		String file = sc.nextLine();
       if(file.equalsIgnoreCase("exit")) {
    	   return;
       }else {
    	   sb.append(file);
       }
       System.out.println("�����Ͻðڽ��ϱ�? (y/n)");
       String a = sc.nextLine();
       if(a.equalsIgnoreCase("y")) {
    System.out.println("������ ���ϸ��� �Է��� �ּ���. : ");
    String b = sc.nextLine();
    	 try (BufferedWriter bw = new  BufferedWriter(new FileWriter(b+".txt"))) {
    		   bw.write(file);
    		   System.out.println("�Է¹��� a_buffer.txt ���Ͽ� ���������� �����Ͽ����ϴ�." );
    	   } catch (IOException e) {
			
			e.printStackTrace();
	
		}
       }else {
    	   System.out.println("�޴��� ���ư��ϴ�");
    	   break;
       }
	}
}
public void fileOpen() {
	System.out.println("���� �� ���ϸ� : ");
	String b = sc.nextLine();
	 try (BufferedReader bw = new  BufferedReader(new FileReader(b+".txt"))) {
		 String temp = null;
			while((temp = bw.readLine()) != null) {
				System.out.println(temp);
			}
	    	
	 } catch (FileNotFoundException e) {
		if(b.equals(b)){
		System.out.println("�����ϴ� ������ �����ϴ�");
		}	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
public void fileEdit() {
	StringBuilder sb = new StringBuilder();
	System.out.println("���� �� ���ϸ� : ");
	String b = sc.nextLine();
	 try (BufferedReader bw = new  BufferedReader(new FileReader(b+".txt"))) {
		 bw.readLine();
		
		 while(true) {
				System.out.println("���Ͽ� �߰��� ������ �Է��Ͻÿ�. (exit�� �Է��ϸ� �����Է� ��)");
				String file = sc.nextLine();
		       if(file.equalsIgnoreCase("exit")) {
		    	   return;
		       }else {
		    	   sb.append(file);
		       }
		       System.out.println("����� ������ ���Ͽ� �߰��Ͻðڽ��ϰ�? (y/n)");
		       String a = sc.nextLine();
		       if(a.equalsIgnoreCase("y")) {
		    	 System.out.println("����� ������ ����Ǿ����ϴ�.");
		    	 try (BufferedWriter br = new  BufferedWriter(new FileWriter(b+".txt"))) {
		    		   br.write(file);
		    		   
		    	   
	
	 } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}
}