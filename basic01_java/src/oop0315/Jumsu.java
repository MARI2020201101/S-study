package oop0315;

public class Jumsu {
		private int no;
		private String name;
		private int[] answer = new int[5];
		private char[] ox = new char[5];
		private int score;
		private int rank;
		
		public Jumsu(){};
		public Jumsu(int no, String name, int... answer) {
			this.no=no;
			this.name=name;
			this.answer = answer;}
		
		public int getScore() {
			return this.score;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public void compute() {
			int[] dap = {3,3,3,3,3};
			int score =0;
			for(int i =0 ; i<dap.length; i++) {
				if(answer[i]==dap[i]) {
					score+=20;
					ox[i] = 'O'; 
				}else {
					ox[i] = 'X';
				}	
			}this.score = score;
		}
		public void disp() {
			System.out.print(no + " ");
			System.out.print(name + " ");
			System.out.print(ox[0] + " ");
			System.out.print(ox[1] + " ");
			System.out.print(ox[2] + " ");
			System.out.print(ox[3] + " ");
			System.out.print(ox[4] + " ");
			System.out.print(score + " ");
			System.out.print(rank + " ");
			System.out.println();
		}
}
