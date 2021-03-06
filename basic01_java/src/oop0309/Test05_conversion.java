package oop0309;

public class Test05_conversion {
	
public static void main(String[] args) {
	System.out.println((char)65);
	System.out.println((char)66);
	System.out.println((char)97);
	System.out.println((char)98);
	
	//int로 아스키 코드값을 사용하기
	//아스키: 미국영문 키보드로 입력할 수 있는 모든 영문 기호들이 할당되어있다
	//총 128개의 부호
	//자바에서는 int-char로 형변환한다. 
	System.out.println((int)'+');//43
	System.out.println((char)43);
	System.out.println((int)' ');//32
	System.out.println("#" + (char)32 +"#");
	
	System.out.println((int)'\r');//13 엔터
	System.out.println((char)60);
	
	//문제)임의의 문자가 소문자인지 확인하시오
	System.out.println((char)97);//a
	System.out.println((char)120);//x
	
	char ch = 'A';
	System.out.println((int)ch>96? ch +" 는 소문자입니다." : ch +" 는 대문자입니다.");
	
	//문제) 출력결과 3+5=8
	int a=3, b=5;
	char op='+';//자동으로 int로형변환되고있다
	System.out.println(a + op + b + "="+ (a+b));
	System.out.println(a +""+ op +""+ b + "="+ (a+b));
	
}
}
