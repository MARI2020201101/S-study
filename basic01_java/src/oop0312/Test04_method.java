package oop0312;

public class Test04_method {
	
	public static void test1(int a, int b) {
		System.out.println("두 수의 합 " + (a+b));
	}
	
	public static void test2(int[] a) {
		for(int i=0 ; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void test3(String a, String b) {
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void test4(String[] a) {
		for(String s : a)
		System.out.println("test4"+s);
	}
	public static void test5(int a, int b) {
		System.out.println("test5 " + (a+b));
	}
	public static void test6(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}	
		}
	}
	
	
	

	public static void main(String[] args) {
		/*
		 * 함수 호출 방식
		 * 1) call by value(값으로 호출)
		 * 2) call by reference(주소로 호출) 
		 */
		int[] num = {10,20,30};
		test1(num[0],num[2]); //call by value
		test2(num); //배열을 통째로 넘긴다== 배열이 저장되어있는 주소값을 넘긴다
		
		String[] name = {"무궁화","진달래","개나리"};
		test3(name[0],name[2]);
		test4(name);
		
		int[][] su = {
				{1,3,5},
				{2,4,6}
		};
		test5(su[0][0],su[1][2]);
		test6(su);
		
		//과제) 소스 분석 하기
		//로또번호 1~45중에서 서로 겹치지 않게 6개 발생
		int[] lotto= new int[6];
		
		for(int a=0; a<6; a++) {
			lotto[a]=(int)(Math.random()*45)+1;
			for(int b = 0; b<a; b++) {
				if(lotto[a]==lotto[b]) {
					a--;
					break;
				}
			}
		}
		//정렬하기 sorting~~
		
		
		
		
	}

}
