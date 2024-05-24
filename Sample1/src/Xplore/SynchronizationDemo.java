package Xplore;

class Line1 {
	synchronized public void getLine() {
		for(int i=0;i<3;i++) {
			System.out.println(i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Line2 extends Thread{
	Line1 line1;
	Line2(Line1 line1){
		this.line1 =line1;
	}
	public void run() {
		line1.getLine();
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		Line1 line1 = new Line1();
		Line2 line2 = new Line2(line1);
		Line2 line21 = new Line2(line1);
		line2.start();
		line21.start();
		
		
	}

}
