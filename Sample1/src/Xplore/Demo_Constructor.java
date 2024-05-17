/*
 * Notes : to understand the flow of constructors and its types;
 * Date : 24-04-2024
 */
package Xplore;

public class Demo_Constructor {
	int marks;
	String name;

	Demo_Constructor() {
		System.out.println("Hai iam from consgtructor");
	}

	int a;

	Demo_Constructor(int m, String n) {
		marks = m;
		name = n;

	}

	public void dispaly() {
		System.out.println("Nmae: " + name + " marks : " + marks);
	}

	public static void main(String[] args) {
		Demo_Constructor demo_Constructor = new Demo_Constructor();
		System.out.println(demo_Constructor.a);
		Demo_Constructor demo_Constructor2 = new Demo_Constructor(440, "Kathiravan");
		demo_Constructor2.dispaly();
	}

}
