package com.uni.exception.run;

import java.io.IOException;

import com.uni.exception.controller.A_UnCheckedException;
import com.uni.exception.controller.B_ChekedException;

public class Run {

	public static void main(String[] args) throws Exception {
		// ��������
		// - �ý��� ���� : ��ǻ���� ���۵����� �߻��ϴ� ���� --> �ҽ��ڵ�� �ذ�ȵ� --> �ɰ��� ����
		// - ������ ���� : �ҽ��ڵ� ������ ���� --> �����ٷ� ���ʿ� ���� �˷��� (���? �Ź� �������� ����ǰ� �ֱ� ������ �����Ͻ� ������
		// �ִ� �͵��� �̸� �˷��ִ°�)
		// - ��Ÿ�� ���� : �ڵ� �����δ� ������ ���µ� ���α׷� ������ �� �߻��ϴ� ���� (������� �Ǽ� �� ���� �ְ� �����ڰ� ���� ���� ��
		// ��츦 ����� ó�� �� �� ������ ���� �ִ�)

		// - �� ���� : ���������ε� ���� ���� �������� ���� ���� ������ ������ ���α׷� �ǵ��� ���� �ʴ� ��

		// �츮�� �ý��� ������ ������ �����Ͽ���, ��Ÿ�ӿ���, �������� ���� ���� �� �ɰ��� �͵��� ������ �۾�
		// �̷� �͵��� "����"��� �Ѵ�. -->Exception

		// �̷��� ���ܵ��� "�߻�"���� ��쿡 ���ؼ� "ó��"�ϴ� ����� "����ó��"��� �Ѵ�.

		// ����ó�� ���
		// 1. try~catch���� �̿�
		// 2. throws�� �̿� (���ѱ��)
		// 3. try~with~resource

		//A_UnCheckedException a = new A_UnCheckedException();
		//a.classNArrayEX();
		
		B_ChekedException b = new B_ChekedException();
		b.method5();
	}

}
