package oop0319;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test03_input {
	//파일을 읽어들이기 !
	//메모장 파일 내용 읽기
	public static void main(String[] args) {
		//inputStream - outputStream
		//Reader - Writer
		//읽고 쓸때는 짝을 맞추는것이 좋다(데이터 손실이 적다)
		
		/*
		 * 영문자 1개 = 1byte 
		 * 한글 = 최소 2byte
		 * input, outputstream => 1byte 단위
		 * Reader, Writer => 2byte단위
		 * 그러므로 어떤 I/O를 선택할지 내용물에 따라 고민하기!!
		 * 
		 * Character 클래스 -> 기본 2byte. 영문자도 Character 클래스는 무조건 2바이트! 
		 */
		FileReader fr = null;
		BufferedReader br = null;
		BufferedReader br2 = null;
		try {
			String filename = "C:\\java202102\\workspace\\basic01_java\\src\\oop0319\\Test01_Buyer.java";
			String memoName = "C:\\java202102\\setup\\test.txt";
			
			//1) 파일을 가져오기
			fr= new FileReader(filename);
			
			//2) 파일 내용을 읽기
			//BufferedReader : 파일을 한줄씩 읽어들이는 커서. iterator같은 녀석
			br = new BufferedReader(fr);
			br2 = new BufferedReader(new  FileReader(memoName));
			int num = 0;
			while(true) {
				//3) 엔터(\n)를 기준으로 한줄씩 가져오기
				
				String line = br.readLine();
				if(line ==null) {
					break;
			}
				
				System.out.printf("%3d %s\n",++num,line);
			}
			
			System.out.println("---------------------------");
			while(true) {
				String memo = br.readLine();
				System.out.println(memo);
				if(memo ==null) {
					break;
				}
			}
			
			}catch(Exception e) {
			System.out.println("파일 읽기 실패 : " + e.getMessage());
		}finally {
			//자원 반납하기
			
			try {
				if(br!=null)
						br.close();
				if(br2 != null)
					br2.close();
				if(fr!= null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
