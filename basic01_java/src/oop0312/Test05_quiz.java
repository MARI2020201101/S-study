package oop0312;

public class Test05_quiz {
	
	public static double sd(int[] i) {
		int result = 0;
		int[] result2 = new int[i.length];
		
		for(int n =0; n<i.length; n++) {
			result +=i[n];
		}
			result = result/i.length;
		for(int n = 0; n<i.length ; n++) {
			result2[n] =i[n]-result;
		}
		
		for(int n=0; n<result2.length; n++) {
			result2[n]=Math.abs(result2[n]);
		}
		double d = 0;
		for(int n =0; n<result2.length; n++) {
			d+= result2[n];
		}
			d = d/result2.length;
		return d;
		
	}
	public static void main(String[] args) {
		//문제) 표준편차 구하기
		int[] aver = {85,90,93,86,82};
		double result = sd(aver);
		System.out.println("표준편차 : " + result);
		
		/*
		 * 1) aver의 평균 구하고
		 * 	  aver의 각 요소에서 87.2를 뺀다
		 * 
		 * 2) 평균과 차이값을 모두 양수로 바꾼다 = 편차
		 * 3) 표준편차 = 편차의 평균값
		 */

	}

}
