package Xplore;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		Vector< String> vec = new Vector<>();
		vec.add("OOPS");
		vec.add(1, "class");
		vec.add("Object");
		vec.addElement("Inheritance");
		vec.add("Abstraction");
		vec.addElement("Polymorphism");
		vec.add("Encapsulation");
		System.out.println(vec);
		System.out.println(vec.contains("Object"));
		System.out.println(vec.isEmpty());
		System.out.println(vec.subList(3,vec.size()));
		System.out.println(vec.firstElement());
		

	}

}
