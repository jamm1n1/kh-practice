package com.uni.chap04_field.model.vo;

public class FieldTest2 {
/*[����������][�����] �ڷ��� ������ [=�ʱⰪ];
	
	 * * �ʵ忡�� ��밡���� ���������� 4����
	 * 
	 * public 		=> ��𼭵� (���� ��Ű��, �ٸ� ��Ű�� ���) ���� ����
	 * protected	=> ���� ��Ű�� ���� ���� + ���� �ٸ� ��Ű����� ��ӱ���(�θ��ڽİ��� ����)������ ���� ����
	 * default 		=> ���� ��Ű�������� ���� ����
	 * private 		=> only �ش� Ŭ���������� ���� ����
	 * 
	 * ���������� �Ʒ��� ������ ���� ������ ���ִ� ������ ��������. 
	 * 
	 * ����� static->��������(���������� ������ Ŭ���� ����)
	 */
	
	
	
	public String pub = "public";
	protected String pro = "protected";
	String def = "defualt";
	private String pri = "private";

	
	public void setPub(String pub) {
		this.pub = pub;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}
	public String getPri() {
		return pri;
	}
	public void setPri(String pri) {
		this.pri = pri;
	}
	
			
}
