package com.uni.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		
		// file : ������ �����ϱ� ���� Ŭ������ ����� ����� �������� �ʴ´�. - ������ ������� ����� ��Ʈ���� ����Ѵ�.
		
		//1. ��������� ���� ���������� ���� project ������ �����ȴ�.
		try {
			File f1 = new File("test.txt");//�޸𸮻� ��ü���·� ����
			//f1.createNewFile();//�� �޼ҵ带 �����ؾ߸� ���� ������ ���������.
			
			//2. �����ϴ� �⺻ ����̺곪 ������ ���ϻ���
			File f2 = new File("D:\\test.txt"); // C����̺꿡�� �ٷθ����� ���Ѵ�
			//f2.createNewFile(); 
			
			//3 ���� ����� ���� 
			//File f3 = new File("D:\\test\\test.txt"); // ���� ���� ������ �ٷ� �����ʰ� IOException ���� �߻�
			//f3.createNewFile(); 
			
			File testFolder = new File("D:\\test");// Ȯ���ڸ� �������� ������ ������ �ν� 
			testFolder.mkdir();//��������
			
			File f3 = new File("D:\\test\\test.txt"); 
			f3.createNewFile(); 
			
			System.out.println(f1.exists());//���翩��Ȯ��
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(testFolder.exists());
			
			System.out.println(f3.isFile());
			System.out.println(testFolder.isFile());
			
			//��������� ���� �����ʰ� ���� ������Ʈ�� ���� , Ȯ���ھ��� ������ ����
			File folder = new File("parent");
			folder.mkdir();//���ο� ���͸� ���� 
			
			File file =new File("parent\\parent.txt");
			file.createNewFile();
			
			System.out.println("���ϸ� : "+ file.getName());
			System.out.println("������ : "+ file.getAbsolutePath()); // �ֻ��� ��κ��� �������� �ִ°�� ���� ��� ��Ÿ ����
			System.out.println("����� : "+ file.getPath());// ������ ��ġ�� ������ �������� ������� ���
			System.out.println("���� �뷮 : "+ file.length() );
			System.out.println("���� ���� : "+ file.getParent());// parent
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
