package Xplore;

import java.util.Scanner;

public class Switch_Statements {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the day : ");
			String day = scanner.nextLine();
			switch (day) {
			case "monday":
				System.out.println("MONDAY");
				
				break;

			default:
				System.out.println("Nothing");
				break;
			}
		}

	}

}
