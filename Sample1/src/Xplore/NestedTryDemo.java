package Xplore;

public class NestedTryDemo {

	public static void main(String[] args) {
		int a=100;
		try {
			try {
				int[] arrray = new int[5];
				arrray[10]= 41;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				a=a/0;
			} catch (ArithmeticException e) {
System.out.println(e);
			}
		}
		catch (Exception e) {
System.out.println(e);		}
	}

}
