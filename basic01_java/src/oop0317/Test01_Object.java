package oop0317;

class Jeju{

	@Override
	public String toString() {
		return "���ֵ�";
	}
	}
class Suwon{
	private String id = "SOLDESK";
	private String pw = "1234";
	
	@Override
	public String toString() {
		return "���� [id = "+ id +" , password = "+pw + "]";
	}
	//toString : ���� ��� �뵵�� ���� ���. ���� ������ ���� �� ������
}
class Inchon{
	private String name = "��õ������";
	private String phone = "5678";
	@Override
	public String toString() {
		return "Inchon [name=" + name + ", phone=" + phone + "]";
	}
	
}

public class Test01_Object {

	public static void main(String[] args) {
//�ڹ��� ��� Ŭ������ ������ object Ŭ������ ��ӹ޴´�
		Suwon sw = new Suwon();
		Jeju j = new Jeju();
		System.out.println(sw);
		System.out.println(j);
	}

}