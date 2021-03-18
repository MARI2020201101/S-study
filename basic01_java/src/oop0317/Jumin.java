package oop0317;

import java.util.Calendar;
import java.util.Locale;

public class Jumin {
	private String jumin;//�ֹι�ȣ

	public Jumin(String jumin) {
		this.jumin = jumin;
	}
	public Jumin() {	}
	
	public boolean validate() {
		//�ֹι�ȣ�� ��ȿ���� ����
		boolean flag = false;
		if(jumin.length()!= 13) {
			return flag;
		}
		String[] jumins = jumin.split("");
		int[] j = new int[14];
		int result = 0;
		for(int i =0; i<jumins.length ; i++) {
			j[i] = Integer.parseInt(jumins[i]);
			if(i+2<10)
			result +=j[i]*(i+2);
			else result += j[i]*((i+2)%8);
		}
		if((11-(result%11))%11==j[13]) {
			flag = true;
		}
		return flag;
	}	
	
	public boolean validate2() {
		boolean flag = false;
		Integer[] CHECKNUM= {2,3,4,5,6,7,8,9,2,3,4,5};
		Integer[] save = new Integer[12];
		int hap = 0;
		int size = save.length;
		
		for(int i = 0 ; i<size ;i++) {
			int num = Integer.parseInt(jumin.substring(i, i+1));
			save[i] =num*CHECKNUM[i];
			hap += save[i];
		}
		int M = (11-(hap%11))%10;
		
		if(M==Integer.parseInt(jumin.substring(size-2, size-1))) {
			flag = true;
		}
		return flag;
	}
	public void disp() {
		//�������, ����, ����, �� , ��ƿ� ���� ����ϱ� 
		//�� �� ȣ���� �䳢 �� �� �� �� ������ �� �� ����
		/*
		 * ������� : 1989�� 12�� 30�� -> 
		 * 			�ֹι�ȣ ���ڸ� ©�� ����
		 * ���� ��¥ ���� 
		 * ���� : ���� 
		 * ���� : 32 -> GregorianCalendar Ŭ���� �̿�
		 * �� : ->�¾�⵵ %12 , 0 ������ 1�� 2 ��..
		 */
		 String nai = ""; 
		 String month = jumin.substring(2,4);
		 String day = jumin.substring(4,6);
		 String sex = jumin.substring(6,7);
		 if(sex.equals("1")||sex.equals("2")) {
			 nai = "19" + jumin.substring(0,2);
		 }else nai = "20" + jumin.substring(0,2);
		 System.out.printf("%s�� %s�� %s�� \n", nai,month,day);
		 
		 if(sex.equals("1")||sex.equals("3")) {
			 System.out.println("���� : ����");
		 }else System.out.println("���� : ����");
		 Calendar cal = Calendar.getInstance(Locale.KOREA);
		 int currYear = cal.get(Calendar.YEAR);
		 int currMonth = cal.get(Calendar.MONTH); 
		 int currDay = cal.get(Calendar.DAY_OF_MONTH);
		 int Byear = Integer.parseInt(nai);
		 int Bmonth = Integer.parseInt(month);
		 int Bday = Integer.parseInt(day);
		 
		 int age = currYear - Byear;
		 if((currMonth*100 + currDay)<(Bmonth*100+Bday)) {
			 age--;
		 }
		 System.out.println("���� : " +age);
		 
		 switch(Byear%12) {
		 case 0: System.out.println("�� : ������"); break;
		 case 1: System.out.println("�� : ��");break;
		 case 2: System.out.println("�� : ��");break;
		 case 3: System.out.println("�� : ����");break;
		 case 4: System.out.println("�� : ��");break;
		 case 5: System.out.println("�� : ��");break;
		 case 6: System.out.println("�� : ȣ����");break;
		 case 7: System.out.println("�� : �䳢");break;
		 case 8: System.out.println("�� : ��");break;
		 case 9: System.out.println("�� : ��");break;
		 case 10: System.out.println("�� : ��");break;
		 case 11: System.out.println("�� : ��");break;
		 }
		 
	
	}
}
