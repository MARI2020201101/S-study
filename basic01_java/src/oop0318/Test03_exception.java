package oop0318;

public class Test03_exception {
	public static void main(String[] args) {
		//Exception 예외처리
		//에러의 종류
		/*
		 * 1) 빨간줄 에러(코딩에러)
		 * 2) 런타임 에러( 실행 run을 하면 exception뜬다)
		 * 3) 원치 않는 값이 나왔을 때 -> 어느시점에서 gara값이 들어갔지?!!! -> 찍어보기!
		 * 		중간중간에 변수값을 찍어보면서 확인하는게 중요햇. 
		 */
		//exception이 떠도 프로그램은 정상적으로 종료가 되어야 함!!
		//따라서 예외처리를 해주어야 한다. 
		/*
		 * ->try~catch
		 * ->finally
		 * ->throws
		 */
		//정상적으로 종료한다는 것 = exception이 발생되어도 내가 쓴 코드 끝까지 실행되어야함!!
		
		//1) 예외처리 하지 않는 경우
		/*System.out.println(1);
		//여기서 exception뜨고 뒤에 구문이 실행이 안됨
		System.out.println(2/0); => 왜 0으로 나누는거니? ArithmeticException발생
		System.out.println(3);
		System.out.println("END");
		*/
		
		//2)예외처리를 한 경우
		try {
			//예외 발생이 예상되는 코드 작성- 자바가 알려줌
			System.out.println(1);
			System.out.println(2/0); //exception
			System.out.println(3); //얘는 실행안됨
			
		}catch(ArithmeticException e){
			//예외가 발생되었을 때 처리할 코드 작성.
			//메세지를 보고 내가 고치러 간당.
			e.getMessage();
			System.out.println(e);
		}
		//얘가 나왔다는 게 중요함. 어쩄든 프로그램은 정상적으로 종료! 
		System.out.println("END");
		
		
		//file입출력 : 외부문서가 있는지 없는지 java코드내에서는 알수 없음.
		//따라서 exception처리는 필수적!!
		
		//3)
		try {
			System.out.println(1);
			int num= Integer.parseInt("korea");
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("END");
	
	
	//4) 다중catch문
	try {

		int[] num = new int[3];
		num[5] = 7;
		
	}catch(Exception e) {//다형성
		System.out.println(e);
	}finally {
		System.out.println("CLOSE"); //예외가 발생이 되어도 안되어도 반드시실행
		//open => close
		//외부 응용 프로그램을 오픈해서 데이터를 사용하고 -> 반드시 close하기
		//open하려고 했는데 파일이 없다 -> 그래도 반드시 close 
		//제대로 문 닫고 나와주기!!
	}
	System.out.println("END");
}
}
