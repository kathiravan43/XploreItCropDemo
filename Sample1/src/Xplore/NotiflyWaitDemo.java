package Xplore;

class Customer{
	int amount = 10000;
	synchronized void withdraw (int amount)
	{
		System.out.println("Going to withdraw:");
		if(this.amount<amount)
		{
			System.out.println("Your blance is low :" + " waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount = this.amount-amount;
		System.out.println("withdraw is completed your balance is = "+this.amount);
	}
	
	synchronized void Deposit(int amount) {
		System.out.println("Going to deposit :");
		this.amount = this.amount+ amount;
		System.out.println("Deposit completed :" + " your balance  is :"+this.amount);
		notify();
		
	}
	
}
public class NotiflyWaitDemo {

	public static void main(String[] args) {
		Customer customer = new  Customer();
		new Thread() {
			public void run() {
				customer.withdraw(1000);
			}
		}.start();
		new Thread() {
			public void run() {
				customer.Deposit(200000);
			}
		}.start();
		
	}

}
