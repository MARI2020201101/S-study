package oop0318;

class MyThread2 extends Thread{
	//클래스가 클래스를 상속받는 경우 단일 상속만 가능하다. 
	private int num;
	private String name;
	public MyThread2() {}
	public MyThread2( int num, String name) {
		
		this.num = num;
		this.name = name;
	}

	public void run() {
		for(int i = 0; i<num; i++) {
			System.out.println(name + " : " + i);
		}
	}
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
	}
}

public class Test09_Thread {
	//2)쓰레드를 사용하는 경우
	//JVM이 쓰레드 관리자에 등록하고
	// -> start() 메소드가 run()을 호출한다
	// -> 예) 채팅프로그램, 실시간예매 ( 현장에서도 예매할 수 있고, 인터넷에서도 가능한)
	
	public static void main(String[] args) {
	MyThread2 m1 = new MyThread2(1000,"★");
	MyThread2 m2 = new MyThread2(1000,"★★");
	MyThread2 m3 = new MyThread2(1000,"★★★");
	
	m1.start();
	m2.start();
	m3.start();
	
	
	}
}
