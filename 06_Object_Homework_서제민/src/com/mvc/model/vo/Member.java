package com.mvc.model.vo;

public class Member {

	
private String memberId; //���̵�
private String memberpwd;//���
private String membername;//�̸�
private String citizenNo;//�ֹι�ȣ
private double height ;//Ű

public Member() {
	
}

public Member(String memberld, String memberpwd, String membername, String citizenNo, double height) {
	super();
	this.memberId = memberld;
	this.memberpwd = memberpwd;
	this.membername = membername;
	this.citizenNo = citizenNo;
	this.height = height;
}
public String getMemberId() {
	return memberId;
}
public void setMemberId(String memberld) {
	this.memberId = memberld;r
}
public String getMemberpwd() {
	return memberpwd;
}
public void setMemberpwd(String memberpwd) {
	this.memberpwd = memberpwd;
}
public String getMembername() {
	return membername;
}
public void setMembername(String membername) {
	this.membername = membername;
}
public String getCitizenNo() {
	return citizenNo;
}
public void setCitizenNo(String citizenNo) {
	this.citizenNo = citizenNo;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
 public String infomation() {
	 String info  = memberId , memberpwd, membername , citizenNo ,height;				 
	 return info;
 }
@Override
public String toString() {
	return "Member [memberld=" + memberId + ", memberpwd=" + memberpwd + ", membername=" + membername + ", citizenNo="
			+ citizenNo + ", height=" + height + "]";
}
}
