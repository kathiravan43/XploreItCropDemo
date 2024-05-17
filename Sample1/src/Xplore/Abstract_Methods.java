package Xplore;
abstract class Parent{
	public abstract void study();
}
class Child extends Parent{

	@Override
	public void study() {
		System.out.println("Iam studing physics");
		
	}
	
}
public class Abstract_Methods {

	public static void main(String[] args) {
Child child = new  Child();
child.study();
	}

}
