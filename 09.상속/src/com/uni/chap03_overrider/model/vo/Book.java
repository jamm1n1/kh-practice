package com.uni.chap03_overrider.model.vo;

import java.util.Objects;

public class Book {

	private String title;
	private String author;
	private int price;
	
	
	public Book() {
		
	}
	
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "���� : " + title + ", ���� : " + author + ", ���� : " + price ;
	}

    //1.object Ŭ������ toString()�޼ҵ� �������̵�
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ",  + ]";
	}
	public boolean equals(Object obj) {
//      bk1.equals(bk2)
		
//        this(���簴ü)           vs        obj(���� ���� �񱳴�� )
//        �ڷ��� : Book                     Object
		if(!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book)obj;
//		 bk1.equals(bk2)
			
//       this(���簴ü)           vs        obj(���� ���� �񱳴�� )
//       �ڷ��� : Book                     Object
		
		if(this.title.equals(other.title)&& this.author.equals(other.author) && this.price == other.price) {
			return true;			
		}else {
			return false;
		}
		//�������̵� �� : Object Ŭ������ hashCode() �޼ҵ� ���� --> �ش� ��ü�� ���� �ּҰ��� 10������ ����� ��� 
		//�������̵� �� : �ΰ�ü�� �����ּҰ��� ������ �۾� �����ʰ� �ΰ�ü�� ���� ����� ������ ������� ���� �ؽ��ڵ尪�� �������� ������
		
	}
	//3.�ؽ��ڵ�
	public int hashCode() {
		//1�� : �ش簴ü�� �ʵ尪�� �ϳ��� ���ڿ��� ���ļ� �� �ش� ���ڿ��� �ؽ��ڵ带 ���� 
		//	  title + author + price ---> ���ڿ� (String) �̵ȴ�. 
		// ��, ���� ���ڿ��� ��� �ش� ���ڿ��� hashCode �� ������ String���� �̹� ������
		//return (title + author + price ).hashcode
		
		//2��
		return Objects.hash(title,author,price);
		// Objects.hash �� �־��� ������ �̿��ؼ� �ڵ带 �����ϴ� ����, 
				//�־��� �Ű������ �迭�� �����ϰ� arrays.hashcode(Object[])��
				//ȣ���ؼ� �ؽ��ڵ带 ��� �̰��� ��������
		
	}
	// �������̵�
		// - �ڽ�Ŭ������ ��ӹ��� �θ� Ŭ������ �޼ҵ带 ������(���ۼ�) �ϴ� ��
		// - �θ� �����ϴ� �ޙ��带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ̸� �ڽ� ��ü�� ���� ����� �ڽ� �޼ҵ尡 �켱���� ������
		
		// �������̵� ��������
		// - �θ�Ŭ������ �޼ҵ�� �޼ҵ� �� ����
		// - �Ű����� ����, �ڷ���, ��������
		// - ��ȯ�� ����
		// - �θ� �޼ҵ��� ���� �����ں��� ������ ���ų� Ŀ���Ѵ�.
		// ex) �θ�޼ҵ��� ���� �����ڰ�  protected �� ��쿡 �������̵� �ϴ� �޼ҵ��� ���� �����ڴ� protected, public
		
		// @Override (annotation)
		// - ��ø� �����൵ ũ�� ����� ���� (��ø� �����൵ �������̵� �� ����)
		// - ���̴� ���� : ã�ƺ��� ����. (�������̵� �� �޼ҵ����� ǥ��)
}
