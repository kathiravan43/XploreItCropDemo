package Xplore;


public class GenericsClass {

	public static<E> void printArray(E[] elements) {
		for( E element : elements )
		{
			System.out.println(element);
		}
		
	}
	public static void main(String[] args) {
	Integer[] intArray = {10,20,3,04,05};
	Character[] chararray = {'a','b','c','d','e','f'};
	System.out.println("Priting Integer Array");
	printArray(intArray);
	System.out.println("Printing Char array");
	printArray(chararray);

	}

}
