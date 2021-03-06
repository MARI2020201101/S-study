package oop0319;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test04_input {
public static void main(String[] args) {
String filename = "C:\\java202102\\workspace\\basic01_java\\src\\oop0319\\Test01_Buyer.java";
	
	try {
		//byte : 1바이트 할당
		//char : 2바이트 할당 ( 한글 안 깨짐)

		//1)FileInputStream : 바이트 기반 -> 한글 깨짐
		FileInputStream fis = new FileInputStream(filename);
		while(true) {
			int data =  fis.read();
			
			if(data==-1) {
				break;
			}//System.out.printf("%c", data);
		}
		fis.close();
		
	}catch(Exception e) {
		System.out.println("파일 읽기 실패 " + e);
	}
	
	//2) FileReader : character 기반 -> 한글 안깨짐
	try {
		FileReader fr = new FileReader(filename);
		while(true) {
			int data = fr.read();
			if(data==-1) break;
			//System.out.print((char)data);
		}
		
	}catch(Exception e) {
		System.out.println("파일 읽기 실패 " + e.getMessage());
	}
	
	try {
		FileReader fr = new FileReader(filename);
		int data = 0;
		while( (data =fr.read()) !=-1) {
			System.out.print((char)data);
		}fr.close();
	}catch(Exception e) {
		
	}
}
	
}
