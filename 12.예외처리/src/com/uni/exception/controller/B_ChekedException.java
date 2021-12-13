package com.uni.exception.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_ChekedException {

	// CheckedException �� �ݵ�� ����ó���� ������Ѵ�.
	// ���ǹ�, �ҽ� �ڵ��� �������� �ذ��� �ȵȴ�. -- �����Ұ�
	// �ַ� �ܺ� �Ű�ü�� ����½� �߻�

	// IOException ����� ������ ������ �������� ������ ���� //Io�� ��ǲ�ƿ�ǲ

	public void method1() {
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("����");
		}

	}

	private void method2() throws IOException {
		/*
		 * 1. try~ catch()ó�� : �̱������� �ٷ� ���ܸ� ó���ϰڴ�.
		 * 
		 * try : ���ܰ� �߻��� ���ɼ����ִ� �ڵ带 ��ϳ��� �ۼ� catch (�߻��ɿ���Ŭ���� �Ű�����): try �������� ���ܰ� �߻��ϸ� ���
		 * ó���� �Ұ����� �ۼ� finally : try~catch �� ������ �ݵ�� �� ����Ǿ�� �ϴ� �ڵ带 �ۼ�
		 * 
		 */

		byte[] aa = { 'a', 'b', 'c' };
		// try {
		System.out.write(aa);
		/*
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		// 2. throws : ���� �� �޼ҵ忡�� ���ܸ� ó������ �ʰ� ���� �̸޼ҵ带 ȣ���� ������ �����ϰڴ�

	}

	public void method3() {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(""));

			// fileReader : ���Ϸ� ���� ���� ������ �о���̴� ��Ʈ�� Ŭ������ ����Ʈ ������ �������� ���ڰ� �����Ƿ� ���ڴ��� ��Ʈ����
			// ����Ѵ�.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ����� FileNotFoundException (���� ������ �о �����Ϸ��� �ϴ� )�߻� ��Ű��
			// catch ���� e.printStackTrace(); ����� �ǰ�
			// finally ������ ���۷��� ���� (br) �� �ʱⰪ null �� �״�� �� �ִ� ���� �̱⶧����
			// null �� �����ϴ� ���۷��� ������ close() �� ����߱� ������ NullPointerException �� �߻��Ѵ�.
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void method4() throws IOException {
		// try ~ with ~ resource : �ݳ��� close�ڿ� �� �ִ°�� ó�� -> try () ��ȣ �ȿ� ��ü �����Ҽ� �ְ�
		// �� ��ȣ�ȿ��� ������ ��ü�� close �������ʾƵ� �ڵ� close �ȴ�.

		try (BufferedReader br = new BufferedReader(new FileReader(""));) {

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void method5() throws Exception {
		
		//InputStreamReader: ����Ʈ ��Ʈ���� ���� ��Ʈ������ ��������ִ� ������ �ϴ� ������Ʈ��
				//system Ŭ������ inputStream System.in --> byte���� ǥ����ǲ��Ʈ��Ű�����Է�
				//			   outputStream System.out --> ǥ�� �ƿ�ǲ ��Ʈ�� ȭ�����  
				//BufferedReader�� ���� �Է� ��Ʈ���� ����Ǿ� ���۸� ������ �ִ� ���� ��Ʈ���̴�.
				//BufferedReader�� �Է� �ҽ��κ��� �ڽ��� ���� ���� ũ�⸸ŭ �����͸� �̸� �а� ���ۿ� ������ �д�. 
				//���α׷��� �ܺ��� �Է� �ҽ��κ��� ���� �д� ��� ���۷κ��� �������ν� �б� ������ ���ȴ�
				//readLine(); ���پ� ���� ��ŭ ��ȯ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�ƹ����ڿ��̳� �Է����ּ���.");
		
	/*	try {
			String str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		String str = br.readLine();
		System.out.println(str);
		
		if(str.equals("a")) {
			throw new Exception("���� �߻��ߴ�.~~");
		}
//		���� �߻� ����			����ó��
		//RuntimeException		 ��Ÿ�� ����(������ ���� X)		  ����			--> uncheckedException (������ �ɹ��ɷ� �ذ� --> ����ó���� ���� �ذ��ϰų� if���� ���� ���ʿ� ���ܹ߻��� ���ų�)
		//RuntimeException ��		������ ����O			  �ʼ�			--> checkedException (�ݵ�� ����ó���� ���� �ذ� �ؾߵ� --> ���ǹ��̰� ���� ���� �ȴ�)
	}
}
