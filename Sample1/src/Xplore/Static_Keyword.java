/*
 * Notes : to know about static method;
 * Date : 24/04/2024
 */
package Xplore;

class Student {

	int rollno;
	String name;
	static String college;

	Student(int r, String n, String c) {
		rollno = r;
		name = n;
		college = c;
	}

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + "  " + name + "  " + college);
	}

	static {
		System.out.println("Hai Hello welcome");
	}

	public static void change() {
		college = "SRI Shakthi";

	}
}

public class Static_Keyword {

	public static void main(String[] args) {
		Student.change();
//		Student student1 = new Student(43, "Kathir", "ABC COLLEGE");
//		Student student2 = new Student(44, "Kavin", "SIET COLLEGE");
		Student student3 = new Student(43, "Kathir");
		Student student4 = new Student(44, "Kavin");
		student3.display();
		student4.display();

	}

}
