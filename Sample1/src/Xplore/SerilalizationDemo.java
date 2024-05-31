package Xplore;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employees implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Employees(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	
	
	
	
}
public class SerilalizationDemo {

	public static void main(String[] args) throws IOException {
		
		Employees employees1 =new Employees(1, "Kathiravan");
		Employees employees2 =new Employees(2, "Samjai");
		Employees employees3 =new Employees(3, "Vinesh");
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\serilazation.txt");
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		outputStream.writeObject(employees1);
		outputStream.writeObject(employees2);
		outputStream.writeObject(employees3);
		outputStream.flush();
		outputStream.close();
		System.out.println("completed");
		
		
	}

}
