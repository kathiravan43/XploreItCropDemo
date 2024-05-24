package Xplore;

import java.security.PublicKey;

public class DeadLockDemo {

	public static void main(String[] args) {
		final String resource1 = "Anu";
		final String resource2 = "Priya";
		Thread t1 = new Thread()
		{
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 : locked resource 1");
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (resource2) {
						System.out.println("Thread 1 : locked resource 2");
						try {
							Thread.sleep(600);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 : locked Resource 2");
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (resource1) {
					System.out.println("Thread 2 : locked Resource 1");
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}
			}
		};
		t1.start();
		t2.start();

	}

}
