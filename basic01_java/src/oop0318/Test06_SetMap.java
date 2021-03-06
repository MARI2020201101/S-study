package oop0318;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test06_SetMap {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(3);
		set.add(2.4);
		set.add("BUSAN");
		set.add('R');
		Iterator li = set.iterator();
		 while(li.hasNext()) {
			 System.out.println(li.next());
		 }//순서 상관없이 나온다
		 //iterator -> 커서( C에서는 포인터라고들 함) 를 이용해서 접근하는 경우 
		 
		 HashMap<Integer, String> map = new HashMap();
		 map.put(1, "one");
		 map.put(2, "two");
		 map.put(3, "three");
		 map.put(4, "four");
		 
		 System.out.println(map.get(1));
		 System.out.println(map.get(2));
		 System.out.println(map.get(3));
		 System.out.println(map.get(4));
		 System.out.println(map.size());
		 map.remove(4);
		 System.out.println(map.size());
		 //JSON에 저장할때 많이 씀!!!
		 //NoSQL DB도 이런식으로 사용
		 //python 에서 -> 자바의 map 이 딕셔너리임
		 
		 //문제)
		 /* = 기준으로 문자 분리해서
		  * = 앞의 문자열은 key
		  * = 뒤의 문자열은 value 에 저장
		  * 
		  * key 값들 중에서 read.do 호출하면
		  * value 값이 나오도록
		  */
		
		 System.out.println("------------------");
		 HashSet command=new HashSet();
		    command.add("list.do=net.bbs.List");
		    command.add("read.do=net.bbs.Read");
		    command.add("write.do=net.bbs.Write");
		    
		 Iterator li2 = command.iterator();//출력. 분리. for로 같이 하고
		 // 각각 배열에 저장해서
		 // 각각 map에 저장
		 List<String> list = new ArrayList(); 
		 while(li2.hasNext()) {
			 list.add((String) li2.next());
		 }
		 Map<String,String> map2 = new HashMap<>();
		 for(String s : list) {
			String[] slist = s.split("=");
			map2.put(slist[0],slist[1]);
		 }
		 System.out.println(map2.get("read.do"));
		 
		 
	}
	
}
