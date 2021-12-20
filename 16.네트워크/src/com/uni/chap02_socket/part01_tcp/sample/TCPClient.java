package com.uni.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public void ClientStart() {
		//1.������ ip �ּҿ� ������ ���� ��Ʈ��ȣ�� ���� �˾ƾ��� 
		int port = 8500;
		String serverIp = null;
		
		try {
			//2 ������ ip �ּҿ� ������ ���� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ ���ϰ�ü ����
			serverIp = InetAddress.getLocalHost().getHostAddress();
			
			
				Socket server = new Socket(serverIp, port);
			
				System.out.println("������ ������ �Ǿ����ϴ�. ");
				
				//3.�������� ����� ��Ʈ�� ����
				if(server != null) {
					BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
					
					PrintWriter pw = new PrintWriter(server.getOutputStream());
					
					//4. ��Ʈ���� ���ؼ� �а� ����
					pw.println("�ݰ�����");
					pw.flush();
					
					//���� -> Ŭ���̾�Ʈ �޼��� �о� ����
					String message = br.readLine();
					System.out.println("������ ���� �޼��� " +  message);
					
					pw.close();
					br.close();
					
				}
				server.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}
}
