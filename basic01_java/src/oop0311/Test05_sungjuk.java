package oop0311;


public class Test05_sungjuk {

	public static void main(String[] args) {
		
		String[] name= {"라일락","진달래","개나리","무궁화","홍길동"};
        int[] kor= {100, 50, 95, 80, 60};
        int[] eng= {100, 55, 95, 85, 40};
        int[] mat= {100, 60, 35, 90, 30};
        
        //1)평균구하기
        int[] aver = new int[5];
        
        for(int i = 0; i<kor.length ; i++) {
        	aver[i] = (kor[i]+eng[i]+mat[i])/3;
        }
        //2)등수구하기(기준:평균)
        int[] rank = {1,1,1,1,1};
        for(int i=0; i<aver.length ; i++) {
        	for(int j =0; j<aver.length; j++) {
        		if(aver[i]<aver[j]) {
            		rank[i]++;
            	}
        	}
        	
        }
        for(int i= 0; i<aver.length; i++)
        System.out.printf("이름: %s , 평균 : %d , 등수 : %d \n", name[i] ,aver[i], rank[i]);
        
        
        //3) 과락(평균을 기준으로 합격, 재시험, 불합격)
        int total = 0;
        String[] result = {"","","","",""};
        for(int i = 0;i<aver.length ;i++) {
        	total += aver[i];
        }
        int totalaver = total/aver.length;
        for(int i =0; i<aver.length ; i++) {
        	if(totalaver<aver[i]) result[i]="합격";
        	else if(totalaver==aver[i]) result[i]="재시험";
        	else result[i] ="불합격";
        }
        
        for(int i =0 ; i<aver.length;i++) {
        	System.out.print(name[i]+" ");
        	System.out.print(kor[i]+" ");
        	System.out.print(eng[i]+" ");
        	System.out.print(mat[i]+" ");
        	System.out.print(aver[i]+" ");
        	System.out.print(rank[i]+"등 ");
        	
        	if(aver[i]>=70) {
            	if(kor[i]<40||eng[i]<40|| mat[i]<40) System.out.println("재시험");
            	else System.out.println("합격");
            }else System.out.println("불합격");
        	
        	
        }
        
        
        //4) 평균 10점당 * 개씩
        String[] star = {"","","","",""};
        for(int i = 0;i<aver.length; i++) {
        	int num = (aver[i]/10);
        	for(int j=0; j<num; j++) {
        		star[i]=star[i]+"*";
        	}
        }
        for(int i = 0; i<aver.length;i++) {
        	for(int stars =0; stars<aver[i]/10;stars++) {
            	System.out.print("*");
            	
            }System.out.println(" ");
        }
        
       
        //5) 평균 95점이상 = 장학생
        String[] student = {"","","","",""};
        for(int i= 0; i<aver.length; i++) {
        	if(aver[i]>=95) student[i]="장학생";
        	else student[i] ="학생";
        }
        System.out.println("-----------------------------------------------");
        for(int i= 0; i<aver.length; i++)
            System.out.printf("이름: %s , 별 : %s , 특이사항 : %s \n", name[i] ,star[i], student[i]);
            
	}

}
