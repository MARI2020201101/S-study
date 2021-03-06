package oop0316;

import java.util.StringTokenizer;

public class Test01_String {

	public static void main(String[] args) {
		String str = "Gone With The Wind";
		
		//특정 문자 기준으로 문자열 분리하기
		String[] str2= str.split("");
		for(String s : str2) System.out.println(s);
		String[] str3 = str.split("W");
		for(String s : str3) System.out.println(s);
		
		String str4 = "Hello,Happy,Day";
		String[] str5 = str4.split(",");
		for(String s : str5)System.out.println(s);
		
		//맨끝 좌우 공백제거
		System.out.println("#" + "S K   Y   ".trim() +"#");
		
		// 문자열 연산속도
		/*
		 * String <<<< StringBuffer <= StringBuilder
		 * buffer랑 builder는 속도 거의 비슷
		 */
		String s1 = "";
		System.out.println(s1.length());//0
		s1 += "ONE";
		System.out.println(s1);
		System.out.println(s1.length()); //3
		s1+= "TWO";
		s1 += "THREE";
		System.out.println(s1);
		
		//모든 문자열 지우기( 빈 문자열 대입)
		s1 = "";
		System.out.println(s1.length()); //0
		
		StringBuffer s2 = null;
		s2= new StringBuffer();
		s2.append("ONE");
		System.out.println(s2);
		
		s2.delete(0, s2.length());
		System.out.println(s2.length()); //0
		
		StringBuilder s3 = new StringBuilder();
		
		//문자열 쪼개는 애 
		StringTokenizer st  = new StringTokenizer(str, "W");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
