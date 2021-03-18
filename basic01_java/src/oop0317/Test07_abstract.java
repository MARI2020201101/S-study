package oop0317;

abstract class Travel{
	void view() {}
	abstract String travelWhere();
}

class TypeA extends Travel{
	@Override
	String travelWhere() {
		return "일본";
	}}
class TypeB extends Travel{
	@Override
	String travelWhere() {
		// TODO Auto-generated method stub
		return "대만";
	}
}
class TypeC extends Travel{
	@Override
	String travelWhere() {
		// TODO Auto-generated method stub
		return "캐나다";
	}
}
public class Test07_abstract {
public static void main(String[] args) {
	Travel a = new TypeA();
	Travel b = new TypeB();
	Travel c = new TypeC();
	
	System.out.println(a.travelWhere());
	System.out.println(b.travelWhere());
	System.out.println(c.travelWhere());
}
	
}
