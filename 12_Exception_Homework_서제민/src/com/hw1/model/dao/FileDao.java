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
		System.out.println("파일에 저장할 내용을 반복해서 입력하시오. (exit을 입력하면 내용입력 끝)");
		String file = sc.nextLine();
       if(file.equalsIgnoreCase("exit")) {
    	   return;
       }else {
    	   sb.append(file);
       }
       System.out.println("저장하시겠습니까? (y/n)");
       String a = sc.nextLine();
       if(a.equalsIgnoreCase("y")) {
    System.out.println("저장할 파일명을 입력해 주세요. : ");
    String b = sc.nextLine();
    	 try (BufferedWriter bw = new  BufferedWriter(new FileWriter(b+".txt"))) {
    		   bw.write(file);
    		   System.out.println("입력받은 a_buffer.txt 파일에 성공적으로 저장하였습니다." );
    	   } catch (IOException e) {
			
			e.printStackTrace();
	
		}
       }else {
    	   System.out.println("메뉴로 돌아갑니다");
    	   break;
       }
	}
}
public void fileOpen() {
	System.out.println("열기 할 파일명 : ");
	String b = sc.nextLine();
	 try (BufferedReader bw = new  BufferedReader(new FileReader(b+".txt"))) {
		 String temp = null;
			while((temp = bw.readLine()) != null) {
				System.out.println(temp);
			}
	    	
	 } catch (FileNotFoundException e) {
		if(b.equals(b)){
		System.out.println("존재하는 파일이 없습니다");
		}	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
public void fileEdit() {
	StringBuilder sb = new StringBuilder();
	System.out.println("수정 할 파일명 : ");
	String b = sc.nextLine();
	 try (BufferedReader bw = new  BufferedReader(new FileReader(b+".txt"))) {
		 bw.readLine();
		
		 while(true) {
				System.out.println("파일에 추가할 내용을 입력하시오. (exit을 입력하면 내용입력 끝)");
				String file = sc.nextLine();
		       if(file.equalsIgnoreCase("exit")) {
		    	   return;
		       }else {
		    	   sb.append(file);
		       }
		       System.out.println("변경된 내용을 파일에 추가하시겠습니가? (y/n)");
		       String a = sc.nextLine();
		       if(a.equalsIgnoreCase("y")) {
		    	 System.out.println("변경된 내용이 저장되었습니다.");
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