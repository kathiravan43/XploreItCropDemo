package Xplore;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class FileWriterDemo{
	 final static String fileName="C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Data1.txt";
	public  static void towrite() {
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("Hello welcome to file handling topic");
			fileWriter.close();
			System.out.println("Wrote successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class FileReaderDemo {
	public static void toRead() {
		try {
		File file = new File(FileWriterDemo.fileName);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
		String data = scanner.nextLine();
		System.out.println("Data from file : "+data);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	
	
}
public class FileHandlingNew {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\FileHandling\\Data1.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("File Created : "+file.getName());
			}
			else if(file.exists())
			{
				System.out.println("Name of the File : "+file.getName());
				System.out.println("Absolute file path : "+file.getAbsolutePath());
				System.out.println("Wriatable : "+file.canWrite());
				System.out.println("Readable : "+file.canRead());
				System.out.println("File size in the byte : "+ file.length());
			}
			
			else {
				System.out.println("The Already exist.....!");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriterDemo.towrite();
		FileReaderDemo.toRead();

	}

}
