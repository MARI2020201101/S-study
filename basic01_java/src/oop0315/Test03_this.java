package oop0315;

public class Test03_this {

static class Score{
	private String name="�����";
	private int kor,eng,mat;
	private int aver;
	
	//�⺻������ : �������� ������ ���� ��õ( ���� ����
	public Score() {}
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.aver = (kor+eng+mat)/3;
	}

	public void disp() {
		String name = "������";
		System.out.println("name :" + name);
		System.out.println("name :" + this.name);
		System.out.println("kor : "+kor);
		System.out.println("mat : "+mat);
		System.out.println("eng : "+eng);
		System.out.println("aver : "+aver);
		
	}
}
	public static void main(String[] args) {
		// this
		/*
		 * -> Ŭ���� ������ ����Ű�� �����
		 * -> �Ϲ� ���������� ��������� �����ϱ� ����
		 * 
		 * this()
		 * -> �ڽ��� ������ �Լ����� ȣ��
		 * -> ���¿�~~( ���ʴ¿�~~ �� �� ����.. ��������..//) 
		 */
		Score one = new Score();
		one.disp();
		System.out.println(one);
		System.out.println(one.toString());
		Score two = new Score("�迬��",100,90,95);
		two.disp();
		System.out.println(two);
		two=null;
		System.out.println(two);
		
		/*Score kim= new Score("����ȭ", 70,85,100);
		Score lee= new Score("���϶�", 90,95,90);
		Score park= new Score("���޷�", 60,45,90);*/
		
		//������Ʈ�� �迭�� �� �� �ִ�. 
		Score[] score = new Score[] {
				new Score("����ȭ", 70,85,100),
				new Score("���϶�", 90,95,90),
				new Score("���޷�", 60,45,90)
		};
	}
}