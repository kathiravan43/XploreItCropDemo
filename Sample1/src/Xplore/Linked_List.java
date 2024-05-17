package Xplore;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> fruit = new LinkedList<>();
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("PineApple");
		fruit.add("Papaya");
		System.out.println(fruit);
		fruit.addFirst("Pomagranet");
		fruit.addLast("Banana");
		System.out.println(fruit);
		fruit.removeFirst();
		fruit.remove(2);
		System.out.println(fruit);
		for(String print:fruit) {
			System.out.println(print);
		}
	}

}
