package com.uni.chap02_socket.part02_chat.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender implements Runnable {

	private String name;
	private DataOutputStream out;

	private Scanner sc;

	// Sender ��ü ������ �Ű������� socket�� name�� �޾ƿ´�
	// server���� ���� : ��û�� ������ Client�� ����, �������� �޾� �� ���̴�.
	// client���� ���� �� ����� server�� ����, Ŭ���̾�Ʈ ���� �޾� �� ���̴�.

	public Sender(Socket socket, String name) {
		this.name = name;

		try {
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
	  
		
		sc = new Scanner(System.in);
		while(true) {
			try {
				out.writeUTF(name +" > " +sc.nextLine());
			} catch (IOException e) {
				break;
				
			}
		}

	}

}
