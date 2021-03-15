package oop0312;

import java.util.Arrays;
//java��� �ϴ� ��Ű�� �ȿ� util�̶�� ��Ű�� �ȿ� Arrays��� javaŬ����

public class Test04_method {
	
	public static void test1(int a, int b) {
		System.out.println("�� ���� �� " + (a+b));
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
		 * �Լ� ȣ�� ���
		 * 1) call by value(������ ȣ��)
		 * 2) call by reference(�ּҷ� ȣ��) 
		 */
		int[] num = {10,20,30};
		test1(num[0],num[2]); //call by value
		test2(num); //�迭�� ��°�� �ѱ��== �迭�� ����Ǿ��ִ� �ּҰ��� �ѱ��
		
		String[] name = {"����ȭ","���޷�","������"};
		test3(name[0],name[2]);
		test4(name);
		
		int[][] su = {
				{1,3,5},
				{2,4,6}
		};
		test5(su[0][0],su[1][2]);
		test6(su);
		
		//����) �ҽ� �м� �ϱ�
		//�ζǹ�ȣ 1~45�߿��� ���� ��ġ�� �ʰ� 6�� �߻�
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
		//�����ϱ� sorting~~
		/*
		 * ������ ����
		 * 1)ascending ASC 		1->10, A->z, ��->��
		 * 2)descending DESC  	
		 * 
		 * ������ ���
		 * 1) �������� (insertion sort)
		 * 2) �������� (selection sort)
		 * 3) �������� (bubble sort)
		 * 
		 * �ڹٿ��� �������ִ� Ŭ������ ����Ǿ��ִ�
		 */
		int[] nums = {2,9,6,3,5};
		Arrays.sort(nums);
		Arrays.sort(lotto);
		System.out.print("\n--------\n");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println("\n--------\n");
		for(int i=0; i<lotto.length; i++) {	
			System.out.println(lotto[i]);
		}
		
		/*
		 * ��������(selection sort)
		 * 9 7 5 3 -> 3 5 7 9
		 * 4! ��ŭ
		 * 
		 * ��������(bubble sort)
		 * ���� �ֶ� ���ؼ� �ڸ��ٲٱ�
		 * sort �ȵǸ� ó������ �ٽ� ��
		 */
		int[] s = {9,7,5,3};
		int tmp=0;
		for(int i =0 ; i<s.length; i++) {
			for(int j=0; j<s.length ; j++) {
				if(s[i]>s[j])
				tmp = s[i];
				s[i]= s[j];
				s[j]= tmp;
			}
		}System.out.println(s[0]);
		
		for(int ss : s)
		System.out.println(ss);
		
		
		
	}

}