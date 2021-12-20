package com.uni.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.uni.chap02_socket.part02_chat.thread.Reciver;
import com.uni.chap02_socket.part02_chat.thread.Sender;

public class ChatServerManager {

	
	public void startServer() {
		//���� �̸� ���ϱ� 
		String name = "sever";
		
		//1.��Ʈ��ȣ 
		int port = 8500;
		
		try {
			ServerSocket server = new ServerSocket(port);
			
			System.out.println("Sever Start");
			
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� ������ �Ǿ����ϴ�.");
			
			//�ۼ��� �۾��� ������ ����� 
			//: ä�����α׷��� ������ó�� �۽��� �ް� ������ �ϴ°��� �ƴ϶� ��ȭ��ó�� �۽��� �����鼭 ���ÿ� ���ŵ� �Ҽ��־�� 
			// �ϱ⶧���� �̸� ���� �۽Ű� ������ ������ ������� ó���ϸ� ���ÿ� ó���� �����ϴ�.
			
			Sender sender = new Sender(client, name);
			Thread sth = new Thread(sender);
			
			Reciver reciver = new Reciver(client);
			Thread rth = new Thread(reciver);
			
			sth.start();
			rth.start();
			
			server.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
