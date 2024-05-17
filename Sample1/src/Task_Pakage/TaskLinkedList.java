package Task_Pakage;

import java.util.LinkedList;

public class TaskLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> values = new LinkedList<Integer>();
		values.add(25);
		values.add(50);
		values.add(14);
		values.add(150);
		values.add(200);
		System.out.println("Original list : " + values);

		System.out.println("After Updates : " + values);
	}

}
