package oop0316;

import java.util.StringTokenizer;

public class Test01_String {

	public static void main(String[] args) {
		String str = "Gone With The Wind";
		
		//Ư�� ���� �������� ���ڿ� �и��ϱ�
		String[] str2= str.split("");
		for(String s : str2) System.out.println(s);
		String[] str3 = str.split("W");
		for(String s : str3) System.out.println(s);
		
		String str4 = "Hello,Happy,Day";
		String[] str5 = str4.split(",");
		for(String s : str5)System.out.println(s);
		
		//�ǳ� �¿� ��������
		System.out.println("#" + "S K   Y   ".trim() +"#");
		
		// ���ڿ� ����ӵ�
		/*
		 * String <<<< StringBuffer <= StringBuilder
		 * buffer�� builder�� �ӵ� ���� ���
		 */
		String s1 = "";
		System.out.println(s1.length());//0
		s1 += "ONE";
		System.out.println(s1);
		System.out.println(s1.length()); //3
		s1+= "TWO";
		s1 += "THREE";
		System.out.println(s1);
		
		//��� ���ڿ� �����( �� ���ڿ� ����)
		s1 = "";
		System.out.println(s1.length()); //0
		
		StringBuffer s2 = null;
		s2= new StringBuffer();
		s2.append("ONE");
		System.out.println(s2);
		
		s2.delete(0, s2.length());
		System.out.println(s2.length()); //0
		
		StringBuilder s3 = new StringBuilder();
		
		//���ڿ� �ɰ��� �� 
		StringTokenizer st  = new StringTokenizer(str, "W");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}