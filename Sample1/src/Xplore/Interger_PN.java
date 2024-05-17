/*

 * Task 2 = To find the given integer is positive or negative

 * Date : 18/04/2024

 */
package Xplore;

import java.util.Scanner;

public class Interger_PN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scanner.nextInt();
		if (number != 0) {
			if (number >= 1) {
				System.out.println(number + " Its a Positive Integer");
			} else if (number <= -1) {
				System.out.println(number + " Its a Negative Integer");

			}
		} else {
			System.out.println("The Number is ZERO");
		}
		scanner.close();
	}

}
