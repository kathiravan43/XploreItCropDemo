/*
 * Notes : Task using stack and add the books
 * Date : 09/05/2024
 */
package Task_Pakage;

import java.util.Stack;

public class TaskStackBooks {

	public static void main(String[] args) {
		Stack<String> books = new Stack<>();
		books.add("C Programming");
		books.add("c++");
		books.add("Phyton");
		books.add("Java");
		books.add("Angular");
		System.out.println("List of Books : " + books);
		System.out.println("First value of the Book List : " + books.firstElement());
		System.out.println("Last element of the book list : " + books.lastElement());
		System.out.println(books.search("Java"));
	}
}
