package Xplore;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> l = new HashSet<>();
		l.add("ONE");
		l.add("TWO");
		l.add("Three");
		l.add("Four");
		l.add("Five");
		l.add("TWO");

System.out.println(l);
	
		LinkedHashSet<String> list = new LinkedHashSet<>();
		list.add("one");
		list.add("Two");
		list.add("three");
		list.add("four");
		list.add("Four");
		list.add("one");
		list.add("Seven");
		System.out.println("List is :"+list );
		list.remove("four");
		System.out.println("After : "+list);

	}

}
