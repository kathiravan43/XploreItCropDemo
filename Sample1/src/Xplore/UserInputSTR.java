package Xplore;

import java.util.Scanner;

/*
 * NOTES : To a string from the user using STring Data Type 
 * DATE  : 16/04/2024
 * 
 */
public class UserInputSTR {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("Enter the paragraph :");
		str = scanner.nextLine();
		System.out.println("The entered paragraph is :");
		System.out.println(str);
		scanner.close();
	}

}
