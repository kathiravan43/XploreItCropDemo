package Xplore;

import java.util.Scanner;

public class IF_statement {

	public static void main(String[] args) {
		System.out.println("Enter any two numbers : ");
		Scanner scanner  = new Scanner(System.in);
		int a,b;
		a=scanner.nextInt();
		b= scanner.nextInt();
		if(a+b>20)
		{
			System.out.println((a+b) +" Is greater than 20");
		}
		
	}

}
