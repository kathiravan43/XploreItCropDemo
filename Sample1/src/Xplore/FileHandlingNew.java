package Xplore;

import java.io.File;
import java.io.IOException;

public class FileHandlingNew {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Data1.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("File Created : "+file.getName());
			}
			else {
				System.out.println("The Already exist.....!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
