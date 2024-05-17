package Xplore;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pri = new  PriorityQueue<>();
		pri.add(20);
		pri.add(48);
		pri.add(74);
		pri.offer(25);
		pri.offer(15);
		System.out.println(pri);
		System.out.println("Head : "+pri.element());
		System.out.println("Head : "+pri.peek());
		Iterator itr = pri.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		pri.remove();
		pri.poll();
		System.out.println(pri);
		
 
	}

}
