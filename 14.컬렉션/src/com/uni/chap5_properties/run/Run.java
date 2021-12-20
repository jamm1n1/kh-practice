package com.uni.chap5_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// .properties�� ����ϴ� ����
		// 1. �ش� ���α׷��� �⺻������ ������ �ִ� �������� .properties Ȯ���� ������ �����س�����
		// key value ��� ���ڿ��̱� ������ �����ڰ� �ƴ� �Ϲ��� �����ڰ� �ش� ������ �ٷ�Ⱑ ����.
		// --> JDBC ���� �ѹ� ����� ���Ŵ�.

		// 2. xml���Ϸ� ������ �� �ִ� �޼ҵ带 ���� ����
		// .xml ������ ���α׷��� ���� ȣȯ�� ����. ��, �ڹٿ��� �۾��ϰ� xml���Ϸ� �����ϸ�
		// C���� �ҷ��鿩 ����� �� �ִٴ���

		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin@localhost:1521:xe");
		prop.setProperty("user", "student");
		prop.setProperty("password", "student");

		System.out.println(prop);
		// 1.Iterator
		Set st = prop.keySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key);
			System.out.println(prop.getProperty(key));
    
		}
		//2. Enumeration
		 Enumeration em = prop.keys();
		 while(em.hasMoreElements()) {
			 String key = /*�ٿ�����ȯ*/(String)em.nextElement();
			 System.out.println(key + "   "+ prop.getProperty(key));
		 }
		 
		 System.out.println("Properties ��� ������ Properties ���Ϸ� ���� �� �ҷ�����");
		 
		 try {
			//prop.store(new FileOutputStream("prop.properties"), "Test properties");
			
			prop.storeToXML(new FileOutputStream("prop.xml"), "Test Xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		 Properties readProp = new Properties();
		 
		 try {
			readProp.load(new FileInputStream("prop.xml"));
			
			Set st1 = readProp.keySet();
			Iterator it1 = st1.iterator();
			while(it1.hasNext()) {
				String key = (String)it1.next();
				System.out.println(key+ "  ----------    "+ readProp.getProperty(key));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
