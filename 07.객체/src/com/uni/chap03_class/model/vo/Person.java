package com.uni.chap03_class.model.vo;


//클래스에서 사용가능한 접근 제한자 --> public , default(생략)
public class Person {

	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	
	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public void setGender(char gender) {
		this.gender = gender;

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;

	}
	public String getId() {
		return this.id;
	}
	public String getPwd() {
		return this.pwd;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getEmail() {
		return this.email;
	}
	
	public String information() {
	String info  = id+" | "+pwd+" | "+name+" | "+age+" | "+gender+" | "+phone+" | "+email;
	return info;
		
	}
}
	
	
