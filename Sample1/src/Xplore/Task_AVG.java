/*
 * Task 1 = Mark sheet
 * Date : 18/04/2024
 */
package Xplore;

import java.util.Scanner;

public class Task_AVG {

	public static void main(String[] args) {
		String Student_Name, roll_Number;
		@SuppressWarnings("unused")
		int age, total = 0;
		int marks_Array[] = new int[5];
		float average;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Student Name: ");
		Student_Name = scanner.nextLine();
		System.out.println("Enter the Roll Number :");
		roll_Number = scanner.nextLine();
		System.out.println("Enter the Age : ");
		age = scanner.nextInt();
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the Mark " + (i + 1));
			marks_Array[i] = scanner.nextInt();
			total = marks_Array[i] + total;
		}
		average = total / 5;
		System.out.println("---------------------------------------------------------------");
		System.out.println("Name of the student :" + Student_Name);
		System.out.println("Roll Number of the Student :" + roll_Number);
		System.out.println("Total Marks :" + total);
		System.out.println("Average :" + average);
		System.out.println("%" + ((total / 500) * 100));

		if (average >= 90) {
			System.out.println(Student_Name + " You have recived 'O' Grade");
		} else if (average <= 89 && average >= 70) {
			System.out.println(Student_Name + " You have recived 'A' Grade");

		} else if (average <= 69 && average >= 50) {
			System.out.println(Student_Name + " You have recived 'B' Grade");

		} else if (average <= 49) {
			System.out.println(Student_Name + " sorry to say that you 'FAIL' ");

		} else {
			System.out.println("program mistake");
		}

		scanner.close();

	}

}
