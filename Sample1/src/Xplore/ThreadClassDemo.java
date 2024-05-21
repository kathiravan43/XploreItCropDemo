package Xplore;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Runnung from ruunable interface");
		
	}

}





public class ThreadClassDemo extends Thread {
	public void run() {
		System.out.println("The method is running");
		
	}

	public static void main(String[] args) {
		ThreadClassDemo t = new ThreadClassDemo();
		ThreadDemo t1 = new ThreadDemo();
		Thread thread = new Thread(t1);
		//t.run();
		thread.run();
	}
	
	

}
