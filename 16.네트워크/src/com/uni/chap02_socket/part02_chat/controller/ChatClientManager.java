package com.uni.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.uni.chap02_socket.part02_chat.thread.Reciver;
import com.uni.chap02_socket.part02_chat.thread.Sender;

public class ChatClientManager {

	
	public void startClient() {
		
		String name = "Client";
		
		int port = 8500;
		
		String serverIp=null;
		
		try {
			serverIp = InetAddress.getLocalHost().getHostAddress();// 다른사람아이피가있으면 그아이피 주소담아서해여함
			
			try {
				Socket socket = new Socket(serverIp, port);
				//Ip 192.168.43.203
				System.out.println("서버와 연결이 되었습니다.");
								
				Sender sender = new Sender(socket, name);
				Thread sth = new Thread(sender);
				
				Reciver reciver = new Reciver(socket);
				Thread rth = new Thread(reciver);
				
				sth.start();
				rth.start();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

		
	}

