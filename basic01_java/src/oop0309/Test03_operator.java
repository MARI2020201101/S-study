package oop0309;

public class Test03_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		System.out.println(a*-1); //이항연산자
		System.out.println(-a); //단항연산자
		System.out.println(a==3? "3입니다":"3이 아닙니다");
		//3항연산자
		
		//절대값: 0과의 거리 
		//문제) 절대값을 구하시오(= 무조건 양수로 출력)
		int num = 1;
		System.out.println(num>0?"절대값은 : " + num:"절대값은 : " + -num);
	
		int b =3;
		b=b+2;
		System.out.println(b);
		b+=2;
		System.out.println(b);
		
		//문제) 세개의 수 중에서 최대값을 출력하시오
		int x=7, y=5,z=9;
		int result =x>y?x:y;
		result = z>result ? z:result ;
		System.out.println("제일 큰 수는 : "+ result +"입니다.");
		
		}

}
