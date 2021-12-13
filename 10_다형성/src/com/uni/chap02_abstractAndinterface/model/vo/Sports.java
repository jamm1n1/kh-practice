package com.uni.chap02_abstractAndinterface.model.vo;

public abstract class Sports {

	
	private int people;

	public Sports() {}
	
	public Sports(int people) {
		super();
		this.people = people;

	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}
	
	public abstract void rule();
	//�߻�޼ҵ�(�̿ϼ��� �޼ҵ�� ������ �����Ǿ��������� �޼ҵ�)->{}����ΰ� ���� ���� �Ǿ����� ��������
	
	//-> �̿ϼ��� �߻�޼ҵ尡 �ִٴ°��� �� Ŭ���� ���� �߻� Ŭ���� (�̿ϼ� Ŭ����) ��� �� --> �߻� Ŭ������ ��ø� �������(public abstract class Sports {)
}
