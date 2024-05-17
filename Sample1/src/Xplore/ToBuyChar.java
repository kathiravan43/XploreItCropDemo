package Xplore;

import java.util.Scanner;
/*
 NOTES : To a character from the user using scanner 
 DATE  : 16/04/2024
 */
public class ToBuyChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch;
		System.out.println("Enter the char: ");
		ch = scanner.next().charAt(0);
		System.out.println("the entered char is : "+ ch);
		scanner.close();
		
		
	}

}
