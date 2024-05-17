package Xplore;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Demo {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		list.add("Kathir");
		list.add("Shankkar");
		list.add("Maghesh");
		list.add("PNKStr");
		list.remove(2);
		list.add(0, "AGR");
		System.out.println(list);
		System.out.println("Returning element : "+list.get(2));
		System.out.println(list.toString());
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
