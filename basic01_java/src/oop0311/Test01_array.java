package oop0311;

public class Test01_array {
public static void main(String[] args) {
	int kor[] = new int[3];
	kor[0] = 90;
	kor[1] = 70;
	kor[2] = 69;
	System.out.println(kor[0]);
	System.out.println(kor[1]);
	System.out.println(kor[2]);

	String[] name = new String[3];
	for(int i=0;i<3;i++) {
		name[i] = "���޷� " +i ;
	}
	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
}
}
