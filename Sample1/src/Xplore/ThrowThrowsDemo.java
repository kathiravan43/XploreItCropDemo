package Xplore;

public class ThrowThrowsDemo {

	public static void check(int age)throws ArithmeticException {
		try {
		if(age>18)
		{
			throw new ArithmeticException("Eligible");
		}
		else {
			System.out.println("Not eleigible");
		}
		}
		catch (Exception e) {
			System.out.println("eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			check(4);
	}

}
