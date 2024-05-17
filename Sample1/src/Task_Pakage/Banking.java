package Task_Pakage;

import java.util.Scanner;

class Balance {
	int b_Amount = 5000;

	public void deposit(int amount) {
		this.b_Amount = amount + this.b_Amount;
	}
}

class Withdraw extends Balance {
	int withdrawal_Amount;
	Balance balance = new Balance();
	Scanner scanner = new Scanner(System.in);

	public void withdrawAmount() {
		System.out.println("Enter the Amount : ");
		withdrawal_Amount = scanner.nextInt();

		if (balance.b_Amount > this.withdrawal_Amount) {
			balance.b_Amount = balance.b_Amount - withdrawal_Amount;
			System.out.println("Successfully Withdrawed ");
			System.out.println("Your Aviable Balance is : " + balance.b_Amount);
		} else {
			System.out.println("Insuficient amount");
			System.out.println("Do you wish to Deposit press 1:");
			int choise = scanner.nextInt();
			if (choise == 1) {
				System.out.println("Enter the Amount to Deposit: ");
				int Amount = scanner.nextInt();
				balance.deposit(Amount);
				withdrawAmount();

			} else {
				System.exit(0);
			}

		}

	}
}

public class Banking {

	public static void main(String[] args) {

		Withdraw withdraw = new Withdraw();

		withdraw.withdrawAmount();

	}

}
