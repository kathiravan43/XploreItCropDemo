/*
 * Notes: To understand the concept of class and object;
 * DATE : 23/04/2024
 * 
 */
package Xplore;

public class Laptop {
	String company_Name;
	int price;
	public static void main(String[] args) {
		Laptop laptop1 =new Laptop();
		Laptop laptop2 = new Laptop();
		laptop1.company_Name="Dell";
		laptop1.price=48000;
		laptop2.company_Name="ASUS";
		laptop2.price=38000;
		System.out.println(laptop1.company_Name + "  "+ laptop1.price);
		System.out.println(laptop2.company_Name + "  "+ laptop2.price);

	}

}
