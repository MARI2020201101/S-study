package oop0310;

public class Test01_if {
	public static void main(String[] args) {
		
		String name ="maru";
		int kor =100, eng=100, mat=60;
		
		int aver = (kor+eng+mat)/3;
		System.out.printf("이름 : %s\n" , name);
		System.out.printf("국어 : %d\n" , kor);
		System.out.printf("영어 : %d\n" , eng);
		System.out.printf("수학 : %d\n" , mat);
		System.out.printf("평균 : %d\n" , aver);
		
		//문제1) 평균이 95이상 - 장학생
		if(aver>=95)System.out.printf("%s\t님은 장학생입니다.\n",name);
		else System.out.printf("%s\t님은 장학생이 아닙니다.\n",name);
		//문제2) 국어가 70이상 - 합격 
		if(kor>=70)System.out.printf("%s 과목은 합격입니다.\n","국어");
		else System.out.printf("%s 과목은 불합격입니다.\n","국어");
		//문제3) 수학이 90이상 -A, 80이상 - B,70이상 - C, 60이상 - D,나머지 F
		if(mat>=90)System.out.printf("%s 과목은 %c입니다. \n","수학",'A');
		else if(mat>=80)System.out.printf("%s 과목은 %c입니다. \n","수학",'B');
		else if(mat>=70)System.out.printf("%s 과목은 %c입니다. \n","수학",'C');
		else if(mat>=60)System.out.printf("%s 과목은 %c입니다. \n","수학",'D');
		else System.out.printf("%s 과목은 %c입니다. \n","수학",'F');
		
		//문제4)과락 평균70이상 : 합격,
		//단 국영수 세과목중 한과목이라도 40미만이면 재시험
		//평균 70미만 : 불합격
		if(kor<40||mat<40||eng<40)System.out.println("재시험입니다.");
		else if(aver>=70)System.out.println("합격입니다.");
		else System.out.println("불합격입니다.");
	}
	

}
