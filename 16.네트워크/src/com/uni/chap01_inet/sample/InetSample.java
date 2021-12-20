package com.uni.chap01_inet.sample;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetSample {
	// 1. ��Ʈ��ũ(Network)��?
	// -> net + work �� �ռ��� : net(�׹�) + work(��)
	// -> ���Ϸ� ������ ��ü�� ����̶�� �Ű�ü�� ���Ͽ� ���� ����Ǿ� �ִ� ȯ��

	// 2. ��Ʈ��ŷ(Networking) �̶�?
	// -> �� �� �̻��� ��ǻ�͸� ���̺�� �����Ͽ� ��Ʈ��ũ(Network)�� �����ϴ� �۾�

	// 3. ��Ʈ��ŷ�� ����
	// -> ���� ���� ��ű��(��ǻ��,�޴��� ��) ���� ���� �����Ͽ� �����͸� �ս��� �ְ� �ްų� �Ǵ�
	// �ڿ� (������ ��) ���� �����ϱ� ����
	// -> �߰������� ���� ������ ��ȯ ������ ����

	// -> �ڹٿ��� �����ϴ� java.net ��Ű���� ����ϸ� ���ø����̼ǳ��� ������ ����� �� �� �ִ�.

	// 4. ��Ʈ��ũ���� �ʿ��� ����
	// ����(Server) : ���񽺸� �����ϴ� ��ǻ��
	// Ŭ���̾�Ʈ(Client) : ���񽺸� ����ϴ�(�����޴�) ��ǻ��
	// -> ���񽺸� ����(����)�Ϸ��� ������ ���α׷��� �־�� �ϸ� ���񽺸� �̿�(Ŭ���̾�Ʈ)�Ϸ���
	// Ŭ���̾�Ʈ�� ���α׷��� �� �� �־�� �Ѵ�.

	// 5. ��Ʈ��ũ ����帧(�������)
	// (���� -> Ŭ���̾�Ʈ�� �� ��)
	// ���� -> ���� -> ��Ʈ -> IP -> ��Ʈ��ũ -> IP -> ��Ʈ -> ���� -> Ŭ���̾�Ʈ�� ���μ���
	public void isSample() {

		try {
			InetAddress loaclIp = InetAddress.getLocalHost(); // �� ��ǻ�� ip�ּ� ��ȯ
			System.out.println("�� �Ǿ���" + loaclIp.getHostName());// ȣ��Ʈ �̸���ȯ
			System.out.println("�� �Ǿ���" + loaclIp.getHostAddress());// ȣ��Ʈ�� ip �ּҹ�ȯ

			InetAddress naverIp = InetAddress.getByName("www.naver.com");
			System.out.println("���̹� ������ �Ǿ���" + naverIp.getHostName());// ȣ��Ʈ �̸���ȯ
			System.out.println("���̹� ���� �ּ�" + naverIp.getHostAddress());// ȣ��Ʈ�� ip �ּҹ�ȯ
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
