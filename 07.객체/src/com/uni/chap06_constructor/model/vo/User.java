package com.uni.chap06_constructor.model.vo;

public class User {
	/*
	 * * ������ : �ٸ� ��Ű���� ����ϰ����ϴ� Ŭ�������� ����Ŭ������ ���� ��ü�� �����Ҷ� ����ϴ� �޼ҵ�
	 * 
	 * [����������] Ŭ������([�Ű�����, �Ű�����, ...]) {... }
	 * ���������� :public (�ٸ�Ŭ�������� �����Ϸ��� �����̹Ƿ�)
	 * 
	 * * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �������ֱ� ���� ����
	 * 2. �Ű������� ���޹��� ������ �ʵ忡 �ٷ� �ʱ�ȭ�� ����
	 * 
	 * * ������ �ۼ��� ���ǻ���
	 * 1. �ݵ�� Ŭ������� �����ؾߵȴ�. (��/�ҹ��� ����)
	 * 2. ��ȯ���� �������� �ʴ´�. (�޼ҵ�� �����ؼ� �򰥸�������)
	 * 3. �Ű����� �����ڸ� ��������� �ۼ��ϰԵǸ� �⺻�����ڸ� JVM�� �ڵ����� ��������� �ʴ´�. 
	 *    ��, �⺻�����ڴ� �׻� �⺻���� �ۼ��ϴ� ������ �淯��
	 * 
	 */
	
	
 
	
	
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//�⺻������(�Ű����������»�����) --> public Ŭ������(){} : ���� ��ü �������� �������� �ϰ��ִ�. �Ű������� �ִ� �����ڰ� �ִ°��� ������ �Ұ����ϴ� 
	public User(){
		
	}
	//�Ű������� �ִ� ������ (����ڰ� ����) -->public Ŭ������(�Ű�����){: ��ü������ ���ÿ� ���޵� ������ �Ű������� ��Ƽ� �ش��ʿ� �ʱ�ȭ�ϴ� ����
	//                 this.�ʵ庯���� = �Ű������� 
	public User(String userId, String userpwd, String userName) {
		// TODO Auto-generated constructor stub
		this.userId=userId;
		this.userPwd=userpwd;
		this.userName =userName;
		
		// ������ �ʵ�κ��� JVM�� �ʱⰪ���� ���ִ�.
	}
	public User(String userId, String userpwd, String userName, int age, char gender) {
		// TODO Auto-generated constructor stub
		/*this.userId=userId;
		this.userPwd=userpwd;
		this.userName =userName;*/
		
		this(userId, userpwd, userName);
		//���� ���� �ߺ��Ǵ� ������ �ʱ�ȭ�ϴ� ������ �����ڰ� �����ϴ� ��� this()�����ڸ� ��� �����ϴ�. 
		//���� Ŭ������������ �����ڿ��� �ٸ� �����ڸ� ȣ�Ⱑ�� ��, �̋� �ݵ�� ù�ٿ� �ۼ��� �ؾ��Ѵ�.(�� �ѹ��� ȣ�Ⱑ��)
		this.age=age;
		this.gender=gender;
	}
	
	/* ���
	 * �����ε� : ������ �޼ҵ� ���� ����ϴ� ��  , �Ű������� �ڷ����� ���� , ������ �ٸ��� �ۼ��Ǿ�� �Ѵ�. (����������, ��ȯ���� �������) 
	 * */
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserpwd() {
		return userPwd;
	}
	public void setUserpwd(String userpwd) {
		this.userPwd = userpwd;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userpwd=" + userPwd + ", username=" + userName + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
	
	
}
