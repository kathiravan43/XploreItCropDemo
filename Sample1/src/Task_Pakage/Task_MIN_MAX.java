package Task_Pakage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task_MIN_MAX {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Values: ");
		for (int i = 0; i < 10; i++) {
			list.add(scanner.nextInt());

		}
		System.out.println("Original Lsit : " + list);
		Collections.sort(list);
		System.out.println("After sorting : " + list);
		System.out.println("Minum Integer : " + list.get(0));
		System.out.println("Maximum Integr : " + list.get(list.size() - 1));
		System.out.println(list.contains(30));
		scanner.close();
	}

}
