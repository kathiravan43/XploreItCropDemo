package Xplore;

public class ExceptionDemo {

	public static void main(String[] args) {
		int []array = new int[5];
		int a= 140;
		try {
			int b= a/12;
			array[10]=47;
		} 
		
		catch (ArithmeticException ex) {
			
			// TODO: handle exception
			System.out.println(ex);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("The array size is :"+array.length+" you can't add more than that..");
		}
		finally {
			System.out.println("Finally block excuted");
		}
	}
	

}
