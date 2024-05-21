package Xplore;

public class ThreadTwice extends Thread {
	 public void run1() {
		System.out.println("Hai from extended thread :");
	}
	 public void run() {
		for(int i =1;i<=5;i++)
		{
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	 
	public static void main(String[] args) {
		
		ThreadTwice thread = new ThreadTwice();
		thread.run();
		thread.start();

	}

}
