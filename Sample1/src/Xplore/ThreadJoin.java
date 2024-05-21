package Xplore;


class Joining extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+" * "+i+" = " +i);
		}
	
	}
	public void run2() {
		for(int j=0;j<3;j++) {
			System.out.println("Hai from thread run2 method");
		System.out.println( Thread.currentThread().getName());
	}
}
}
public class ThreadJoin {

	public static void main(String[] args) {
		Joining joining = new Joining();
		//Thread thread = new Thread(joining);
		joining.run();
	
		joining.run2();
		
	}

}
