package oop0318;

public class Test03_exception {
	public static void main(String[] args) {
		//Exception ����ó��
		//������ ����
		/*
		 * 1) ������ ����(�ڵ�����)
		 * 2) ��Ÿ�� ����( ���� run�� �ϸ� exception���)
		 * 3) ��ġ �ʴ� ���� ������ �� -> ����������� gara���� ����?!!! -> ����!
		 * 		�߰��߰��� �������� ���鼭 Ȯ���ϴ°� �߿���. 
		 */
		//exception�� ���� ���α׷��� ���������� ���ᰡ �Ǿ�� ��!!
		//���� ����ó���� ���־�� �Ѵ�. 
		/*
		 * ->try~catch
		 * ->finally
		 * ->throws
		 */
		//���������� �����Ѵٴ� �� = exception�� �߻��Ǿ ���� �� �ڵ� ������ ����Ǿ����!!
		
		//1) ����ó�� ���� �ʴ� ���
		/*System.out.println(1);
		//���⼭ exception�߰� �ڿ� ������ ������ �ȵ�
		System.out.println(2/0); => �� 0���� �����°Ŵ�? ArithmeticException�߻�
		System.out.println(3);
		System.out.println("END");
		*/
		
		//2)����ó���� �� ���
		try {
			//���� �߻��� ����Ǵ� �ڵ� �ۼ�- �ڹٰ� �˷���
			System.out.println(1);
			System.out.println(2/0); //exception
			System.out.println(3); //��� ����ȵ�
			
		}catch(ArithmeticException e){
			//���ܰ� �߻��Ǿ��� �� ó���� �ڵ� �ۼ�.
			//�޼����� ���� ���� ��ġ�� ����.
			e.getMessage();
			System.out.println(e);
		}
		//�갡 ���Դٴ� �� �߿���. ��� ���α׷��� ���������� ����! 
		System.out.println("END");
		
		
		//file����� : �ܺι����� �ִ��� ������ java�ڵ峻������ �˼� ����.
		//���� exceptionó���� �ʼ���!!
		
		//3)
		try {
			System.out.println(1);
			int num= Integer.parseInt("korea");
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("END");
	
	
	//4) ����catch��
	try {

		int[] num = new int[3];
		num[5] = 7;
		
	}catch(Exception e) {//������
		System.out.println(e);
	}finally {
		System.out.println("CLOSE"); //���ܰ� �߻��� �Ǿ �ȵǾ �ݵ�ý���
		//open => close
		//�ܺ� ���� ���α׷��� �����ؼ� �����͸� ����ϰ� -> �ݵ�� close�ϱ�
		//open�Ϸ��� �ߴµ� ������ ���� -> �׷��� �ݵ�� close 
		//����� �� �ݰ� �����ֱ�!!
	}
	System.out.println("END");
}
}