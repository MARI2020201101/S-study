package oop0318;

class Test{
	//1) try ~catch �����̿��� ����ó��
	public void view() {
		try {
			int a = Integer.parseInt("korea");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	//2) throw �� �̿��� ����ó��
	public void disp() throws Exception{
		System.out.println(1/0);
	}
	
	public void doSomething() throws NullPointerException, NumberFormatException{
		int a = Integer.parseInt("korea");
		System.out.println(a);
	}
	//OS�� �����ؼ� ������ �߻����� �ʵ��� �����ϴ� ��� 
	//���� �װ� ������??? ����.......
	//������ ���� �Ͼ�� �Լ� ( user���� ���� ���Ǵ� �Լ� - ������ �����߼� �����߻�)
	//����ȣ�� ���´�. ���������� lock �ع���
	public synchronized void login() {
		
	}
	
}

public class Test04_throws {

	public static void main(String[] args) {
		// ���ܸ� ������
		//-> �޼ҵ� ȣ�� �� ����ó���� �Ѳ����� ��Ƽ� ó���Ѵ�
		Test t = new Test();
		
		try{t.disp();
		t.doSomething();}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}