package Xplore;

import java.util.TreeSet;



public class SetExample {

	public static void main(String[] args) {
		TreeSet< Integer> list = new TreeSet<>();
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(670);
		list.add(40);
		System.out.println(list);
		System.out.println("Min Value : "+list.pollFirst());
		
		TreeSet<String> alp = new TreeSet<>();
		alp.add("A");
		alp.add("B");
		alp.add("C");
		alp.add("D");
		alp.add("F");
		alp.add("E");
		System.out.println(alp);
		System.out.println("Descemnding set : "+alp.descendingSet());
		System.out.println("head set : "+alp.headSet("B", true));
		System.out.println("subset : "+alp.subSet("B", false, "F", false));
		System.out.println("Tail set : "+alp.tailSet("C"));
	}

}
