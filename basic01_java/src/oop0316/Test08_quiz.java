package oop0316;

public class Test08_quiz {
public static void main(String[] args) {
	
	//이메일 주소에 @문자 있으면
    //     @글자 기준으로 문자열을 분리해서 출력하고
    //     ->출력결과 : webmaster
    //               soldesk.com
    //     @문자 없다면 "이메일주소 틀림" 메세지를 출력하시오
    //String email="webmaster@soldesk.com";
	
	String email = "test@email.com";
	
	if(email.contains("@")) {
		String[] emailResult = email.split("@");
	for(String s : emailResult) {
		System.out.println(s);	}
	}else System.out.println("이메일 주소 틀림");
	
	System.out.println("-----------------");
	int pos = email.indexOf("@");
	if(pos==-1) {
		System.out.println("이메일주소 틀림");
	}else {
		System.out.println("이메일 주소 맞음");
	}
	
	
    //문2)주민번호 각 숫자의 전체 합을 구하시오
    //    1+5+1+2+3+0+4+1+2+3+4+5+6=37
    String jumin="1512304123456";
    Integer result = 0;
    String[] jumin2 = jumin.split("");
    for(String j : jumin2) {
    	result += Integer.parseInt(j);
    	}
    System.out.println("------------------");
    System.out.println("주민번호의 합 :" + result);
    
    System.out.println("--------------------------"); 
    Integer hap = 0;
    for(int i = 0; i<jumin.length() ;i++) {
    	hap += Integer.parseInt(jumin.substring(i,i+1));
    }System.out.println("주민번호의 합 with substring :" + hap);
    
    //문3)파일명, 확장명을 분리해서 출력하시오
    //   출력결과
    //   ->파일명 : 2020.03.10.sky
    //   ->확장명 : png
    String path="d:/java202102/workspace/2020.03.10.sky.png";
    int lastIndex = path.lastIndexOf("/");
    String path2 = path.substring(lastIndex+1);
  
    int lastJum = path2.lastIndexOf(".");
    String ext = path2.substring(lastJum+1);
    String fileName = path2.substring(0, lastJum);

    System.out.println("------------------");
    System.out.println(fileName);
    System.out.println(ext);
    
    //2) 확장명이 이미지 파일인지 확인하시오(png, jpg,gif)
    //맞으면 "파일이 전송되었습니다"
    //틀리면 "파일을 다시 선택해주세요"
    //확장명 전부 소문자로 바꾼후 문자열 비교
    ext = ext.toLowerCase();
    if(ext.equals("png")||ext.equals("jpg")||ext.equals("gif"))
    	System.out.println("파일이 전송되었습니다");
    else System.out.println("파일을 다시 선택해주세요");
    
    
    
}
}
