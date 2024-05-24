package Xplore;

class Train {
	 public void printTable(int n) {
		 synchronized(this) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * n);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	 }

}

class Thread1 extends Thread {
	Train train;

	Thread1(Train train) {
		this.train = train;
	}

	public void run() {
		train.printTable(5);

	}
}

class Thread2 extends Thread {
	Train train;

	Thread2(Train train) {
		this.train = train;
	}

	public void run() {
		train.printTable(100);

	}

}

public class SynchronizedBlock {

	public static void main(String[] args) {
		Train train = new Train();
		Thread1 thread1 = new Thread1(train);
		Thread2 thread2 = new Thread2(train);
		thread1.start();
		thread2.start();
	}

}
