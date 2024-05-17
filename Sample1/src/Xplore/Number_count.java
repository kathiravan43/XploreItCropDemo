/*

 * Task 2 = To find the given integer Count
 * Date : 18/04/2024

 */
package Xplore;

import java.util.Scanner;

public class Number_count {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		int temp = number, count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		switch (count) {
		case 1:
			System.out.println(temp + " ONE digit number");

			break;
		case 2:
			System.out.println(temp + " TWO digit number");

			break;
		case 3:
			System.out.println(temp + " THREE digit number");

			break;
		case 4:
			System.out.println(temp + " FOUR digit number");

			break;
		default:
			System.out.println("More than FOUR digits");
			break;
		}
		scanner.close();

	}

}
