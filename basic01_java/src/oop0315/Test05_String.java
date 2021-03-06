package oop0315;

public class Test05_String {

	public static void main(String[] args) {
		String str = new String("Gone with the Wind");
		System.out.println(str.length()); // 문자 길이 (개수)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.indexOf('G')); //문자열의 순서
		System.out.println(str.indexOf("e",4));
		//없는 문자열 = -1
		
		System.out.println(str.startsWith("o"));
		System.out.println(str.endsWith("d"));
		System.out.println(str.startsWith("Gone"));
		System.out.println(str.replace('n', 'N'));
		System.out.println(str.concat(" Dont forget me"));
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		String str2 = "";
		String str3 = " ";
		
		System.out.println(str2.isBlank()); //true
		System.out.println(str2.isEmpty()); //true
		System.out.println(str3.isBlank());  //true
		System.out.println(str3.isEmpty());  //false
		//blank 는 trim 여백도 공백으로 처리
		
		if(str.isEmpty())System.out.println("빈문자열 입니다");
		else System.out.println("빈문자열이 아닙니다");
		
		String name1 = "HAPPY";
		String name2 = new String("HAPPY");
		
		if(name1==name2)System.out.println("같다");
		else System.out.println("다르다");
		//reference (주소값) 이 다르기때문에 "다르다"

		if(name1.equals(name2))System.out.println("같다");
		else System.out.println("다르다");
		//내용값비교 "같다"
		
		String name3 = name1;
		if(name1==name3)System.out.println("같다");
		else System.out.println("다르다");
		
		//문자열의 일부분만 추출하기(★★★★★)
		//무조건 0부터 센다
		System.out.println(str.substring(6));
		System.out.println(str.substring(6,12));
		System.out.println(str.substring(10,13));
		//잘라오려는 글자수 +1 하기 
		//	->why?? 문자열의 꼬릿말이 들어가는 공간을 확보해야 하기 때문
		System.out.println(str.substring(0,1));
		System.out.println(str.substring(str.length()-1,str.length()));
		System.out.println(str.substring(str.length()-1)); //시작인덱스
	}

}
