package oop0311;

public class Test04_quiz {

	public static void main(String[] args) {
		int [] num = {7,8,-9,5,6};
		int size = num.length; //5
		
		//1) 배열요소의 전체 합
		int result = 0;
		for(int i =0;i<size; i++) {
			result +=num[i];	
		}System.out.println("전체 합 : "+result);
		
		//2) 음수의 갯수
		int gae = 0;
		for(int n : num) {
			if(n<0) gae++;
		}System.out.println("음수의 갯수 : "+ gae);
		
		//3) 최대값, 최소값
		int large = 0;
		int small = 0;
		for(int i = 0; i<size; i++) {
			if(large<num[i]) {large = num[i];}
			if(small>num[i]) {small = num[i];}
		}System.out.printf("최댓값 : %d , 최솟값 :  %d \n", large,small );
		
		int max = num[0];
		int min = num[0];
		//배열요소가 전부 음수일경우, large값이 0이되는 오류 발생 ->초기값설정주의!!
		
		//4)num[4]요소의 등수를 구하시오
		int dun[] = new int[5];
		dun[0] = num[0];
		int temp = 0;
		//등수 기준 : 큰 순서대로 desc
		//property를 두개. 첫번째
		for(int i =0; i<size-1 ; i++) {
			for(int j=0;j<size;j++) {
				if(dun[i]<num[j]) {
					temp = dun[i];
					dun[i] = num[j];
					dun[i+1] =temp;
					}
			}
			
		}System.out.println(dun[0]);
		System.out.println(dun[1]);
		System.out.println(dun[2]);
		System.out.println(dun[3]);
		System.out.println(dun[4]);
		
		int r =1; // 등수. 점차 밀려남
		for(int i=0; i<size; i++) {
			if(num[4]<num[i]) {
				r++;
			}
		
		}System.out.println(r+"등입니다.");
		
		//5) 각각의 등수 구하기
		int[] rank = {1,1,1,1,1};
		for(int i =0 ; i<size; i++) {
			for(int j=0; j<size ; j++) {
				if(num[i]<num[j]) {
					rank[i]=rank[i]+1;
				}
			}
	
		}
		for(int i=0;i<size;i++) {
			System.out.println(num[i]+"등수는 : "+rank[i]);
		
		}
	}
}


