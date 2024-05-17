package Task_Pakage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_LinkedShuffel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter the Values : ");
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());

		}
		System.out.println("original List : " + list);
		Collections.shuffle(list);
		System.out.println("After Shuffel : " + list);
		sc.close();
	}

}
