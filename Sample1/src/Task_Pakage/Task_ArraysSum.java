package Task_Pakage;

import java.util.Scanner;

public class Task_ArraysSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int array1 : array) {
			System.out.print(array1 + " ");
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(" ");
		System.out.println("Sum of values in the array : " + sum);
		scanner.close();
	}

}
