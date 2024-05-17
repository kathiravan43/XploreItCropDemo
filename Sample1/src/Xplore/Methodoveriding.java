package Xplore;


class Methodoveriding_Demo{
	 void run() {
		System.out.println("Hai");
	}
	 void run1() {
		 System.out.println("Hai from run 1");
	 }
}
class Methodoveriding_Demo2 extends Methodoveriding_Demo{
	 void run() {
System.out.println("Hello");
	}
}
public class Methodoveriding {

	public static void main(String[] args) {
		
		Methodoveriding_Demo2 methodoveriding_Demo2 = new Methodoveriding_Demo2();
		methodoveriding_Demo2.run();
	}

}
