package com.uni.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {


	// "����Ʈ ��� ��Ʈ��" ������ ������ ����� �غ���!

	// "����Ʈ ��Ʈ��" : �����͸� 1����Ʈ ������ �����ϴ� ��δ�! (���� �����.. 1����Ʈ�� �ѱ��� ����..)
	// "��� ��Ʈ��" : �ܺθ�ü�� ���������� ����Ǵ� ��δ�!

	// "����Ʈ ��� ��Ʈ��" --> �ܺθ�ü�� �����ϰ� �� �ܺθ�ü�� ���������� ����� ��ο� �����͸� 1����Ʈ ������ �����ϰڴ�!! (�Է� ��
	// ���)

	// XXXInputStream : XXX��ü�κ��� �����͸� �Է¹޴� ��� (�ܺθ�ü�� ���� ������ �о���ڴ�. �������ڴ�.)
	// XXXOutputStream : XXX��ü�� �����͸� ����ϴ� ��� (�ܺθ�ü�� ������ ���ڴ�. �����ڴ�.)

	// File Input/Output Stream --> �ܺ� ��ü�� ���Ϸ� ����!
	// Audio Input/Output Stream --> �ܺ� ��ü�� �������ġ�� ����!
	// Piped Input/Output Stream --> �ܺ� ��ü�� �Ǵٸ� ���μ����� ����! (���μ����� ���)
	
	//���α׷� --> �ܺθ�ü(����)  ( ��� : ���α׷� ���� �����͸� ���Ϸ� �������� , �� ���Ϸ� ����)
	public void fileSave() {
	
		//FileOutputStream : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ�� 
		//1. FileOutputStream ��ü ������ ������ΰ� ������� (�ش� ������ ������ �ڵ����� ���� ��������� ����, ������ �׳� �ٷ� ���� )
		FileOutputStream fout = null;
		
		try {
			
			//true ���ۼ��� : ������ �ش� ������ ������� �������  (�⺻�� false)
			//true �ۼ��� : ������ ������ �ִ°�� �̾ �ۼ��� (append)
			fout = new FileOutputStream("a_byte.txt", true);
			
			//2. ���Ͽ� �����͸� ����ϰ����Ҷ� write()�޼ҵ带 ��� //IOException�߻�
			//1byte ������ ����� �Ǳ� ������ -128~127 ������ ���ڸ� ����� ���� ( ��, ���Ͽ��� �ش� ������ ������ ���ڰ� ��ϵ� )
			//��, ������ ����ϸ� ������ �����
			fout.write(97);
			fout.write('b');
		  //fout.write('��');//�ѱ��� 2byte �̱⶧���� ������ ����ȴ�. --> ����Ʈ ���� ��Ʈ�����δ� ������ ����
			
			//����Ʈ �迭 ���� ���� 
			byte[] bArr = {99,100,101};
			fout.write(bArr);
			
			// write(byte[] b, int off, int len) : off �ε��� ���� len �� ��ŭ
			fout.write(bArr, 0, 1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fout != null)
				try {
					//3. �ݵ�� ��Ʈ���� �̿������� �ݳ��ؾ��Ѵ�.
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	public void fileRead() {
		//FileInputStream : "����"�� ���� �����͸� 1����Ʈ ������ �Է¹޴� ��Ʈ�� 
		//1. FileInputStream ��ü���� --> ��ü ������ ������ΰ� ������� (�ش� ������ ������ FileNoutFoundException�߻� )
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			
		  /*System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/
			
			int value = 0;
			while((value = fis.read()) != -1) { //read() �ϸ鼭 ����ش� ,EOF (������ ��)�� ������ -1/
				System.out.print(value);
				System.out.println((char)value);
			}
			
			fis.read();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(fis != null)
				try {
					//3. �ݵ�� ��Ʈ���� �̿������� �ݳ��ؾ��Ѵ�.
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	}

