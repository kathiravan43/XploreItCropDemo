package Task_Pakage;

class Book{
	int price;
	String published_Year;
	String language;
	int book_Id;
	String author_Name;
	String book_name;
	 Book(int p, String bookN){
		price= p;
		book_name = bookN;
	}
	 Book(String published_Year,String language,String author_Name) {
		this.published_Year =  published_Year;
		this.language = language;
		this.language = author_Name;
	}
	 
	 public void display1() {
		System.out.println("Name of the Book : " + book_name + "Price :  "+ price);
	}
	 public void display2() {
		System.out.println(published_Year);
		System.out.println(language);
		System.out.println(language);
	}
	 
}
public class Task_constructor {

	public static void main(String[] args) {
		Book book1 = new Book(450, "The Indian Nation");
		Book book2 = new Book("1989", "Tamil", "Brito");
		book1.display1();
		book2.display2();
	}

}
