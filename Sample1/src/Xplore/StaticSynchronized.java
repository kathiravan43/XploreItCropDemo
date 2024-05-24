package Xplore;

 class Display{
	 public static synchronized  void wish(String str) {
		for(int i=0;i<3;i++)
		{
			System.out.println("Hello");
			System.out.println(str);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 }
 
 class Statics1 extends Thread{
	 Display d;
	 String str;
	  Statics1(Display d,String string ) {
		this.d = d;
		this.str = string;
	}
	 public void run() {
		d.wish(str);
	}
	 
 }
 
//class Statics2 extends Thread{
//	Display d;
//	 String str;
//	  Statics2(Display d,String str) {
//		this.d = d;
//		this.str = str;
//		
//	}
//	 public void run() {
//		d.wish(str);
//	}
//}

public class StaticSynchronized {

	public static void main(String[] args) {
		
		Display display = new  Display();
		Display display2 = new Display();
		Statics1 statics1 = new  Statics1(display,"Anupriya");
		Statics1 statics2 = new Statics1(display2,"Vignesh");
		statics1.start();
		statics2.start();
		
		
	}

}
