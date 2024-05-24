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
		ThreadTwice thread2 = new ThreadTwice();
		System.out.println("Name of the Thread1 : "+thread.getName());
		thread.setPriority(MAX_PRIORITY);
		thread.run();
		thread.start();
		thread.run1();
		System.out.println("Name of the Thread 2 : "+thread2.getPriority()+"   "+thread2.getName());
		thread2.setName("Apple");
		System.out.println("After changing :"+thread2.getName());
		System.out.println("Priority of the tread 1 :"+thread.getPriority());

	}

}
