package Xplore;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> de = new ArrayDeque<String>();
		de.offer("Kathir");
		de.offer("Suba");
		de.add("Sanjai");
		de.offerFirst("Manoj");
		de.offerLast("vignesh");
		for(String str : de) {
			System.out.println(str);
		}
		de.pollFirst();
		System.out.println(de);
		de.pollLast();
		System.out.println(de);
		
		
				

	}

}
