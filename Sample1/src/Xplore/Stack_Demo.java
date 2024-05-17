package Xplore;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		boolean result = stk.empty();
		System.out.println(result);
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk);
		System.out.println(stk.search(40));
		int location = stk.search(30);
		System.out.println(location);
		System.out.println(stk.size());
	}
}
