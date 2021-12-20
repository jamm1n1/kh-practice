package com.uni.chap02_socket.part02_chat.thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Reciver implements Runnable{

	private DataInputStream in;

	public Reciver(Socket socket) {//소켓 정보를 가져와서
		
		try {
			in= new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
		try {
			System.out.println(in.readUTF());
		} catch (IOException e) {
		break;
		}
		}
	}
}
