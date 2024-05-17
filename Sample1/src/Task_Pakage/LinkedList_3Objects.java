package Task_Pakage;

import java.util.LinkedList;

public class LinkedList_3Objects {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(25);
		list1.add(50);
		list1.add(75);
		LinkedList<Integer> list2 = new LinkedList<>(list1);
		list2.add(15);
		list2.add(10);
		list2.add(35);
		LinkedList<Integer> list3 = new LinkedList<>(list2);
		System.out.println(list3);

	}

}
