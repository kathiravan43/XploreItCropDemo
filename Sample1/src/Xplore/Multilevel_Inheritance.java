package Xplore;


class Animal
{
	int age = 043;
	public void eat() {
		System.out.println("Animal");
		
	}
	public int return_Age() {
		return age;
	}
	
}
class Birds extends Animal {
	public void speak() {
		System.out.println("Bird");
	}
	
}
class Rabbit extends Birds{
	public void cry() {
		System.out.println("Rabbit");
	}
}
public class Multilevel_Inheritance {

	
	public static void main(String[] args) {
		 Rabbit rabbit = new Rabbit();
		 rabbit.cry();
		 rabbit.eat();
		 rabbit.speak();
		 System.out.println(rabbit.return_Age());

	}

}
