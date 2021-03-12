package oop0312;

public class Test01_method {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.sqrt(4));
		System.out.println();
		test1();
		test2();
		test3(3);
		test4(50,60,70);
		test6();
		test5("#", 10);
	}
	
	//함수는 각각 독립적. 함수 안에 함수를 만들 수 없다
	//return 이라는 명령어 = 나를 부른 곳으로 돌아간다
	public static void test1() {
		System.out.println("JAVA");
	}
	public static void test2() {
		System.out.println("PYTHON");
	}
	public static void test3(int a) {
		System.out.println(a);
	}
	public static void test4(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	//문제) #기호 100번출력
	public static void test6() {
		for(int i=0 ; i<100; i++)
			if((i+1)%10==0) System.out.println("#");
			else System.out.print("#");
	}
	public static void test5(String s, int num) {
		for(int i = 0; i<num; i++)
		System.out.println(s);
	}
	

}
