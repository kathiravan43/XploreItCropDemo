package Xplore;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
NavigableMap<Integer, String> map = new TreeMap<>();
map.put(100, "Ramu");
map.put(101, "Janu");
map.put(102,"Somu");
map.put(104, "Riya");
System.out.println("Descending map : "+map.descendingMap());
System.out.println("HeadMap : "+map.headMap(102));
System.out.println("Tail Map : "+map.tailMap(101));
System.out.println("SubMap : "+map.subMap(101, true, 104,true));
	}

}
