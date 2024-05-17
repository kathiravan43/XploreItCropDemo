package Xplore;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		Map<Integer,String> list = new LinkedHashMap<>();
		list.put(101,"Anu");
		list.put(102,"amal davis");
		list.put(103,"leo das");
		list.put(104,"duraisingam");
		list.put(105,"thavasi");
		System.out.println(list.keySet());
		System.out.println(list);
		list.remove(102);
		for(Map.Entry<Integer ,String> m : list.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		list.putIfAbsent(102, "Kathir");
		System.out.println("++++++++++++++++++++++++");
		for(Map.Entry<Integer ,String> m : list.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
