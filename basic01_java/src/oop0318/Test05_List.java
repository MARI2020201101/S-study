package oop0318;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test05_List {
//Java Collections Framework
	
	/*�迭 [] : �ڷḦ ��Ƴ��� �� �ִ�
	 * 
	 * 1 ) List : �迭�� ����. �ε����� 0���� ���� 
	 * 	List<E> E: element �� ����
	 * 	List, Vector, ArrayList ~~...
	 * 
	 * 2 ) Set : ������ ����
	 * 	HashSet, EnumSet...
	 * 
	 * 3 ) Map : ������ ����. Ű�� ����� ����
	 * 	Map<K,V> key �� value
	 * 	HashMap, HashTable, Map, Properties... 
	 */
	// E, K, V..�̷� ���ڵ��� ���� ���׸��� ����
	
	/*
	 * class ArrayList implements List{}
	 * class HashSet implements Set{}
	 * class HashMap implements Map{}
	 * class HashTable implements Map{}
	 * class Properties implements Map{}
	 */
	public static void main(String[] args) {
		List vector = new Vector();
		String a = "a";
		String b = "b";
		int c = 3;
		vector.add(a);
		vector.add(b);
		vector.add(c);
		System.out.println(vector.get(2));
		System.out.println("-----------");
		for(int i =0 ;i<vector.size(); i++ )System.out.println(vector.get(i));
		System.out.println("-----------");
		
		List list = new ArrayList<>();
		//����) removed()�̿��ؼ� list���� ����
		list.add(5);
		list.add(6.7);
		list.add('r');
		
		System.out.println(list.size());
		for(int i=0 ; i<list.size(); i++) {
			list.remove(i);
		}
		
		//��������������� �ε����� Ʋ�����ԵǱ� ������ �Ʒ������� ������ ��!
		if(list.isEmpty())System.out.println("���ŵǾ����ϴ�");
		else System.out.println("���� ���� : " + list.size());
		list.add(5);
		list.add(6.7);
		list.add('r');
	
		System.out.println(list.size());
		list.clear();
		
		System.out.println(list.size()); //0
		list.add(5);
		list.add(6.7);
		list.add('r');
		for(int i =list.size()-1; i>=0 ; i--) list.remove(i);
		if(list.isEmpty())System.out.println("���ŵǾ����ϴ�");
		else System.out.println("���� ���� : " + list.size());
	}
	
}