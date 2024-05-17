package Xplore;


class Methodoverloading_Demo {
	
	public static double add(int a, int b) {
		return a+b;
		
	}
	public static float add(int a,float b, int c) {
		return a+b+c;
		
	}
	
	
}
public class Methodoverloading {

	public static void main(String[] args) {
		System.out.println(Methodoverloading_Demo.add(80, 20));
		System.out.println(Methodoverloading_Demo.add(41, -60, 9));
	}

}
