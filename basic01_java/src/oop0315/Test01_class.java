package oop0315; //���� Ŭ������ ������ġ

public class Test01_class {
	


	public static void main(String[] args) {
		//access Modifier ��������
		/*
		 * private �����.Ŭ���� ���ο����� ����. ������ �� �ִ�
		 * package �ƹ��͵� �Ⱦ�. ���� ��Ű��(oop0315) �������� ���ٰ���
		 * protected ��Ӱ��迡 �ִ� Ŭ������ �ٸ� ��Ű���� �ִ� ��쿡�� ���ٰ���
		 * public 
		 * 
		 */
		
		/*
		 * <RAM�޸� ����: static, heap, stack>
		 * ���� �ּҰ����� �����Ϳ� �����Ѵ�
		 * 
		 *--------------------------------------
		 * 1) new ������ . �������� 
		 * Ŭ������ ����Ϸ��� �޸𸮸� �Ҵ��ϰ� ����Ѵ�
		 * RAM(Random Access Memory) �� heap ������ �޸𸮰� �Ҵ�ǰ� 
		 * �ּҰ��� �����. �ּ�(reference)���� �ִ� = Object , ��ü�̴�
		 * 
		 * 2) stack ������ int -> �������� call by value
		 * 	  stack ������ sungjuk -> �ּҰ��� ����. �ּҰ����� heap�� ã�ư���
		 * 							 call by reference
		 */
		class Sungjuk{
			//package �����Ǿ�����
			//package class : Sungjuk
			//Ŭ�������� ù���ڴ� �빮�ڷ�. 
			
			//������� field
			public String name;
			int kor,eng,mat;
			private int aver;
			
			private void view() {}
			int calc() {
				int result = (kor+eng+mat)/3;
				
				this.aver = result;
				return result;
				
			}
			public void disp() {}
		
		}	
		Sungjuk sj = new Sungjuk(); 
		sj.name="�����";
		sj.kor = 100;
		sj.eng = 90;
		sj.mat = 100;
		int result = sj.calc();
		System.out.println("aver result :" + result);
		
		//��ü���� ������ Ư¡
		//ĸ��ȭ �Ѵ�. ĸ���� �s ���� �̸��� ������ ������ ������~~ ���� �˰��̵��� ������
		//������ ������ ���� �ְ� ĸ��ȭ�Ҽ��� �ִ�.
		//����Ÿ�� �����ϱ� ���ؼ��� - �� �ּҰ��� �˸� �Ǵ� ���̴�!!
		Sungjuk sj2 = new Sungjuk(); // heap�� �޸� �Ҵ�. �ּҰ� �߻�
		sj2.name = "������";
		sj2.kor =70;
		sj2.eng = 100;
		sj2.mat = 90;
		int result2 = sj.calc();
		System.out.printf("\n%s ���� ��� ���� : %d\n", sj2.name, result2 );
		System.out.println(sj.hashCode());
		System.out.println(sj2.hashCode());
		
		Sungjuk tmp = sj2;
		System.out.println(sj2);
		System.out.println(tmp);
		System.out.println(tmp.hashCode());
	}
}