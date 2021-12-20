package com.uni.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public void fileSave() {
		// 1. ��ݽ�Ʈ�� ���� (� �ܺθ�ü�� �����͸� �ְ���� ���̳ĸ� �������ִ� ����(���) ��Ʈ���� �ݵ�� �ʿ�)

		/*
		 * BufferedWriter bw = null;
		 * 
		 * try { bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
		 * 
		 * bw.write("�ȳ��ϼ���.\n"); bw.write("�ݰ����ϴ�."); bw.newLine(); bw.write("�����մϴ�.");
		 * 
		 * } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }finally { try { if(bw != null)bw.close(); } catch
		 * (IOException e) {
		 * 
		 * e.printStackTrace(); } }
		 */
		// try with resource �������� �����ϰ� �۾� -> try(��Ʈ�� ��ü ���� �����ۼ�): �� ����ϰ� ���� �˾Ƽ� �ݾ���,
		// �ڵ���ȯ���� (close())
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			bw.write("�ȳ��ϼ���.\n");
			bw.write("�ݰ����ϴ�.");
			bw.newLine();
			bw.write("�����մϴ�.");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void fileOpen() {
		try(BufferedReader bw = new BufferedReader(new FileReader("c_buffer.txt"))) {
			// System.out.println(bw.readLine());

			String temp = null;
			while((temp = bw.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}