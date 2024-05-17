package Xplore;

interface Father {
	public void do_Savings();
}

interface Mother {
	public abstract void clean_YourRoom();
}

class Child1 implements Father, Mother {

	@Override
	public void clean_YourRoom() {
		System.out.println("Clean your Room says by Mother");
	}

	@Override
	public void do_Savings() {
		System.out.println("Do Savings by father ");
	}

}

public class Mutiple_Inheritance {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.clean_YourRoom();
		child1.do_Savings();
	}

}
