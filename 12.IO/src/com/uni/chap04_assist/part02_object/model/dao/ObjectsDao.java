package com.uni.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.uni.chap04_assist.part02_object.model.vo.Phone;
public class ObjectsDao {
	
	/*Phone[] arr = new Phone[3];
	arr[0] = new Phone("LG",10000);
	arr[1] = new Phone("LG1",20000);
	arr[2] = new Phone("LG2",30000);
	*/
	
	//��ü �迭�� �ƴ� �÷����� �̿�
	//<>���׸��� ����ϴ� ���� : 1. ��õ� Ÿ���� ��ü�� �����ϵ��� ������ �α�����
	                  //  2. �÷��ǿ� ����� ��ü�� ������ ����ҋ� ����ȯ �ϴ� ������ ���ֱ� ���ؼ� 
	public void fileSave() {
	
	ArrayList<Phone> phoneList = new ArrayList<Phone>();
			phoneList.add(new Phone("LG",10000));
			phoneList.add(new Phone("LG2",20000));
			phoneList.add(new Phone("LG3",30000));
			
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone1.txt"))){
				
				for(int i =0; i <phoneList.size(); i++) {
					oos.writeObject(phoneList.get(i));
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	public void fileOpen() {
		ArrayList<Phone> phoneList = new ArrayList<Phone>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone1.txt"))){
			
			int i = 0;
			while (true) {
				phoneList.add((Phone) ois.readObject());
				
				System.out.println(phoneList.get(i));
				i++;
			}
			
		}catch(EOFException e ) {
			System.out.println("���� �б� �Ϸ�");
		}
		catch (FileNotFoundException e) {
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