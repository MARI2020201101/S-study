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
		//����) ǥ������ ���ϱ�
		int[] aver = {85,90,93,86,82};
		double result = sd(aver);
		System.out.println("ǥ������ : " + result);
		
		/*
		 * 1) aver�� ��� ���ϰ�
		 * 	  aver�� �� ��ҿ��� 87.2�� ����
		 * 
		 * 2) ��հ� ���̰��� ��� ����� �ٲ۴� = ����
		 * 3) ǥ������ = ������ ��հ�
		 */

	}

}