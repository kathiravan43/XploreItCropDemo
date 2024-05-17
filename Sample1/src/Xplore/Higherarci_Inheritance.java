package Xplore;


class Animal2{
	public void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal2{
	public void dog_sound() {
		System.out.println("Barking");
	}
}
class Cat extends Animal2{
	public void cat_sound() {
		System.out.println("Meowing");
		
	}
}
class Lion extends Animal2{
	public void lion_Sound() {
		System.out.println("high sound");
	}
}
public class Higherarci_Inheritance {

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();

	}

}
