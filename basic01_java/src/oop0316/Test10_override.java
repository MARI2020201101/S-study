package oop0316;

class Korea {
	String name = "���ѹα�";
	final void view() {
		System.out.println("Korea . view()...");
		
	}
	void disp() {
		System.out.println("Korea.disp()...");
	}
}

class Seoul extends Korea{
	
}
class Busan extends Korea{

	@Override
	void disp() {
		System.out.println("Busan.disp()...");;
	}
	
	
}

public class Test10_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
