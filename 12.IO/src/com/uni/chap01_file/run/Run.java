package com.uni.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		
		// file : 파일을 제어하기 위한 클래스로 입출력 기능을 제공하지 않는다. - 파일의 입출력은 입출력 스트림을 사용한다.
		
		//1. 경로지정을 딱히 하지않으면 현재 project 폴더에 생성된다.
		try {
			File f1 = new File("test.txt");//메모리상에 객체상태로 존재
			//f1.createNewFile();//이 메소드를 실행해야만 실제 파일이 만들어진다.
			
			//2. 존재하는 기본 드라이브나 폴더에 파일생성
			File f2 = new File("D:\\test.txt"); // C드라이브에는 바로만들지 못한다
			//f2.createNewFile(); 
			
			//3 폴더 만들고 생성 
			//File f3 = new File("D:\\test\\test.txt"); // 없는 폴더 생성이 바로 되지않고 IOException 에러 발생
			//f3.createNewFile(); 
			
			File testFolder = new File("D:\\test");// 확장자를 지정하지 않으면 폴더롣 인식 
			testFolder.mkdir();//폴더생성
			
			File f3 = new File("D:\\test\\test.txt"); 
			f3.createNewFile(); 
			
			System.out.println(f1.exists());//존재여부확인
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(testFolder.exists());
			
			System.out.println(f3.isFile());
			System.out.println(testFolder.isFile());
			
			//경로지정을 딱히 하지않고 현재 프로젝트에 생성 , 확장자없이 폴더로 생성
			File folder = new File("parent");
			folder.mkdir();//새로운 디렉터리 생성 
			
			File file =new File("parent\\parent.txt");
			file.createNewFile();
			
			System.out.println("파일명 : "+ file.getName());
			System.out.println("절대경로 : "+ file.getAbsolutePath()); // 최상위 경로부터 내파일이 있는경로 까지 모두 나타 낸것
			System.out.println("상대경로 : "+ file.getPath());// 파일이 위치한 폴더를 기준으로 상대적인 경로
			System.out.println("파일 용량 : "+ file.length() );
			System.out.println("상위 폴더 : "+ file.getParent());// parent
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
