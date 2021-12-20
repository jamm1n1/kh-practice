package com.uni.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSever {

	public void severStart() {
		
		//1. ������ ��Ʈ��ȣ�� ���� (0~65536)-->(0~1023)
		int port = 8500;
		String serverIp= null;
		
		//2.���� ���ϸ����
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
			
			//3.Ŭ���̾�Ʈ�� ���� ���� ��û�� �ö����� ���
              System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�.");
              
            //4.���ӿ�û�� ���� ��û������ �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü���� 
             Socket client = server.accept();
             
             String clientIp =client.getInetAddress().getHostAddress();
             System.out.println(clientIp + "�� ������ ��û��! ");
             
             
             //5.����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ���� 
             
             InputStream input = client.getInputStream();
             OutputStream output = client.getOutputStream();
             
             //6. ������Ʈ���� ����ؼ� ���ɰ��� 
             BufferedReader br = new BufferedReader(new InputStreamReader(input));
			
             PrintWriter pw = new PrintWriter(output);
             //7. ��Ʈ���� ���� �а� ���� 
             String message = br.readLine();
             System.out.println(clientIp + " �� ���� �޼��� : "+ message);
             
             //���� -> Ŭ���̾�Ʈ�� �޼��� ����
             pw.println("������ �ݰ����ϴ�.");
             pw.flush();
             
             //8 �������
             pw.close();
             br.close();
             
             server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
