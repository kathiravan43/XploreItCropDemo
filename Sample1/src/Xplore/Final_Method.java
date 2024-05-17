package Xplore;

class Finalmethod{
	 final public void type() {
		System.out.println("Final method from final method class");
	}
}
public class Final_Method extends Finalmethod {
	public void type1() {
		System.out.println("Final method from extend class");
	}
	public static void main(String[] args) {
		Finalmethod finalmethod = new Finalmethod();
		finalmethod.type();
	}

}
