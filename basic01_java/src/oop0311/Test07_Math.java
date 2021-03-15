package oop0311;

import java.util.Random;

public class Test07_Math {

	public static void main(String[] args) {
		//����(absolute value)
		System.out.println(Math.abs(3));
		System.out.println(Math.abs(-3));
		System.out.println(Math.abs(-2.4));
		
		//��
		System.out.println(Math.max(3, 5.5));
		System.out.println(Math.min(-1, 0.7));

		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		System.out.println(Math.ceil(1.3));//�ø�
		System.out.println(Math.floor(3.3));//����
		System.out.println(Math.round(5.2));//�ݿø�
		
		System.out.println(Math.floor(Math.random()*100));
		//�߻� ���� : 0.0 <= r < 1.0
		System.out.println((int)(Math.random()*2));//0 1
		System.out.println((int)(Math.random()*6)); // 0 1 2 3 4 5
		
		//����1) �ֻ��� ���� ����: 1~6�߻���Ű��
		System.out.println((int)Math.ceil(Math.random()*6));
		//����2) �ζǹ�ȣ ���� : 1~45
		System.out.println((int)(Math.ceil(Math.random()*45)));
		//����3) �ζǹ�ȣ 1~45�߿��� ���� ��ġ�� �ʰ� 6�� �߻���Ű��
		//�Ȱ�ġ��??
		System.out.println("---------------------------------");
		int[] nums = {0,0,0,0,0,0};
		for(int i =0 ; i<nums.length;i++)
			for(int j=0 ; j<nums.length;j++) {
				nums[i]= (int)Math.ceil(Math.random()*45);
				if(nums[i]==nums[j]) {
					nums[i]= (int)Math.ceil(Math.random()*45);
				}
			}
		for(int i =0 ; i<nums.length;i++)
		System.out.println(nums[i]);
	}

}