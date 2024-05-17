package Task_Pakage;

import java.util.Scanner;

public class Task_ArraysCount {

	public static void main(String[] args) {
		int[] array = new int[10];
		int positiveIntCount = 0, NegativeIntCount = 0, evenCount = 0, oddcount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Array Elements :");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				positiveIntCount++;
				//System.out.print("The positive elements are : " + array[i] + " ");
			} else if (array[i] < 0) {
				NegativeIntCount++;
				//System.out.println("The negative elements are : " + array[i] + " ");
			}
			if (array[i] % 2 == 0) {
				evenCount++;
				//System.out.println("Even numbers : " + array[i]);
			} else {
				oddcount++;
				//System.out.println("Odd Nubers : " + array[i]);
			}
		}
		System.out.println(" posive integer count :  "+positiveIntCount);
		System.out.println(" negative count:  "+NegativeIntCount);
		System.out.println("even numbers count:  "+evenCount);
		System.out.println("odd numbers count :  "+oddcount);
		scanner.close();
	}

}
