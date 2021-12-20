package com.uni.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {

	
	
	
	public void fileSaver() {
		
		//FileWriter : ���Ϸ� �����͸� 2byte ������ ����ϱ� (�ѱ��� �������ʴ´�)
		
		//1. FileWriter ��ü���� --> �ش� ������ ������ �ڵ����� ��������� ���� ��θ� ������ش�. �ش� ������ ������������ ������θ� ����.
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt",false);
			
			fw.write("��~~��մ�");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(fw !=null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
	
	
	
	
	public void fileOpen() {
		//FileReader : ���Ϸκ��� �����͸� 2byte������ �Է¹ޱ�
		//1.FileReader ��ü���� --> ���ϰ� ������� �������
		
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			/*System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());*/
			
			int value = 0; 
			while ((value = fr.read())!= -1) {
				System.out.println((char)value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr !=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
	}
}
		
	
	

