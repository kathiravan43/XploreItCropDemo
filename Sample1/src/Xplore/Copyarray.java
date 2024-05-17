package Xplore;

public class Copyarray {

	public static void main(String[] args) {
	String array[]= {"Kathir","is a good boy ", "Have a nice day","Happy to see u"				};
	String[] copyto = 	new String[10];
	System.arraycopy(array, 1, copyto, 0, 2);
	System.out.println(String.valueOf(copyto));
	
	}

}
