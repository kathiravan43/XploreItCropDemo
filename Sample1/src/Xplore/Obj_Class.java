/*
 * Notes : to understand the concept of class and object using method ;
 * DATE  : 23/04/2024
 * 
 */
package Xplore;

public class Obj_Class {
	String name;
	int age;
	public void insert(int age , String name)
	{
		name = name;
		age = age;
	}
	public void display()
	{
		System.out.println("Name of the student :"+ name + " Age :"+age);
	}
	public static void main(String[] args) {
		Obj_Class obj_Class1 = new Obj_Class();
		Obj_Class obj_Class2 = new Obj_Class();
		obj_Class1.name="Kathiravan";
		obj_Class1.age = 22;
		obj_Class2.name="Sanjay";
		
				obj_Class2.age=18;
				obj_Class1.display();
				obj_Class2.display();
		

	}

}
