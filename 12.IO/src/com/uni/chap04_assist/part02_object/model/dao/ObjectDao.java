package com.uni.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.uni.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {

	// ��ü�� ���Ͽ� ����Ҷ� ���Ǵ� ��Ʈ��
	// FileOutputStream : ������¿� ���Ǵ� ��� ����Ʈ ��Ʈ�� Ŭ����
	// ObjectOutputStream : ��ü ������ ��½� ���Ǵ� ���� ����Ʈ ��Ʈ�� Ŭ����
	
	public void fileSave() {
		
		Phone ph = new Phone("�Ｚ",2000);
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))){
			oos.writeObject(ph);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		//FileInputStream : ���Ϸκ��� �����͸� �о���̱� ����  ���Ǵ� ��� ����Ʈ ��Ʈ�� Ŭ����
		//ObjectInputStream : ��Ʈ������ ���� ��ü ������ �о���̱� ���� ���Ǵ� ���� ����Ʈ ��Ʈ�� Ŭ����
		
	    try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))){
	    	
	    	Phone ph = (Phone) ois.readObject();
	    	
	    	
	    	System.out.println(ph.toString());
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
