package Task_Pakage;

import java.util.Scanner;

class Swap {
	String s1, s2;

	public void toswap(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
		System.out.println("-------Before swaping-------");
		System.out.println("word 1 : " + s1);
		System.out.println("Word 2 : " + s2);
		s1 = s1.concat(s2);
		s2 = s1.substring(0, (s1.length() - s2.length()));
		s1 = s1.substring(s2.length());

		System.out.println("---------After Swaping--------- ");
		System.out.println("word 1 : " + s1);
		System.out.println("word 2 : " + s2);

	}
}

public class Task_Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the word 2: ");
		String s2 = sc.nextLine();
		Swap swap = new Swap();
		swap.toswap(s1, s2);
		sc.close();

	}

}
