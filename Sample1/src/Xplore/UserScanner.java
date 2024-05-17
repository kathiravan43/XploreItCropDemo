package Xplore;

import java.util.Scanner;

/*   
 project name = Scanner
 Date = 16/04/2024
 notes : to a number from a user using scanner class 


 */
public class UserScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num_1;
		System.out.println("Enter the Number: ");
		num_1 = scanner.nextInt();
		System.out.println("The entered number is : " + num_1);
		scanner.close();

	}

}
